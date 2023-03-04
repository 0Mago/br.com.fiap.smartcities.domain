package br.com.fiap.smartcities.dao;

import br.com.fiap.smartcities.domain.Estabelecimento;
import java.util.List;
import java.util.Optional;

public interface IEstabelecimentoDAO {
    Estabelecimento save(Estabelecimento estabelecimento);
    Estabelecimento update(Estabelecimento estabelecimento);
    void delete(Long id);
    List <Estabelecimento> findAll();
    Optional<Estabelecimento> findById(Long id);
    List<Estabelecimento> findByCategoria(Estabelecimento estabelecimento);


}
