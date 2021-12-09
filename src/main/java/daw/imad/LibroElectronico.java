/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw.imad;

import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author imad
 */
public class LibroElectronico {

    /*
    La utilidad del private es de proteger los atributos o metodos que
    no queremos que sean visibles fuera de nuestra clase, pero si queremos utilizar los
    atributos o metodos desde otra clase y solo utilizamos el private es imposible ya que
    esa clase nunca los vera seran totalmente invisibles, para ello deberiamos de utilizar el
    public que hace que los metodos y atributos sean publicos y podamos acceder a ellos
    desde cualquier clase, pero como tampoco nos interesa que sea todo publica para
    ello el 99% de las veces dejaremos los atributos privados y utilizaremos 
    metodos publicos para acceder o modificarlos Ejemplo Getter y Setter
     */
    //Atributos encapsulados
    private String identificadorLibro;//tres digitos(000-999)
    private String nombreLibro;
    private int numeroPaginasTotales;//max 9999 paginas
    private double MBLibro;//Max 10 MB
    private int paginaActual;

    //Constructores
    //Constructor por defecto, que crea objetos con identificador aleatorio entre 000 y 999,
    //el libro que contiene es "Don Quijote de la Mancha" con 1435 páginas y 5MB de espacio. 
    public LibroElectronico() {
        identificadorLibro = RandomStringUtils.randomNumeric(3).toUpperCase();
        nombreLibro = "Don Quijote de la Mancha";
        numeroPaginasTotales = 1435;
        MBLibro = 5;
        paginaActual = 1;

    }

    //Constructor parametrizado. En caso de crear libros de más de 9999 páginas o más de 10 MB, 
    //se deben establecer estos valores a cero.
    public LibroElectronico(String identificadorLibro, String nombreLibro, int numeroPaginasTotales, double MBLibro) {
        this.identificadorLibro = identificadorLibro;
        this.nombreLibro = nombreLibro;
        this.numeroPaginasTotales = 0;
        //Si el numero es mayor o igual que 0 y menor o igual que 9999 significa que es un valor correcto
        if (numeroPaginasTotales >= 0 && numeroPaginasTotales <= 9999) {
            this.numeroPaginasTotales = numeroPaginasTotales;
        }
        this.MBLibro = 0;
        if (MBLibro >= 0 && MBLibro <= 10) {
            this.MBLibro = MBLibro;
        }
        this.paginaActual = 1;
    }

    //metodos
    //Metodo publico que sirve para pasar a la siguiente página.
    public void pasarPagina() {
        //Solo salta de pagina si el numero no es igual al maximo de paginas que
        //significa que ya no hay mas paginas que leer
        if (this.paginaActual != numeroPaginasTotales) {
            this.paginaActual = this.paginaActual + 1;
            //BORRAR ELSE solo sirve para depurar
        } else {
            System.out.println("No se puede pasar de pagina es la ultima");
        }
    }

    //Metodo publico que sirve para  retrocede una página.
    public void retrocederPagina() {
        //Solo retrocede de pagina si el numero no es igual o menor a 1 que
        //significa que no se puede retroceder paginas
        if (this.paginaActual > 1) {
            this.paginaActual = this.paginaActual - 1;
            //BORRAR ELSE solo sirve para depurar
        } else {
            System.out.println("No se puede retroceder de pagina es la primera");
        }
    }

    //Metodo publico que recibe un parametro y salta hacia adelante (si el parámetro numero es positivo) o hacia atrás (si el parámetro numero es negativo) 
    //tantas páginas como indica el parámetro.
    public void saltar(int numero) {
        int sumaPaginas = this.paginaActual + (numero);
        
        if (sumaPaginas <= this.numeroPaginasTotales && sumaPaginas > 0) {

            this.paginaActual = sumaPaginas;

        }

    }

    //Metodos Getter y setter.
    public String getIdentificadorLibro() {
        return identificadorLibro;
    }

    public void setIdentificadorLibro(String identificadorLibro) {
        this.identificadorLibro = identificadorLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getNumeroPaginasTotales() {
        return numeroPaginasTotales;
    }

    public void setNumeroPaginasTotales(int numeroPaginasTotales) {
        this.numeroPaginasTotales = 0;
        //Si el numero es mayor o igual que 0 y menor o igual que 9999 significa que es un valor correcto
        if (numeroPaginasTotales >= 0 && numeroPaginasTotales <= 9999) {
            this.numeroPaginasTotales = numeroPaginasTotales;
        }
    }

    public double getMBLibro() {
        return MBLibro;
    }

    public void setMBLibro(double MBLibro) {
        this.MBLibro = 0;
        if (MBLibro >= 0 && MBLibro <= 10) {
            this.MBLibro = MBLibro;
        }
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    //meodo sobresescrito toString
    @Override
    public String toString() {
        return "LibroElectronico{" + "identificadorLibro=" + identificadorLibro + ", nombreLibro=" + nombreLibro + ", numeroPaginasTotales=" + numeroPaginasTotales + ", MBLibro=" + MBLibro + ", paginaActual=" + paginaActual + '}';
    }

}
