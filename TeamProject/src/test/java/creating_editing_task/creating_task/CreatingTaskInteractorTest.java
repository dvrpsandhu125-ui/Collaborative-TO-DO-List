package creating_editing_task.creating_task;

import data_access.InMemoryTaskDataAccessObject;
import entity.Task;
import org.junit.jupiter.api.Test;
import use_case.create_editing_task.CreateTaskDataAccessInterface;
import use_case.create_editing_task.creating_task.CreateTaskInputData;
import use_case.create_editing_task.creating_task.CreateTaskInteractor;
import use_case.create_editing_task.creating_task.CreateTaskOutputBoundary;
import use_case.create_editing_task.creating_task.CreateTaskOutputData;

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
                1,
                "cleaning",
                "clean the bathroom",
                null,
                null,
                null,
                new ArrayList<>());
        taskRepository.saveTask( task);

        CreateTaskOutputBoundary successPresenter = new CreateTaskOutputBoundary() {
            @Override
            public void prepareSuccessView(CreateTaskOutputData response) {
                assertEquals("cleaning", task.getTask_name());
                assertEquals("cleaning the bathroom", task.getTask_description());
                assertEquals(null, task.getDeadline());
                assertEquals(null, task.getLocation());
                assertEquals(null, task.getTask_status());
                assertEquals(null, task.getAssignedMembers());
                assertEquals(1, task.getTask_id());
                assertEquals("1", task.getGroupId());
            }

            @Override
            public void prepareFailView(String response) {

            }
        };
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
                1,
                "cleaning",
                "clean the bathroom  living room, kitchen, individual rooms, stairs, cabinets, microwave, and desks",
                null,
                null,
                null,
                new ArrayList<>());
    }

}
