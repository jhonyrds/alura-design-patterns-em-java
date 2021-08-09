package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.GerarPedido;

import java.math.BigDecimal;

public class TestePedidos {
    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, quantidadeItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependências*/);

        handler.executa(gerador);
    }
}
