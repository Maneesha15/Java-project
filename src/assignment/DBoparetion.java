/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Oshani
 */
public class DBoparetion {

    String url = "jdbc:mysql://127.0.0.1:3306/nsbm enrollment system";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pt = null;
    ResultSet rs = null;

    public boolean addunderstudent(students st) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "INSERT INTO und_student VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);
            pt.setInt(1, st.getStudent_id());
            pt.setString(2, st.getFirst_name());
            pt.setString(3, st.getLast_name());
            pt.setInt(4, st.getAge());
            pt.setString(5, st.getAddress());
            pt.setString(6, st.getEmail());
            pt.setInt(7, st.getPhone_number());
            pt.setString(8, st.getGender());
            pt.setInt(9, st.getAdmission_year());
            pt.setString(10, st.getIntake_month());
            pt.setString(11, st.getCourse_sub1_1());
            pt.setString(12, st.getCourse_sub1_2());
            pt.setString(13, st.getCourse_sub1_3());
            pt.setString(14, st.getCourse_sub1_4());
            pt.setString(15, st.getCourse_sub2_1());
            pt.setString(16, st.getCourse_sub2_2());
            pt.setString(17, st.getCourse_sub2_3());
            pt.setString(18, st.getCourse_sub2_4());
            pt.setString(19, st.getFaculty_name());
            pt.setInt(20, st.getAL_index());
            pt.setString(21, st.getZcore());
            pt.setString(22, st.getAL_sub1());
            pt.setString(23, st.getAL_sub1_grade());
            pt.setString(24, st.getAL_sub2());
            pt.setString(25, st.getAL_sub2_grade());
            pt.setString(26, st.getAL_sub3());
            pt.setString(27, st.getAL_sub3_grade());

            pt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.print(e);
            return false;
        }

    }

    public boolean addpoststudents(poststudents pst) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "INSERT INTO post_student VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);
            pt.setInt(1, pst.getPstudent_id());
            pt.setString(2, pst.getFirst_name());
            pt.setString(3, pst.getLast_name());
            pt.setInt(4, pst.getAge());
            pt.setString(5, pst.getGender());
            pt.setInt(6, pst.getPhone_number());
            pt.setString(7, pst.getAddress());
            pt.setString(8, pst.getEmail());
            pt.setString(9, pst.getQulification());
            pt.setString(10, pst.getInstitute());
            pt.setInt(11, pst.getYOC());
            pt.setInt(12, pst.getAdmission_year());
            pt.setString(13, pst.getIntake_month());
            pt.setString(14, pst.getCourse_sub1_1());
            pt.setString(15, pst.getCourse_sub1_2());
            pt.setString(16, pst.getCourse_sub1_3());
            pt.setString(17, pst.getCourse_sub1_4());
            pt.setString(18, pst.getCourse_sub2_1());
            pt.setString(19, pst.getCourse_sub2_2());
            pt.setString(20, pst.getCourse_sub2_3());
            pt.setString(21, pst.getCourse_sub2_4());
            pt.setString(22, pst.getFaculty_name());

            pt.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.print(e);
            return false;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }

        }

    }

    ArrayList<students> getstudents() {
        try {
            ArrayList<students> list = new ArrayList();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "SELECT student_id,first_name,last_name,age,email,phone_number,Gender,Admission_year,Intake_month,faculty_name FROM und_student";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            rs = pt.executeQuery();

            while (rs.next()) {
                students s = new students();
                s.setStudent_id(rs.getInt(1));
                s.setFirst_name(rs.getString(2));
                s.setLast_name(rs.getString(3));
                s.setAge(rs.getInt(4));
                s.setEmail(rs.getString(5));
                s.setPhone_number(rs.getInt(6));
                s.setGender(rs.getString(7));
                s.setAdmission_year(rs.getInt(8));
                s.setIntake_month(rs.getString(9));
                s.setFaculty_name(rs.getString(10));
                list.add(s);

            }
            return list;

        } catch (Exception e) {
            System.out.print(e);
            return null;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }

    ArrayList<poststudents> getpoststudents() {
        try {

            ArrayList<poststudents> list = new ArrayList();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "SELECT p_student_id,first_name,last_name,age,email,qulification,Institute,year_of_completion,phone_number,Gender,Admission_year,Intake_month,faculty_name FROM post_student";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            rs = pt.executeQuery();

            while (rs.next()) {
                poststudents pts = new poststudents();
                pts.setPstudent_id(rs.getInt(1));
                pts.setFirst_name(rs.getString(2));
                pts.setLast_name(rs.getString(3));
                pts.setAge(rs.getInt(4));
                pts.setEmail(rs.getString(5));
                pts.setQulification(rs.getString(6));
                pts.setInstitute(rs.getString(7));
                pts.setYOC(rs.getInt(8));
                pts.setPhone_number(rs.getInt(9));
                pts.setGender(rs.getString(10));
                pts.setAdmission_year(rs.getInt(11));
                pts.setIntake_month(rs.getString(12));
                pts.setFaculty_name(rs.getString(13));
                list.add(pts);

            }
            return list;

        } catch (Exception e) {
            System.out.print(e);
            return null;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }

    ArrayList<Lecture> getlectures() {
        try {

            ArrayList<Lecture> list = new ArrayList();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "SELECT * FROM lecture_details";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            rs = pt.executeQuery();

            while (rs.next()) {
                Lecture pts = new Lecture();
                pts.setLecture_id(rs.getInt(1));
                pts.setName(rs.getString(2));
                pts.setEmail(rs.getString(3));
                pts.setAge(rs.getInt(4));
                pts.setGender(rs.getString(5));
                pts.setPhone_number(rs.getInt(6));
                pts.setQulification(rs.getString(7));
                pts.setDepartment_id(rs.getInt(8));
                pts.setSubject_code(rs.getString(9));

                list.add(pts);

            }
            return list;

        } catch (Exception e) {
            System.out.print(e);
            return null;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }

    ArrayList<Instructor> getinstructors() {
        try {

            ArrayList<Instructor> list = new ArrayList();

            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "SELECT * FROM instructor_details";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            rs = pt.executeQuery();

            while (rs.next()) {
                Instructor ins = new Instructor();
                ins.setInstructor_id(rs.getInt(1));
                ins.setName(rs.getString(2));
                ins.setEmail(rs.getString(3));
                ins.setAge(rs.getInt(4));
                ins.setGender(rs.getString(5));
                ins.setPhone_number(rs.getInt(6));
                ins.setQulification(rs.getString(7));
                ins.setDepartment_id(rs.getInt(8));
                ins.setSubject_code(rs.getString(9));

                list.add(ins);

            }
            return list;

        } catch (Exception e) {
            System.out.print(e);
            return null;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }

    public boolean updateUnStudent(students std) {
        try {
            System.out.println("task 1 done");
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "UPDATE und_student SET first_name=?, last_name=?,age=?, address=?, email=?, phone_number=?, Gender=?,  Admission_year=?, Intake_month=?, course_sub1_1=?,course_sub1_2=?,course_sub1_3=?,course_sub1_4=?,course_sub2_1=?,course_sub2_2=?, course_sub2_3=?,course_sub2_4=?, faculty_name=?, AL_index=?, zcore=?, AL_sub1=?, AL_sub1_grade=?, AL_sub2=?, AL_sub2_grade=?, AL_sub3=?, AL_sub3_grade=? WHERE student_id=?";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            pt.setString(1, std.getFirst_name());
            pt.setString(2, std.getLast_name());
            pt.setInt(3, std.getAge());
            pt.setString(4, std.getAddress());
            pt.setString(5, std.getEmail());
            pt.setInt(6, std.getPhone_number());
            pt.setString(7, std.getGender());
            pt.setInt(8, std.getAdmission_year());
            pt.setString(9, std.getIntake_month());
            pt.setString(10, std.getCourse_sub1_1());
            pt.setString(11, std.getCourse_sub1_2());
            pt.setString(12, std.getCourse_sub1_3());
            pt.setString(13, std.getCourse_sub1_4());
            pt.setString(14, std.getCourse_sub2_1());
            pt.setString(15, std.getCourse_sub2_2());
            pt.setString(16, std.getCourse_sub2_3());
            pt.setString(17, std.getCourse_sub2_4());
            pt.setString(18, std.getFaculty_name());
            pt.setInt(19, std.getAL_index());
            pt.setString(20, std.getZcore());
            pt.setString(21, std.getAL_sub1());
            pt.setString(22, std.getAL_sub1_grade());
            pt.setString(23, std.getAL_sub2());
            pt.setString(24, std.getAL_sub2_grade());
            pt.setString(25, std.getAL_sub3());
            pt.setString(26, std.getAL_sub3_grade());
            pt.setInt(27, std.getStudent_id());

            System.out.println("task 2 done");
            pt.executeUpdate();
            System.out.println("task 3 done");
            return true;

        } catch (Exception e) {
            System.out.print("has an exception" + e);
            return false;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }
        }

    }

    public boolean updatepstStudent(poststudents std) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "UPDATE post_student SET first_name=?,last_name=?,age=?,address=?,email=?,qulification=?,Institute=?,year_of_completion=?, phone_number=?, gender=?,Admission_year=?, Intake_month=?, course_sub1_1=?, course_sub1_2=?, course_sub1_3=?, course_sub1_4=?, course_sub2_1=?, course_sub2_2=?,  course_sub2_3=?, course_sub2_4=?,  faculty_name=?  WHERE p_student_id=" + std.getPstudent_id();

            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            pt.setString(1, std.getFirst_name());
            pt.setString(2, std.getLast_name());
            pt.setInt(3, std.getAge());
            pt.setString(4, std.getAddress());
            pt.setString(5, std.getEmail());
            pt.setString(6, std.getQulification());
            pt.setString(7, std.getInstitute());
            pt.setInt(8, std.getYOC());
            pt.setInt(9, std.getPhone_number());
            pt.setString(10, std.getGender());
            pt.setInt(11, std.getAdmission_year());
            pt.setString(12, std.getIntake_month());
            pt.setString(13, std.getCourse_sub1_1());
            pt.setString(14, std.getCourse_sub1_2());
            pt.setString(15, std.getCourse_sub1_3());
            pt.setString(16, std.getCourse_sub1_4());
            pt.setString(17, std.getCourse_sub2_1());
            pt.setString(18, std.getCourse_sub2_2());
            pt.setString(19, std.getCourse_sub2_3());
            pt.setString(20, std.getCourse_sub2_4());
            pt.setString(21, std.getFaculty_name());
            //pt.setInt(22, std.getPstudent_id());
            pt.execute();
            System.out.println("updated");
            return true;

        } catch (Exception e) {
            System.out.print(e);
            return false;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }
        }

    }

    public boolean updatelecture(Lecture l) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "UPDATE lecture_details SET Lecture_id=?, Name=?, Email=?, Age=?, Gender=?, Phone_number=?, Qualifications=?, Department_id=?, Subject_code=? WHERE Lecture_id=? ";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);
            System.out.println("task one done");

            pt.setInt(1, l.getLecture_id());
            pt.setString(2, l.getName());
            pt.setString(3, l.getEmail());
            pt.setInt(4, l.getAge());
            pt.setString(5, l.getGender());
            pt.setInt(6, l.getPhone_number());
            pt.setString(7, l.getQulification());
            pt.setInt(8, l.getDepartment_id());
            pt.setString(9, l.getSubject_code());
            pt.setInt(10, l.getLecture_id());
            pt.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.print(e);
            return false;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }
        }
    }

    public boolean deleteunstudent(students std) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "DELETE FROM und_student WHERE student_id=?";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);
            pt.setInt(1, std.getStudent_id());
            pt.execute();
            return true;

        } catch (Exception e) {
            System.out.print(e);
            return false;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }

        }
    }

    public boolean deletepststudent(poststudents std) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "DELETE FROM post_student WHERE p_student_id=" + std.getPstudent_id();
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            pt.execute();
            return true;

        } catch (Exception e) {
            System.out.print(e);
            return false;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }

        }
    }
    
    

    public students searchstudent(int k) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "SELECT * FROM und_student WHERE student_id=" + k;
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            rs = pt.executeQuery();
            rs.next();
            System.out.println("done up to this");
            students std = new students();
            std.setStudent_id(rs.getInt(1));
            std.setFirst_name(rs.getString(2));
            std.setLast_name(rs.getString(3));
            std.setAge(rs.getInt(4));
            std.setAddress(rs.getString(5));
            std.setEmail(rs.getString(6));
            std.setPhone_number(rs.getInt(7));
            std.setGender(rs.getString(8));
            std.setAdmission_year(rs.getInt(9));
            std.setIntake_month(rs.getString(10));
            std.setCourse_sub1_1(rs.getString(11));
            std.setCourse_sub1_2(rs.getString(12));
            std.setCourse_sub1_3(rs.getString(13));
            std.setCourse_sub1_4(rs.getString(14));
            std.setCourse_sub2_1(rs.getString(15));
            std.setCourse_sub2_2(rs.getString(16));
            std.setCourse_sub2_3(rs.getString(17));
            std.setCourse_sub2_4(rs.getString(18));
            std.setFaculty_name(rs.getString(19));
            std.setAL_index(rs.getInt(20));
            std.setZcore(rs.getString(21));
            std.setAL_sub1(rs.getString(22));
            std.setAL_sub1_grade(rs.getString(23));
            std.setAL_sub2(rs.getString(24));
            std.setAL_sub2_grade(rs.getString(25));
            std.setAL_sub3(rs.getString(26));
            std.setAL_sub3_grade(rs.getString(27));
            System.out.println("done");
            return std;

        } catch (Exception e) {
            System.out.print("has an exception " + e);
            return null;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }

        }

    }

    public poststudents searchpstudent(int k) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "SELECT * FROM post_student WHERE p_student_id=" + k;
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            rs = pt.executeQuery();
            rs.next();
            System.out.println("done up to this");
            poststudents std = new poststudents();

            std.setPstudent_id(rs.getInt(1));
            std.setFirst_name(rs.getString(2));
            std.setLast_name(rs.getString(3));
            std.setAge(rs.getInt(4));
            std.setGender(rs.getString(5));
            std.setPhone_number(rs.getInt(6));
            std.setAddress(rs.getString(7));
            std.setEmail(rs.getString(8));
            std.setQulification(rs.getString(9));
            std.setInstitute(rs.getString(10));
            std.setYOC(rs.getInt(11));
            std.setAdmission_year(rs.getInt(12));
            std.setIntake_month(rs.getString(13));
            std.setCourse_sub1_1(rs.getString(14));
            std.setCourse_sub1_2(rs.getString(15));
            std.setCourse_sub1_3(rs.getString(16));
            std.setCourse_sub1_4(rs.getString(17));
            std.setCourse_sub2_1(rs.getString(18));
            std.setCourse_sub2_2(rs.getString(19));
            std.setCourse_sub2_3(rs.getString(20));
            std.setCourse_sub2_4(rs.getString(21));
            std.setFaculty_name(rs.getString(22));

            System.out.println("done");
            return std;

        } catch (Exception e) {
            System.out.print("has an exception " + e);
            return null;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }

        }

    }

    public int getsubjectcredit(String subcode) {

        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "SELECT credits FROM subjects WHERE subject_code='" + subcode + "'";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            rs = pt.executeQuery();
            //rs.next();
            int credit = rs.getInt(0);
            return credit;

        } catch (Exception e) {
            System.out.print("has an exception " + e);
            return 0;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }

        }

    }

    public boolean addPayments(Paymentclass py) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "INSERT INTO payments VALUES (?,?,?,?,?)";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            pt.setInt(1, py.getPayment_id());
            pt.setInt(2, py.getStudent_id());
            pt.setString(3, py.getSubject_code());
            pt.setInt(4, py.getAmount());
            pt.setString(5, py.getDate());
            pt.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.print("has an exception " + e);
            return false;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }

        }
    }

    public boolean addPaymentsPost(Paymentclass py) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "INSERT INTO paymentsPost VALUES (?,?,?,?,?)";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            pt.setInt(1, py.getPayment_id());
            pt.setInt(2, py.getStudent_id());
            pt.setString(3, py.getSubject_code());
            pt.setInt(4, py.getAmount());
            pt.setString(5, py.getDate());
            pt.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.print("has an exception " + e);
            return false;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }

        }

    }

    public boolean addlecture(Lecture lc) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "INSERT INTO lecture_details VALUES (?,?,?,?,?,?,?,?,?)";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            pt.setInt(1, lc.getLecture_id());
            pt.setString(2, lc.getName());
            pt.setString(3, lc.getEmail());
            pt.setInt(4, lc.getAge());
            pt.setString(5, lc.getGender());
            pt.setInt(6, lc.getPhone_number());
            pt.setString(7, lc.getQulification());
            pt.setInt(8, lc.getDepartment_id());
            pt.setString(9, lc.getSubject_code());
            pt.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.print("has an exception " + e);
            return false;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }

        }
    }

    public boolean addInstructor(Instructor ins) {
        try {
            con = (Connection) DriverManager.getConnection(url, username, password);
            String quary = "INSERT INTO instructor_details VALUES (?,?,?,?,?,?,?,?,?)";
            pt = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(quary);

            pt.setInt(1, ins.getInstructor_id());
            pt.setString(2, ins.getName());
            pt.setString(3, ins.getEmail());
            pt.setInt(4, ins.getAge());
            pt.setString(5, ins.getGender());
            pt.setInt(6, ins.getPhone_number());
            pt.setString(7, ins.getQulification());
            pt.setInt(8, ins.getDepartment_id());
            pt.setString(9, ins.getSubject_code());
            pt.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.print("has an exception " + e);
            return false;
        } finally {
            try {
                if (pt != null) {
                    pt.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println(e);

            }

        }

    }

}
