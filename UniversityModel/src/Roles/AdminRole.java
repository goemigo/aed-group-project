/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roles;

import Platform.Platform;
import UI.AdminInterface.AdminJFrame;
import UserAccount.UserAccount;
import javax.swing.JFrame;

/**
 *
 * @author forumkaria
 */
public class AdminRole extends Role{

    @Override
    public JFrame createWorkArea(Platform platform, UserAccount ua) {
        return new AdminJFrame(platform,ua);
    }
    
}
