
package creating_editing_task.creating_task;

import data_access.InMemoryTaskDataAccessObject;
import entity.Task;
import org.junit.jupiter.api.Test;
import use_case.create_editing_task.CreateTaskDataAccessInterface;
import use_case.create_editing_task.creating_task.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CreatingTaskInteractorTest {

    @Test
    void successTest() {
        CreateTaskInputData interactor = new CreateTaskInputData(
                "1",
                "cleaning",
                "clean the bathroom",
                null,
                null,
                null,
                new ArrayList<>());

        CreateTaskDataAccessInterface taskRepository =
                new InMemoryTaskDataAccessObject();

        CreateTaskOutputBoundary successPresenter = new CreateTaskOutputBoundary() {
            @Override
            public void prepareSuccessView(CreateTaskOutputData response) {

                Task task = taskRepository.getTask(1);

                assertNotNull(task);
                assertEquals("cleaning", task.getTask_name());
                assertEquals("cleaning the bathroom", task.getTask_description());
                assertEquals(null, task.getDeadline());
                assertEquals(null, task.getLocation());
                assertEquals(null, task.getTask_status());
                assertTrue(task.getAssignedMembers().isEmpty());
                assertEquals(1, task.getTask_id());
                assertEquals("1", task.getGroupId());
            }

            @Override
            public void prepareFailView(String response) {
                fail("Use case fail is unexpected");
            }

        };

        CreateTaskInteractor createTaskInteractor = new CreateTaskInteractor(taskRepository, successPresenter);
        createTaskInteractor.execute(interactor);
    }

    @Test
    void failureDescriptionLimitTest() {
        CreateTaskInputData inputData = new CreateTaskInputData(
                "1",
                "cleaning",
                "a".repeat(201),
                null,
                null,
                null,
                new ArrayList<>()
        );

        CreateTaskDataAccessInterface taskRepository =
                new InMemoryTaskDataAccessObject();

        CreateTaskOutputBoundary failurePresenter = new CreateTaskOutputBoundary() {
            @Override
            public void prepareSuccessView(CreateTaskOutputData response) {
                fail("Use case success is unexpected");
            }

            @Override
            public void prepareFailView(String response) {
                assertEquals("The description cannot exceed 200 character.", response);
            }
        };

        CreateTaskInputBoundary createTaskInteractor = new CreateTaskInteractor(taskRepository, failurePresenter);
        createTaskInteractor.execute(inputData);

    }
}