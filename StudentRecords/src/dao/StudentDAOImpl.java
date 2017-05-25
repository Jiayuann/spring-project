package dao;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiayuan
 */
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
import dao.StudentDAO;
import pojo.Student;

public class StudentDAOImpl extends HibernateTemplate implements StudentDAO{
    public List<Student> list() {
        return find("from Student");
    } 
    @Override
    public void add(Student p) {
    	save(p);
    }
    @Override
    public Student get(int id) {
    	return (Student)get(Student.class,id);
    }
    @Override
    public void update(Student p) {
    	super.update(p);		
    }
    @Override
    public void delete(Student p) {
    	super.delete(p);
    }

   
}
