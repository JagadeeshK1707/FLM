package com.model.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Student;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Student getStudentById(int id) {

        Session session = sessionFactory.getCurrentSession();
        return session.get(Student.class, id);
    }

    public void saveStudent(Student student) {

        Session session = sessionFactory.getCurrentSession();
        session.persist(student);
    }
}