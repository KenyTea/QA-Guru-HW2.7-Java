package guru.qa;

public class Student {
    private int course;
    private String group;

    public int GetCourse(){
        return course;
    }
    public void SetCourse(int course){
        this.course = course;
    }

    public String GetGroup(){
        return group;
    }
    public void SetGroup(String group){
        this.group = group;
    }

    public void StudentLearn(){
        System.out.println("\nЯ лбюлю учиться :)!!!\n");
    }

}
