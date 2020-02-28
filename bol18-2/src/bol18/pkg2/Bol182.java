/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol18.pkg2;

/**
 *
 * @author ipampillonvieitez
 */
public class Bol182 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Metodos a = new Metodos();
        a.crearArrayRandom();
//a.amosarArrayNotas();
        a.contarAprobadosSuspensos();
        System.out.println("Nota media: " + a.calcularNotaMedia());
        a.amosarNotaAlta();

        a.crearArrayNomes();
//a.amosarArrayNomes();
        a.amosarArrays();
        /*
a.visualizarNotaAlumno();
a.visualizarAlumnosAprobados();
a.ordencrecenteArrays();
a.amosarArrays();
a.amosarListaAprobados();
         */
        a.hacerMenu();

    }

}
