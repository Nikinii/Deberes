/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaEnClase;

/**
 *
 * @author Niko
 */
public class Dueno1 {
     String nombre;
    int edad;
    String numTelefono;

     public Dueno1(String nombre, int edad, String numTelefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.numTelefono = numTelefono;
    }
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public void mostrarinfo() {
        System.out.println("El nombre del dueño es:" + this.nombre
                + "\n la edad del dueño es de: " + this.edad+"años"
                + "\n El numero de telefo del dueño es:" + this.numTelefono);
    }
}
