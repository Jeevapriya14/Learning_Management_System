package Model;


import java.util.ArrayList;

public class Admin {
    public String ad_id;
    public String ad_name;
    public String created_at;
    public ArrayList<Course> acourses=new ArrayList<>();

    public Admin(String ad_id, String ad_name, String created_at, ArrayList<Course> acourses) {
        this.ad_id = ad_id;
        this.ad_name = ad_name;
        this.created_at = created_at;
        this.acourses = acourses;
    }
    public Admin(){
        this.ad_id="";
        this.ad_name="";
        this.created_at="";
        this.acourses=new ArrayList<>();
    }
}
