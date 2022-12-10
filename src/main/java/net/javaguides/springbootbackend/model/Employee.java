package net.javaguides.springbootbackend.model;
import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   @Column(name = "first_name")
   private String firstName;
   @Column(name = "last_name")
   private String lastName;
   @Column(name = "email_id")
   private String emailId;

    public Employee(){
    }
    public Employee(String firstName, String lastname, String emailId) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
