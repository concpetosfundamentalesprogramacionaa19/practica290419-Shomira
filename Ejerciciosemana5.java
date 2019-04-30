/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosemana5;

import java.util.Scanner;
//Importacion del paquete donde de encuentran los porcentajes 
import porcentajes.PorcentajeMatricula;

/**
 *
 * @author FJTAMATTSH
 */
public class Ejerciciosemana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        //Declaracion de Variables 

        double precioMatricula = 1330;
        double totalPrecio = 1330;
        double descuentoCiudad;
        double descuentoMatricula;
        double descuentoEdad;
        double descuentoEstadoCivil;
        double descuentoCargasFamiliares;
        double costoCargoAdm;
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("INGRESO DE DATOS DEL ESTUDIANTE ");
        System.out.println("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        //Si el estudiante es de Loja o Zamora
        System.out.println("Estimad@ " + nombre + " escriba el lugar de "
                + "donde es usted de Loja o Zamora? ");
        String lugar = entrada.nextLine();
        //Edad del Estudiante
        System.out.println("Ingrese su edad");
        int edad = entrada.nextInt();
        //Si el estado civil del estudiante es casado
        entrada.nextLine();
        System.out.println("¿Usted es casado?.Conteste SI o NO: ");
        String estadoCivil = entrada.nextLine();
        //Si el estudiante tiene una o varias cargas familiares 
        System.out.println("¿Usted tiene cargas familiares?.Conteste "
                + "de igual forma SI O NO : ");
        String cargasFam = entrada.next();

        // Si es  de Loja o Zamora,se descontara el 20% de la matrícula.
        if (lugar.equals("Loja") || lugar.equals("Zamora")) {
            descuentoCiudad = (precioMatricula*PorcentajeMatricula.des_lojaZamora);
            totalPrecio = (precioMatricula - descuentoCiudad);
        }
        //La edad es >=17 y < 20, al costo de la matrícula se le descontara 10
        if (edad >= 17 || edad < 20) {
            descuentoEdad = (precioMatricula * PorcentajeMatricula.descuentoEdad);
            totalPrecio = (totalPrecio - descuentoEdad);
        }
        //Si es casado se descontara el 5% del costo de matrícula inicial.
        if (estadoCivil.equals("SI")) {
            descuentoEstadoCivil =(precioMatricula*PorcentajeMatricula.desc_estadoCivil);
            totalPrecio = (totalPrecio - descuentoEstadoCivil);
        }
        //Si tiene una o varias cargas familiares se le descontara el 3% 
        if (cargasFam.equals("SI")) {
            descuentoCargasFamiliares = (precioMatricula*PorcentajeMatricula.des_cargasFam);
            totalPrecio = (totalPrecio - descuentoCargasFamiliares);
        }
        //Al costo final  se agrega el  2% por trámite administrativos.
        costoCargoAdm = (totalPrecio * PorcentajeMatricula.cost_administrativo);
        totalPrecio = totalPrecio + costoCargoAdm;
        //Salida de datos con el costo final de la matricula 
        System.out.println("El costo de su matricula es " + totalPrecio);

    }

}
