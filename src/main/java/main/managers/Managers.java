package main.managers;

import main.managers.history.InMemoryHistoryManager;
import main.managers.task.FileBackedTasksManager;
import main.managers.history.HistoryManager;

public class Managers {

    public static HistoryManager getHistoryManager(){
        return  new InMemoryHistoryManager();
    }
    public static FileBackedTasksManager getFileBackendManager(){
        return new FileBackedTasksManager();
    }
}
