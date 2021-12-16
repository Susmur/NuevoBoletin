import java.util.Scanner;

public class Boletin16_12_2021Ejercicio3 {
    /*
    Ejercicio 3. Realizar un programa que lea dos números enteros positivos N y M y muestre los múltiplos
de N que hay desde 1 hasta M. Por ejemplo si N = 4 y M = 500 el programa mostrará los múltiplos de 4
desde 1 hasta 500. El valor de N deberá ser menor que el valor de M. Si no se introducen valores
válidos para N o M se mostrará el mensaje correspondiente y se vuelven a pedir.
     */
        static Scanner sc=new Scanner(System.in);


    /**
     * precondiciones: queremos introducir por consola dos numeros enteros positivos y que nos muestre los multiplos del primero hasta
     * llegar al segundo
     * postcondiciones:
     * quer
     * @param args
     */
    public static void main(String[] args) {

        int numeroMultiplo;
        int numeroMaximo;

        System.out.println("Introduzca el valor de n");
        numeroMultiplo=sc.nextInt();
        System.out.println("Introduzca el valor de m");
        numeroMaximo=sc.nextInt();


        if (numeroMultiplo<numeroMaximo){


        hallarMultiplo(numeroMultiplo,numeroMaximo);

        }else{

            System.out.println("El valor de n debe de ser mayor que m");
            System.out.println("Introduzca el valor de n");
            numeroMultiplo=sc.nextInt();
            System.out.println("Introduzca el valor de m");
            numeroMaximo=sc.nextInt();
            hallarMultiplo(numeroMultiplo,numeroMaximo);
        }

    }

    /**
     *
     * @param numeroMultiplo
     * @param numeroMaximo
     */
    public static void hallarMultiplo(int numeroMultiplo, int numeroMaximo){


        for (int i=0; i<=numeroMaximo;i+=numeroMultiplo){


            System.out.println(i);
        }


    }

}
