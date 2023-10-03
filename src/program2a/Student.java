/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program2a;

import java.util.Date;

/**
 *
 * @author CATHERINE MEDILO
 */
public class Student {
       private String firstName;
       private String middleName;
       private String lastName;
       private Date birthDate;
       private String address;
       private int year;
       private String section;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String middleName, String lastName, String address, int year, String section) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.year = year;
        this.section = section;
    }
 
    public String getFullName(){
        return firstName + " " + middleName + " " + lastName ;  
    }
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public int getYear() {
        return year;
    }

    public String getSection() {
        return section;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", address=" + address + ", year=" + year + ", section=" + section + '}';
    }

    
    
}
