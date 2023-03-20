/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Certifier;

import Personnel.Person;

/**
 *
 * @author 15512
 */
public class Certifier extends Person{
    Degree degree;
    
    public Certifier(){
        super();
    }

    public
    Degree getDegree() {
        return degree;
    }

    public Degree createDegree(String name) {
        Degree d = new Degree(name);
        return d;
    }
    
    
   
    
}

