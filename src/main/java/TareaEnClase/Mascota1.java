/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaEnClase;

/**
 *
 * @author Niko
 */
public class Mascota1 {

    private String nombre;
    private int edad;
    Dueno1 dueno;

    public Mascota1(String nombre, int edad, Dueno1 dueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Dueno1 getDueno() {
        return dueno;
    }

    public void setDueno(Dueno1 dueno) {
        this.dueno = dueno;
    }

    

    public void mostrarinfo() {
        System.out.println("El nombre de la mascota es:" + this.nombre
                + "\n la edad de la mascota es de:" + this.edad+" años"
                + "\n El dueño de la mascota es:" + this.getDueno().getNombre());
    }

}
