/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colorresistor;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class User {
    
    private int a;
    Scanner s = new Scanner(System.in);
    
    public User(){
    this.a=0;
    }
    
    public int Seta(int z){
        a=z;
        return a;
    }
    
    public void Geta(int z){
   this.a = z;
    }
    public double InDato(){
    System.out.println("digite un valor");
    double x;
    x=s.nextDouble();
    return x;
    }
}
