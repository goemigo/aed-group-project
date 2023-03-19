/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import CourseCatalog.CourseLoad;
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
    Boolean isGraduated;
    
    public HashMap<String, CourseLoad> getCourseLoads() {
        return courseLoads;
    }

    public Student getStudent() {
        return student;
    }
    
    public int getGraduationProgressBar() {
        return courseCount *100/8;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getGraduationStatus() {
        return this.isGraduated?"Graduated":"Yet to Graduate";
    }

    public void setIsGraduated(Boolean isGratuated) {
        this.isGraduated = isGratuated;
    }

    public void registerCourse(String term, CourseOffer co) {
        if (this.courseCount < 12) {
            this.courseCount++;
            this.courseLoads.put(term, cl);
//            cl.newSeatAssignment()
        }
    }

    public HashMap<String, ArrayList<String>> getTermGrades() {
        for (Map.Entry<String,CourseLoad> mapElement : this.courseLoads.entrySet()) {
            String term = mapElement.getValue().getTerm();
            ArrayList<String> grades = mapElement.getValue().getAllGrades();  
            this.termGrades.put(term, grades);
        }
        
        return termGrades;
    }
    
}
