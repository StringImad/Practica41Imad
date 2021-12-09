/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.imad;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author imad
 */
public class PruebaLibro {

    public static void main(String[] args) {
//        int eleccionVentana = 0;
//        boolean repetir = false;
//        String identificadorUsuario = null;
//        String nombreLibroIntroducidoPorUsuario;
//        String numeroPaginasIntroducidoPorUsuarioString;
//        int numeroPaginasIntroducidoPorUsuario;
//        String MBLibroIntroducidoPorUsuarioString;
//        double MBLibroIntroducidoPorUsuario;

        LibroElectronico prueba1 = new LibroElectronico();
        LibroElectronico prueba2 = new LibroElectronico();
        System.out.println("---Datos Libro 1----");
        System.out.println(prueba1);
        System.out.println("---Datos Libro 2----");
        System.out.println(prueba2);
        LibroElectronico prueba3 = new LibroElectronico("111", "La aguja", 1300, 4);
 
        prueba3.pasarPagina();
        System.out.println(prueba3);
        prueba3.saltar(20);
        System.out.println(prueba3);
        prueba3.retrocederPagina();
        System.out.println(prueba3);

//        do {
//            try {
//
//                identificadorUsuario = JOptionPane.showInputDialog("Pulse 1 para Introducir el identificador del libro manual\n"
//                        + "Pulse 2 para generarlo automatico");
//                eleccionVentana = Integer.parseInt(identificadorUsuario);
//                repetir = false;
//
//            } catch (NumberFormatException ex) {
//                JOptionPane.showMessageDialog(null, "Formato incorrecto:\n"
//                        + "Por favor ingrese un valor valido", "Error de formato",
//                        JOptionPane.ERROR_MESSAGE);
//                repetir = true;
//            }
//        } while (repetir);
//        switch (eleccionVentana) {
//            case 1:
//
//                identificadorUsuario = JOptionPane.showInputDialog("Introduce el identificador del libro");
//
//                break;
//            case 2:
//                identificadorUsuario = RandomStringUtils.randomNumeric(3).toUpperCase();
//                break;
//        }
//        //nombreLibro
//        nombreLibroIntroducidoPorUsuario = JOptionPane.showInputDialog("Introduce el nombre del libro");
//        //PaginasTotales
//        numeroPaginasIntroducidoPorUsuarioString = JOptionPane.showInputDialog("Introduce las paginas totales");
//        numeroPaginasIntroducidoPorUsuario = Integer.parseInt(numeroPaginasIntroducidoPorUsuarioString);
//
//        //MB Libro
//        MBLibroIntroducidoPorUsuarioString = JOptionPane.showInputDialog("Introduce los MB del libro");
//        MBLibroIntroducidoPorUsuario = Integer.parseInt(MBLibroIntroducidoPorUsuarioString);
//        LibroElectronico prueba3 = new LibroElectronico("111", "La aguja", 13000, 4);
//
//        LibroElectronico prueba4 = new LibroElectronico(identificadorUsuario, nombreLibroIntroducidoPorUsuario, numeroPaginasIntroducidoPorUsuario, MBLibroIntroducidoPorUsuario);
//        System.out.println("---Datos Libro 3----");
//        JOptionPane.showMessageDialog(null, prueba3.toString());
//
//        System.out.println(prueba3);
//        System.out.println("---Datos Libro 4----");
//        JOptionPane.showMessageDialog(null, prueba4.toString());
//
//        System.out.println(prueba4);
//        System.out.println("---Pasando 4 pagina libro 3---");
//        prueba3.pasarPagina();
//        prueba3.pasarPagina();
//        prueba3.pasarPagina();
//        prueba3.pasarPagina();
//        System.out.println(prueba3);
//        JOptionPane.showMessageDialog(null, prueba3.toString());
//
//        System.out.println("---retrocediendo 2 pagina libro 3---");
//        prueba3.retrocederPagina();
//        prueba3.retrocederPagina();
//        System.out.println(prueba3);
//        JOptionPane.showMessageDialog(null, prueba3.toString());
//
//        System.out.println("---Retrocediendo 1 pagina libro 4---");
//        prueba4.retrocederPagina();
//        System.out.println(prueba4);
//        JOptionPane.showMessageDialog(null, prueba4.toString());
//
//        System.out.println("---saltando 100 paginas libro 4---");
//        prueba4.saltar(100);
//        System.out.println(prueba4);
//        JOptionPane.showMessageDialog(null, prueba4.toString());
//
//        System.out.println("---restando 50 paginas libro 4---");
//        prueba4.saltar((-50));
//        System.out.println(prueba4);
//        JOptionPane.showMessageDialog(null, prueba4.toString());
    }

}
