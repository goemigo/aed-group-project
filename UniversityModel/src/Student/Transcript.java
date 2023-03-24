/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import Student.Student;
import CourseCatalog.CourseLoad;
import CourseCatalog.CourseOffer;
import CourseCatalog.SeatAssignment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 15512
 */
public class Transcript {

    HashMap<String, CourseLoad> courseLoads;
    HashMap<String, ArrayList<String>> termGrades;
    Student student;
    int courseCount;
    Boolean isGraduated = false;

    public Transcript() {
        this.courseLoads = new HashMap<String, CourseLoad>();

    }

    public HashMap<String, CourseLoad> getCourseLoads() {
        return courseLoads;
    }

    public ArrayList<SeatAssignment> getSeatAssignmentsAllTerms() {
        ArrayList<SeatAssignment> sas = new ArrayList<SeatAssignment>();
        for (Map.Entry<String, CourseLoad> mapElement : this.courseLoads.entrySet()) {
                
            ArrayList<SeatAssignment> sat = mapElement.getValue().getSeatassignments();
            for (SeatAssignment sa : sat) {
                sas.add(sa);
            }

        }
        return sas;
    }

    public Student getStudent() {
        return student;
    }

    public int getGraduationProgressBar() {
        return courseCount * 100 / 8;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getGraduationStatus() {
        return this.isGraduated ? "Graduated" : "Yet to Graduate";
    }

    public void setIsGraduated(Boolean isGratuated) {
        this.isGraduated = isGratuated;
    }

    public void registerCourse(String term, CourseOffer co) {
        if (this.courseCount < 8) {
            this.courseCount++;
            if (this.courseLoads.get(term) != null) {
                System.out.println("\n adding term" + co.toString());
                CourseLoad termCl = this.courseLoads.get(term);
                SeatAssignment sa = co.assignEmptySeat(termCl);
//                termCl.newSeatAssignment(co);
            } else {
                System.out.println("\n creating term" + co.toString());
                CourseLoad cl = new CourseLoad(term, this.student);
//                cl.newSeatAssignment(co);
                SeatAssignment sa = co.assignEmptySeat(cl);
                this.courseLoads.put(term, cl);  
            }
        }
    }

    public HashMap<String, ArrayList<String>> getTermGrades() {
        for (Map.Entry<String, CourseLoad> mapElement : this.courseLoads.entrySet()) {
            String term = mapElement.getValue().getTerm();
            ArrayList<String> grades = mapElement.getValue().getAllGrades();
            this.termGrades.put(term, grades);
        }

        return termGrades;
    }

    public ArrayList<SeatAssignment> getCourseList() {
        ArrayList<SeatAssignment> temp2;
        temp2 = new ArrayList<SeatAssignment>();

        for (CourseLoad cl : this.courseLoads.values()) { //extract cl list as objects --ignore label
            temp2.addAll(cl.getSeatassignments()); //merge one array list to another
        }

        return temp2;

    }
}
