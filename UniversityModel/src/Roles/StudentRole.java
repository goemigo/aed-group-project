/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Platform.Platform;
import UI.Student.StudentScreen;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author forumkaria
 */
public class StudentRole extends Role {

    @Override
    public JFrame createWorkArea(Platform platform, UserAccount useraccount) {
        // return jframe
        return new StudentScreen(platform, useraccount);
        
    }
    
    public String toStringRole(){
        return "student";
    }    
}
