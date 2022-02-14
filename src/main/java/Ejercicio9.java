import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 {

    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        frase = frase.replace("a", "e");
        frase = frase.concat(" No sabia que concatenar asi que buenos dias");
        System.out.println(frase);
    }
}
