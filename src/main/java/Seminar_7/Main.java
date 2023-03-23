package Seminar_7;

import Seminar_7.controller.NotepadController;
import Seminar_7.models.*;
import Seminar_7.view.NotepadView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonDb jsonDb = new JsonDb("src/main/java/sem_06_notebook/notes.json");
        TxtDb txtDb = new TxtDb("src/main/java/sem_06_notebook/notes/");
        Logable logger = new TxtLogger("src/main/java/sem_06_notebook/log.txt");
        Repositoriable<Note> notesRepo = new RepoWLog(logger, jsonDb, txtDb);
        NotepadController controller = new NotepadController(notesRepo);
        NotepadView view = new NotepadView(controller);
        view.run();
    }
}