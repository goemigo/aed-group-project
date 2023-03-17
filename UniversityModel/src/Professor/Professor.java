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
import java.util.HashMap;

/**
 *
 * @author 15512
 */
public class Professor extends Person {

    private CourseCatalog courseCatalog;
//    private CourseSchedule courseSchedule;
    private HashMap<String, CourseSchedule> allSchedules;
    private int reputation;
    private int tuitionCollected;
    
    
    public Professor(){
        super();
        this.courseCatalog = new CourseCatalog(this);
        this.allSchedules = new HashMap<String, CourseSchedule>();  
    }
    
    public Course createCourse(String name,String topic, String region, String language, int price){
        Course c = this.courseCatalog.createCourse(name,topic,region,language,price);
        return c;
    }
    
    public CourseOffer createCourseOffer(String term, String courseId){
        CourseSchedule cs = this.getCourseScheduleByTerm(term);
        CourseOffer co = cs.newCourseOffer(courseId);
        
        return co;
    }
    
    public CourseSchedule newCourseSchedule(String term) {

        CourseSchedule cs = new CourseSchedule(term, this.courseCatalog);
        this.allSchedules.put(term, cs);
        return cs;
    }
    
    public CourseSchedule getCourseScheduleByTerm(String term) {

        return allSchedules.get(term);

    }
    
    public void setCoursePrice(int price){
        
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
    
    
    
    
}
