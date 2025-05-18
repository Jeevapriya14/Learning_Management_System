package Model;

public class Course_Completion {
    public String cc_id;
    public String percentage;
    public String no_of_lessons_completed;

    public Course_Completion(String cc_id, String percentage, String no_of_lessons_completed) {
        this.cc_id = cc_id;
        this.percentage = percentage;
        this.no_of_lessons_completed = no_of_lessons_completed;
    }
}
