public class Main {
    public static void main(String[] args) {
        System.out.println("Suma de numeros: ");
        int num1, num2, num3;
         suma(num1 = 4, num2 = 5, num3 = 8);

       //parte2
        System.out.println("Número de Puertas: ");
        Coche coche = new Coche();
        coche.IncrementarPuertas();
        coche.IncrementarPuertas();
        coche.IncrementarPuertas();
        System.out.println(coche.numPuertas);
    }


    // suma parte1

    public static void suma(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
        System.out.println(num1 + num2);
        System.out.println(num2 + num3);
    }
}

//clase coche
class Coche{
        public int numPuertas=0;

        public void IncrementarPuertas(){
            this.numPuertas++;
        }
}



