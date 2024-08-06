/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList;


import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class produtoComprado extends Produto{
   
    public produtoComprado(String nome, double valor, boolean perecivel, long id, String descricao, int itensComprados) {
        super(nome, valor, perecivel, id, descricao, itensComprados);
    }
    
    public static Produto ComprarProduto(){
        boolean ePerecivel;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Entre com o nome do produto");
        String nome = entrada.next();
        System.out.print("Entre com o valor do produto");
        double valor = entrada.nextDouble();
        System.out.print("É perecivel? 1 - Sim 2- Não");
        int perecibilidade = entrada.nextInt();
        if(perecibilidade == 1){
            ePerecivel = true;
        }
        else{
            ePerecivel = false;
        }
        long id = entrada.nextLong();
        System.out.print("Entre com a descricao do produto");
        String descricao = entrada.nextLine();
        System.out.print("Entre com a quantidade de items comprados ");
        int items = entrada.nextInt();
        return new produtoComprado(nome, valor, ePerecivel, id, descricao, items);
    }


    
}
