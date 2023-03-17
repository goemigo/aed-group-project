/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import Platform.Platform;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author 15512
 */
public abstract class Role {
    
    private static String[] roles = {"student", "professor", "certifier"};
    
    public static String[] getAllRoles() {
        return roles;
    }
    
    public abstract JFrame createWorkArea(Platform platform, UserAccount useraccount);
}
