package Model;

import java.util.ArrayList;

public class Student extends User_Credential{
    public String s_id;
    public String c_id;
    public String s_name;
    public String s_age;
    public String department;
    public ArrayList<Course> scourses=new ArrayList<>();

    public Student(String u_id,String password,String s_id, String c_id, String s_name, String age, String department, ArrayList<Course> scourses) {
        super(u_id,password);
        this.s_id = s_id;
        this.c_id = c_id;
        this.s_name = s_name;
        this.s_age = age;
        this.department = department;
        this.scourses = scourses;
    }
    public Student(){
        super("","");
        this.s_id="";
        this.c_id="";
        this.s_name="";
        this.s_age="";
        this.department="";
        this.scourses=new ArrayList<>();
    }


}
