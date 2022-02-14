package Ejercicio16;

import java.util.Random;

public class Persona {
    String nombre;
    int edad;
    String DNI;
    float peso;
    float altura;
    char sexo; //Masculino = M, Femenino = F

    //CONSTRUCTORES-----------------------------------------

    public Persona(){
        this.nombre="";
        this.edad=0;
        this.peso=0;
        this.altura=0;
        this.sexo='H';
        setDNI(generarDNI());
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=0;
        this.altura=0;
        this.sexo=comprobarSexo(sexo);
        setDNI(generarDNI());
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.altura=altura;
        this.sexo=comprobarSexo(sexo);
        setDNI(generarDNI());
    }

    //GETTERS --------------------------------------
    public int getEdad(){
        return this.edad;
    }

    public char getSexo(){
        return this.sexo;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDNI(){
        return this.DNI;
    }

    public float getPeso(){
        return this.peso;
    }

    public float getAltura(){
        return this.altura;
    }

//SETTERS -------------------------------------------
public void setEdad(int edad){
    this.edad=edad;
}

    public void setSexo(char sexo){
        this.sexo=sexo;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setDNI(String dni){
        this.DNI=dni;
    }

    public void setPeso(float peso){
        this.peso=peso;
    }

    public void setAltura(float altura){
        this.altura=altura;
    }

    //Metodos a utilizar-----------------------------------------

    public int calcularIMC(){
        if(this.peso/(Math.pow(this.altura,2))<20){
            return-1;
        }else if(this.peso/(Math.pow(this.altura,2))>25){
            return 1;
        }else return 0;
    }

    public String generarDNI(){
        String dni ="";
        Random r = new Random();
        //Generacion numero ocho cifras random
        int numbers = 10000000 + (int)(r.nextFloat() * 899900);
        dni += String.valueOf(numbers);
        //Generacion letra random para dni
        char c = (char)(r.nextInt(26) + 'a');
        dni = dni+c;
        return dni;
    }

    public boolean esMayorDeEdad(){
        if (this.edad > 18)
            return true;
        else return false;
    }

    public char comprobarSexo(char sexo){
        if(sexo != 'M' ){
            sexo = 'H';
        }
        return sexo;
    }

    public String toString(){
        String persona="Nombre: ";
        persona = persona.concat(this.nombre);
        String peso = String.valueOf(this.peso);
        persona= persona+" Peso: ";
        persona = persona.concat(peso);
        String altura = String.valueOf(this.altura);
        persona = persona+" Altura: ";
        persona = persona.concat(altura);
        String edad = String.valueOf(this.edad);
        persona = persona+" Edad: ";
        persona = persona.concat(edad);
        persona = persona+" DNI: ";
        persona = persona.concat(this.DNI);
        persona = persona+" Sexo: ";
        persona = persona+this.sexo;
        return persona;
    }

}
