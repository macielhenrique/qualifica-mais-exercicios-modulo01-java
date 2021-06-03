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
public class Exercicio02 {
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite um valor");
        int valor = scan.nextInt();// Aguarda a leitura do valor
        
        
        // Testar se o valor digitado é par ou impar
        if(valor % 2== 0){
            System.out.println(valor + "  É par");
        }else{
            System.out.println( valor + "  É impar");
        }
    }
    
}
