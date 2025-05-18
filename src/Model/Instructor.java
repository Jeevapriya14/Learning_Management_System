package Model;

import java.util.ArrayList;

public class Instructor extends User_Credential {
    public String i_id;
    public String c_id;
    public String i_name;
    public String i_age;
    public String College_name;
    public ArrayList<Course> icourses=new ArrayList<>();

    public Instructor(String u_id,String password,String i_id, String c_id, String i_name, String i_age, String college_name, ArrayList<Course> icourses) {
        super(u_id,password);
        this.i_id = i_id;
        this.c_id = c_id;
        this.i_name = i_name;
        this.i_age = i_age;
        this.College_name = college_name;
        this.icourses = icourses;
    }
    public Instructor(){
        super("","");
        this.i_id="";
        this.c_id="";
        this.i_name="";
        this.i_age="";
        this.College_name="";
        this.icourses=new ArrayList<>();
    }
}
