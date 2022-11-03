/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TareaEnClase;

/**
 *
 * @author Niko
 */
public class Principal {


    public static void main(String[] args){
        
        var dueno1 = new Dueno1("Juanito Alcachofa",21,"0928287898");
        var mascota1 = new Mascota1("Bolita",10,dueno1);
        var atencion1 = new Atencion1("10am-8pm","Patitas",10,mascota1);
        atencion1.mostrarInfo();
        dueno1.mostrarinfo();
        mascota1.mostrarinfo();
    } 

    
}
