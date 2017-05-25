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
import dao.CourseDAO;
import pojo.Course;
public interface CourseService {
    public List<Course> list(int p_id);
    public Course get(int id);
}
