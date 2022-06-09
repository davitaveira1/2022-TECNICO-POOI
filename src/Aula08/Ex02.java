/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula08;

/**
 *
 * @author 2201338
 */
import java.util.Scanner;
public class Ex02 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        
        System.out.print("Informe a idade:");
        idade = entrada.nextInt();
        
        double altura;
        System.out.print("Informe a altura: ");
        altura = entrada.nextDouble();
        
        String email;
        System.out.print("Informe o e-mail: ");
        email = entrada.next();
        
        entrada.nextLine();
        String nomeCompleto;
        System.out.print("Informe o seu nome completo: ");
        nomeCompleto = entrada.nextLine();
        
        System.out.println("Idade :"+idade);
        System.out.println("Altura: "+altura);
        System.out.println("Email: "+email);
        System.out.println("Nome completo: "+nomeCompleto);
        
    }
    
}
