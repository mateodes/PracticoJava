package Ejercicio16;

public class Persona {
    String nombre;
    int edad;
    String DNI;
    float peso;
    float altura;
    boolean sexo; //Masculino = true, Femenino = false

    //CONSTRUCTORES-----------------------------------------

    public Persona(){
        this.nombre="";
        this.edad=0;
        this.peso=0;
        this.altura=0;
        this.sexo=true;
    }

    public Persona(String nombre, int edad, boolean sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=0;
        this.altura=0;
        this.sexo=sexo;
    }

    public Persona(String nombre, int edad, boolean sexo, float peso, float altura){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.altura=altura;
        this.sexo=sexo;
    }

    //GETTERS --------------------------------------
    public int getEdad(){
        return this.edad;
    }

    public boolean getSexo(){
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

    public void setSexo(boolean sexo){
        this.sexo=sexo;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String setDNI(String dni){
        this.DNI=dni;
    }

    public void setPeso(float peso){
        this.peso=peso;
    }

    public void setAltura(float altura){
        this.altura=altura;
    }


    public int calcularIMC(){

    }

    public String generarDNI(){
        
    }

}
