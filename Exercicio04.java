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
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite a quantidade de maças");
        int quantidade = scan.nextInt();
        double valorTotal;
        
        if (quantidade < 12){
            valorTotal = quantidade * 0.30;
        }else if(quantidade >=12 && quantidade <= 30) {
            valorTotal= quantidade * 0.25;
        }else{
            valorTotal = quantidade * 0.2;
        }
        System.out.println("O total a pagar é: " +valorTotal);

    }
    

    
}
