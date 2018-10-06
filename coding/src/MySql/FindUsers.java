package MySql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Fz
 * @date 2018/10/4 14:33
 */
public class FindUsers {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        MyDataSource dataSource=new MyDataSource();
        Connection con=dataSource.getConnection();
        Statement statement=con.createStatement();
        ResultSet result=statement.executeQuery("select * from sc");

        while(result.next()){
            System.out.print("SNO: " + result.getString("SNO"));
            System.out.print(", CNO: " +result.getString("CNO"));
            System.out.print(", SCORE: " + result.getInt("SCORE"));
            System.out.print("\n");
        }

        result.close();
        statement.close();
        dataSource.releaseConnection(con);
    }


}
