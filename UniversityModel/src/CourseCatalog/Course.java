/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseCatalog;

/**
 *
 * @author 15512
 */
public class Course {

    String number;
    String name;
    int credits;
    int price = 1500; //per credit hour
    String description;

    public Course(String n, String num, int ch) {
        name = n;
        number = num;
        credits = ch;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCOurseNumber() {
        return number;
    }

    public int getCoursePrice() {
        return price * credits;
    }

    public int getCredits() {
        return credits;
    }
}
