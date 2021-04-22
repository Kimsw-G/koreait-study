package chap07.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionExam4 {
    public static void main(String[] args) {
        DBUtils du = new DBUtils();
        du.getConnection();
    }
}

class DBUtils{
    Connection getConnection(){

        Connection con = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/ksw";
            String id = "root";
            String pw = "koreait";
            con = DriverManager.getConnection(url, id, pw);
            System.out.println("ㅇㅇ");
        } catch (Exception e) {
            System.out.println("ㄴㄴ");
            e.printStackTrace();
        }


        return con;
    }
}


