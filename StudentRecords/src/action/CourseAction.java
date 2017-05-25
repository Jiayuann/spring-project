package action;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jiayuan
 */
import pojo.Course;
import service.CourseService;
import dao.CourseDAO;
import java.util.List;
public class CourseAction {
    private CourseService courseService;
    private List<Course> courses;
    private Course course;
    public String list(){
        courses = courseService.list(course.getP_id());

        return "listCourse";
        
    }
    

    /**
     * @return the courseService
     */
    public CourseService getCourseService() {
        return courseService;
    }

    /**
     * @param courseService the courseService to set
     */
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * @return the courses
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * @return the course
     */
    public Course getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(Course course) {
        this.course = course;
    }
 
    
    public static void main(String []args){
        System.out.println("courseAction");
    }

}
