import java.sql.*;
class JDBCDemo
{
    public static void main(String[] args) throws Exception
    {
        batchdemo();
    }

    public static void readRecords()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";
        String query = "select * from employee";

        Connection con = DriverManager.getConnection(url, UserName, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while(rs.next())
        {
            System.out.println("Id is " + rs.getInt(1));
            System.out.println("Name is " + rs.getString(2));
            System.out.println("Salary is " + rs.getInt(3));
        }
        con.close();
    }
    public static void insertRecords()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";
        String query = "insert into employee values (4,'priya',25000)";

        Connection con = DriverManager.getConnection(url, UserName, password);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);

        System.out.println("Number of rows affected: "+rows);
        con.close();
    }
    public static void insertVar()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";

        int id=5;
        String name="varun";
        int salary=26000;

        // (5,'varun',26000)
        String query = "insert into employee values(" +id+ ",'"+ name+"',"+salary+");";

        Connection con = DriverManager.getConnection(url, UserName, password);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);

        System.out.println("Number of rows affected: "+rows);
        con.close();
    }
    public static void insertUsing_prepardstatement()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";

        int id = 6;
        String name = "varun";
        int salary = 27000;

        // (5,'varun',26000)
        String query = "insert into employee values(?,?,?);";

        Connection con = DriverManager.getConnection(url, UserName, password);

        PreparedStatement pst = con.prepareStatement(query);
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setInt(3,salary);
        int rows=pst.executeUpdate();
        System.out.println("Number of rows affected: "+rows);
        con.close();
    }
    public static void delete()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";

        int id = 6;

        String query = "delete from employee where emp_id=" + id;

        Connection con = DriverManager.getConnection(url, UserName, password);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        System.out.println("Number of rows affected: " + rows);
        con.close();
    }
    //Update
    public static void update()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";

        String query = "update employee set salary=15000 where emp_id=1";

        Connection con = DriverManager.getConnection(url, UserName, password);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        System.out.println("Number of rows affected: " + rows);
        con.close();
    }

    // Types of statements
    // 1.normal statements
    // 2.prepared statements
    // 3.callable statements

    // calling simple stored procedure
    public static void stored_procedure()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";

        Connection con = DriverManager.getConnection(url, UserName, password);
        CallableStatement cst = con.prepareCall("{call GetEmp()}");
        ResultSet rs = cst.executeQuery();
        while(rs.next())
        {
            System.out.println("Id is " + rs.getInt(1));
            System.out.println("Name is " + rs.getString(2));
            System.out.println("Salary is " + rs.getInt(3));
        }
        con.close();
    }
    // calling stored procedure with input parameter
    public static void stored_procedure_input_parameter()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";

        int id=3;
        Connection con = DriverManager.getConnection(url, UserName, password);
        CallableStatement cst = con.prepareCall("{call GetEmpById(?)}");
        cst.setInt(1,id);
        ResultSet rs = cst.executeQuery();
        while(rs.next())
        {
            System.out.println("Id is " + rs.getInt(1));
            System.out.println("Name is " + rs.getString(2));
            System.out.println("Salary is " + rs.getInt(3));
        }
        con.close();
    }
    // calling stored procedure with in and out parameter
    public static void stored_procedure_input_output_parameter()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";

        int id=3;
        Connection con = DriverManager.getConnection(url, UserName, password);
        CallableStatement cst = con.prepareCall("{call GetEmpByIdinout(?,?)}");
        cst.setInt(1,id);
        cst.registerOutParameter(2,Types.VARCHAR);
        cst.executeUpdate();
        System.out.println(cst.getString(2));
        con.close();
    }
    // commit and autocommit

    public static void commitdemo()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";

        String query1 = "update employee set salary=40000 where emp_id=1";
        String query2 = "update employee set salary=40000 where emp_id=2";

        Connection con = DriverManager.getConnection(url, UserName, password);
        Statement st = con.createStatement();
        int rows1 = st.executeUpdate(query1);
        System.out.println("Rows affected " + rows1);
        int rows2 = st.executeUpdate(query2);
        System.out.println("Rows affected " + rows2);
        con.close();
    }
    public static void autocommit()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";

        String query1 = "update employee set salary=55000 where emp_id=1";
        String query2 = "update employee set salary=55000 where emp_id=2";

        Connection con = DriverManager.getConnection(url, UserName, password);
        con.setAutoCommit(false);
        Statement st = con.createStatement();
        int rows1 = st.executeUpdate(query1);
        System.out.println("Rows affected " + rows1);
        int rows2 = st.executeUpdate(query2);
        System.out.println("Rows affected " + rows2);
        if(rows1>0 && rows2>0)
            con.commit();
        con.close();
    }
    // batch processing
    public static void batchdemo()throws Exception
    {
        String url = "jdbc:mysql://localhost:3306/jdbcdemo";
        String UserName = "root";
        String password = "2407";

        String query1 = "update employee set salary=10000 where emp_id=1";
        String query2 = "update employee set salary=10000 where emp_id=2";
        String query3 = "update employee set salary=10000 where emp_id=3";
        String query4 = "update employee set salary=10000 where emp_id=4";

        Connection con = DriverManager.getConnection(url, UserName, password);
        con.setAutoCommit(false);
        Statement st = con.createStatement();
        st.addBatch(query1);
        st.addBatch(query2);
        st.addBatch(query3);
        st.addBatch(query4);
        int[] res = st.executeBatch();
        for (int i: res)
        {
            if(i>0)
                continue;
            else
                con.rollback();
        }
        con.commit();
        con.close();
    }
}
