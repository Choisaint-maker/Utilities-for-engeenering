/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colorresistor;

/**
 *
 * @author Estudiantes
 */
public class Bandas1 {
    private double x;
    private double y;
    private double z;
    private double w;
    private double v; // valor de la quinta banda (tolerancia)
     private User ObjUser;

    public Bandas1() {
    this.x =0;
    this.y =0;
    this.z =0;
    this.w =0;
    ObjUser = new User();
    }

    public void calcularValorResistor() {


        System.out.println("Primera Banda");
        this.x = ObjUser.InDato();
        System.out.println("Primer Valor: " + x);

        System.out.println("Segunda Banda");
        y = ObjUser.InDato();
        System.out.println("Segundo Valor: " + y);

        System.out.println("Tercera Banda: ");
        z = ObjUser.InDato();
        System.out.print("Tercer valor: \n" + z);

        System.out.println("Cuarta Banda: ");
        w = ObjUser.InDato();
        System.out.print("Cuarto valor: " + w);

        // convertir z y w a multiplicadores
        double multiplicadorZ = getMultiplicador(z);
        double multiplicadorW = getMultiplicador(w);

        // calcular valor de la resistencia
        double valorRes = (x * 100 + y * 10 + z) * multiplicadorZ * multiplicadorW;

        System.out.println("Valor de la resistencia: " + valorRes);

     
        System.out.println("Quinta Banda (Tolerancia)");
        System.out.println("1. para Rojo \n 2. para plateado \n 3. para Doradol");
        v = ObjUser.InDato();
        System.out.println("Tolerancia: " + v);

        double tolerancePercentage = getTolerancePercentage((int) v);
        System.out.println("Tolerancia porcentaje: " + tolerancePercentage + "%");
    }

    private double getMultiplicador(double valor) {
        switch ((int) valor) {
            case 0:
                return 1;
            case 1:
                return 10;
            case 2:
                return 100;
            case 3:
                return 1000;
            case 4:
                return 10000;
            case 5:
                return 100000;
            case 6:
                return 1000000;
            case 7:
                return 10000000;
            case 8:
                return 100000000;
            case 9:
                return 1000000000;
            default:
                return 1; 
        }
    }

    private double getTolerancePercentage(int toleranceValue) {
        switch (toleranceValue) {
            case 1:
                return 2;
            case 2:
                return 10;
            case 3:
                return 5;
         
            default:
                return 0.0; 
        }
    }
}

