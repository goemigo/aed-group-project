/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Platform;

import CourseCatalog.MasterCourseCatalog;
import Personnel.Certifier;
import java.util.ArrayList;

/**
 *
 * @author 15512
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
        
    }
    
    public static Platform getInstance() {
        return new Platform();
    }
    
}
