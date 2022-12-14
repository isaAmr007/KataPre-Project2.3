package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        userService.saveUser("Isa","Amirkhanov", (byte) 18);
        userService.saveUser("Alexandr", "Pushkin", (byte) 35);
        userService.saveUser("Lev", "Tolstoy", (byte) 90);
        userService.saveUser("Vladimir","Putin", (byte) 70);

        userService.removeUserById(3);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
