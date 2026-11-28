package use_case.create_editing_task.editing_task;

import use_case.create_editing_task.creating_task.CreateTaskOutputData;

interface EditTaskOutputBoundary {

    void prepareSuccessView(EditTaskOutputData response);

    void prepareFailView(String response);
}
