public class Person {
    private String name;
    private String surname;
    private int age;

   public void setName(String name){
       this.name=name;
   }
   public void setSurname(String surname){
       this.surname=surname;
   }
   public void setAge(int age){
       this.age=age;

   }
   public String getName(){
       return this.name;
   }
   public String getSurname(){
       return this.surname;
   }
   public int getAge(){
       return this.age;
   }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
