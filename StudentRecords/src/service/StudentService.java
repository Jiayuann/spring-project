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
import java.util.List;
import pojo.Student;
public interface StudentService {
    public List<Student> list();
    public void add(Student p);
    public Student get(int id);
    public void update(Student p);
    public void delete(Student p);
}
