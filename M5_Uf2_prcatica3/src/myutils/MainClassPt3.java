/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

/**
 *
 * @author Sergio
 */
public class MainClassPt3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("inverteixCadena******");
        System.out.println(MyUtils.inverteixCadena("Supercalifragilisticoespialidoso"));
        System.out.println(MyUtils.inverteixCadena("Null"));
        System.out.println(MyUtils.inverteixCadena(null));
        System.out.println("");

        System.out.println("edat*********");
        System.out.println(MyUtils.edat(28, 05, 1992));
        System.out.println(MyUtils.edat(28, 05, 1550));
        System.out.println(MyUtils.edat(28, 05, 2222));
        System.out.println("");
        
        System.out.println("factorial******* ");
        System.out.println(MyUtils.factorial(3));
        System.out.println(MyUtils.factorial(-22));
        System.out.println("");
        



        
        
    }
    
}
