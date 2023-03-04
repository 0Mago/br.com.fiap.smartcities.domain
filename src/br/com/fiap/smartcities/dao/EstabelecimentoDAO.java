package br.com.fiap.smartcities.dao;

import br.com.fiap.smartcities.domain.Estabelecimento;
import br.com.fiap.smartcities.infra.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class EstabelecimentoDAO implements  IEstabelecimentoDAO {

    @Override
    public Estabelecimento save(Estabelecimento estabelecimento) {

        try (Connection connection = ConnectionFactory.getConnection()) {
            String sql = "INSERT INTO tbl_estabelecimento (datacriacao, nome) VALUES(?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);


            preparedStatement.setDate(1,java.sql.Date.valueOf(estabelecimento.getDataCriacao()));
            preparedStatement.setString(2, estabelecimento.getNome());


            preparedStatement.executeUpdate();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }


        return estabelecimento;
    }

    @Override
    public Estabelecimento update(Estabelecimento estabelecimento) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Estabelecimento> findAll() {
        return null;
    }

    @Override
    public Optional<Estabelecimento> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Estabelecimento> findByCategoria(Estabelecimento estabelecimento) {
        return null;
    }
}
