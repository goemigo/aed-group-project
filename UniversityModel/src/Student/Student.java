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
    private Boolean tuitionPaidForAllCO = false;
    private Boolean requested = false;
    private Platform platform;


    public Boolean getRequested() {
        return requested;
    }

    public void setRequested(Boolean requested) {
        this.requested = requested;
    }
    
    public Student(){
        super();
        this.transcript = new Transcript(this);
    }
    
    public Transcript getTranscript() {
        return transcript;
    }
    
    public ArrayList<SeatAssignment> getCourseList() {

        return transcript.getCourseList();

    }
    
    public int getTuitionPaidForCO(CourseOffer co){
        int tuitionForCO = 0;
        for (SeatAssignment sa: this.getCourseList()){
            if (sa.getSeat().getCourseoffer() == co){
                tuitionForCO += co.getCourse().getPrice();
            }
        }
        return tuitionForCO;
    }

    public Boolean getTuitionPaidForAllCO() {
        for (SeatAssignment sa: this.getCourseList()){
            if (!sa.getPaid()){
                return false;
            }
        }
        return true;
    }

    public void setTuitionPaidForAllCO(Boolean tuitionPaidForAllCO) {
        this.tuitionPaidForAllCO = tuitionPaidForAllCO;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }
    
    @Override
    public String toString(){
        return this.getPersonid();
    }
    
    
}
