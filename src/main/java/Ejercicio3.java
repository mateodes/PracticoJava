import java.io.*;
public class Ejercicio3 {

    public static void main(String[] args) {
        String texto = "";
        double pi = 3.14, radio = 0, area = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);

        try {
            System.out.println("Ingrese el radio del circulo: ");
            texto = buffer.readLine();
            radio = Double.parseDouble(texto);
        } catch (IOException e) {};
        area = pi * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }
}
