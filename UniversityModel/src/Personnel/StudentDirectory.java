/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnel;

import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class StudentDirectory {
    ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addToStudents(Student student) {
        this.students.add(student);
    }
}
