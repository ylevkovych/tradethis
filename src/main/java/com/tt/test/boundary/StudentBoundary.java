package com.tt.test.boundary;

import com.tt.test.control.StudentEJB;
import com.tt.test.model.Student;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ylevkovych
 * Date: 4/13/11
 * Time: 9:27 PM
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean
@SessionScoped
public class StudentBoundary {

    @EJB
    private StudentEJB studentEJB;
    private Student student = new Student();
    private List<Student> studentList = new ArrayList<Student>();

    public void save() {
        studentEJB.save(student);
    }

    public void list() {
        studentList = studentEJB.list();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
