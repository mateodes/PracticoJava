package Ejercicio16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import Ejercicio16.Persona;

public class Main {



    public static void main(String[] args){

        String nombre = "",texto="";
        int edad=0;
        float peso =0, altura=0;
        char sexo=' ';
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(in);
        System.out.println("Ingrese un nombre: ");
        try {
            texto = buffer.readLine();
            nombre = texto;
        } catch (IOException e) {};
        System.out.println("Ingrese una edad: ");
        try {
            texto = buffer.readLine();
            edad = Integer.parseInt(texto);
        } catch (IOException e) {};
        System.out.println("Ingrese el sexo: (M=Mujer H=Hombre)");
        try {
            texto = buffer.readLine();
            sexo = texto.charAt(0);
        } catch (IOException e) {};
        System.out.println("Ingrese el peso: ");
        try {
            texto = buffer.readLine();
            peso = Float.parseFloat(texto);
        } catch (IOException e) {};
        System.out.println("Ingrese la altura: ");
        try {
            texto = buffer.readLine();
            altura = Float.parseFloat(texto);
        } catch (IOException e) {};

        Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona p2 = new Persona(nombre,edad,sexo);
        Persona p3 = new Persona();

        //Comprobaciones peso ideal

        int pesoIdeal = p1.calcularIMC();
        if(pesoIdeal==1){
        System.out.println("Esta primera persona tiene sobrepeso");
        }else if(pesoIdeal==-1){
        System.out.println("Esta primera persona esta bajo su peso ideal");
        }else System.out.println("Esta primera persona tiene su peso ideal");

        pesoIdeal = p2.calcularIMC();
        if(pesoIdeal==1){
        System.out.println("Esta segunda persona tiene sobrepeso");
        }else if(pesoIdeal==-1){
        System.out.println("Esta segunda persona esta bajo su peso ideal");
        }else System.out.println("Esta segunda persona tiene su peso ideal");

        pesoIdeal = p3.calcularIMC();
        if(pesoIdeal==1){
        System.out.println("Esta tercera persona tiene sobrepeso");
        }else if(pesoIdeal==-1){
        System.out.println("Esta tercera persona esta bajo su peso ideal");
        }else System.out.println("Esta tercera persona tiene su peso ideal");

        //Comprobaciones mayoria de edad

        if(p1.esMayorDeEdad()==true){
        System.out.println("Esta primer persona es mayor de edad");
        }else System.out.println("Esta primer persona es menor de edad");

        if(p2.esMayorDeEdad()==true){
        System.out.println("Esta segunda persona es mayor de edad");
        }else System.out.println("Esta segunda persona es menor de edad");

        if(p3.esMayorDeEdad()==true){
        System.out.println("Esta tercera persona es mayor de edad");
        }else System.out.println("Esta tercera persona es menor de edad");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

    }



}

