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
class CourseLoad {
    String term;
    ArrayList<SeatAssignment> seatassignments;
    
    public CourseLoad(String t){
        seatassignments = new ArrayList<SeatAssignment>();
        this.term = t;
    }
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat();
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment(this);
        seatassignments.add(sa);  //add to students course 
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){
        sa.assignSeatToStudent(this); 
        seatassignments.add(sa);
    }
}
