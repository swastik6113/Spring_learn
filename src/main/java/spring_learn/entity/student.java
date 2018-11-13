package spring_learn.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
public class student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int student_id;
    @Column(name = "Student_name")
    private String studentname;
    @Column(name = "Student_address")
    private String studentaddress;
    @Column(name = "Student_salary")
    private BigInteger studentsalary;
    student(){}
    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentaddress() {
        return studentaddress;
    }

    public void setStudentaddress(String studentaddress) {
        this.studentaddress = studentaddress;
    }

    public BigInteger getStudentsalary() {
        return studentsalary;
    }

    public void setStudentsalary(BigInteger studentsalary) {
        this.studentsalary = studentsalary;
    }
    public String toString()
    {
        return "Student name :"+this.getStudentname()+"\n address :"+this.getStudentaddress();
    }


}
