/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Estudiantes
 */
 

import java.util.Scanner;

public class EcuacionCuadratica {
    Scanner s=new Scanner(System.in);
    private double a,b,c;
    private double x1,x2;
    private boolean TieneSol = true;

    public void ModA(double a){
        a = s.nextInt();
        this.a = a;
    }
    public void ModB(double b){
        b = s.nextInt();
        this.b = b;
    }
    public void ModC(double c){
        c = s.nextInt();
        this.c = c;
    }
    
        public boolean resolv(){
        double disc; //discriminante
        disc = b*b-4*a*c;
        if(disc==0){
        x1=(-b+Math.sqrt(disc))/(2*a);
        x2=x1;
        return true;
        }else{
            if(disc < 0){
            double rea = -b/2*a;
            double img = Math.sqrt((-disc/2*a));
            System.out.println("Soluciones complejas");
            System.out.println("x1="+rea +"+"+img +"i"  );
            return false;
            }else{
                x1=(-b+Math.sqrt(disc))/(2*a);
                x2=(-b-Math.sqrt(disc))/(2*a);
                return true;
                }
            }
        }
    public double devX1(){
    return x1;
    }
     public double devX2(){
    return x2;
    }
}
