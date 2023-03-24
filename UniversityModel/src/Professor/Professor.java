/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import CourseCatalog.Course;
import CourseCatalog.CourseCatalog;
import CourseCatalog.CourseOffer;
import CourseCatalog.CourseSchedule;
import CourseCatalog.Seat;
import CourseCatalog.SeatAssignment;
import Personnel.Person;
import Student.Student;
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
    private float reputation; // average number
    private int tuitionCollected;
    private Boolean accountStatus = false; //only professor role has this attribute
    private ArrayList<Student> enrolledListForAllTerm;
    
    public Professor(){
        super();
        this.courseCatalog = new CourseCatalog(this);
        this.allSchedules = new HashMap<String, CourseSchedule>();  
//        this.enrolledListForAllTerm = new ArrayList<Student>();
        
//        insertTermsInAllSchedules();
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
        CourseOffer co = cs.newCourseOffer(courseId,this);
        return co;
    }
    
    public CourseSchedule getCourseScheduleByTerm(String term) {
        return allSchedules.get(term);
    }
    
    public ArrayList<Student> getEnrolledListForAllTerm(){
        this.enrolledListForAllTerm = new ArrayList<Student>();
        for (Map.Entry<String,CourseSchedule> termSchedule: this.allSchedules.entrySet()){
            CourseSchedule cs = (CourseSchedule) termSchedule.getValue();
            for (Student s: cs.getEnrolledListForTerm()){
                this.enrolledListForAllTerm.add(s);
            };
        }
        return this.enrolledListForAllTerm;
    }
    
    public int getEnrolledCountForCourse(Course c){
        int enrolledForCourse = 0;
        for (Map.Entry<String,CourseSchedule> termSchedule: this.allSchedules.entrySet()){
            CourseSchedule cs = (CourseSchedule) termSchedule.getValue();
            for (CourseOffer co: cs.getSchedule()){
                if (co.getCourse() == c){
                    for (Seat s: co.getSeatlist()){
                        if (s.getOccupied() ){
                        enrolledForCourse += 1;
                        }
                    }
                }      
            }
        }
        return enrolledForCourse;
    }
    
    public int getPassCountForCourse(Course c){
        int passCountForCourse = 0;
        for (Map.Entry<String,CourseSchedule> termSchedule: this.allSchedules.entrySet()){
            CourseSchedule cs = (CourseSchedule) termSchedule.getValue();
            for (CourseOffer co: cs.getSchedule()){
                if (co.getCourse() == c){
                    for (Seat s: co.getSeatlist()){
                        if(s.getOccupied()){
                            if (s.getSeatassignment().getGrade().equals("Pass")){
                            passCountForCourse += 1;
                            }
                        }  
                    }
                }      
            }
        }
        return passCountForCourse;
    }
    
    public int getTuitionCollectedForCourse(Course c) {
        int tuitionForCourse = 0;
        for (Map.Entry<String,CourseSchedule> termSchedule: this.allSchedules.entrySet()){
            CourseSchedule cs = (CourseSchedule) termSchedule.getValue();
            for (CourseOffer co: cs.getSchedule()){
                if (co.getCourse() == c){
                    for (Seat s: co.getSeatlist()){
                        if (s.getOccupied() && s.getSeatassignment().getPaid()){
                        tuitionForCourse += co.getCourse().getPrice();
                        }
                    }
                }      
            }
        }
        return tuitionForCourse;
    }
    
    public void initiateAllSchedules(ArrayList<String> terms){
        for (String term: terms){
            this.newCourseSchedule(term);
        }
        
    }

    public CourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(CourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }


//    public int getReputation() {
//        return reputation;
//    }
    public float calReputation(){
        this.reputation = 0;
        int gradingCount = 0;
        for (Student s: this.getEnrolledListForAllTerm()){
            for (SeatAssignment sa: s.getTranscript().getSeatAssignmentsAllTerms()){
                if(sa.getProfessorRepGrading()!=0){
                    this.reputation += sa.getProfessorRepGrading();
                    gradingCount += 1;
                }
            }
        }
        if (gradingCount==0){
            return 0;
        }else{
            return this.reputation/gradingCount;
        }
    }

    public void setReputation(int reputation) {
        this.reputation = reputation;
    }

    public int getTuitionCollected() {
        this.tuitionCollected = 0;
        for (Map.Entry<String,CourseSchedule> termSchedule: this.allSchedules.entrySet()){
            CourseSchedule cs = (CourseSchedule) termSchedule.getValue();
            for (CourseOffer co: cs.getSchedule()){
//                if (co.getSeatlist().size()>co.getSeatsAvailable()){
                    for (Seat s: co.getSeatlist()){
                        if (s.getOccupied() && s.getSeatassignment().getPaid()){
                        this.tuitionCollected += co.getCourse().getPrice();
                        }
                    }
//                }
                
            }
        }
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
    
    public String getAccountStatusString(){
        return  (this.accountStatus==true) ? "Active": "Inactive";
    }
}
