/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaEnClase;

/**
 *
 * @author Niko
 */
public class Atencion1 {
    private String horario;
    private String nomlocal;
    private int costo;
    Mascota1 mascota;
    
     public Atencion1(String horario, String nomlocal, int costo, Mascota1 mascota) {
        this.horario = horario;
        this.nomlocal = nomlocal;
        this.costo = costo;
        this.mascota = mascota;
    }

    public String getHorario() {
        return horario;
    }

    public String getNomlocal() {
        return nomlocal;
    }

    public int getCosto() {
        return costo;
    }

    public Mascota1 getMascota() {
        return mascota;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setNomlocal(String nomlocal) {
        this.nomlocal = nomlocal;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setMascota(Mascota1 mascota) {
        this.mascota = mascota;
    }

    
    public void mostrarInfo(){
        System.out.println("El nombre del local es: "+this.nomlocal+
                "\n los horarios de atencion son: "+this.horario+
                "\n El costo de la atencion es de: "+this.costo+" $"+
                "\n El mascota es: "+this.getMascota().getNombre());
    }
    
    
}
