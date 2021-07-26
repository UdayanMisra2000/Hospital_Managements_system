import java.util.Scanner;
import java.util.Calendar;
import java.sql.*;


public class H_Management_project {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.print("Date: " + cal.get(Calendar.DATE) + "/" + months[cal.get(Calendar.MONTH)] + "/" + cal.get(Calendar.YEAR));
        System.out.print("\t\t\t\t\t\t\t\t\t Time: " + cal.get(Calendar.HOUR) + ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND));
        int status = 1;
        while (status == 1) {
            System.out.println("\n 1.DOCTOR    2.STAFF    3.OPD    4.EMERGENCY    5.MEDICINE    6.LAB    7.FACILITY");
            int choice = input.nextInt();
            switch (choice) {
                case 1-> {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    int s1 = 1;
                    while (s1 == 1) {
                        System.out.println("1.Add New Entry \t\t 2.Existing Doctors List \t\t 3. Deletion");
                        int c1 = input.nextInt();
                        switch (c1) {
                            case 1 -> insert(1);
                            case 2 -> {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name\t Specialist \t Timing \t Qualification \t Room No.");
                                System.out.println("--------------------------------------------------------------------------------");
                                OracleCon(1);
                            }
                            case 3 -> deletion(1);
                        }
                        System.out.println("If you want to go back to the doctor section press 1: \nIf you want to go back to the main menu press any other key: ");
                        s1 = input.nextInt();
                    }
                }
                case 2-> {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **STAFF  SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    int s2 = 1;
                    while (s2 == 1) {
                        System.out.println("1.Add New Entry \t\t 2.Existing Staff List \t\t 3. Deletion");
                        int c1 = input.nextInt();
                        switch (c1) {
                            case 1 -> insert(2);
                            case 2 -> {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name\t Designation \t Sex \t Salary ");
                                System.out.println("--------------------------------------------------------------------------------");
                                OracleCon(2);
                            }
                            case 3 -> deletion(2);
                        }
                        System.out.println("If you want to go back to the staff section press 1: \nIf you want to go back to the main menu press any other key: ");
                        s2 = input.nextInt();
                    }
                }
                case 3-> {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **OPD  SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    int s3 = 1;
                    while (s3 == 1) {
                        System.out.println("1.Add New Entry \t\t 2.Existing OPD List \t\t 3. Deletion");
                        int c1 = input.nextInt();
                        switch (c1) {
                            case 1 -> insert(3);
                            case 2 -> {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name\t Disease \t Sex \t admit status \t age");
                                System.out.println("--------------------------------------------------------------------------------");
                                OracleCon(3);
                            }
                            case 3-> deletion(3);
                        }
                        System.out.println("If you want to go back to the OPD section press 1: \nIf you want to go back to the main menu press any other key: ");
                        s3 = input.nextInt();
                    }
                }
                case 4 -> {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **EMERGENCY  SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    int s4 = 1;
                    while (s4 == 1) {
                        System.out.println("1.Add New Entry \t\t 2.Existing EMERGENCY patient List \t\t 3. Deletion");
                        int c1 = input.nextInt();
                        switch (c1) {
                            case 1 -> insert(4);
                            case 2 -> {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Sex \t admit status \t cause \t age");
                                System.out.println("--------------------------------------------------------------------------------");
                                OracleCon(4);
                            }
                            case 3 -> deletion(4);
                        }
                        System.out.println("If you want to go back to the EMERGENCY section press 1: \nIf you want to go back to the main menu press any other key: ");
                        s4 = input.nextInt();
                    }
                }
                case 5-> {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **MEDICINE  SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    int s5 = 1;
                    while (s5 == 1) {
                        System.out.println("1.Add New Entry \t\t 2.Existing MEDICINE information \t\t 3. Deletion");
                        int c1 = input.nextInt();
                        switch (c1) {
                            case 1 -> insert(5);
                            case 2 -> {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println(" Name \t Company \t Expiry Date \t Cost \t Count");
                                System.out.println("--------------------------------------------------------------------------------");
                                OracleCon(5);
                            }
                            case 3 -> deletion(5);
                        }
                        System.out.println("If you want to go back to the MEDICINE section press 1: \nIf you want to go back to the main menu press any other key: ");
                        s5 = input.nextInt();
                    }
                }
                case 6-> {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **LAB  SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    int s6 = 1;
                    while (s6 == 1) {
                        System.out.println("1.Add New Entry \t\t 2.Existing LAB information \t\t 3. Deletion");
                        int c1 = input.nextInt();
                        switch (c1) {
                            case 1 -> insert(6);
                            case 2 -> {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Facility \t Lab Cost");
                                System.out.println("--------------------------------------------------------------------------------");
                                OracleCon(6);
                            }
                            case 3-> deletion(6);
                        }
                        System.out.println("If you want to go back to the LAB section press 1: \nIf you want to go back to the main menu press any other key: ");
                        s6 = input.nextInt();
                    }
                }
                case 7-> {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                       **FACILITY  SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");
                    int s7 = 1;
                    while (s7 == 1) {
                        System.out.println("1.Add New Entry \t\t 2.Existing FACILITIES \t\t 3. Deletion");
                        int c1 = input.nextInt();
                        switch (c1) {
                            case 1 -> insert(7);
                            case 2 -> {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("Facility name");
                                System.out.println("--------------------------------------------------------------------------------");
                                OracleCon(7);
                            }
                            case 3-> deletion(7);
                        }
                        System.out.println("If you want to go back to the Facility section press 1: \nIf you want to go back to the main menu press any other key:  ");
                        s7 = input.nextInt();
                    }
                }
            }
            System.out.println("If you want to go back to the main menu press 1: \nIf you want to EXIT press any other key: ");
            status = input.nextInt();
        }
    }



    public static void OracleCon(int d){
                try {
//step1 load the driver class
                    Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create  the connection object
                    Connection con = DriverManager.getConnection(
                            "jdbc:oracle:thin:@localhost:1521:xe", "system", "oracle");

//step3 create the statement object
                    Statement stmt = con.createStatement();

//step4 execute query
                    switch (d) {
                        case 1 -> {
                            System.out.println("\n");

                            ResultSet rs1 = stmt.executeQuery("select * from doctors");
                            while (rs1.next())
                                System.out.println(rs1.getInt(1) + " \t" + rs1.getString(2) + " \t" + rs1.getString(3) + " \t" + rs1.getString(4) + " \t" + rs1.getString(5) + " \t" + rs1.getInt(6));
                        }
                        case 2 -> {
                            System.out.println("\n");

                            ResultSet rs2 = stmt.executeQuery("select * from staff");
                            while (rs2.next())
                                System.out.println(rs2.getInt(1) + " \t" + rs2.getString(2) + " \t" + rs2.getString(3) + " \t" + rs2.getString(4) + " \t" + rs2.getInt(5));
                        }
                        case 3 -> {
                            System.out.println("\n");

                            ResultSet rs3 = stmt.executeQuery("select * from patients");
                            while (rs3.next())
                                System.out.println(rs3.getInt(1) + " \t" + rs3.getString(2) + " \t" + rs3.getString(3) + " \t" + rs3.getString(4) + " \t" + rs3.getString(5) + " \t" + rs3.getInt(6));
                        }
                        case 4 -> {
                            System.out.println("\n");

                            ResultSet rs4 = stmt.executeQuery("select * from emergency");
                            while (rs4.next())
                                System.out.println(rs4.getInt(1) + " \t" + rs4.getString(2) + " \t" + rs4.getString(3) + " \t" + rs4.getString(4) + " \t" + rs4.getString(5) + " \t" + rs4.getInt(6));
                        }
                        case 5 -> {
                            System.out.println("\n");

                            ResultSet rs5 = stmt.executeQuery("select * from medicine");
                            while (rs5.next())
                                System.out.println(rs5.getString(1) + " \t" + rs5.getString(2) + " \t" + rs5.getString(3) + " \t" + rs5.getInt(4) + " \t" + rs5.getInt(5));
                        }
                        case 6 -> {
                            System.out.println("\n");

                            ResultSet rs6 = stmt.executeQuery("select * from lab");
                            while (rs6.next())
                                System.out.println(rs6.getString(1) + " \t" + rs6.getInt(2));
                        }
                        case 7 -> {
                            System.out.println("\n");

                            ResultSet rs7 = stmt.executeQuery("select * from facility");
                            while (rs7.next())
                                System.out.println(rs7.getString(1));
                        }
                    }
//step5 close the connection object
                    con.close();

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

    public static void insert(int i)
        {
            //Creating the connection
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "system";
            String pass = "oracle";
            Scanner k = new Scanner(System.in);
            String sql;
            switch (i) {
                case 1 -> {
                    //Entering the data
                    System.out.println("enter id");
                    int id = k.nextInt();
                    System.out.println("enter the name");
                    String name = k.next();
                    System.out.println("enter specialist");
                    String specialist = k.next();
                    System.out.println("enter the time");
                    String time = k.next();
                    System.out.println("enter the qualification");
                    String qualification = k.next();
                    System.out.println("enter the room");
                    int room = k.nextInt();
//Inserting data using SQL query
                    sql = "insert into doctors values(" + id + ",'" + name + "','" + specialist + "','" + time + "','" + qualification + "'," + room + ")";
                    
                }
                case 2 -> {
                    System.out.println("enter id");
                    int id = k.nextInt();
                    System.out.println("enter the name");
                    String name = k.next();
                    System.out.println("enter destination");
                    String destination = k.next();
                    System.out.println("enter sex");
                    String sex = k.next();
                    System.out.println("enter the salary");
                    int salary = k.nextInt();
//Inserting data using SQL query
                    sql = "insert into staff values("+id+",'"+name+"','"+destination+"','"+sex+"',"+salary+")";
                }
                case 3 ->{
                    System.out.println("enter id");
                    int id = k.nextInt();
                    System.out.println("enter the name");
                    String name = k.next();
                    System.out.println("enter disease");
                    String disease = k.next();
                    System.out.println("enter sex");
                    String sex = k.next();
                    System.out.println("enter the admit_status");
                    String admit_status = k.next();
                    System.out.println("enter the age");
                    int age = k.nextInt();
//Inserting data using SQL query
                    sql = "insert into patients values("+id+",'"+name+"','"+disease+"','"+sex+"','"+admit_status+"',"+age+")";
                }
                case 4 ->{
                    System.out.println("enter id");
                    int id = k.nextInt();
                    System.out.println("enter the name");
                    String name = k.next();
                    System.out.println("enter sex");
                    String sex = k.next();
                    System.out.println("enter admit_status");
                    String admit_status = k.next();
                    System.out.println("enter the cause");
                    String cause = k.next();
                    System.out.println("enter the age");
                    int age = k.nextInt();
//Inserting data using SQL query
                    sql = "insert into emergency values("+id+",'"+name+"','"+sex+"','"+admit_status+"','"+cause+"',"+age+")";
                }
                case 5 ->{
                    System.out.println("enter name");
                    String name = k.next();
                    System.out.println("enter the company");
                    String company = k.next();
                    System.out.println("enter expiry");
                    String expiry = k.next();
                    System.out.println("enter cost");
                    int cost = k.nextInt();
                    System.out.println("enter count");
                    int count = k.nextInt();
//Inserting data using SQL query
                    sql = "insert into medicine values('"+name+"','"+company+"','"+expiry+"',"+cost+","+count+")";
                }
                case 6 ->{
                    System.out.println("enter facility");
                    String facility = k.next();
                    System.out.println("enter cost");
                    int cost = k.nextInt();
//Inserting data using SQL query
                    sql = "insert into lab values('"+facility+"',"+cost+")";
                }
                case 7 ->{
                    System.out.println("enter facilities");
                    String facilities = k.next();
//Inserting data using SQL query
                    sql = "insert into facility values('"+facilities+"')";
                }
                default -> throw new IllegalStateException("Unexpected value: " + i);
            }
            Connection con;
            try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");

                //Reference to connection interface
                con = DriverManager.getConnection(url,user,pass);

                Statement st = con.createStatement();

                int m = st.executeUpdate(sql);
                if (m == 1)
                    System.out.println("inserted successfully : "+sql);
                else
                    System.out.println("insertion failed");
                con.close();
            }
            catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    public static void deletion(int del)
    {
        //Creating the connection
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "system";
        String pass = "oracle";

        //Entering the data
        Scanner k = new Scanner(System.in);
        String sql;
        switch (del) {
            case 1 -> {
                System.out.println("Enter the primary key of the row you want to delete");
                String primary_key = k.next();
                System.out.println("Enter the column of the primary key");
                String column = k.next();
                //Deleting data using SQL query
                sql = "delete from doctors where " + column + " = " + primary_key + " ";
            }
            case 2 -> {
                System.out.println("Enter the primary key of the row you want to delete");
                String primary_key = k.next();
                System.out.println("Enter the column of the primary key");
                String column = k.next();
                //Deleting data using SQL query
                sql = "delete from staff where " + column + " = " + primary_key + " ";
            }
            case 3 -> {
                System.out.println("Enter the primary key of the row you want to delete");
                String primary_key = k.next();
                System.out.println("Enter the column of the primary key");
                String column = k.next();
                //Deleting data using SQL query
                sql = "delete from patients where " + column + " = " + primary_key + " ";
            }
            case 4 -> {
                System.out.println("Enter the primary key of the row you want to delete");
                String primary_key = k.next();
                System.out.println("Enter the column of the primary key");
                String column = k.next();
                //Deleting data using SQL query
                sql = "delete from emergency where " + column + " = " + primary_key + " ";
            }
            case 5 -> {
                System.out.println("Enter the primary key of the row you want to delete");
                String primary_key = k.next();
                System.out.println("Enter the column of the primary key");
                String column = k.next();
                //Deleting data using SQL query
                sql = "delete from medicine where " + column + " = '" + primary_key + "' ";
            }
            case 6 -> {
                System.out.println("Enter the primary key of the row you want to delete");
                String primary_key = k.next();
                System.out.println("Enter the column of the primary key");
                String column = k.next();
                //Deleting data using SQL query
                sql = "delete from lab where " + column + " = '" + primary_key + "' ";
            }
            case 7 -> {
                System.out.println("Enter the primary key of the row you want to delete");
                String primary_key = k.next();
                System.out.println("Enter the column of the primary key");
                String column = k.next();
                //Deleting data using SQL query
                sql = "delete from facility where " + column + " = '" + primary_key + "' ";
            }
            default -> throw new IllegalStateException("Unexpected value: " + del);
        }
        Connection con;
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //Reference to connection interface
            con = DriverManager.getConnection(url,user,pass);

            Statement st = con.createStatement();
            int m = st.executeUpdate(sql);
            if (m == 1)
                System.out.println("deleted successfully : "+sql);
            else
                System.out.println("deletion failed");
            con.close();
        }
        catch(Exception exc)
        {
            System.out.println(exc.getMessage());
        }
    }
    }

