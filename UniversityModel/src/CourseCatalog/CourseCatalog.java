/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

import Professor.Professor;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class CourseCatalog {
    ArrayList<Course> courses;
    private Professor professor;
    
    public CourseCatalog(Professor p){
        this.courses = new ArrayList<Course>();
        this.professor = p;
    }
    
    public ArrayList<Course> getCourses() {
        return courses;
    }

    public Course createCourse(String name,String topic, String region, String language, int price){
        Course c = new Course(name,topic,region,language,price);
        this.courses.add(c);
        return c;
    }
    
    public Course getCourseById(String id){
        for (Course c : courses) {
            if (c.getCourseId().equals(id))
                return c;
        }
        return null;
    }
    
    public Course getCourseByName(String n){
        for (Course c : courses) {
            if (c.getCourseId().equals(n))
                return c;
        }
        return null;
    }
    
    public Boolean checkCourseNameUnique(String name){
        for (Course c: this.courses){
            if(c.getName().equals(name)){
                return false;
            }
        }
        return true;
    }
    
    
    
}
