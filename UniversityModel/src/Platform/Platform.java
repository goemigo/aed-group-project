/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Platform;

import CourseCatalog.CourseSchedule;
import Student.StudentDirectory;
import CourseCatalog.MasterCourseCatalog;

import Professor.Professor;

import Certifier.Certifier;
import Professor.ProfessorDirectory;
import Roles.AdminRole;
import Roles.CertifierRole;
import Roles.ProfessorRole;
import Roles.StudentRole;
import Student.Student;
import UserAccount.UserAccount;
import UserAccount.UserAccountDirectory;

import java.util.ArrayList;

/**
 *
 * @author 15512
 */
public class Platform {

    MasterCourseCatalog masterCourseCatalog;
    ArrayList<String> terms;
    int revenue;
    Certifier certifier;
    StudentDirectory sd;
    ProfessorDirectory pd;
    UserAccountDirectory uad;

    public static Platform getInstance() {
        return new Platform();
    }

    public Platform(){
        this.certifier = new Certifier();
        this.sd = new StudentDirectory();
        this.pd = new ProfessorDirectory();

        this.masterCourseCatalog = new MasterCourseCatalog();
        
        //set up the terms
        this.terms = new ArrayList<String>();
        this.terms.add("Fall 2022"); 
        this.terms.add("Spring 2023");
        this.terms.add("Summer 2023");
        this.terms.add("Fall 2023"); 
        
        this.uad = new UserAccountDirectory();
        
        //create the admin user
        UserAccount admin = this.uad.createUserAccount("a", "a", new AdminRole());
        
        //create the certifier useraccount and certifier object
        UserAccount certifierAccount = this.uad.createUserAccount("c", "c", new CertifierRole());
        certifier.setPersonid(certifierAccount.getAccountId());
        certifier.setName("c");
        
        certifier.createDegree("MSIS");
        //below accounts are created for testing purpose
        UserAccount stuAccount = this.uad.createUserAccount("s", "s", new StudentRole());
        UserAccount p1ccount = this.uad.createUserAccount("p1", "p1", new ProfessorRole());
        UserAccount p2ccount = this.uad.createUserAccount("p2", "p2", new ProfessorRole());
        Student s = this.getSd().createStudent(stuAccount.getAccountId(), "s");
        Professor p1 = this.getPd().createProfessor(p1ccount.getAccountId(), "p1");
        Professor p2 = this.getPd().createProfessor(p2ccount.getAccountId(), "p2");
    }

    public MasterCourseCatalog getMasterCourseCatalog() {
        return masterCourseCatalog;
    }

    public void setMasterCourseCatalog(MasterCourseCatalog masterCourseCatalog) {
        this.masterCourseCatalog = masterCourseCatalog;
    }

    public void setTerms(ArrayList<String> terms) {
        this.terms = terms;
    }

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

    public ArrayList<CourseSchedule> listCourseOffersByTerm(String term) {
        ArrayList<CourseSchedule> coList = new ArrayList<CourseSchedule>();
        for (Professor p : this.pd.getProfessors()) {
            coList.add(p.getCourseScheduleByTerm(term));
        }
        return coList;
    }
   
    public
    StudentDirectory getSd() {
        return sd;
    }

    public void setSd(StudentDirectory sd) {
        this.sd = sd;
    }

    public ProfessorDirectory getPd() {
        return pd;
    }

    public void setPd(ProfessorDirectory pd) {
        this.pd = pd;
    }
    
    public UserAccountDirectory getUad() {
        return uad;
    }

    public void setUad(UserAccountDirectory uad) {
        this.uad = uad;
    }

    public ArrayList<String> getTerms() {
        return terms;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }
    
    
}
