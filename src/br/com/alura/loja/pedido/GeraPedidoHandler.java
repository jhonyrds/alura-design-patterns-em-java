package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }
    //construtor com injeção de dependências: repository, service etc.

    public void executa(GerarPedido dados) {

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        //executar a lista de ações
        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
