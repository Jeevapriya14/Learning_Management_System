package Controller;

import Model.Course;
import Model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentController {

    HashMap<String,ArrayList<Course>> map=new HashMap<>();
    InstructorController inc=new InstructorController();
    public StudentController(InstructorController inc) {
        this.inc=inc;

    }
    Student stu=new Student();



    public void addCourse(String s_id,String c_id,String c_name,String c_category,String price,String description,String title,String no_of_lessons){
        Course course=new Course(c_id, c_name, c_category, price, description, title, no_of_lessons);
        stu.scourses.add(course);
        if(!map.containsKey(s_id)){
            map.put(s_id,stu.scourses);
            System.out.println("Course has been enrolled!");
        }

    }
    public void viewAllCourses(){
            inc.viewAllCourse();

    }






}
