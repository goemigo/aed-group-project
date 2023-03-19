/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import CourseCatalog.CourseCatalog;
import CourseCatalog.CourseSchedule;
import Personnel.Person;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 15512
 */
public class Student extends Person{
    private Transcript transcript;
    private Boolean tuitionPaid;

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
   
}
