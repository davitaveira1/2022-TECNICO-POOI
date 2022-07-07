/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula09;

/**
 *
 * @author 2201338
 */
public class Gato {
    
    //atributos
    String nome;
    int idade;
    String proprietario;
    String sexo;
    
    //metodos
    void pular(){
        System.out.println("Gato pulando!");
    }
    
    void som(){
        System.out.println("Miau!");
    }
    
    void xixi(){
        System.out.println("Gato fazendo xixi!");
    }
    
    //apresentar as informações do gato
    void apresentarInformacoesGato(int anoNascimento){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Proprietário: "+proprietario);
        System.out.println("Sexo: "+sexo);
        System.out.println("Ano nascimento: "+anoNascimento);
    }
    
    //método principal        
    public static void main(String[] args) {
        Gato cat = new Gato();
        
        //inicializar atributos
        cat.nome="Garfield";
        cat.idade=6;
        cat.proprietario="Jony";
        cat.sexo="M";
        
        //chamar os métodos
        /*
        cat.pular();
        cat.som();
        cat.xixi();
        */
        //apresentando os atributos do gato
        /*
        System.out.println("Nome: "+cat.nome);
        System.out.println("Idade: "+cat.idade);
        System.out.println("Proprietário: "+cat.proprietario);
        System.out.println("Sexo: "+cat.sexo);
        */
        //apresentando as informações via método
        cat.apresentarInformacoesGato(2015);
        
        //passando informação via PARÂMETRO
        
    }
    
}
