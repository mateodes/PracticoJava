import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Ejercicio8 {
    public static void main(String[] args) {
        String dia = "";
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        System.out.println("Ingrese un dia de la semana: ");
        try {
            dia = buffer.readLine();
        } catch (IOException e) {};
        int opcion = 0;
        if ((dia.equalsIgnoreCase("lunes")) || (dia.equalsIgnoreCase("martes")) || (dia.equalsIgnoreCase("miercoles")) || (dia.equalsIgnoreCase("jueves")) || (dia.equalsIgnoreCase("viernes"))){
            opcion = 1;
        };
        if((dia.equalsIgnoreCase("sabado")) || (dia.equalsIgnoreCase("domingo"))){
            opcion = 2;
        };
        switch (opcion) {
            case 1:{
                System.out.println("Es un dia laboral");
                break;
            }
            case 2:{
                System.out.println("Es un dia NO laboral");
                break;
            }
        }
    }
}