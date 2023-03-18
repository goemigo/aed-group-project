/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseCatalog.CourseOffer;
import CourseCatalog.CourseSchedule;
import Personnel.Person;
import Personnel.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 15512
 */
public class Professor extends Person {

    private CourseCatalog courseCatalog;
//    private CourseSchedule courseSchedule;
    private HashMap<String, CourseSchedule> allSchedules;
    private int reputation = 0; //default
    private int tuitionCollected;
    private Boolean accountStatus; //only professor role has this attribute
    private ArrayList<Student> enrolledListForAllTerm;
    
    public Professor(){
        super();
        this.courseCatalog = new CourseCatalog(this);
        this.allSchedules = new HashMap<String, CourseSchedule>();  
    }
    
    public Course createCourse(String name,String topic, String region, String language, int price){
        Course c = this.courseCatalog.createCourse(name,topic,region,language,price);
        return c;
    }
    
    public CourseSchedule newCourseSchedule(String term) {

        CourseSchedule cs = new CourseSchedule(term, this.courseCatalog);
        this.allSchedules.put(term, cs);
        return cs;
    }
    
    //create schedule before create offer
    public CourseOffer createCourseOffer(String term, String courseId){
        CourseSchedule cs = this.getCourseScheduleByTerm(term);
        CourseOffer co = cs.newCourseOffer(courseId);
        
        return co;
    }
    
    public CourseSchedule getCourseScheduleByTerm(String term) {

        return allSchedules.get(term);

    }
    
    public ArrayList<Student> getEnrolledListForAllTerm(){
        for (Map.Entry<String,CourseSchedule> termSchedule: this.allSchedules.entrySet()){
            CourseSchedule cs = termSchedule.getValue();
            
            for (Student s: cs.getEnrolledListForTerm()){
                this.enrolledListForAllTerm.add(s);
            };
        }
        return this.enrolledListForAllTerm;
    }
   

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }


    public int getReputation() {
        return reputation;
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getTuitionCollected() {
        return tuitionCollected;
    }

    public void setTuitionCollected(int tuitionCollected) {
        this.tuitionCollected = tuitionCollected;
    }

    public HashMap<String, CourseSchedule> getAllSchedules() {
        return allSchedules;
    }

    public void setAllSchedules(HashMap<String, CourseSchedule> schedules) {
        this.allSchedules = schedules;
    }

    public Boolean getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Boolean accountStatus) {
        this.accountStatus = accountStatus;
    }
    
    
    
    
}
