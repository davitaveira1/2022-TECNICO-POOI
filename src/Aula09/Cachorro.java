/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula09;

/**
 *
 * @author 2201338
 */
public class Cachorro {
    
    //atributos
    String nome;
    double peso;
    int idade;
    
    //metodos
    
    public static void main(String[] args) {
        //criando um objeto do tipo cachorro
        //criando a variavel
        Cachorro dog = new Cachorro();        
        //inserir nome no cachorro
        dog.nome="Pluto";
        dog.idade=3;
        dog.peso=2.5;
        
        System.out.println("Nome do cachorro: "+dog.nome);
        System.out.println("Idade do cachorro: "+dog.idade);
        System.out.println("Peso do cachorro: "+dog.peso);
    }
    
}
