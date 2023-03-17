/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class CourseSchedule {
    private String term;
    private CourseCatalog courseCatalog;
    private ArrayList<CourseOffer> schedule;
    
    public CourseSchedule(String t,CourseCatalog cc){
        this.term = t;
        this.courseCatalog = cc;
        schedule = new ArrayList<CourseOffer>();
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

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {

            sum = sum + co.getTotalCourseRevenues();

        }
        return sum;
    }
}
