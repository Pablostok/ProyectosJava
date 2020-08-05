//Realizar la secuencia de Fibonacci

public class Fibonacci {
    public static void main(String args[]){
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        int num = 0, auxsuma = 1, num_nuevo = 0;

        System.out.print("\n");

        for(int i = 0; i <= 50; i++){
            if(i != 50){
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