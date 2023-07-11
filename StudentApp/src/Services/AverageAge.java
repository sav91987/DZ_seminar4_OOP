package Services;

import java.util.List;

import Domen.Person;

public class AverageAge<T> extends Person{
    
    /**
     * @param name - Имя
     * @param age - Возраст
     */
    public AverageAge(String name, int age) {
        super(name, age);
    }

    /**
     * @param <T> - подставной тип, может быть только наследником Person
     * @param list - список
     * @return - среднее значение возраста по группе
     */
    public static <T extends Person> double getMeanAge(List<T> list)  {
        double meanAge = 0.0;

        for (T elem : list) {
            meanAge = meanAge + ((Person) elem).getAge();
        }
        return (meanAge / list.size());
    }
}




    
    

    

