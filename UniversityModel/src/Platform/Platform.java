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

    public Platform() {
        this.certifier = new Certifier();
        this.sd = new StudentDirectory();
        this.pd = new ProfessorDirectory();

        this.masterCourseCatalog = new MasterCourseCatalog();
        this.terms.add("Fall 2022");
        this.terms.add("Spring 2023");
        this.terms.add("Summer 2023");
        this.terms.add("Fall 2023");

        this.uad = new UserAccountDirectory();

        UserAccount user = this.uad.createUserAccount("a", "a", new AdminRole());

    }

    public MasterCourseCatalog getMasterCourseCatalog() {
        return masterCourseCatalog;
    }

    public void setMasterCourseCatalog(MasterCourseCatalog masterCourseCatalog) {
        this.masterCourseCatalog = masterCourseCatalog;
    }

    public ArrayList<String> getTerms() {
        return terms;
    }

    public void setTerms(ArrayList<String> terms) {
        this.terms = terms;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
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

    public MasterCourseCatalog getCourseCatalog() {
        return masterCourseCatalog;
    }

    public ArrayList<CourseSchedule> listCourseOffersByTerm(String term) {
        ArrayList<CourseSchedule> coList = new ArrayList<CourseSchedule>();
        for (Professor p : this.pd.getProfessors()) {
            coList.add(p.getCourseScheduleByTerm(term));
        }
        return coList;
    }

    public static void main(String[] args) {
        // TODO code application logic here

    }

    public StudentDirectory getSd() {
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
}
