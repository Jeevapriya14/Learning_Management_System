package Controller;

import Model.User_Credential;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class UserCredentialController {

    HashMap<String,User_Credential>map=new HashMap<>();
    HashSet<String> set=new HashSet<>();
    HashMap<String,ArrayList<String>>profile=new HashMap<>();
    ArrayList<String> list=new ArrayList<>();


    public UserCredentialController() {

    }
    User_Credential User=new User_Credential();
    public boolean register(String u_id,String password,String u_name,String role,String u_age,String ph_no){
        if(!map.containsKey(u_id)){
            map.put(u_id,new User_Credential(u_id,password));
            ArrayList<String> info=new ArrayList<>();
            info.add(u_name);
            info.add(role);
            info.add(u_age);
            info.add(ph_no);
            profile.put(u_id,info);


            return true;
        }
        return false;

    }
    public User_Credential login(String u_id,String password,String role){
        User_Credential credential=map.get(u_id);
        if(map.containsKey(u_id)){
            System.out.println("Logged in successfully!");
            set.add(u_id);

            return credential;

        }
        else{
            return null;
        }

    }

    public boolean authenticate(String u_id,String password){
        User_Credential credential=map.get(u_id);
        if(set.contains(u_id)){
            return credential.getPassword(password).equals(password);
        }
        return false;
    }
    public boolean changePassword(String u_id,String password,String npassword){
        User_Credential credential=map.get(u_id);
        if(authenticate(u_id,password)){
            credential.setPassword(npassword);
            return true;
        }else{
            return false;
        }
    }
    public void viewProfile(String u_id){
        if(profile.containsKey(u_id)){
            for(String key:profile.get(u_id)){
                System.out.println(key);
            }

        }else {
            System.out.println("Invalid account!");
        }
    }
    public boolean logout(String u_id){
        if(set.contains(u_id)){
            set.remove(u_id);
            return true;
        }else {
            return false;
        }
    }
    public boolean deleteAccount(String u_id){
        if(map.containsKey(u_id)){
            map.remove(u_id);
            set.remove(u_id);
            return true;
        }else{
            return false;
        }
    }
    public void editProfile(String u_id,String nname,String nrole,String nage,String nph_no){
        if(profile.containsKey(u_id)){
            ArrayList<String> info=profile.get(u_id);
            info.set(0,nname);
            info.set(1,nrole);
            info.set(2,nage);
            info.set(3,nph_no);
            System.out.println("Your new profile details:");
            for(String pr:info){
                System.out.println(pr);
            }


        }else{
            System.out.println("Account not found!");
        }

    }



}
