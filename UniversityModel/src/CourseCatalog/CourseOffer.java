/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

import Student.Student;
import Professor.Professor;
import java.util.ArrayList;

/**
 *
 * @author emi
 */
public class CourseOffer {
    private Course course;
    private ArrayList<Seat> seatlist;
    private Professor professor;
    private ArrayList<Student> enrolledStudentList;
    
    public CourseOffer(Course c,Professor professor) {
        course = c;
        this.professor = professor;
        seatlist = new ArrayList<Seat>();
        enrolledStudentList = new ArrayList<Student>();
    }
    
    public void generatSeats(int numOfSeats) {
        for (int i = 0; i < numOfSeats; i++) {
            seatlist.add(new Seat(this));
        }
    }

    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }

    public SeatAssignment assignEmptySeat(CourseLoad cl) {

        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(cl); // link seat to courseload (belongs to a certain student)
        cl.registerStudent(sa); // add the sa to student's course load's ArrayList<SeatAssignment>
        return sa;
    }
    
    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getPrice();
            }

        }
        return sum;
    }
    
    public ArrayList<Student> getEnrolledStudentList(){
        
        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                this.enrolledStudentList.add(s.getSeatassignment().getCourseload().getStudent());
            }

        }
        return this.enrolledStudentList;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }

    public void setSeatlist(ArrayList<Seat> seatlist) {
        this.seatlist = seatlist;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    
}
