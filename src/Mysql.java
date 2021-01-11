import java.sql.*;
import java.lang.*;

public class Mysql {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "kritter");
            //Statement s = c.createStatement();

            //insert data into table
                /*s.executeUpdate("insert into department"+"(department_iD,name)"+"values('5','Chemistry')");
                System.out.println("All inserted");*/

            //select the data to be printed in the table
                /*String sql = "select * from department";
                ResultSet rs = s.executeQuery(sql);
                ResultSetMetaData  rsmd = rs.getMetaData();
                int col = rsmd.getColumnCount();
                System.out.println("Department_id,name");
                while(rs.next())
                {
                    for(int i = 1; i<= col; i++)
                    {
                        if(i>1)
                            System.out.print(", ");
                        String colval = rs.getString(i);
                        System.out.print(colval);
                    }
                    System.out.println(" ");
                }*/

            //update and print the data of the table
                /*String sql1 = "Update student_info set student_name = 'Ishika' where id = 1951364";
                int rowsaff = s.executeUpdate(sql1);
                */
                /*
                ResultSet rs = s.executeQuery(sql);
                ResultSetMetaData  rsmd = rs.getMetaData();
                int col = rsmd.getColumnCount();
                System.out.println("id \t name course year dep_id");
                while(rs.next())
                {
                    for(int i = 1; i<= col; i++)
                    {
                        if(i>1)
                            System.out.print(", ");
                        String colval = rs.getString(i);
                        System.out.print(colval);
                    }
                    System.out.println(" ");
                }*/

            //create a table
            /*System.out.println("Inserting the records into table..");
            String sql = "CREATE TABLE registration"+
                    "(id INT NOT NULL PRIMARY KEY,"+
                    "first_name CHAR(50),"+
                    "last_name CHAR(50),"+
                    "age INT(10))";
            s.executeUpdate(sql);
            System.out.println("Created table in the database");*/

            //delete/drop table
            /*String delsql = "drop table registration";
            if (s.execute(delsql) == true) {
                System.out.println("Table is deleted from the database");
            } else {
                System.out.println("delete error");
            }
            String altsql = "alter table department add column department_loc CHAR(100)";
            if (s.execute(altsql) == true) {
                System.out.println("Table is altered");
            } else {
                System.out.println("altered error ");
            }*/


            /*Preapred Statement*/

            /**PreparedStatement stmt = c.prepareStatement("insert into department values(?,?)");
            stmt.setInt(1,8);
            stmt.setString(2,"Arts");**/


            /**PreparedStatement stmt = c.prepareStatement("update department set department_iD=? where name=?");
            stt.setInt(1,6);
            stmt.setString(2,"Arts");*/

            PreparedStatement stmt = c.prepareStatement("delete from department where department_iD=?");
            stmt.setInt(1,6);

            int i = stmt.executeUpdate();
            System.out.println(i+" record deleted");

            c.close(); //close the connection
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

