package test;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author hasee
 */
public class DBUtilTest {
    public static Connection connection;

    public static void testQuery() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "select * from emp where empno=?";
        QueryRunner runner = new QueryRunner();
        Emp query = runner.query(connection, sql, new BeanHandler<Emp>(Emp.class), 7369);
        System.out.println(query);
        connection.close();

    }

    public static void testList() throws SQLException {
        connection = MySqlDBUtil.getConnection();
        String sql = "select * from emp";
        QueryRunner runner = new QueryRunner();
        List<Emp> queryList = runner.query(connection, sql, new BeanListHandler<Emp>(Emp.class));
        for (Emp emp : queryList) {
            System.out.println(emp);
        }
        connection.close();

    }

    /**
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args) throws SQLException {
//        testQuery();
        testList();

    }
}

