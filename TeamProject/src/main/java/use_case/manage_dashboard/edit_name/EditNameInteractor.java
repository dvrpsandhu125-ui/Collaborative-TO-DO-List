package use_case.manage_dashboard.edit_name;

import entity.User;

/**
 * The Manage Dashboard Interactor.
 */

public class EditNameInteractor implements EditNameInputBoundary {
    /* private final EditNameUserDataAccessInterface userDataAccessObject;
    private final EditNameOutputBoundary userPresenter;
    

    public EditNameInteractor(EditNameUserDataAccessInterface manageDashboardUserDataAccessInterface,
                              EditNameOutputBoundary changePasswordOutputBoundary) {
        this.userDataAccessObject = manageDashboardUserDataAccessInterface;
        this.userPresenter = changePasswordOutputBoundary;
    }

    @Override
    public void execute(EditNameInputData manageDashboardInputData) {
        final User user = new User(manageDashboardInputData.getUsername(),
                manageDashboardInputData.getPassword(), manageDashboardInputData.getColor());

        userDataAccessObject.editUsername(user);

        final EditNameOutputData manageDashboardOutputData = new EditNameOutputData(user.getName());
        userPresenter.prepareSuccessView(manageDashboardOutputData);
    }
     */
}
