/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Platform.Platform;
import UI.Professor.ProfessorScreen;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author 15512
 */
public class ProfessorRole extends Role {
    
    @Override
    public JFrame createWorkArea(Platform platform, UserAccount useraccount) {
       return new ProfessorScreen(platform, useraccount);
    }
    
    public String toStringRole(){
        return "Branch Manager";
    }
}
