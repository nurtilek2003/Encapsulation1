public class School {
    private String lesson;
    private String name;
    private int pupils;

    public void setLesson(String lesson){
        this.lesson=lesson;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPupils(int pupils){
        this.pupils=pupils;
    }
    public String getLesson(){
        return this.lesson;
    }
    public String getName(){
        return this.name;
    }
    public int getPupils(){
        return this.pupils;
    }

    @Override
    public String toString() {
        return "School{" +
                "lesson='" + lesson + '\'' +
                ", name='" + name + '\'' +
                ", pupils=" + pupils +
                '}';
    }
}
