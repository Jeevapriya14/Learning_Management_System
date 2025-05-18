import Controller.InstructorController;
import Controller.StudentController;
import Controller.UserCredentialController;
import Model.User;
import Model.User_Credential;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        UserCredentialController uc=new UserCredentialController();
        InstructorController inc=new InstructorController();
        StudentController stuc=new StudentController(inc);


        while(true){
            System.out.println("------WELCOME TO UDEMY PLATFORM--------");
            System.out.println("Select options from below:");
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Change Password");
            System.out.println("4.View your profile");
            System.out.println("5.Edit your profile");
            System.out.println("6.Exit");
            int option=Integer.parseInt(sc.nextLine());
            if(option==1){
                System.out.println("Register it");
                System.out.println("Enter user id:");
                String u_id=sc.nextLine();
                System.out.println("Enter password:");
                String password=sc.nextLine();
                System.out.println("Enter your name:");
                String u_name=sc.nextLine();
                System.out.println("Enter Role:");
                String role=sc.nextLine();
                System.out.println("Enter age:");
                String u_age=sc.nextLine();
                System.out.println("Enter phone number:");
                String ph_no=sc.nextLine();
                if(uc.register(u_id,password,u_name,role,u_age,ph_no)){
                    System.out.println("Registered successfully!");

                }else{
                    System.out.println("Already Registered!");
                }


            }else if(option==2){
                System.out.println("Login to your Account!");
                System.out.println("Enter your user id:");
                String u_id=sc.nextLine();
                System.out.println("Enter your password:");
                String password=sc.nextLine();
                System.out.println("Enter your role(Student/Instructor/Admin: ");
                String role=sc.nextLine();
                User_Credential loggedin=uc.login(u_id,password,role);
                if(loggedin!=null){


                        if (role.equalsIgnoreCase("Student")) {



                            while(true) {
                                System.out.println("Welcome to your Student Account");
                                System.out.println("Select options below:");
                                System.out.println("1.Log out");
                                System.out.println("2.Delete Account");
                                System.out.println("3.Enroll Courses");
                                System.out.println("4.View All courses");
                                System.out.println("3.Exit");

                                int Option=Integer.parseInt(sc.nextLine());
                                if(Option==1){
                                    System.out.println("Enter your user id:");
                                    u_id=sc.nextLine();
                                    if(uc.logout(u_id)){
                                        System.out.println("Logged out successfully!");
                                        break;
                                    }else{
                                        System.out.println("Accout not found!");
                                        break;
                                    }
                                }else if(Option==2){
                                    System.out.println("Enter your user_id:");
                                    u_id=sc.nextLine();
                                    if(uc.deleteAccount(u_id)){
                                        System.out.println("Account Deleted successfully!");
                                        break;
                                    }else{
                                        System.out.println("Account not found!");
                                        break;
                                    }
                                }else if(Option==5){
                                    break;
                                }
                                else if(Option==3){
                                    System.out.println("Enter your user id:");
                                    String s_id=sc.nextLine();
                                    System.out.println("Enter course id:");
                                    String c_id=sc.nextLine();
                                    System.out.println("Enter course name:");
                                    String c_name=sc.nextLine();
                                    System.out.println("Enter course Category:");
                                    String c_category=sc.nextLine();
                                    System.out.println("Enter price:");
                                    String price=sc.nextLine();
                                    System.out.println("Enter description:");
                                    String description=sc.nextLine();
                                    System.out.println("Enter title:");
                                    String title=sc.nextLine();
                                    System.out.println("No of lessons:");
                                    String no_of_lessons=sc.nextLine();
                                    stuc.addCourse(s_id,c_id,c_name,c_category,price,description,title,no_of_lessons);

                                }else if(Option==4){
                                    inc.viewAllCourse();
                                }
                            }
                        } else if (role.equalsIgnoreCase("Instructor")) {

                            while (true) {


                                System.out.println("Welcome Instructor!");
                                System.out.println("Select options below:");
                                System.out.println("1.Log out");
                                System.out.println("2.Delete Account");
                                System.out.println("4.Create course");
                                System.out.println("5.View Added courses");
                                System.out.println("6.View All courses");
                                System.out.println("3.Exit");
                                int Option = Integer.parseInt(sc.nextLine());
                                if (Option == 1) {
                                    System.out.println("Enter your user id:");
                                    u_id = sc.nextLine();
                                    if (uc.logout(u_id)) {
                                        System.out.println("Logged out successfully!");
                                        break;
                                    } else {
                                        System.out.println("Account not found!");
                                        break;
                                    }
                                } else if (Option == 2) {
                                    System.out.println("Enter your user_id:");
                                    u_id = sc.nextLine();
                                    if (uc.deleteAccount(u_id)) {
                                        System.out.println("Account Deleted successfully!");
                                        break;
                                    } else {
                                        System.out.println("Account not found!");
                                        break;
                                    }
                                }else if(Option==3){
                                    break;
                                }else if(Option==4){
                                    System.out.println("Create new course");
                                    System.out.println("Enter your id:");
                                    String i_id=sc.nextLine();
                                    System.out.println("Enter course id:");
                                    String c_id=sc.nextLine();
                                    System.out.println("Enter course name:");
                                    String c_name=sc.nextLine();
                                    System.out.println("Enter course category:");
                                    String c_category=sc.nextLine();
                                    System.out.println("Enter price:");
                                    String price=sc.nextLine();
                                    System.out.println("Enter description:");
                                    String description=sc.nextLine();
                                    System.out.println("Enter title:");
                                    String title=sc.nextLine();
                                    System.out.println("Enter no_of_lessons:");
                                    String no_of_lessons=sc.nextLine();
                                    inc.createCourse(i_id,c_id,c_name,c_category,price,description,title,no_of_lessons);


                                }else if(Option==5){
                                    System.out.println("View added courses");
                                    System.out.println("Enter instructor id:");
                                    String i_id=sc.nextLine();
                                    inc.viewAddedCourses(i_id);

                                }else if(Option==6){
                                    stuc.viewAllCourses();
                                }
                            }
                        }


                         else {
                            while (true) {
                                System.out.println("Welcome Admin!");
                                System.out.println("Select options below:");
                                System.out.println("1.Log out");
                                System.out.println("2.Delete Account");
                                System.out.println("3.Exit");
                                int Option = Integer.parseInt(sc.nextLine());
                                if (Option == 1) {
                                    System.out.println("Enter your user id:");
                                    u_id = sc.nextLine();
                                    if (uc.logout(u_id)) {
                                        System.out.println("Logged out successfully!");
                                        break;
                                    } else {
                                        System.out.println("Account not found!");
                                        break;
                                    }
                                } else if (Option == 2) {
                                    System.out.println("Enter your user_id:");
                                    u_id = sc.nextLine();
                                    if (uc.deleteAccount(u_id)) {
                                        System.out.println("Account Deleted successfully!");
                                        break;
                                    } else {
                                        System.out.println("Account not found!");
                                        break;
                                    }

                                }else if(Option==3){
                                    break;
                                }
                            }
                        }

                }else{
                    System.out.println("Register it!");
                }



            }else if(option==3){
                System.out.println("Change your password");
                System.out.println("Enter your user id:");
                String u_id=sc.nextLine();
                System.out.println("Enter your passowrd:");
                String password=sc.nextLine();
                System.out.println("Enter your new password: ");
                String npassword=sc.nextLine();
                if(uc.changePassword(u_id,password,npassword)){
                    System.out.println("Password has been updated!");

                }else{
                    System.out.println("Invalid account!");
                }
            }
            else if(option==4){
                System.out.println("View your profile!");
                System.out.println("Enter your user id:");
                String u_id=sc.nextLine();
                uc.viewProfile(u_id);
            }else if(option==5){
                System.out.println("Edit your profile");
                System.out.println("Enter user id: ");
                String u_id=sc.nextLine();
                System.out.println("Enter your new name: ");
                String nname=sc.nextLine();
                System.out.println("Enter your new role: ");
                String nrole=sc.nextLine();
                System.out.println("Enter your updated age: ");
                String nage=sc.nextLine();
                System.out.println("Enter new Phone number: ");
                String nph_no=sc.nextLine();
                uc.editProfile(u_id,nname,nrole,nage,nph_no);
            }
            else{
                System.out.println("Thank you!");
                break;
            }
        }

    }
}