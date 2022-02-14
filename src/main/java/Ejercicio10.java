import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {

    public static void main(String[] args) {

        String frase = "";
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            System.out.println("Ingrese una frase para eliminar sus espacios: ");
            frase = buffer.readLine();
        } catch (IOException e) {};
        frase = frase.replace(" ", "");
        System.out.println(frase);
    }

}
