/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

import Student.Student;
import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class CourseLoad {
    String term;
    ArrayList<SeatAssignment> seatassignments;
    Student student;
    
    public CourseLoad(String t, Student s){
        seatassignments = new ArrayList<SeatAssignment>();
        this.term = t;
        this.student = s;
    }
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat();
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment(this);
        seatassignments.add(sa);  //add to students course 
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){
        sa.assignSeatToStudent(this); 
        seatassignments.add(sa);
    }

    public String getTerm() {
        return term;
    }

    public ArrayList<SeatAssignment> getSeatassignments() {
        return seatassignments;
    }

    public ArrayList<String> getAllGrades() {
        ArrayList<String> grades = new ArrayList<String>();
        for(SeatAssignment sa : this.seatassignments){
            grades.add(sa.getGrade());
        }
        return grades;
    }
    
    public Student getStudent() {
        return student;
    }

    
}
