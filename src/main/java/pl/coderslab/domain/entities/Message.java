package pl.coderslab.domain.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String text;
    private LocalDate sendDate;

    @Column(insertable = false, updatable = false)
    private long user_id;

    @ManyToOne
    private User user;

    public Message() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDate sendDate) {
        this.sendDate = sendDate;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return id == message.id &&
                user_id == message.user_id &&
                Objects.equals(text, message.text) &&
                Objects.equals(sendDate, message.sendDate) &&
                Objects.equals(user, message.user);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, text, sendDate, user_id, user);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", sendDate=" + sendDate +
                ", user_id=" + user_id +
                ", user=" + user +
                '}';
    }
}