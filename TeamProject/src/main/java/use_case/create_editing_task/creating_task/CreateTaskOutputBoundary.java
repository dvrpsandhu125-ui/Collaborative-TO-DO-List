package use_case.create_editing_task.creating_task;

public interface CreateTaskOutputBoundary {

    void prepareSuccessView(CreateTaskOutputData response);

    void prepareFailView(String response);
}
