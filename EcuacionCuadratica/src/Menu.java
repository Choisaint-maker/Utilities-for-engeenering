/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Choisaint
 */
import java.util.Scanner;

public class Menu {
    Scanner s=new Scanner(System.in);
    EcuacionCuadratica ec= new EcuacionCuadratica();
    public int InDatos(){
        
        System.out.println("Bienvenido al solucionador de ecuaciones cuadraticas");
        System.out.println("Version 1.3");
        System.out.println("Desarrollado Por Santiago G.");
        
        System.out.println("Seleccione Una opcion");
        System.out.println("1 para Resolver ecuaciones");
        System.out.println("2 para informacion de contacto");
        System.out.println("3 para salir");
        int i= s.nextInt();
        
        if(i==1){
        
        System.out.println("Ingrese el Valor del Coeficiente A");
        double a = 0;
        ec.ModA(a);
        System.out.println("Ingrese el Valor del Coeficiente B");
        double b = 0;
        ec.ModB(b);
        System.out.println("Ingrese el Valor del Coeficiente C");
        double c = 0;
        ec.ModC(c); 
        System.out.println("Las Raices de la Ecuacion son;");
        ec.resolv();
        
        if(ec.resolv()){
        System.out.println("X1: "+  ec.devX1());
        System.out.println("X2: "+  ec.devX2());
        }else{
        System.out.println("La solucion està en los "); 
        }      
        InDatos();  
        
    }if(i==2){
    System.out.println("Autor: Santiago Gonzalez Rincon");   
    System.out.println("Correo: Santiagogr0806@gmail.com");
    System.out.println("Afiliacion: Universidad Distrital F.J.D.C");  
    InDatos();
    }if(i==3){
    System.out.println("Gracias por Usar El programa");   
    }else{
        System.out.println("Valor Invalido, Seleccione 1 o 2");  
        InDatos();
        }     
return i;
  }
        
}

