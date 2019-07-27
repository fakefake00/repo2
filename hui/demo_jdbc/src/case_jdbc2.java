import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class case_jdbc2 {
    public static void main(String[] args) {

        Connection conn=null;
        Statement statement=null;
        //注册驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //定义sql
            String sql="insert into account values(null,'王五',3000)";
            //获取Connection
            conn= DriverManager.getConnection("jdbc:mysql:///db2?serverTimezone=GMT%2B8","root","@dmin123");
            //获取执行sql的对象 Statement
            statement=conn.createStatement();

            int count=statement.executeUpdate(sql);//影响的行数
            //处理结果
            System.out.println(count);
            if (count>0){
                System.out.println("执行成功");
            }else{
                System.out.println("执行失败");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //statement.close();
            //避免空指针异常
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            //conn.close();
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
