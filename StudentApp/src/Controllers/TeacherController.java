package Controllers;

import Domen.Teacher;
import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher> {
    /**
     * TeacherController служит для управления TeacherService,
     * использует методы интерфейса iPersonController
     */
    private final TeacherService teachService = new TeacherService();
    
    @Override
    public void create(String firstName, int age) {
        teachService.create(firstName,age);
    }
    
}
