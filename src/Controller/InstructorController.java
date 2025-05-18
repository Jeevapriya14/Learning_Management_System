package Controller;

import Model.Course;
import Model.Instructor;

import java.util.ArrayList;
import java.util.HashMap;

public class InstructorController {
    Instructor ic = new Instructor();

    public InstructorController() {

    }

    HashMap<String, ArrayList<Course>> map = new HashMap<>();

    public void createCourse(String i_id, String c_id, String c_name, String c_category, String price, String description, String title, String no_of_lessons) {
        Course course = new Course(c_id, c_name, c_category, price, description, title, no_of_lessons);
        ic.icourses.add(course);
        if (!map.containsKey(i_id)) {
            map.put(i_id, new ArrayList<>());

        }
        map.get(i_id).add(course);
        System.out.println("Course has been added!");
    }

    public void viewAddedCourses(String i_id) {
        if(map.containsKey(i_id)) {
            ArrayList<Course> courses = map.get(i_id);



            for (Course c : courses) {
                System.out.println(c.c_id);
                System.out.println(c.c_name);
                System.out.println(c.c_category);
                System.out.println(c.price);
                System.out.println(c.description);
                System.out.println(c.title);
                System.out.println(c.no_of_lessons);

            }
        }
        else {
            System.out.println("No courses were added");
        }



    }
    public void viewAllCourse() {
        for(Course c:ic.icourses){
            System.out.println(c.c_id+" "+c.c_name+" "+c.c_category+" "+c.price+" "+c.description+" "+c.title+" "+c.no_of_lessons);

    }

    }


}
