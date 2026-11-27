package interface_adapters.creating_editing_task;

import entity.User;
import use_case.create_editing_task.creating_task.CreateTaskInputBoundary;
import use_case.create_editing_task.creating_task.CreateTaskInputData;

import java.time.LocalDate;
import java.util.List;

public class CreateTaskController {

    private final CreateTaskInputBoundary createTaskUseCaseInteractor;

    public CreateTaskController( CreateTaskInputBoundary interactor){
        createTaskUseCaseInteractor = interactor;
    }

    public void execute( String groupId,
                        String name,
                        String description,
                        String status,
                        LocalDate deadline,
                        String location,
                        List<User> assignedMembers){

        final CreateTaskInputData inputData = new CreateTaskInputData(groupId, name, description, status, deadline, location,
                assignedMembers);
        createTaskUseCaseInteractor.execute( inputData );
    }

}
