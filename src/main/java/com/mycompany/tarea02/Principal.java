/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea02;

/**
 *
 * @author Niko
 */
public class Principal {

    public static void main(String[] arga) {
        var empleado1 = new Empleado();
        empleado1.nombre = "Juan Vince";
        empleado1.horasTrabajadas = 180;
        empleado1.costoHoras = 20;
        empleado1.yearIngreso = 2000;

        System.out.println("El nombre del empleado es: " + empleado1.nombre + " y su ingreso neto es de: "
                + empleado1.calcularIngresos(2022) + "\nSu ingreso por bonos debido a horas extras trabajadas es de: "
                + empleado1.bonoHorasExtra() + "\nEl impuesto a pagar es de: "
                + empleado1.calcularImpuesto(300, 400, 500)
                + "\nSn valor total de: " + empleado1.calcularTotal(2022, 300, 400, 500));

        System.out.println("---------------------------------------");

        var empleado2 = new Empleado();
        empleado2.nombre = "Adolf Stalin";
        empleado2.horasTrabajadas = 160;
        empleado2.costoHoras = 10;
        empleado2.yearIngreso = 2006;

        System.out.println("El nombre del empleado es: " + empleado2.nombre + " y su ingreso neto es de: "
                + empleado2.calcularIngresos(2022) + "\nSu ingreso por bonos debido a horas extras trabajadas es de: "
                + empleado2.bonoHorasExtra() + "\nEl impuesto a pagar es de: "
                + empleado2.calcularImpuesto(300, 400, 500)
                + "\nCon un valor total de: " + empleado2.calcularTotal(2022, 300, 400, 500));
        System.out.println("---------------------------------------");

        var empleado3 = new Empleado();
        empleado3.nombre = "Dieguito Maradona";
        empleado3.horasTrabajadas = 200;
        empleado3.costoHoras = 70;
        empleado3.yearIngreso = 2012;

        System.out.println("El nombre del empleado es: " + empleado3.nombre + " y su ingreso neto es de: "
                + empleado3.calcularIngresos(2022) + "\nSu ingreso por bonos debido a horas extras trabajadas es de: "
                + empleado3.bonoHorasExtra() + "\nEl impuesto a pagar es de: "
                + empleado3.calcularImpuesto(300, 400, 500)
                + "\nCon un valor total de: " + empleado3.calcularTotal(2022, 300, 400, 500));
    }

}
