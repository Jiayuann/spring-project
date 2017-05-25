/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author jiayuan
 */
import dao.StudentDAO;
import pojo.Student;
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;
public class StudentServiceImpl implements StudentService {
    StudentDAO studentDAO;
    public StudentDAO getStudentDAO(){
        return studentDAO;
    }
    public void setStudentDAO(StudentDAO studentDAO){
        this.studentDAO = studentDAO;
    }
    public List<Student> list(){
        List<Student> students = studentDAO.list();
        if(students.isEmpty()){
            for(int i = 0; i < 5; i++){
                Student p = new Student();
                p.setName("student" + i);
                p.setGpa(0);
                if(i == 2)
                    throw new RuntimeException();
                studentDAO.add(p);
                students.add(p);
                
            }        
        }
        return students;

    }
    @Override
    public void add(Student p){
        studentDAO.add(p);
    }
    @Override
    public void update(Student p){
        studentDAO.update(p);
    }
    @Override
    public void delete(Student p){
        studentDAO.delete(p);
    }
    @Override
    public Student get(int id){
        return studentDAO.get(id);
    }
    
    
}
