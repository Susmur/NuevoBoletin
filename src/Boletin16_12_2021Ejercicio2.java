import java.util.Scanner;

public class Boletin16_12_2021Ejercicio2 {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        // declaracion de variables
        int numeroMayor=0;
        int numeroMenor;
        int numeroLeido;
        int contador=0;
        int suma=0;
        numeroLeido=leerNumero();
        numeroMenor=numeroLeido;
        do {
            contador++;
            numeroMayor=comparaMayor(numeroLeido,numeroMayor);
            numeroMenor=comparaMenor(numeroLeido,numeroMenor);
            suma=suma+numeroLeido;
            numeroLeido=leerNumero();


        }while(numeroLeido!=0);
        System.out.println("El mayor de los numeros introducidos es: " + numeroMayor);
        System.out.println("El menor es: " + numeroMenor);
        System.out.println("La cantidad de numeros introducidos es: " + contador);
        System.out.println("La media de todos ellos es: " + hallarMedia(contador,suma));
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
     * postcondicion salida de la media de los datos introducidos
     * @param contador
     * @param suma
     * @return devuelve el resultado de la media entre la suma total y la cantidad de veces
     * que se ha introducido los numeros
     */
    public static float hallarMedia(int contador, int suma){

        float media=0;
        if (contador>0){

            media=suma/contador;
    }
        return media;
    }

    /**
     * precondicion:
     * porstondicion: salida por consola de el numero mas alto de los numeros dados
     * @param numeroLeido
     * @param numeroMayor
     * @return devuelve el valor mas alto introducido por consola
     */
    public static int comparaMayor(int numeroLeido, int numeroMayor ){


        if(numeroLeido>numeroMayor){
            numeroMayor=numeroLeido;
        }
       return numeroMayor;
    }

    /**
     * prondicion:
     * postcondicion: devuelve 0 siempre, ya que es la condicion de salida y lo almacena, ya que tenemos puesto que el menor sea
     * igual o mayor que 0, por lo tanto siempre sera 0.
     * @param numeroLeido
     * @param  numeroMenor
     * @return devuelve el menor de los numero introducidos
     **/
    public static int comparaMenor(int numeroLeido, int numeroMenor) {

        if (numeroLeido < numeroMenor) {
            numeroMenor = numeroLeido;
        }

        return numeroMenor;
    }
}
