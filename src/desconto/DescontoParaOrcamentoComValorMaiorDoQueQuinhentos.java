package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class DescontoParaOrcamentoComValorMaiorDoQueQuinhentos extends Desconto{
	
	public DescontoParaOrcamentoComValorMaiorDoQueQuinhentos(Desconto proximo) {
		super(proximo);		
	}

	public BigDecimal calcular(Orcamento orcamento) {
		if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
			return orcamento.getValor().multiply(new BigDecimal("0.05"));
		}
		return proximo.calcular(orcamento);
	}
}
