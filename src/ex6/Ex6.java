/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;
 import java.util.Scanner;
/**
 *
 * @author Gustavo.R
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int a,b,c;
   
   System.out.print("Informe o valor A: ");
   a = input.nextInt();
   
   System.out.print("Informe o  valor de B: ");
   b = input.nextInt();
   
   c = a;
   a = b;
   b = c;
   System.out.print("\nO valor de A é: "+a);
   System.out.print("\nO valor de B é: " +b);
   
           
    }
    
}