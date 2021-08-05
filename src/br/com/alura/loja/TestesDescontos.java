package br.com.alura.loja;

import java.math.BigDecimal;

import desconto.CalculadoraDeDescontos;
import orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		
		Orcamento primeiroOrcamento = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundoOrcamento = new Orcamento(new BigDecimal("1000"), 1);
		
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		
		System.out.println(calculadora.calcular(primeiroOrcamento));
		System.out.println(calculadora.calcular(segundoOrcamento));

	}

}
