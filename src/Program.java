import java.sql.Connection;

import db.DB;

public class Program {
    public static void main(String[] args) {

        // System.out.println("MySQL JDBC Connection Testing");
        // Connection conn = null;

        // try {
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // String username = "developer";
        // String password = "1234567";
        // String url = "jdbc:mysql://localhost:3308/jdbcdb";
        // conn = DriverManager.getConnection(url, username, password);
        // System.out.println("Database connection established...");
        // } catch (Exception ex) {
        // System.err.println("Cannot connect to database server");
        // ex.printStackTrace();
        // } finally {
        // if (conn != null) {
        // try {
        // System.out.println("Let's terminate connection");
        // conn.close();
        // } catch (Exception ex) {
        // System.err.println("Cannot connect to database server");
        // ex.printStackTrace();
        // }
        // }
        // }

        Connection conn = DB.getConnection();
        DB.closeConnection();
    }
}
