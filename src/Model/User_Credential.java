package Model;

import java.util.ArrayList;

public class User_Credential extends User {
    public String u_id;
    protected String password;

    public ArrayList<Student> students=new ArrayList<>();

    public User_Credential(String u_id, String password) {
        this.u_id = u_id;
        this.password = password;


    }
    public User_Credential(){
        this.u_id="";
        this.password="";
    }
    public String getPassword(String password){
        return password;
    }
    public String setPassword(String npassword){
        return password=npassword;
    }

}
