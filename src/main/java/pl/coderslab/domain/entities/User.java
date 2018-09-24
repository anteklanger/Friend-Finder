package pl.coderslab.domain.entities;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String lastName;

    private String nick;
    @Email
    private String email;

    private String country;

    private String day;

    private String month;
    private String year;
    private String password;

//    @OneToMany
//    @JoinColumn(name = "user_id")
//    private List<Message> messages;

//    @ManyToMany


    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public List<Message> getMessages() {
//        return messages;
//    }
//
//    public void setMessages(List<Message> messages) {
//        this.messages = messages;
//    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(nick, user.nick) &&
                Objects.equals(email, user.email) &&
                Objects.equals(country, user.country) &&
                Objects.equals(day, user.day) &&
                month == user.month &&
                Objects.equals(year, user.year) &&
                Objects.equals(password, user.password); //&&
//                Objects.equals(messages, user.messages);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, nick, email, country, day, month, year, password /*messages*/);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nick='" + nick + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", password='" + password + '\'' +
                /*", messages=" + messages +*/
                '}';
    }
}

