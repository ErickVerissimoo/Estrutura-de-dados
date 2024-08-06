/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.LinkedList;

import java.util.Date;

/**
 *
 * @author Erick
 */
public abstract class Produto {
    private String nome;
    private double valor;
    private boolean perecivel;
    private long id;
    private String descricao;
    private int itensComprados;

 

    
    
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public boolean isPerecivel() {
        return perecivel;
    }

    public long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getItensComprados() {
        return itensComprados;
    }
    
       public Produto(String nome, double valor, boolean perecivel, long id, String descricao, int itensComprados) {
        this.nome = nome;
        this.valor = valor;
        this.perecivel = perecivel;
        this.id = id;
        this.descricao = descricao;
        this.itensComprados = itensComprados;
    }
       
}
