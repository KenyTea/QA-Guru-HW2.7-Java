package guru.qa;

public class Student {
    private int course;
    private String group;

    public int getCourse(){
        return course;
    }
    public void setCourse(int course){
        this.course = course;
    }

    public String getGroup(){
        return group;
    }
    public void setGroup(String group){
        this.group = group;
    }

    public void studentLearn(){
        System.out.println("\nЯ лбюлю учиться :)!!!\n");
    }

}
