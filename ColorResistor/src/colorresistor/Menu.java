/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colorresistor;


 
public class Menu {
   private User objUser = new User();
   private Bandas ObjBandas = new Bandas();
   private Bandas1 ObjBandas1 = new Bandas1();
   private Bandas2 ObjBandas2 = new Bandas2();
    public void menu(){
        
    System.out.println("Calculadora de Resistores");
    System.out.println("Desarrollado por S. Gonzalez");
    System.out.println("Digite la opcion: \n 1. Para Calcular Resistencias. \n 2. Para Informacion del Programa. \n 3. Para Salir.");
    double op = objUser.InDato();
    
    if (op == 1){
        System.out.println("Digite la opcion: \n 1. Para 4 Bandas \n 2. Para 5 Bandas \n 3. Para 6 Bandas.");
    double sel = objUser.InDato();
    if(sel ==1){
    System.out.println("Calculadora de Resistores ------------- 4 Bandas");
    System.out.println("Codigo de colores Para Resistores");
    System.out.println("   /Num/    "+"    /Color/   "+"   /Multiplicador/  ");
    System.out.println(" 0 = Negro x1\n 1 = cafe x10\n 2 = Rojo x100 \n 3 = Naranja x1000\n 4 = Amarillo x10000\n 5 = Verde x1000000\n 6 = Azul x10000000\n 7 = Morado x100000000\n 8 = Gris x1000000000\n 9 = Blanco x10000000000");
    ObjBandas.calcularValorResistor();
    menu();
    }else if (sel==2){
    System.out.println("Calculadora de Resistores ------------- 5 Bandas");
    System.out.println("Codigo de colores Para Resistores");
    System.out.println("   /Num/    "+"    /Color/   "+"   /Multiplicador/  ");
    System.out.println(" 0 = Negro x1\n 1 = cafe x10\n 2 = Rojo x100 \n 3 = Naranja x1000\n 4 = Amarillo x10000\n 5 = Verde x1000000\n 6 = Azul x10000000\n 7 = Morado x100000000\n 8 = Gris x1000000000\n 9 = Blanco x10000000000");
    ObjBandas1.calcularValorResistor();
    menu();
    }else if(sel ==3){
    System.out.println("Calculadora de Resistores ------------- 6 Bandas");
    System.out.println("Codigo de colores Para Resistores");
    System.out.println("   /Num/    "+"    /Color/   "+"   /Multiplicador/  ");
    System.out.println(" 0 = Negro x1\n 1 = cafe x10\n 2 = Rojo x100 \n 3 = Naranja x1000\n 4 = Amarillo x10000\n 5 = Verde x1000000\n 6 = Azul x10000000\n 7 = Morado x100000000\n 8 = Gris x1000000000\n 9 = Blanco x10000000000");
    ObjBandas2.calcularValorResistor();
    menu();
    }else{
        System.out.println("Ingrese un Valor Valido");
    menu();
    }
    }else if(op==2){
    System.out.println("Autor: Santiago Gonzalez Rincon");   
    System.out.println("Correo: Santiagogr0806@gmail.com");
    System.out.println("Afiliacion: Universidad Distrital F.J.D.C");  
    menu();
    }else if (op==3){
    System.out.println("Gracias por Usar el programa");
    }else{
    System.out.println("Valor Invalido");
    menu();
    }
   
  }
            
}

