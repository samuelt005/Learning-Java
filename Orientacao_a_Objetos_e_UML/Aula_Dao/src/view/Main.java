package view;

import model.Autor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url =
                "jdbc:mysql://localhost:3306/controledelivros";
        String usuario = "root";
        String senha = "root";
        Autor autor = new Autor();
        autor.setNome("Monteiro Lobato");
        autor.setIdAutor(10);
        autor.setIdade(120);
        autor.setValorHora(2340.0);


        try {
            Connection connection =
                    DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão foi realizada com sucesso!");

            String sql = "INSERT INTO autor (id_autor, nome, idade, valor_hr) VALUES (?,?,?,?);";
            PreparedStatement statement =
                    connection.prepareStatement(sql);
            statement.setInt(1, autor.getIdAutor());
            statement.setString(2, autor.getNome());
            statement.setInt(3, autor.getIdade());
            statement.setDouble(4, autor.getValorHora());
            int inseriu = statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Não foi possível conectar");
            System.err.println(e.getMessage());
        }
    }

}
