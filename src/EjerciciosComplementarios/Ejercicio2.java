/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosComplementarios;

import javax.swing.JOptionPane;

/**
 *
 * @author jose4
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
        String primernumero;
        String segundonumero;

        int numero1;
        int numero2;
        int suma;

        primernumero = JOptionPane.showInputDialog("Digite el primer numero");
        segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
        
        //Condicion para los numeros negativos
        if (Integer.parseInt(primernumero) < 0 && Integer.parseInt(segundonumero) < 0)
        {
            JOptionPane.showMessageDialog(null, "No puede ingresar valores negativos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
        primernumero = JOptionPane.showInputDialog("Digite el primer numero");
        segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");

        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);

        suma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Resultado", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
