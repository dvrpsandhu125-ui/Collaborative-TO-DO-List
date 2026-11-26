package interface_adapters.creating_editing_task;

import java.util.ArrayList;
import java.util.List;

public class TaskTableViewModel {

    private final List<TaskTableViewModelListener> listeners = new ArrayList<>();

    public static final String VIEW_MODEL_NAME = " task in table";

    private TaskTableState state = new TaskTableState();

    public TaskTableState getState() {
        return state;
    }

    public void setState(TaskTableState state) {
        this.state = state;
    }

    public void addListener(TaskTableViewModelListener listener) {
        listeners.add(listener);
    }

    public void notifyStateChanged() {
        for (TaskTableViewModelListener listener : listeners) {
            listener.stateChanged();
        }
    }

}
