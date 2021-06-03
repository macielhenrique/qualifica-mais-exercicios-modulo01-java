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
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String senhaCorreta = "web";
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite a senha");
        String senhaDigitada = scan.nextLine();
        
        if(senhaDigitada.equals(senhaCorreta)){
            System.out.println("Acesso PERMITIDO");
            
        }else {
            System.out.println("ACESSO NEGADO!");
        }
    }
    
}
