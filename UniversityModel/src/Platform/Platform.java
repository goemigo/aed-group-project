/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Platform;

import Student.StudentDirectory;
import CourseCatalog.MasterCourseCatalog;
import Personnel.Certifier;
import Professor.ProfessorDirectory;
import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class Platform {

    /**
     * @param args the command line arguments
     */
    
    Certifier certifier;
    StudentDirectory sd;
    ProfessorDirectory pd;
    MasterCourseCatalog courseCatalog;
    int revenue;
    
    public Certifier getCertifier() {
        return certifier;
    }
    
    public void collectSubscriptionFee(String profId) {
        this.revenue += 500;
        this.pd.findProfessorById(profId).setAccountStatus(true);
    }

    public void setCertifier(Certifier certifier) {
        this.certifier = certifier;
    }

    public StudentDirectory getStudentDirectory() {
        return sd;
    }

    public ProfessorDirectory getProfessorDirectory() {
        return pd;
    }

    public MasterCourseCatalog getCourseCatalog() {
        return courseCatalog;
    }

    public void setCourseCatalog(MasterCourseCatalog courseCatalog) {
        this.courseCatalog = courseCatalog;
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static Platform getInstance() {
        return new Platform();
    }
    
}
