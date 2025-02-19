public class University {
    private String lesson;
    private String name;
    private int students;

   public void setName(String name){
       this.name=name;
   }
   public void setLesson(String lesson){
       this.lesson=lesson;
   }
   public void setStudents(int students){
       this.students=students;
   }
   public String getName(){
       return this.name;
   }
   public String getLesson(){
       return this.lesson;
   }
   public int getStudents(){
       return this.students;
   }

    @Override
    public String toString() {
        return "University{" +
                "lesson='" + lesson + '\'' +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
