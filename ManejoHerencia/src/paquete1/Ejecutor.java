/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int op;

        System.out.println("[1] Prestamo Automovil\n"
                + "[2] Prestamo Educativo\n");
        op = entrada.nextInt();

        if (op < 1 || op > 2) {
            System.err.println("Error, opción no válida.");
        } else {
            entrada.nextLine();
            System.out.println("Ingrese nombres: ");
            String nombres = entrada.nextLine();
            System.out.println("Ingrese cedula: ");
            String cedula = entrada.nextLine();

            switch (op) {
                case 1:
                PrestamoAutomovil automovil1 = new PrestamoAutomovil(cedula, cedula, cedula, op, op);
                    
                    System.out.println("Ingrese tipo automovil: ");
                    automovil1.setTipoautomovil(entrada.nextLine());
                    System.out.println("Ingrese la marca: ");
                    automovil1.setMarca(entrada.nextLine());
                    System.out.println("Ingrese el garante: ");
                    automovil1.setGarante(entrada.nextLine());
                    System.out.println("Ingrese el Valor Auto: ");
                    automovil1.setGarante(entrada.nextLine());
                    System.out.println("Ingrese el garante: ");
                    automovil1.setGarante(entrada.nextLine());
                    
                    break;
                case 2:
                    PrestamoEducativo docenteF = new DocenteFactura();
                    docenteF.establecerNombres(nombres);
                    docenteF.establecerId(cedula);

                    System.out.println("Ingrese el Valor de Factura: ");
                    docenteF.establecerValorFactura(entrada.nextFloat());
                    System.out.println("Ingrese el descuento porcentaje iva: ");
                    docenteF.establecerValorFactura(entrada.nextFloat());
                    docenteF.obtenerValorCancelar();
                    System.out.printf("%s\n", docenteF);
                    break;
                default: break;
            }
        }
    }
}
