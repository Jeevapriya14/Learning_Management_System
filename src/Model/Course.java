package Model;

public class Course {
    public String c_id;
    public String c_name;
    public String c_category;
    public String price;
    public String description;
    public String title;
    public String no_of_lessons;

    public Course(String c_id, String c_name, String c_category, String price, String description, String title, String no_of_lessons) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.c_category = c_category;
        this.price = price;
        this.description = description;
        this.title = title;
        this.no_of_lessons = no_of_lessons;
    }
}
