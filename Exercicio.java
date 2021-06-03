/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  scan = new Scanner (System.in); // Declarar o objeto
        System.out.println("Digite o Primeiro valor :");
        int n1 = scan.nextInt();
        System.out.println("Digite o segundo valor : ");
        int n2= scan.nextInt();
        
        if (n1>n2){
            System.out.println("O maior valor é " +n1);
        }else{
            System.out.println("O maior valor é" + n2 );
        }
        
        
    }
    
}
