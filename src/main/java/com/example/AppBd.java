package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppBd {
    private static final String PASSWORD = "";
    private static final String USERNAME = "gitpod";
    private static final String JDBC_URL = "jdbc:postgresql://localhost/postgres";

    public static void main(String[] args) {
        new AppBd();
}

    public AppBd(){
        try ( var conn = getconnection()){
            carregarDriverJDBC();
            listarEstados(conn);
            localizarEstado(conn, "TO"); 
            listarDadosTabela(conn, "produto");
            
        } catch (SQLException e) {
            System.err.println("Não foi possivel conectar ao banco de dados" + e.getMessage());
        }
    }
    private  void localizarEstado(Connection conn, String uf) {
        try {
            var sql = "select *from estado where uf = ?";
            var statement = conn.createStatement();
            System.out.println(sql);
            var result = statement.executeQuery(sql);
            if (result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getString("nome"), result.getString("uf"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao executar consulta SQL" + e.getMessage());
        }
    }
    private void listarEstados(connection conn) {
               
        try {
            System.out.println("Conexão com o banco realizada com sucesso");

            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while(result.next()){
                System.out.printf ("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
                       
            
        } catch (SQLException e) {
            if (statement == null)
                System.err.println("Não foi possivel conectar ao banco de dados" + e.getMessage());
            else System.err.println("Não foi possivel executar a consulta ao banco" + e.getMessage());

        }
    }
    private static Connection getconnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);        
    }
    private static void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
            
        } catch (ClassNotFoundException e) {
            System.out.println("Não foi possivel carregar a biblioteca para acesso ao banco de dados:" + e.getMessage());
        }
    }
}
