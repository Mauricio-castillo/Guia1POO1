/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosComplementarios;
import java.util.*;
/**
 *
 * @author jose4
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Capturamos los numeros
        Scanner reader = new Scanner(System.in);
        int num1, num2;
        System.out.println("Digite un numero: ");
        num1 = reader.nextInt();
        System.out.println("Digite otro numero: ");
        num2 = reader.nextInt();
        //Estructura condicional para saber si el numero es divisible o no por el otro numero
        if (num1%num2 == 0)//si el numero 1 al dividirlo con numero 2 nos da 0
            System.out.println(num1 + " es divisible por " + num2);//mostramos mensaje que diga que el num1 es divisible por num2
        else//caso contrario
            System.out.println(num1 + " No es divisible por " + num2);//mostramos un mensaje que diga que el num1 no es divisible por num2.
    }
}
