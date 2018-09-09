package org.injae;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {

        String url = "jdbc:oracle:thin:@10.10.10.91:1521:XE";
        String user = "injae";
        String pw = "12345678";

        Class cls = Class.forName("oracle.jdbc.driver.OracleDriver");

        System.out.println(cls);

        try {
            Connection conn = DriverManager.getConnection(url,user,pw);
            System.out.println(conn);
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}
