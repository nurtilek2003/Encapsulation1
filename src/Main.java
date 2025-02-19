import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 // todo
//        University, School, Car жана Person деген класс тузунуз
//        Алардын свойстваларын ойлоп табыныз
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз
        University university1=new University();
        university1.setLesson("Java");
        university1.setName("Kurulush");
        university1.setStudents(19);
        University university2=new University();
        university2.setLesson("Java Skirip");
        university2.setName("Peksoft");
        university2.setStudents(100);
        University[] universities ={university1,university2};
        System.out.println(Arrays.toString(universities));
        System.out.println();
        System.out.println();

        Person person1=new Person();
        person1.setName("Junusbek");
        person1.setSurname("Baielov");
        person1.setAge(21);
        Person person2=new Person();
        person2.setName("Amir");
        person2.setSurname("Sanjarov");
        person2.setAge(18);
        Person[] person ={person1,person2};
        System.out.println(Arrays.toString(person));
        System.out.println();

         Car car1 = new Car();
         car1.setName("x5");
         car1.setName("BMB");
         car1.setObem(3);
        Car car2 = new Car();
        car2.setName("M klass");
        car2.setName("MERCEDES");
        car2.setObem(6);
         Car[] cars ={car1,car2};
        System.out.println(Arrays.toString(cars));
        System.out.println();

        School school1=new School();
        school1.setName("Babaev");
        school1.setLesson("Ximia"+", "+"algebra");
        school1.setPupils(140);
        School school2=new School();
        school2.setName("Ak- Cuu");
        school2.setLesson("Biologia"+", "+"Taryh");
        school2.setPupils(200);
        School[] schools={school1,school2};
        System.out.println(Arrays.toString(schools));


    }
}