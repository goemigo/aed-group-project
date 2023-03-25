/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Certifier;

import CourseCatalog.Course;
import CourseCatalog.SeatAssignment;
import Student.Student;
import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public
        class Degree {
    String title;
//    Student student;
    
    public Degree(String name){
        this.title = name;
        
    }
    
    public boolean isStudentReadyToGraduate(Student student) {
        ArrayList<SeatAssignment> sas = student.getCourseList();//seatAssignments extracted from course loads
        System.out.println("student course count" + sas.size());
        if (sas.size()<8){
            return false;
        }
        for (SeatAssignment sa: sas){
            if (sa.getGrade().equals("Fail")){
                return false;
            }
        }
        System.out.println("inside Degree method, just done");
        return true;
        
    }
}
    

