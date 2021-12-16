import java.util.Scanner;

public class Boletin16_12_2021 {

 /*
     Ejercicio 1. Realizar un programa para jugar a adivinar un número entre 0 y 100. El programa irá dando
pistas al jugador indicándole si el número introducido por el jugador es menor o mayor que el número
que tiene que adivinar. El juego termina cuando el jugador adivina el número o decide terminar de
jugar (por ejemplo, escribiendo un número negativo). Usaréis el método Math.random()
  */
    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {

        int sorte, suerte, contadorRandon=0;

        suerte=calcularRandom();

        do {
            sorte=leerNumero();

            if(sorte>suerte){
                System.out.println("El numero  es menor ");
                contadorRandon++;
            }else if(sorte<suerte){
                System.out.println("el numero es mayor");
                contadorRandon++;
            }else{
                System.out.println("Enhorabuena!! has acertado en " + contadorRandon + " intentos");
            }
        }while(sorte>=0);


    }

    public static int leerNumero(){

        System.out.print("""
                
                Introduzca un numero del 0 al 100
                
                """);
        return sc.nextInt();
    }

    public static int calcularRandom(){

        int numero;

        numero=(int)(Math.random()*101);

        return numero;
    }

}
