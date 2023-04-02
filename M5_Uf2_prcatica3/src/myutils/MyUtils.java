package myutils;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Sergio
 */
public class MyUtils {

    public static String inverteixCadena(String cadena) {
        // variable para guardar texto al reves
        String resultado = "";

        // si la cadena es null, lo guardamos en varibale resultado
        if (cadena == null) {
            resultado = null;
        } else {
            // Creo variable interna con la longitud de cadena-1
            //con la que recorre cadena y guarda en orden inverso cada caracter
            //en resultado
            for (int i = cadena.length() - 1; i >= 0; i--) {
                resultado += cadena.charAt(i);
            }
        }
        return resultado;
    }

    /**
     * @param dia int dia del naixement
     * @param mes int mes del naixement
     * @param anyo int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     */
    public static int edat(int dia, int mes, int anyo) {
        // Importo LocalDate y creo objeto fechaNacimiento donde le paso
        //año, mes y dia.
        LocalDate fechaNacimiento = LocalDate.of(anyo, mes, dia);

        // LocalDate.now() da la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Almaceno la edad, nos hace una resta entre fecha actual y nacimiento
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();

        // Si el año es menor a 0,ó la fecha mayor a la actual, return -2
        if (fechaNacimiento.isAfter(fechaActual) || anyo < 0) {
            return -2;
        }

        // Si edad es superior que 150, return -1
        if (edad > 150) {
            return -1;
        }

        // si la edad es viable, returun edad
        return edad;

    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial. Si es negativo, return -1
     */
    public static double factorial(double numero) {
        double resultado = 0;
        if (numero == 0) {
            return 1;
        } else {
            if (numero < 0) {
                return -1;
            } else {
                resultado = numero * factorial(numero - 1);
            }

        }
        return resultado;
    }

}
