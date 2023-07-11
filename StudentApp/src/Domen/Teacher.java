package Domen;

public class Teacher extends Person{
    private String acadDegree;
    /**
     * @param name - имя
     * @param age - возраст
     * @param acadDegree - научная степень
     */
    public Teacher(String name, int age, String acadDegree) {
        super(name, age);
        this.acadDegree = acadDegree;
    }
    /**
     * @return - возвращает научную степень
     */
    public String getAcadDegree() {
        return acadDegree;
    }
    public void setAcadDegree(String acadDegree) {
        this.acadDegree = acadDegree;
    }

    //перегрузка метода toString для класса Teacher
    @Override
    public String toString() {
        return "Teacher [name = " + super.getName()+ ", age = " + super.getAge() + ", acadDegree = " + acadDegree + "]";
    }
}
