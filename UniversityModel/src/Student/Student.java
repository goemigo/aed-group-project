/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import CourseCatalog.CourseCatalog;
import CourseCatalog.CourseOffer;
import CourseCatalog.CourseSchedule;
import CourseCatalog.SeatAssignment;
import Personnel.Person;
import Platform.Platform;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 15512
 */
public class Student extends Person{
    private Transcript transcript;
    private Boolean tuitionPaid;
    private Platform platform;
    public Boolean getTuitionPaid() {
        return tuitionPaid;
    }
    
    public void setTuitionPaid(Boolean tuitionPaid) {
        this.tuitionPaid = tuitionPaid;
    }
    
    public Student(){
        super();
        this.transcript = new Transcript();
    }
    
    public Transcript getTranscript() {
        return transcript;
    }
    
    public ArrayList<SeatAssignment> getCourseList() {

        return transcript.getCourseList();

    }
    
    
}
