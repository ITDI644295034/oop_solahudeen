package chap9;

import MiniProject.*;

import java.sql.*;
import java.util.ArrayList;

public class MySQLDB {
    Connection con;
    Statement stmt;
    ResultSet rs;

    public Connection connect() {
        String user = "root";
        String password = "";
        String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/studentdb";
        try {
            Class.forName(DB_DRIVER);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("success");
            return con;
        } catch (Exception e) {
            System.out.println("ติดต่อฐานข้อมูลไม่ได้ครับ");
            return null;
        }
    }

    public Connection connect1() {
        String user = "root";
        String password = "";
        String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/money";
        try {
            Class.forName(DB_DRIVER);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("success");
            return con;
        } catch (Exception e) {
            System.out.println("ติดต่อฐานข้อมูลไม่ได้ครับ");
            return null;
        }
    }

    public Connection connect2() {
        String user = "root";
        String password = "";
        String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost/employee";
        try {
            Class.forName(DB_DRIVER);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("success");
            return con;
        } catch (Exception e) {
            System.out.println("ติดต่อฐานข้อมูลไม่ได้ครับ");
            return null;
        }
    }

    public ArrayList<MyStudent> selectQuery(String sql) {
        MyStudent std;
        try {
            con = connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println(rs);
            ArrayList<MyStudent> studentsList = new ArrayList<MyStudent>();
            while (rs.next()) {
                std = new MyStudent();
                std.setId(rs.getString(1));
                std.setName(rs.getString(2));
                std.setSurname(rs.getString(3));
                System.out.println("id: " + rs.getString(1));
                System.out.println("name: " + rs.getString(2));
                System.out.println("surname: " + rs.getString(3));
                studentsList.add(std);

            }
            return studentsList;
        } catch (Exception e) {
            System.out.println("ดึงฐานข้อมูลไม่ได้ครับ");
            System.out.println(e.getMessage());
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                } else {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Error");
            }
        }
    }

    public ArrayList<MyMoney> selectQuery1(String sql) {
        MyMoney mn;
        try {
            con = connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println(rs);
            ArrayList<MyMoney> studentsList = new ArrayList<MyMoney>();
            while (rs.next()) {
                mn = new MyMoney();
                mn.setAccountNumber(Integer.parseInt(rs.getString(1)));
                mn.setName(rs.getString(2));
                mn.setSurname(rs.getString(3));
                mn.setAccountType(rs.getString(4));
                mn.setDeposit(Double.parseDouble(rs.getString(5)));
                mn.setWithdraw(Double.parseDouble(rs.getString(6)));
                mn.setBalance(Double.parseDouble(rs.getString(7)));
                System.out.println("AccNum: " + rs.getString(1));
                System.out.println("name: " + rs.getString(2));
                System.out.println("surname: " + rs.getString(3));
                System.out.println("AccType: " + rs.getString(4));
                System.out.println("Deposit: " + rs.getString(5));
                System.out.println("withdraw: " + rs.getString(6));
                System.out.println("balance: " + rs.getString(7));
                studentsList.add(mn);

            }
            return studentsList;
        } catch (Exception e) {
            System.out.println("ดึงฐานข้อมูลไม่ได้ครับ");
            System.out.println(e.getMessage());
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                } else {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Error");
            }
        }
    }

    public ArrayList<Employee> selectQuery2(String sql) {
        Employee emp;
        try {
            con = connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println(rs);
            ArrayList<Employee> studentsList = new ArrayList<Employee>();
            while (rs.next()) {
                emp = new Employee();
                emp.setEmployeeId(Integer.parseInt(rs.getString(1)));
                emp.setName(rs.getString(2));
                emp.setSurname(rs.getString(3));
                emp.setPosition(rs.getString(4));
                emp.setSalary(Double.parseDouble(rs.getString(5)));
                emp.setBonus(Double.parseDouble(rs.getString(6)));
                System.out.println("EmployeeId: " + rs.getString(1));
                System.out.println("name: " + rs.getString(2));
                System.out.println("surname: " + rs.getString(3));
                System.out.println("Position: " + rs.getString(4));
                System.out.println("Salary: " + rs.getString(5));
                System.out.println("Bonus: " + rs.getString(6));
                studentsList.add(emp);

            }
            return studentsList;
        } catch (Exception e) {
            System.out.println("ดึงฐานข้อมูลไม่ได้ครับ");
            System.out.println(e.getMessage());
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                } else {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Error");
            }
        }
    }
    public ArrayList<HotelRe> selectQuery3(String sql) {
        HotelRe ht;
        try {
            con = connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println(rs);
            ArrayList<HotelRe> studentsList = new ArrayList<HotelRe>();
            while (rs.next()) {
                ht = new HotelRe();
                ht.setId(Integer.parseInt(rs.getString(1)));
                ht.setName(rs.getString(2));
                ht.setSurname(rs.getString(3));
                ht.setType(rs.getString(4));
                ht.setWeeks(rs.getString(5));
                ht.setDays(Integer.parseInt(rs.getString(6)));
                ht.setTotal(Integer.parseInt(rs.getString(7)));
                System.out.println("Id: " + rs.getString(1));
                System.out.println("name: " + rs.getString(2));
                System.out.println("surname: " + rs.getString(3));
                System.out.println("type: " + rs.getString(4));
                System.out.println("weeks: " + rs.getString(5));
                System.out.println("days: " + rs.getString(6));
                System.out.println("total: " + rs.getString(7));
                studentsList.add(ht);

            }
            return studentsList;
        } catch (Exception e) {
            System.out.println("ดึงฐานข้อมูลไม่ได้ครับ");
            System.out.println(e.getMessage());
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                } else {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Error");
            }
        }
    }

    public ArrayList<MyPatient> selectQuery4(String sql) {
        MyPatient mp;
        try {
            con = connect();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            System.out.println(rs);
            ArrayList<MyPatient> studentsList = new ArrayList<MyPatient>();
            while (rs.next()) {
                mp = new MyPatient();
                mp.setId(Integer.parseInt(rs.getString(1)));
                mp.setName(rs.getString(2));
                mp.setSurname(rs.getString(3));
                mp.setUpper(Integer.parseInt(rs.getString(4)));
                mp.setLower(Integer.parseInt(rs.getString(5)));
                mp.setDanger(rs.getString(6));
                mp.setAdvice(rs.getString(7));
                System.out.println("Id: " + rs.getString(1));
                System.out.println("name: " + rs.getString(2));
                System.out.println("surname: " + rs.getString(3));
                System.out.println("upper: " + rs.getString(4));
                System.out.println("lower: " + rs.getString(5));
                System.out.println("danger: " + rs.getString(6));
                System.out.println("advice: " + rs.getString(7));
                studentsList.add(mp);

            }
            return studentsList;
        } catch (Exception e) {
            System.out.println("ดึงฐานข้อมูลไม่ได้ครับ");
            System.out.println(e.getMessage());
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                } else {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Error");
            }
        }
    }

    public int creatUpdateDelete(String sql) {
        int row = 0;
        try {
            con = connect();
            stmt = con.createStatement();
            row = stmt.executeUpdate(sql);
            System.out.println("Crud dai ");
            return row;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Crud maidai ");
            return row;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println("close");
            }
        }
    }



    public static void main(String[] args) {
        MySQLDB myDB = new MySQLDB();
        myDB.connect();
//        myDB.selectQuery("SELECT * FROM `student`");
//        myDB.selectQuery1("SELECT * FROM `bank`");
//        myDB.creatUpdateDelete1("INSERT INTO BANK VALUES ('002','NASRIN','CHEMU','1000','0','0')");
//        myDB.creatUpdateDelete("DELETE FROM STUDENT WHERE Student_id = '002' ");
    }


}
