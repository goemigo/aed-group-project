/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class MasterCourseCatalog {
    ArrayList<Course> courses;

    public ArrayList<Course> getMasterCourses() {
        return courses;
    }

    public void addToMasterCourses(Course course) {
        this.courses.add(course);
    }
    
}
