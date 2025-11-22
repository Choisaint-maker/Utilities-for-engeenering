
package colorresistor;


public class Bandas {
    private double x;
    private double y;
    private double z;
    private double w;
    private User ObjUser;

    public Bandas() {   
    this.x =0;
    this.y =0;
    this.z =0;
    this.w =0;
     ObjUser = new User();
    }

    public void calcularValorResistor() {
    
        System.out.println("Primera Banda");
        x = ObjUser.InDato();
        System.out.println("Primer Valor: " + x);

        System.out.println("Segunda Banda");
        y = ObjUser.InDato();
        System.out.println("Segundo Valor: " + y);

        System.out.println("Tercera Banda: ");
        z = ObjUser.InDato();
        System.out.print("Tercer valor: \n" + z);

      
        switch ((int) z) {
            case 0:
                z = 1;
                break;
            case 1:
                z = 10;
                break;
            case 2:
                z = 100;
                break;
            case 3:
                z = 1000;
                break;
            case 4:
                z = 10000;
                break;
            case 5:
                z = 100000;
                break;
            case 6:
                z = 1000000;
                break;
            case 7:
                z = 10000000;
                break;
            case 8:
                z = 100000000;
                break;
            case 9:
                z = 1000000000;
                break;
            default:
                System.out.println("Tercer Valor Invalido");
                return;
        }

        double valorRes = (x  * 10 + y) * z;
       

      
        System.out.println("Cuarta Banda (Tolerancia) \n");
        
        w = ObjUser.InDato();
        System.out.println("Tolerancia: \n" + w);


        double porcentajeTolerancia = getPorcentajeTolerancia((int) w);
         System.out.println("Valor Resistor: \n" + valorRes);
        System.out.println("Porcentaje de tolerancia: " + porcentajeTolerancia + "%");
    }

    private double getPorcentajeTolerancia(int ValorTolerancia) {
        switch (ValorTolerancia) {
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