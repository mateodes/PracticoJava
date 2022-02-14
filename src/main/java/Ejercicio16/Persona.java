package Ejercicio16;

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
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=0;
        this.altura=0;
        this.sexo=sexo;
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura){
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
        String dni="";
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
        String persona ="";
        return persona;
    }

}
