/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

/**
 *
 * @author emi
 */
class SeatAssignment {
    Seat seat;
    CourseLoad courseload;
    
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
    
    
}
