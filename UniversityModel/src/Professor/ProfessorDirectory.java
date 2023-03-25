/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import Student.Student;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class ProfessorDirectory {
    ArrayList<Professor> professors;
    
    public ProfessorDirectory(){
        this.professors = new ArrayList<Professor>();
        
    }
    public ArrayList<Professor> getProfessors() {
        return professors;
    }

    public void addToProfessors(Professor professor) {
        this.professors.add(professor);
    }
    

    public Professor findProfessorById(String id){
        for (Professor p: this.professors){
            if (p.getPersonid().equals(id)){
                return p;
            }
        }
        
        return null;
    }
    
    public Professor createProfessor(String id, String name){
        Professor p = new Professor();
        p.setPersonid(id);
        p.setName(name);
        
        this.professors.add(p);
        return p;
    }
    
    public void sortProfessor(ArrayList<Professor> professors){
        professors.sort((p1,p2) -> Float.valueOf(p2.calReputation()).compareTo(p1.calReputation()));
    }

}
