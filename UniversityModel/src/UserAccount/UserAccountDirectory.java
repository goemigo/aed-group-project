/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserAccount;

import Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> useraccountlist;
    
    public UserAccountDirectory() {
        this.useraccountlist = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUseraccountList() {
        return useraccountlist;
    }

    public void setUseraccountList(ArrayList<UserAccount> useraccountlist) {
        this.useraccountlist = useraccountlist;
    }
    
    public UserAccount addUserAccount(UserAccount ua) {
        this.useraccountlist.add(ua);
        return ua;
    }
    
    public UserAccount createUserAccount(String username, String password, Role role) {
        for(UserAccount ua: this.useraccountlist) {
            if(ua.getUsername().equals(username)) {
                return null;
            }
        }
        UserAccount ua = new UserAccount( username,  password,  role);
        this.useraccountlist.add(ua);
        return ua;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.useraccountlist) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
}
