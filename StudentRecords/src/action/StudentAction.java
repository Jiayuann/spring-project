/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

/**
 *
 * @author jiayuan
 */
 
import java.util.List;
import pojo.Student;
import service.StudentService;
 
public class StudentAction {
 
    StudentService studentService;
    List<Student> students;
    Student student;

    public String list() {
    	students = studentService.list();
    	return "listStudent";
    }	
    public String add(){
    	studentService.add(student);
    	return "listStudentAction";
    }
    public String edit(){
    	student = studentService.get(student.getP_id());
    	return "editStudent";
    }
    public String delete(){
    	studentService.delete(student);
    	return "listStudentAction";
    }
    public String update(){
    	studentService.update(student);
    	return "listStudentAction";
    }
    public StudentService getStudentService() {
    	return studentService;
    }
    public void setStudentService(StudentService studentService) {
    	this.studentService = studentService;
    }
    public List<Student> getStudents() {
    	return students;
    }
    public void setStudents(List<Student> students) {
    	this.students = students;
    }
    public Student getStudent() {
    	return student;
    }
    public void setStudent(Student student) {
    	this.student = student;
    }
    public static void main(String []args){
        System.out.println("ff");
    }
}