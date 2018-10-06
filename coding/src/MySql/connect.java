package MySql;

import java.sql.*;

/**
 * @author Fz
 * @date 2018/10/4 13:45
 */
public class connect {
    static final  String JDBC= "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection conn = null;
        Statement stmt = null;
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("连接数据库...");
        conn = DriverManager.getConnection(DB_URL, "root", "admin");
        System.out.println(" 实例化Statement对象...");
        stmt = conn.createStatement();
        String sql;
        sql = "SELECT *FROM sc";
        ResultSet result = stmt.executeQuery(sql);
        while(result.next()){
            // 输出数据
            System.out.print("SNO: " + result.getString("SNO"));
            System.out.print(", CNO: " +result.getString("CNO"));
            System.out.print(", SCORE: " + result.getInt("SCORE"));
            System.out.print("\n");
        }
    }
}
