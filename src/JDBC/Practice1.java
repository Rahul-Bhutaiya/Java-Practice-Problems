package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Practice1 {
    public static void main(String[] args) throws Exception{
        insertData(40,"abc");
//        insertData(4,"dslf");
//        insertData(4,"dslf");
//        insertData(4,"dslf");
//        updateName(4,"patel");
//        deleteData(4);

//        getAllData();
    }

    public static void getAllData() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Rahul@1511");
        PreparedStatement ps = con.prepareStatement("select * from student");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            System.out.print("Roll No : "+rs.getString("rollno")+" ");
            System.out.print("Name : "+rs.getString("name"));
            System.out.println();
            System.out.println("---------------------");
        }
        ps.close();
        con.close();
    }

    public static void deleteData(int rno) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Rahul@1511");
        PreparedStatement ps = con.prepareStatement("delete from student where rollno=?");
//        PreparedStatement ps = con.prepareStatement("delete from student where rollno IN(?,?)");
        ps.setInt(1,rno);

        int response = ps.executeUpdate();
        System.out.println("response : "+response);
        if(response!=0){
            System.out.println("Success");
        }
        else{
            System.out.println("Fail");
        }

        ps.close();
        con.close();
    }

    public static void updateName(int rno,String name) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Rahul@1511");
        PreparedStatement ps = con.prepareStatement("update student set name=? where rollno=?");
        ps.setString(1,name);
        ps.setInt(2,rno);

        int response = ps.executeUpdate();
        System.out.println("response :   "+response);

        if(response!=0){
            System.out.println("Success");
        }
        else{
            System.out.println("Fail");
        }

        ps.close();
        con.close();
    }

    public static void insertData(int rno,String name) throws Exception {

        // loading and registering driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // connecting jdbc to the database
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","Rahul@1511");

//        method : 1
        // creating statement that will execute
//         String query = "insert into student values("+rno+",'"+name+"')";
//        System.out.println(query);
        // PreparedStatement ps = con.prepareStatement(query);

//        method : 2
        PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
        ps.setInt(1, rno);
        ps.setString(2, name);

        // executing query
        int responce = ps.executeUpdate();

        //handling response
        if(responce>0){
            System.out.println("Success");
        }
        else{
            System.out.println("Fail");
        }

        //closing the connection
        ps.close();
        con.close();
    }
}
