package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conectar() {
        Connection conexao = null;
        try {
            String url = "jdbc:mysql://localhost:3306/minha_loja";
            String usuario = "root";
            String senha = "Victinho.37";

            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conectado ao banco de dados!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }
}
