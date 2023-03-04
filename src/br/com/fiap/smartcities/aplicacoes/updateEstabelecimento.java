package br.com.fiap.smartcities.aplicacoes;

import br.com.fiap.smartcities.dao.EstabelecimentoDAO;
import br.com.fiap.smartcities.domain.Estabelecimento;

import java.time.LocalDate;

public class updateEstabelecimento {
    public static void main(String[] args) {
        EstabelecimentoDAO dao = new EstabelecimentoDAO();

        Estabelecimento estabelecimento = new Estabelecimento();

        System.out.println("o i ID e: " + estabelecimento.getId());

        estabelecimento.setNome("Loja do amigo");
        estabelecimento.setDataCriacao(LocalDate.of(2021,9,9));

        dao.save(estabelecimento);

    }
}
