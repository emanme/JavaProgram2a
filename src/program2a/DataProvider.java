/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program2a;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CATHERINE MEDILO
 */
public class DataProvider {
    public static List<Student> students = new ArrayList<>();
    
    public static void generateData(){
        
        students.add(new Student("John", "Doe", "Smith", "123 Main St", 2023, "A"));
        students.add(new Student("Jane", "Ella", "Johnson", "456 Elm St", 2023, "B"));
        students.add(new Student("Robert", "James", "Brown", "789 Oak St", 2022, "A"));
        students.add(new Student("Emily", "Grace", "Davis", "567 Maple St", 2022, "B"));
        students.add(new Student("Michael", "Joseph", "Miller", "321 Pine St", 2021, "A"));
        students.add(new Student("Olivia", "Sophia", "Wilson", "876 Cedar St", 2021, "B"));
        students.add(new Student("David", "Daniel", "Lee", "234 Birch St", 2020, "A"));
        students.add(new Student("Sophie", "Chloe", "Clark", "654 Redwood St", 2020, "B"));
        students.add(new Student("Matthew", "William", "Turner", "890 Spruce St", 2019, "A"));
        students.add(new Student("Isabella", "Ava", "White", "432 Sequoia St", 2019, "B"));
       
    }
}


