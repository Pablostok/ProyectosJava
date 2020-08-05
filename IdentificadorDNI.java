import java.util.Scanner;

public class IdentificadorDNI {

    boolean MetodoIdentificador(int num_DNI, String letra_DNI){
        int resto = num_DNI % 23;
        boolean respuesta = false;

        switch(letra_DNI.toUpperCase()){

            case "T": 
            if(resto == 0){
                respuesta = true;
            }
            break;

            case "R": 
            if(resto == 1){
                respuesta = true;
            }
            break;

            case "W": 
            if(resto == 2){
                respuesta = true;
            }
            break;

            case "A": 
            if(resto == 3){
                respuesta = true;
            }
            break;
            case "G": 
            if(resto == 4){
                respuesta = true;
            }
            break;

            case "M": 
            if(resto == 5){
                respuesta = true;
            }
            break;

            case "Y": 
            if(resto == 6){
                respuesta = true;
            }
            break;

            case "F": 
            if(resto == 7){
                respuesta = true;
            }
            break;
            case "P": 
            if(resto == 8){
                respuesta = true;
            }
            break;

            case "D": 
            if(resto == 9){
                respuesta = true;
            }
            break;

            case "X": 
            if(resto == 10){
                respuesta = true;
            }
            break;

            case "B": 
            if(resto == 11){
                respuesta = true;
            }
            break;
            case "N": 
            if(resto == 12){
                respuesta = true;
            }
            break;

            case "J": 
            if(resto == 13){
                respuesta = true;
            }
            break;

            case "Z": 
            if(resto == 14){
                respuesta = true;
            }
            break;
            case "S": 
            if(resto == 15){
                respuesta = true;
            }
            break;

            case "Q": 
            if(resto == 16){
                respuesta = true;
            }
            break;

            case "V": 
            if(resto == 17){
                respuesta = true;
            }
            break;
            case "H": 
            if(resto == 18){
                respuesta = true;
            }
            break;

            case "L": 
            if(resto == 19){
                respuesta = true;
            }
            break;

            case "C": 
            if(resto == 20){
                respuesta = true;
            }
            break;
            case "K": 
            if(resto == 21){
                respuesta = true;
            }
            break;

            case "E": 
            if(resto == 22){
                respuesta = true;
            }
            break;

            default:
            respuesta = false;
            break;
        }

        return respuesta;
    }
    
    public static void main(String args[]){

        IdentificadorDNI llamar_funciones = new IdentificadorDNI();

        Scanner entrada = new Scanner(System.in);
        int num_DNI = 0;
        String DNI = "", letra_DNI = "";

        System.out.println("");

        System.out.println("Introduzca su DNI:");
        DNI = entrada.nextLine();

        num_DNI = Integer.parseInt(DNI.substring(0, 8));
        letra_DNI = DNI.substring(8, 9);
        entrada.close();

        boolean respuesta = llamar_funciones.MetodoIdentificador(num_DNI, letra_DNI);

        System.out.println("");
        if(respuesta == true){
            System.out.println("  -El DNI es correcto-  ");
        }
        else{
            System.out.println("  -El DNI no es correcto-  ");
        }
    }
}
