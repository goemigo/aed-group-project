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
 * @author forumkaria
 */
public
        class UserAccountDirectory {

    private
            ArrayList<UserAccount> userAccounts;

    public
            UserAccountDirectory() {
        this.userAccounts = new ArrayList<UserAccount>();
    }

    public
            ArrayList<UserAccount> getUserAccounts() {
        return userAccounts;
    }

    public
            void setUserAccounts(ArrayList<UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
    }

    public UserAccount createUserAccount(String username, String password, Role role){
        UserAccount user = new UserAccount(username, password, role);
        userAccounts.add(user);
        return user;
        
    }

    public
            UserAccount findById(String id) {
        for (UserAccount u : this.userAccounts) {
            if (u.getAccountId().equals(id)){
            return u;
        }
        }
        return null;
    
    }
            
    public UserAccount getUserAccount(String id, String password, Role role){
        for(UserAccount u : this.userAccounts){
            if(u.getAccountId().equals(id) && u.getPassword().equals(password) && u.getRole().equals(role)){
                return u;
            }
        }
        return null;
    }
    
    public UserAccount authenticateUser(String name, String password) {
        for(UserAccount ua: this.userAccounts) {
            if(ua.getUsername().equals(name) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    public Boolean accountExists(String username, String password, String role) {
        for(UserAccount u: this.userAccounts) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password) && u.getRole().equals(role)) {
                return true;
            }
        }
        
        return false;
    }
    
    public Boolean isUnique(String username){
        for (UserAccount u:this.userAccounts){
            if(u.getUsername().equals(username)){
                return false;
            }
        }
        return true;
    }
    
    
    public String[] getAllRoles() {
       return Role.getAllRoles();
    }
    
}

