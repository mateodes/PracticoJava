import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11 {

    public static void main(String[] args) {
        String frase = "";
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        try {
            System.out.println("Ingrese una frase: ");
            frase = buffer.readLine();
        } catch (IOException e) {};
        int cantidadcaracteres = frase.length();
        int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
        char a = 'a', A='A', e = 'e',E='e',i='i',I='I',o='o',O='O', u='u', U='U';
        for (int x=0; x<cantidadcaracteres;x++){
            if((frase.charAt(x) == a )|| (frase.charAt(x)==A)) contadorA++;
            if((frase.charAt(x) == e )|| (frase.charAt(x)==E)) contadorE++;
            if((frase.charAt(x) == i )|| (frase.charAt(x)==I)) contadorI++;
            if((frase.charAt(x) == o )|| (frase.charAt(x)==O)) contadorO++;
            if((frase.charAt(x) == u )|| (frase.charAt(x)==U)) contadorU++;
        }
        System.out.println("El largo de la frase es: "+cantidadcaracteres +" a:"+contadorA +" e:"+contadorE +" i:"+contadorI +" o:"+contadorO +" u:"+contadorU);

    }

}
