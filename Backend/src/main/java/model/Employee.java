package model;

import jakarta.persistence.*;

@Entity
@Table(name="Employees")
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="First_Name")
    private String  firstName;
    @Column(name="Last_name")
    private String last_name;
    @Column(name="Email_id")
    private String emailId;

    public Employee(){

    }

    public Employee(String firstName,String lastName,String emailId){
        super();
        this.firstName=firstName;
        this.last_name=lastName;
        this.emailId=emailId;
    }
    public void setId(long id){
        this.id=id;
    }
    public Long getId(){
        return id;
    }

    public void setFirstName(String firstName){
        this.firstName= firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setLast_name(String lastName){
        this.last_name=last_name;
    }
    public String getLast_name(){
        return last_name;
    }

}
