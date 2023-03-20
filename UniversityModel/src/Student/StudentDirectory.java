/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class StudentDirectory {
    ArrayList<Student> studentDirectory;
    
    public ArrayList<Student> getStudent() {
        return studentDirectory;
    }

    public void addToStudents(Student student) {
        this.studentDirectory.add(student);
    }
    
    public Student findStudentById(String id){
        for (Student s: this.studentDirectory){
            if (s.getPersonid().equals(id)){
                return s;
            }
        }
        return null;
    }
    
}
