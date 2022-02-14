import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio15 {
    public static void main(String[] args) {
        String texto = "";
        int opcion = 0;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        boolean x = true;
        while(x){
            System.out.println("****** GESTION CINEMATOGRAFICA ******** \n 1-NUEVO ACTOR \n 2-BUSCAR ACTOR \n 3-ELIMINAR ACTOR \n 4-MODIFICAR ACTOR \n 5-VER TODOS LOS ACTORES \n 6-VER PELICULAS DE LOS ACTORES \n 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES \n 8-SALIR");
            try {
                texto = buffer.readLine();
                opcion = Integer.parseInt(texto);
                if(opcion > 8 || opcion < 1){
                    opcion = 1;
                }
                if (opcion <8 && opcion>0){
                    opcion = 2;
                }
            } catch (IOException e) {};
            switch (opcion){
                case 1:{
                    System.out.println("Opcion incorrecta");
                    break;
                }
                case 2:{
                    break;
                }
                case 8:{
                    x = false;
                    break;
                }

            }
        }
    }
}
