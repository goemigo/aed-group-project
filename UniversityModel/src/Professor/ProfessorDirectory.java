/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Professor;

import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class ProfessorDirectory {
    ArrayList<Professor> professors;

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

}
