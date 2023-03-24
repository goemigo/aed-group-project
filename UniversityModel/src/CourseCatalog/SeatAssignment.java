/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

/**
 *
 * @author emi
 */
public class SeatAssignment {
    Seat seat;
    CourseLoad courseload;
    String grade = "ungraded";
    int professorRepGrading = 0;  //student can rate 1-5 
    Boolean paid = false;
    
    public SeatAssignment(CourseLoad cl, Seat s) {
        seat = s;
        courseload = cl;
    }
    
    public void assignSeatToStudent(CourseLoad cl) {
        courseload = cl;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public CourseLoad getCourseload() {
        return courseload;
    }

    public void setCourseload(CourseLoad courseload) {
        this.courseload = courseload;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getProfessorRepGrading() {
        return professorRepGrading;
    }

    public void setProfessorRepGrading(int professorRepGrading) {
        this.professorRepGrading = professorRepGrading;
    }

    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }
    
    
    
}
