//Likzy Hinojosa Reyes
//24/10/23
//Proposito: Hace que el usuarios logre obtener el numero de un factorial
package com.mycompany.practica5;
import java.util.Scanner;

public class Practica5 {
    
  public static void main (String[]args){
      Scanner Scanner = new Scanner (System.in);
      System.out.println("Ingrese numero para calcular factorial: ");
int numero= Scanner.nextInt();
int factorial=1;
while (numero!=0)
{
    factorial*= numero;
    numero--;
}
System.out.println("El factorial es:" + factorial); 
  }
}
