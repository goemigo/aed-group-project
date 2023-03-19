/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Platform;

import CourseCatalog.MasterCourseCatalog;
import Certifier.Certifier;
import Professor.ProfessorDirectory;
import Roles.AdminRole;
import UserAccount.UserAccount;
import UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class Platform {
        Certifier certifier;
        StudentDirectory sd;
        ProfessorDirectory pd;
        MasterCourseCatalog courseCatalog;
        UserAccountDirectory uad;
    /**
     * @param args the command line arguments
     */
    
    public static Platform getInstance() {
        return new Platform();
    }
    
    
    public Platform(){
        this.certifier = new Certifier();
        this.sd = new StudentDirectory();
        this.pd = new ProfessorDirectory();
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
    ProfessorDirectory getPd() {
        return pd;
    }

    public
    void setPd(ProfessorDirectory pd) {
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
    
    
    

