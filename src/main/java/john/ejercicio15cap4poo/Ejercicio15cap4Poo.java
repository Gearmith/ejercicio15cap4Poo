/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package john.ejercicio15cap4poo;
import java.util.Scanner;

/**
 *
 * @author johnferneymontoyaramirez
 */
public class Ejercicio15cap4Poo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL PESO DE LA ESFERA A: ");
        double pesoA = entrada.nextDouble();
        System.out.println("INGRESE EL PESO DE LA ESFERA B: ");
        double pesoB = entrada.nextDouble();
        System.out.println("INGRESE EL PESO DE LA ESFERA C: ");
        double pesoC = entrada.nextDouble();
        System.out.println("INGRESE EL PESO DE LA ESFERA D: ");
        double pesoD = entrada.nextDouble();

        if (pesoA == pesoB && pesoA == pesoC) {
	    if (pesoD > pesoA) {
	        System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MAYOR PESO");
	    } else {
	        System.out.println("LA ESFERA D ES LA DIFERENTE Y ES DE MENOR PESO");
	    }
        } else if (pesoA == pesoB && pesoA == pesoD) {
	    if (pesoC > pesoA) {
	        System.out.println("LA ESFERA C ES LA DIFERENTE Y ES DE MAYOR PESO");
	    } else {
	        System.out.println("LA ESFERA C ES LA DIFERENTE Y ES DE MENOR PESO");
	    }
        } else if (pesoA == pesoC && pesoA == pesoD) {
	    if (pesoB > pesoA) {
	        System.out.println("LA ESFERA B ES LA DIFERENTE Y ES DE MAYOR PESO");
	    } else {
	        System.out.println("LA ESFERA B ES LA DIFERENTE Y ES DE MENOR PESO");
	    }
	} else if (pesoA > pesoB) {
	    System.out.println("LA ESFERA A ES LA DIFERENTE Y ES DE MAYOR PESO");
	} else {
	    System.out.println("LA ESFERA A ES LA DIFERENTE Y ES DE MENOR PESO");
	} 
    }
}
