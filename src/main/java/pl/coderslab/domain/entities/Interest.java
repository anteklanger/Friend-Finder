package pl.coderslab.domain.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Interest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String intrestName;

//    @Column(insertable = false, updatable = false, nullable = false)
//    private long category_id;

    @ManyToOne
//    @JoinColumn(name = "category_id")
    private CategoryEntity categoryEntity;

    @ManyToOne
    private User user;

    public Interest() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIntrestName() {
        return intrestName;
    }

    public void setIntrestName(String intrestName) {
        this.intrestName = intrestName;
    }

//    public long getCategory_id() {
//        return category_id;
//    }
//
//    public void setCategory_id(long category_id) {
//        this.category_id = category_id;
//    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interest interest = (Interest) o;
        return id == interest.id &&
                Objects.equals(intrestName, interest.intrestName) &&
                Objects.equals(categoryEntity, interest.categoryEntity) &&
                Objects.equals(user, interest.user);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, intrestName, categoryEntity, user);
    }

    @Override
    public String toString() {
        return "Interest{" +
                "id=" + id +
                ", intrestName='" + intrestName + '\'' +
                ", categoryEntity=" + categoryEntity +
                ", user=" + user +
                '}';
    }
}
