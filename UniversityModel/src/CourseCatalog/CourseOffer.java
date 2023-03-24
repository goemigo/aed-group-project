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
    private static int counter = 0;
    private String coId;
    private Course course;
    private ArrayList<Seat> seatlist;
    private Professor professor;
    private ArrayList<Student> enrolledStudentList;
    private int seatsAvailable;
    
    public CourseOffer(Course c,Professor professor) {
        this.coId = "CO" + this.counter++;
        course = c;
        this.professor = professor;
        seatlist = new ArrayList<Seat>();
        
    }
    
    public void generatSeats(int numOfSeats) {
        this.seatsAvailable = numOfSeats;
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

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public SeatAssignment assignEmptySeat(CourseLoad cl,Student student) {
        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        this.seatsAvailable--;
        SeatAssignment sa = seat.newSeatAssignment(cl); // already link seat(from co) to courseload (belongs to a certain student)
        cl.registerStudent(sa); // add the sa to student's course load's ArrayList<SeatAssignment>
        cl.setStudent(student);
        return sa;
    }
    
    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied()) {
                sum = sum + course.getPrice();
            }

        }
        return sum;
    }
    
    public ArrayList<Student> getEnrolledStudentList(){
        enrolledStudentList = new ArrayList<Student>();
        for (Seat s : seatlist) {
            if (s.isOccupied()) {
                this.enrolledStudentList.add(s.getSeatassignment().getCourseload().getStudent());
            }

        }
        return this.enrolledStudentList;
    }
    
    public int getPassCount(){
        int passCount = 0;
        if(this.seatlist.size()>0){
            for (Seat s: this.seatlist){
                //only check the grade for people who take a seat
                if (s.getOccupied()){
                    if (s.getSeatassignment().getGrade().equals("Pass")){
                    passCount += 1;
                    }
                } 
            }
        }
        
        return passCount;
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
    
    @Override
    public String toString(){
        return this.coId;
    }
    
}
