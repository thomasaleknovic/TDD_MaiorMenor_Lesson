package com.thomasaleknovic.tdd_javaspring;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {


    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<Produto>();
    }


    public void adiciona (Produto produto) {
        List<Produto> newList = this.getProdutos();
        newList.add(produto);
      this.setProdutos(newList);



    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
