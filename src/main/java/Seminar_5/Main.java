package Seminar_5;

import Seminar_5.controllers.UserController;
import Seminar_5.model.*;
import Seminar_5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("src/main/java/sem_05_personal/users.txt");
        JsonOperation jsonOperation = new JsonOperation("src/main/java/sem_05_personal/users.json");
        Repository repository = new RepositoryFile(fileOperation, jsonOperation, new UserMapper(), new JsonMapper());
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}