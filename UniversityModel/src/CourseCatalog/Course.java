/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

/**
 *
 * @author 15512
 */
public class Course {

    private static int count = 0;
    
    private String courseId;
    private String name;
    private String topic;
    private String region;
    private String language;
    private int price;
    private int registedCountForCourse = 0;
    private int passCountForCourse = 0;
    private int revenueForCourse = 0;
    
    public Course(String name,String topic, String region, String language, int price) {
        this.courseId = "Course" + count++;
        this.name = name;
        this.topic = topic;
        this.region = region;
        this.language = language;
        this.price = price;

    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Course.count = count;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRegistedCountForCourse() {
        return registedCountForCourse;
    }

    public void setRegistedCountForCourse(int registedCountForCourse) {
        this.registedCountForCourse = registedCountForCourse;
    }

    public int getPassCountForCourse() {
        return passCountForCourse;
    }

    public void setPassCountForCourse(int passCountForCourse) {
        this.passCountForCourse = passCountForCourse;
    }

//    public int getRevenueForCourse() {
//        return revenueForCourse;
//    }

    public void setRevenueForCourse(int revenueForCourse) {
        this.revenueForCourse = revenueForCourse;
    }
    
    

    @Override
    public String toString(){
        return this.courseId;
    }
    
}

