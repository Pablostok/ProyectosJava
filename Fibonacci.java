//Realizar la secuencia de Fibonacci

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        int num = 0, auxsuma = 1, num_nuevo = 0, numeros_a_observar = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("");
        System.out.println(" ~Bienvenid@ al sistema de sucuencia de Fibonacci creado por Pablitu~ ");
        System.out.println("");
        System.out.print("Introduzca los numeros que desea ver de la secuencia: ");
        numeros_a_observar = entrada.nextInt();

        entrada.close();

        System.out.print("\n");

        for(int i = 0; i <= numeros_a_observar; i++){
            if(i != numeros_a_observar){
                System.out.print(Integer.toString(num) + ", ");
                num_nuevo = num + auxsuma;
                num = auxsuma;
                auxsuma = num_nuevo;
            }
            else{
                System.out.print(Integer.toString(num) + "\n");
            }
        }
    }
}
