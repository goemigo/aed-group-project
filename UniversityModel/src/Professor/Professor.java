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

/**
 *
 * @author 15512
 */
public class Professor extends Person {

    private CourseCatalog courseCatalog;
    private CourseSchedule courseSchedule;
    private int reputation;
    private int tuitionCollected;
    
    
    public Professor(){
        super();
        this.courseCatalog = new CourseCatalog(this);
        this.courseSchedule = new CourseSchedule(term, coursecatalog);  
    }
    
    public Course createCourse(String name,String topic, String region, String language, int price){
        Course c = this.courseCatalog.createCourse(name,topic,region,language,price);
        return c;
    }
    public CourseOffer createCourseOffer(){
        
    }
    
    public void setCoursePrice(int price){
        
    }

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }

    public CourseSchedule getCourseSchedule() {
        return courseSchedule;
    }

    public void setCourseSchedule(CourseSchedule courseSchedule) {
        this.courseSchedule = courseSchedule;
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
    
    
}
