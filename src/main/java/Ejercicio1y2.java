import java.io.*;
public class Ejercicio1y2 {
    public static void main(String[] args){
        String texto = "";
        int numero1 = 0, numero2 = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);

        try{
            System.out.println("Ingrese el primer numero: ");
            texto = buffer.readLine();
            numero1 = Integer.parseInt(texto);
            System.out.println("Ingrese el segundo numero: ");
            texto = buffer.readLine();
            numero2 = Integer.parseInt(texto);
        }catch(IOException e){};

        if(numero1 == numero2){
            System.out.println("Ambos numeros son iguales");
        }else if(numero1 > numero2){
            System.out.println("El primer numero es mayor que el segundo");
        }else{
            System.out.println("El segundo numero es mayor que el primero");
        }
    }
}
