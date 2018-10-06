package MySql;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.LinkedList;
import java.util.logging.Logger;

/**
 * @author Fz
 * @date 2018/10/4 14:24
 */
public class MyDataSource implements DataSource {
    LinkedList<Connection> dataSources=new LinkedList<>();
    public MyDataSource() throws SQLException, ClassNotFoundException {
        System.out.println("连接数据库...");
        Class.forName("com.mysql.jdbc.Driver");
        for(int i=0;i<10;i++){
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");
            dataSources.add(conn);
        }
    }
    @Override
    public Connection getConnection() throws SQLException {
        final Connection conn=dataSources.removeFirst();
        return conn;
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }
    public void releaseConnection(Connection con){
        dataSources.add(con);
    }
}
