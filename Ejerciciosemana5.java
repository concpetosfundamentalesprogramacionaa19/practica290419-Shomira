/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosemana5;
import java.util.Scanner;
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
        /**
El costo de matricula de un estudiante es de $1330. Pero se debe considerar algunas situaciones:

Al costo final de matrícula se le debe agregar 2% por trámite administrativos.
Nota: los porcentajes deben estar en una clase y paquete diferente; para su importación en la clase Principal.
* */
        //Determinar el costo de la matricula de un estudiante
     
     double  precioMatricula = 1330;
     double totalPrecio=1330;
     double descuentoCiudad ;
     double descuentoMatricula;
     double descuentoEdad ;
     double descuentoEstadoCivil ;
     double descuentoCargasFamiliares ;
     Scanner entrada = new Scanner(System.in);
     
     System.out.println("INGRESO DE DATOS DEL ESTUDIANTE ");
     System.out.println("Ingrese su nombre: ");
     String nombre = entrada.nextLine();
        //Si el estudiante es de Loja o Zamora, se descontara el 20% de la matrícula inicial.
     System.out.println("Estimad@ " +nombre + "escriba el lugar de donde es usted de Loja o Zamora? ");
     String lugar = entrada.nextLine();
        //Si la edad del estudiante es mayor o igual a 17 y menor a 20, al costo de la matrícula inicial se le descontara 10
     System.out.println("Ingrese su edad");
     int edad = entrada.nextInt();
        //Si el estado civil del estudiante es casado se descontara el 5% del costo de matrícula inicial.
     System.out.println("�Usted es casado?.Conteste SI o NO: ");
     String estadoCivil = entrada.nextLine();
        //Si el estudiante tiene una o varias cargas familiares se le descontara el 3% del costo de matrícula inicial.
     System.out.println("�Usted tiene cargas familiares?.Conteste de igual forma SI O NO : ");
     String cargasFam = entrada.nextLine();
        //Al costo final de matrícula se le debe agregar 2% por trámite administrativos.
     
     if (lugar.equals("Loja") || lugar.equals("Zamora")){
        descuentoCiudad = precioMatricula *PorcentajeMatricula.des_lojaZamora;
        totalPrecio = (precioMatricula-descuentoCiudad);
    }
     if (edad >=17 || edad < 20){
        descuentoEdad = (precioMatricula * PorcentajeMatricula.descuentoEdad);  
        totalPrecio = (totalPrecio-descuentoEdad);
    }
     if(estadoCivil.equals("SI")){
        descuentoEstadoCivil = (precioMatricula*PorcentajeMatricula.desc_estadoCivil);
        totalPrecio = (totalPrecio-descuentoEstadoCivil);
    }   
     if(cargasFam.equals("SI")){
        descuentoCargasFamiliares = (precioMatricula*PorcentajeMatricula.desc_estadoCivil);
        totalPrecio = (totalPrecio-descuentoCargasFamiliares);
    }      
         
        System.out.println("El costo de su matricula es "+ totalPrecio);
    
        
    
    }
    
}
