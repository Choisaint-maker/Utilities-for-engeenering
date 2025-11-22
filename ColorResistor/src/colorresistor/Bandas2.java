
package colorresistor;


public class Bandas2 {

    private double x;
    private double y;
    private double z;
    private double w;
    private double v; 
    private double t; 
    private User ObjUser;
        

    public Bandas2() {
    this.x =0;
    this.y =0;
    this.z =0;
    this.w =0;
    this.t = 0;
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
        System.out.print("Tercer valor: " + z);

        System.out.println("Cuarta Banda: ");
        w = ObjUser.InDato();
        System.out.print("Cuarto valor: " + w);

        //multiplicadores
        double multiplicadorZ = getMultiplicador(z);
        double multiplicadorW = getMultiplicador(w);

        //valor resistor
        double valorRes = (x * 100 + y * 10 + z) * multiplicadorZ * multiplicadorW;

        System.out.println("Valor de la resistencia: " + valorRes);

        // calcular tolerancia
        System.out.println("Quinta Banda (Tolerancia)");
        System.out.println("1. para Rojo \n 2. para plateado \n 3. para Doradol");
        v = ObjUser.InDato();
        System.out.println("Tolerancia: " + v);

        // calcular tolerancia porcentaje
        double tolerancePercentage = getToleranciaPorcentaje((int) v);
        System.out.println("Tolerancia porcentaje: " + tolerancePercentage + "%");

        // calcular coeficiente de temperatura (TCR)
        System.out.println("Sexta Banda (TCR)");
        t = ObjUser.InDato();
        System.out.println("TCR: " + t);

        // calcular TCR en ppm/C
        double tcrPpmC = getTcrPpmC((int) t);
        System.out.println("TCR (ppm/C): " + tcrPpmC);
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

    private double getToleranciaPorcentaje(int toleranciaValor) {
        switch (toleranciaValor) {
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

    private double getTcrPpmC(int tcrValor) {
        switch (tcrValor) {
            case 1:
                return 100;
            case 2:
                return 50;
            case 3:
                return 15;
            default:
                return 0.0; 
        }
    }
}

