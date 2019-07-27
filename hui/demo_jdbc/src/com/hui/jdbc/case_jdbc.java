package com.hui.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class case_jdbc {

    public static void main(String[] args) throws Exception {
        //导入驱动jar包
        //注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //获取数据库的连接对象
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/db2?serverTimezone=GMT%2B8","root","@dmin123");
        //定义sql语句
        String sql="update account set balance=500 where id=1";
        //获取执行sql对象
        Statement statement=conn.createStatement();
        //执行sql
        int count=statement.executeUpdate(sql);
        System.out.println(count);
        //释放资源
        statement.close();
        conn.close();
    }
}
