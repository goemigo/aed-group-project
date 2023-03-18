/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

import Personnel.Student;
import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class CourseSchedule {
    private String term;
    private CourseCatalog courseCatalog;
    private ArrayList<CourseOffer> schedule;
    private ArrayList<Student> enrolledListForTerm;
    
    public CourseSchedule(String t,CourseCatalog cc){
        this.term = t;
        this.courseCatalog = cc;
        schedule = new ArrayList<CourseOffer>();
        enrolledListForTerm = new ArrayList<Student>();
    }
    
    public CourseOffer newCourseOffer(String courseId) {
        Course c = courseCatalog.getCourseById(courseId);
        if (c == null)
            return null;
        
        CourseOffer co = new CourseOffer(c);
        schedule.add(co);
        return co;
    }

    public CourseOffer getCourseOfferByCourseId(String id) {

        for (CourseOffer co : schedule) {

            if (co.getCourse().getCourseId().equals(id)) {
                return co;
            }
        }
        return null;
    }
    
    public ArrayList<Student> getEnrolledListForTerm(){
        for (CourseOffer co: schedule){
            for (Student s: co.getEnrolledStudentList()){
                this.enrolledListForTerm.add(s);
            }
        }
        return this.enrolledListForTerm;
    }

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {

            sum = sum + co.getTotalCourseRevenues();

        }
        return sum;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }

    public ArrayList<CourseOffer> getSchedule() {
        return schedule;
    }

    public void setSchedule(ArrayList<CourseOffer> schedule) {
        this.schedule = schedule;
    }
    
    
}
