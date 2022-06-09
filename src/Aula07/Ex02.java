package Aula07;

import java.util.Scanner;
public class Ex02 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);    
        System.out.print("Informe o nome do usuário (sem espaço): ");
        String nome = entrada.next();
        
        System.out.print("Informe a idade: ");
        int idade = entrada.nextInt();
        
        System.out.print("Informe a altura: ");
        double altura = entrada.nextDouble();
        
        System.out.println("O nome digitado foi: "+nome);
        System.out.println("A idade digitada foi: "+idade);
        System.out.println("A altura digitada foi: "+altura);
        
        
    }
    
}
