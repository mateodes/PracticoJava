import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7 {
    public static void main(String[] args) {
        String texto = "";
        float numero = 0;
        boolean condicion = true;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);

        while (condicion) {
            System.out.println("Ingrese un numero: ");
            try {
                texto = buffer.readLine();
                numero = Float.parseFloat(texto);
            } catch (IOException e) {};
            if (numero>=0)
                condicion = false;
        }
        System.out.println("El numero que le permitio salir del bucle fue: "+numero);
    }
}
