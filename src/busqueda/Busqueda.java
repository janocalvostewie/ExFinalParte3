package busqueda;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Busqueda {

    public static void main(String[] args) {
        //Numero de elementos
//        System.out.println("Introduce el número de elementos: ");
//        Scanner scNmElementos = new Scanner(System.in);
        int numElementos=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el número de elementos:"));
        //Número que queremos buscar
//        System.out.println("Introduce el número para averiguar: ");
//        Scanner scNumAveriguar = new Scanner(System.in);
        int numAveriguar=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el número para averiguar:"));
        int[] numeros = new int[numElementos];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i * 5;
        }
        Busqueda ejemplo = new Busqueda();
        int indice = ejemplo.busquedaBinaria(numeros, numAveriguar, 0, numeros.length - 1);
        System.out.println("El indice del valor "+numAveriguar+" es: " + indice);
    }

    public int busquedaBinaria(int[] listado, int clave, int posInicial, int posFinal) {
        int posMitad = (posFinal + posInicial) / 2;
        if (clave == listado[posMitad]) {
            return posMitad;
        } else if (clave < listado[posMitad]) {
            if (posMitad - 1 <= posInicial) {
                return -1;
            } else {
                return busquedaBinaria(listado, clave, posInicial, posMitad - 1);
            }
        } else if (posMitad + 1 >= posFinal) {
            return -1;
        } else {
            return busquedaBinaria(listado, clave, posMitad + 1, posFinal);
        }
    }
}
