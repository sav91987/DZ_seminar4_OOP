import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teacher;
import Services.AverageAge;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 444);
        Student s5 = new Student("Даша", 23, 171);
        Student s6 = new Student("Лена", 23, 104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        Teacher t1 = new Teacher("Игорь", 65, "Docent");
        Teacher t2 = new Teacher("Борис", 50, "Professor");
        Teacher t3 = new Teacher("Владимир", 55, "Professor");
        Teacher t4 = new Teacher("Андрей", 52, "Docent");

        List<Teacher> listTeach = new ArrayList<Teacher>();
        listTeach.add(t1);
        listTeach.add(t2);
        listTeach.add(t3);
        listTeach.add(t4);

        Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
        Emploee e2 = new Emploee("Марина", 40, "уборщица");
        Emploee e3 = new Emploee("Светлана", 42, "повар");
        Emploee e4 = new Emploee("Максим", 52, "слесарь");
        Emploee e5 = new Emploee("Оксана", 37, "бухгалтер");

        List<Emploee> listEmp = new ArrayList<Emploee>();
        listEmp.add(e1);
        listEmp.add(e2);
        listEmp.add(e3);
        listEmp.add(e4);
        listEmp.add(e5);
        

        TeacherService.sortByFIOTchrLst(listTeach);
        System.out.println();
        System.out.println("Средний возраст по Teacher: " + AverageAge.getMeanAge(listTeach));
        System.out.println("Средний возраст по Student: " + AverageAge.getMeanAge(listStud));
        System.out.println("Средний возраст по Emploee: " + AverageAge.getMeanAge(listEmp));

        // StudentGroup group4580 = new StudentGroup(listStud, 4580);
        // System.out.println(group4580);

        // for(Student std : group4580)
        // {
        // System.out.println(std);
        // }

        // System.out.println("=========================================================");

        // Collections.sort(group4580.getGroup());

        // for(Student std: group4580.getGroup())
        // {
        // System.out.println(std);
        // }



        // PersonComparator<Student> comS = new PersonComparator<Student>();
        // comS.compare(s1, s2);

       
    }

    // PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
    // comT.compare(t1, t2);

    // //comS.compare(s1, t2);
    // PersonComparator<Person> comP = new PersonComparator<Person>();
    // comP.compare(s1, t2);

    // Emploee e1 = new Emploee("Федорович", 60, "разнорабочим");
    // //EmploeeController empControll = new EmploeeController();
    // EmploeeController.paySalary(e1);
    // // EmploeeController.paySalary(s1);
    // empControll.paySalary(e1);
    // empControll.paySalary(s1);

}
