package Aula08;

import java.util.Scanner;
public class Ex01 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tempoMinutos;
        int tempoSegundos;
        System.out.println("Tempo em minutos: ");
        tempoMinutos = entrada.nextInt();
        
        tempoSegundos = tempoMinutos*60;
        
        System.out.println("Tempo em segundos: ");
        System.out.println(tempoSegundos);
        
    }
    
}
