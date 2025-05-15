package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;
    final List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void addCompra(Compra compra){
        compras.add(compra);
    }

    double getTotalCompras(){
        double total = 0;
        for(Compra compra: compras){
            total += compra.getValorTotal();
        }

        return total;
    }

}
