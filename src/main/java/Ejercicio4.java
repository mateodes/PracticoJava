import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {
    public static void main(String[] args) {
        String texto = "";
        double iva = 21, precio = 0, preciofinal = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);

        try {
            System.out.println("Ingrese el precio del producto: ");
            texto = buffer.readLine();
            precio = Double.parseDouble(texto);
        } catch (IOException e) {};
        preciofinal = precio + (precio*(iva/100));
        System.out.println("El precio final del producto es: " + preciofinal);
    }
}
