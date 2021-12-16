import java.util.Scanner;

public class Boletin16_12_2021Ejercicio6 {

    /*
    Ejercicio 6. Diseñar un programa en JAVA que solicite un número entero mayor que 0 y dibuje un
triángulo rectángulo de n elementos de lado, usando para ello asteriscos (*). Por ejemplo para n= 8,
debería salir lo siguiente
     */
        static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        pintarTriangulo();
    }

    public static int pedirNumero(){

        System.out.println("Introduzca las filas");
        return sc.nextInt();
    }

    public static void pintarTriangulo(){

        int filas=pedirNumero();

        for (int altura=0;altura<filas;altura++){
            for (int espacio=0;espacio<(filas-altura)*2;espacio++){
                System.out.print(" ");
            }
            for (int triangulo=0;triangulo<=altura;triangulo++){
                System.out.print(" *");
            }
            System.out.println();

        }
    }
}
