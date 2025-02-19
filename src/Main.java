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
        University[] universities ={university1};
        System.out.println(Arrays.toString(universities));

        Person person1=new Person();
        person1.setName("Junusbek");
        person1.setSurname("Baielov");
        person1.setAge(21);
        Person[] person ={person1};
        System.out.println(Arrays.toString(person));

         Car car1 = new Car();
         car1.setName("x5");
         car1.setName("BMB");
         car1.setObem(3);
         Car[] cars ={car1};
        System.out.println(Arrays.toString(cars));

        School school1=new School();
        school1.setName("Babaev");
        school1.setLesson("Ximia"+", "+"algebra");
        school1.setPupils(140);
        School[] schools={school1};
        System.out.println(Arrays.toString(schools));


    }
}