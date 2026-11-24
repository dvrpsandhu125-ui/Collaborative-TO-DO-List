package creating_editing_task.creating_task;

import data_access.InMemoryTaskDataAccessObject;
import entity.Task;
import org.junit.jupiter.api.Test;
import use_case.create_editing_task.CreateTaskDataAccessInterface;
import use_case.create_editing_task.creating_task.CreateTaskInputData;
import use_case.create_editing_task.creating_task.CreateTaskInteractor;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CreatingTaskInteractorTest {

    @Test
    void successTest(){
        CreateTaskInputData interactor = new CreateTaskInputData(
                "1",
                "cleaning",
                "clean the bathroom",
                null,
                null,
                null,
                new ArrayList<>());

        CreateTaskDataAccessInterface taskRepository = new InMemoryTaskDataAccessObject();
        Task task = new Task( "1",
                "cleaning",
                "clean the bathroom",
                null,
                null,
                null,
                new ArrayList<>());
        taskRepository.saveTask( task);
    }

    @Test
    void failureDescriptionLimitTest(){
        CreateTaskInputData interactor = new CreateTaskInputData(
                "1",
                "cleaning",
                "clean the bathroom, living room, kitchen, individual rooms, stairs, cabinets, microwave, and desks",
                null,
                null,
                null,
                new ArrayList<>());

        CreateTaskDataAccessInterface taskRepository = new InMemoryTaskDataAccessObject();
        Task task = new Task( "1",
                "cleaning",
                "clean the bathroom  living room, kitchen, individual rooms, stairs, cabinets, microwave, and desks",
                null,
                null,
                null,
                new ArrayList<>());
    }

}
