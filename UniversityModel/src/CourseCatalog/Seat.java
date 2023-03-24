/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

/**
 *
 * @author emi
 */
public class Seat {
    private static int count = 0;
    
    private String id; // unique id
    private Boolean occupied; 
    private CourseOffer courseoffer;
    private SeatAssignment seatassignment; //links back to studentprofile
    
    public Seat(CourseOffer co){
        this.id = "Seat" + count++;
        occupied = false;
        courseoffer = co;
        
    }
    
    public Boolean isOccupied(){
        return occupied;

    }
    public SeatAssignment newSeatAssignment(CourseLoad cl){
        System.out.println("\n added in course load " + cl.toString());
        seatassignment = new SeatAssignment(cl, this); //links seatassignment to seat
        occupied = true;   
        return seatassignment;
    }

    public Boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(Boolean occupied) {
        this.occupied = occupied;
    }

    public CourseOffer getCourseoffer() {
        return courseoffer;
    }

    public void setCourseoffer(CourseOffer courseoffer) {
        this.courseoffer = courseoffer;
    }

    public SeatAssignment getSeatassignment() {
        return seatassignment;
    }

    public void setSeatassignment(SeatAssignment seatassignment) {
        this.seatassignment = seatassignment;
    }
    
    
}
