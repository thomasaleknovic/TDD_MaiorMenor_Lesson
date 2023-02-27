package com.thomasaleknovic.tdd_javaspring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestaMaiorEMenor {

    @Test
    public void ordemDecrescente() {


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Jogo de pratos", 70.0));

        MaiorEMenor algoritmo = new MaiorEMenor();
        algoritmo.encontra(carrinho);


        Assertions.assertEquals("Jogo de pratos",
                algoritmo.getMenor().getNome());
        Assertions.assertEquals("Geladeira",
                algoritmo.getMaior().getNome());
    }

    @Test
    public void apenasUmProduto() {


        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adiciona(new Produto("Geladeira", 450.0));

        MaiorEMenor algoritmo = new MaiorEMenor();
        algoritmo.encontra(carrinho);


        Assertions.assertEquals("Geladeira",
                algoritmo.getMenor().getNome());
        Assertions.assertEquals("Geladeira",
                algoritmo.getMaior().getNome());



    }

}
