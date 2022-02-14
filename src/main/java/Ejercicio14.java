import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14 {
    public static void main(String[] args) {
        String texto = "";
        int numero =  0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);

        try {
            System.out.println("Ingrese un numero: ");
            texto = buffer.readLine();
            numero = Integer.parseInt(texto);
        } catch (IOException e) {};

        for(int i = numero ; i<=1000; i=i+2){
            System.out.println(i);
        }

    }

}
