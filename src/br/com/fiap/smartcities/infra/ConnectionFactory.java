package br.com.fiap.smartcities.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private ConnectionFactory(){}

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl", "rm95176", "050789");
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }
}
