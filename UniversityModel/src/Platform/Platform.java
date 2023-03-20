/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Platform;

import CourseCatalog.MasterCourseCatalog;
import Personnel.Certifier;
import Roles.AdminRole;
import UserAccount.UserAccount;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author forumkaria
 */
public class Platform {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Certifier certifier;
        StudentDirectory sd;
        ProffessorDirectory pd;
        MasterCourseCatalog courseCatalog;
        UserAccountDirectory topLevelUserAccountDirectory;
        
    }
    
    public static Platform getInstance() {
        return new Platform();
    }
    
    public class Platform {
        Certifier certifier;
        StudentDirectory sd;
        ProffessorDirectory pd;
        MasterCourseCatalog courseCatalog;
        UserAccountDirectory uad;
    
    public Platform(){
        this.certifier = new Certifier();
        this.sd = new StudentDirectory();
        this.pd = new ProffessorDirectory();
        this.uad = new UserAccountDirectory();
        this.courseCatalog = new MasterCourseCatalog();
        
        UserAccount user = this.uad.createUserAccount("a", "a", new AdminRole());
    }
    
    

    public
    Certifier getCertifier() {
        return certifier;
    }

    public
    void setCertifier(Certifier certifier) {
        this.certifier = certifier;
    }

    public
    StudentDirectory getSd() {
        return sd;
    }

    public
    void setSd(StudentDirectory sd) {
        this.sd = sd;
    }

    public
    ProffessorDirectory getPd() {
        return pd;
    }

    public
    void setPd(ProffessorDirectory pd) {
        this.pd = pd;
    }

    public
    MasterCourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public
    void setCourseCatalog(MasterCourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }

    
    public UserAccountDirectory getUad() {
        return uad;
    }

    public void setUad(UserAccountDirectory uad) {
        this.uad = uad;
    }

    }
    
    
    

