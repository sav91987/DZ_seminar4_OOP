package Domen;

public class Emploee extends Person {
    private String special;

    public Emploee(String firstName, int age, String special) {
        super(firstName, age);
        this.special = special;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "Emploee [name = " + super.getName() + ", age = " + super.getAge() + ", special = " + special
                + "]";
    }
}
