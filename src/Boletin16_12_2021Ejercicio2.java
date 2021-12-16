import java.util.Scanner;

public class Boletin16_12_2021Ejercicio2 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        // declaracion de variables
        int numeroMayor=0;
        int numeroMenor=999999999;
        int numeroLeido;
        int contador;
        int suma;


        do {
            numeroLeido=leerNumero();
            numeroMayor=comparaMayor(numeroLeido,numeroMayor);
            numeroMenor=comparaMenor(numeroLeido,numeroMenor);



        }while(numeroLeido!=0);

    }

    /**
     *  Pide un numero por pantalla y lo lee por teclado.
     * @return int con el numero leido por el teclado
     */
    public static int leerNumero(){

        System.out.println("Introduzca un numero ");

        return sc.nextInt();

    }
     /*
    Ejercicio 2. Realizar un programa que lea una serie de números enteros positivos hasta que se
introduzca un cero y muestre la cantidad de números introducidos, la media, el número mayor y el
número menor.
     */


    /**
     * precondicion
     * postcondicion
     * @param contador
     * @param suma
     * @return
     */
    public static float hallarMedia(int contador, int suma){

        float media=0;
        if (contador>0){

            media=suma/contador;
    }
        return media;
    }

    public static int comparaMayor(int numeroLeido, int numeroMayor ){


        if(numeroLeido>numeroMayor){
            numeroMayor=numeroLeido;
        }
       return numeroMayor;
    }

    /**
     *
     * @param
     * @param
     * @return
     */
    public static int comparaMenor(int numeroLeido, int numeroMenor) {

        if (numeroLeido < numeroMenor) {
            numeroMenor = numeroLeido;
        }

        return numeroMenor;
    }
}
