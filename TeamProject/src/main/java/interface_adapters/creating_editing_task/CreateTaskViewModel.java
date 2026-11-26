package interface_adapters.creating_editing_task;

import java.util.ArrayList;
import java.util.List;

public class CreateTaskViewModel {
    private final List<CreateTaskViewModelListener> listeners = new ArrayList<>();

    private static final String VIEW_MODEL_NAME = " task created";

    private CreateTaskState state = new CreateTaskState();

    public CreateTaskState getState() {
        return state;
    }

    public void setState(CreateTaskState state) { this.state = state; }

    public void addListener(CreateTaskViewModelListener listener) {
        listeners.add(listener);
    }

    public void notifyStateChanged() {
        for (CreateTaskViewModelListener listener : listeners) {
            listener.stateChanged();
        }
    }
}
