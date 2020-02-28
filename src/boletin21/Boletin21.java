/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import boletin21.metodos.Libro;
import boletin21.metodos.Metodos;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aalvarezbretana
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Libro> libro = new ArrayList();
        Metodos obx = new Metodos();
        File ficheiro = new File("libros.txt");
        int resposta;

        do {
            System.out.println("\nQue queres facer?"
                    + "\n 1.-Crear libro."
                    + "\n 2.-Vender libro."
                    + "\n 3.-Mostrar libros."
                    + "\n 4.-Dar de baixa un libro se has unidades son 0."
                    + "\n 5.-Ordenar."
                    + "\n 0.-Saír.");
            Scanner sc = new Scanner(System.in);
            resposta = sc.nextInt();
            switch (resposta) {
                case 1:
                    obx.engadirLibro("libros.txt");
                    break;
                case 2:
                    obx.consultar(ficheiro);
                    break;
                case 3:
                    obx.visualizar(ficheiro);
                    break;
                case 4:
                    obx.darBaixa(libro, ficheiro);
                    obx.escribirListaActualizada("libros.txt", libro);
                    break;
                case 5:
                    obx.modificarPrezo(libro);
                    obx.escribirListaActualizada("libros.txt", libro);
            }
        } while (resposta != 0);

    }

}
