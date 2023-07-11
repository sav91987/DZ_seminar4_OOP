package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {


    private String acadDegree;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>(teachers);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher per = new Teacher(firstName,age, acadDegree);
        teachers.add(per);
    }    

    /**
     * @param teachers - список для сортировки
     */
    public static void sortByFIOTchrLst(List<Teacher> teachers) 
    {
        System.out.println("======================== список Teachers до сортировки ============================");
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("====================== список Teachers после сортировки ===========================");
        teachers.sort(new PersonComparator<Teacher>());
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    } 
}
