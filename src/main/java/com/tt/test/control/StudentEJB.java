package com.tt.test.control;

import com.tt.test.model.Student;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: ylevkovych
 * Date: 4/13/11
 * Time: 9:22 PM
 * To change this template use File | Settings | File Templates.
 */
@Stateless
public class StudentEJB {

    @PersistenceContext(unitName = "TestPU")
    EntityManager em;

    public void save(Student s) {
        em.persist(s);
    }

    public List<Student> list() {
        return em.createNativeQuery("SELECT * FROM student", Student.class).getResultList();
    }

}
