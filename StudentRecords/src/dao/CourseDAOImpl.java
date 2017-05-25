/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author jiayuan
 */
import java.util.List;
import pojo.Course;
import org.springframework.orm.hibernate3.HibernateTemplate;
public class CourseDAOImpl extends HibernateTemplate implements CourseDAO{
    public List<Course> list(int p_id){
        return find("from Course where p_id in (?)",p_id);
    }
    @Override
    public Course get(int id){
        return (Course)get(Course.class, id);
    }
}
