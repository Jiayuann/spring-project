/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import pojo.Course;
import dao.CourseDAO;
/**
 *
 * @author jiayuan
 */
public class CourseServiceImpl implements CourseService {
    private CourseDAO courseDAO;
   
    @Override
    public List<Course> list(int p_id) {
        List<Course> courses = courseDAO.list(p_id);
        return courses;
    }

    @Override
    public Course get(int id) {
       return courseDAO.get(id);
    }
  

    /**
     * @return the courseDAO
     */
    public CourseDAO getCourseDAO() {
        return courseDAO;
    }

    /**
     * @param courseDAO the courseDAO to set
     */
    public void setCourseDAO(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }
    
}
