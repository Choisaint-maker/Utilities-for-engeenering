
package calculadora;

import java.util.Scanner;

public class Calculadora {
    
    int funcion;
    double num1;
    double num2;
    int op;
    double res;


    Scanner s=new Scanner(System.in);
 
    public static void main(String[] args) {
        Calculadora fun=new Calculadora();
        fun.menu();    
    }
    
    double suma(){ 
      System.out.println("Ingrese Primer Valor");
      num1= s.nextInt();
     System.out.println("Ingrese Segundo Valor");
      num2 = s.nextInt();
      res=num1+num2;
      return res;
       }
    double resta(){ 
      System.out.println("Ingrese Primer Valor");
      num1= s.nextInt();
     System.out.println("Ingrese Segundo Valor");
      num2 = s.nextInt();
      res=num1-num2;
      return res;
       }
    
    double mult(){ 
     System.out.println("Ingrese Primer Valor");
      num1= s.nextInt();
     System.out.println("Ingrese Segundo Valor");
      num2 = s.nextInt();
      res=num1*num2;
      return res;
       }
     double div(){ 
         System.out.println("Ingrese Primer Valor");
      num1= s.nextInt();
     System.out.println("Ingrese Segundo Valor");
      num2 = s.nextInt();
      res=num1/num2;
      return res;
       }
     
    
       void opbasicas( int op){
  System.out.println("seleccione la operación");
  System.out.println("1 para suma");
  System.out.println("2 para resta");
  System.out.println("3 para multiplicación");
  System.out.println("4 para division");
    op= s.nextInt();
    if(op==1){
     this.suma();
      }
  if(op==2){
      this.resta();
  }
  if(op==3){
      this.mult();
      }
  if(op==4){
   this.div();
  }   
}
    double sen(){
    System.out.println("Ingrese Valor En Grados: ");
    num1= s.nextInt();
    double x = num1*(Math.PI/180);
    res=Math.sin(x);
    return res;
    } 
    double cos(){
    System.out.println("Ingrese Valor En Grados: ");
    num1= s.nextInt();
    double x = num1*(Math.PI/180);
    res=Math.cos(x);
    return res;
    } 
    double tan(){
      System.out.println("Ingrese Valor En Grados: ");
    num1= s.nextInt();
    double x = num1*(Math.PI/180);
    res=Math.tan(x);
    return res;
    } 
       
       
       void tancos(int op1){
  System.out.println("Seleccione la operación:");
  System.out.println("1 para Seno.");
  System.out.println("2 para Coseno.");
  System.out.println("3 para Tangente.");
  System.out.println("4 para pasar de °C a °F");
  System.out.println("5 para pasar de °F a °C");
  op1= s.nextInt();

  if(op1==1){
    this.sen();
  }
  
  if(op1==2){
    this.cos(); 
  }
  
  if(op1==3){
   this.tan();
  }
  if(op1==4){
     System.out.println("Ingrese Valor En Grados C: ");
    num1= s.nextInt();
    res = (num1 * 9/5) +32;
  }
  if(op1==5){
     System.out.println("Ingrese Valor En Grados F: ");
    num1= s.nextInt();
    res = (num1 - 32) * 5/9;
  }
}
       
       void mostrarr(){
        System.out.println("el resultado es: "+res);
       }
    
   void menu(){
        System.out.println("Calculadora/Funciones V 2.0");
        System.out.println("Desarrollado por S. Gonzalez");
        System.out.println("Digite un numero para seleccionar la función:");
        System.out.println(" 1 para Operaciones Basicas. ");
        System.out.println(" 2 para Funciones Varias.");
        System.out.println(" 3 para cerrar el programa");
        funcion= s.nextInt();  
        
  if (funcion==1){
    this.opbasicas(op);
    this.mostrarr();
    this.menu();
    }
  if (funcion==2){
    this.tancos(op);
    this.mostrarr();
    this.menu();
    }   
  if(funcion==3){
  System.out.println("Gracias por usar el programa."); 
   }
  else{
       System.out.println("Ingrese un valor valido") ;
      this.menu();
  }
 }  
}
    

   






