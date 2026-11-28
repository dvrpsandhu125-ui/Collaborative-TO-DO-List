package manage_dashboard.edit_color;

import entity.User;
import entity.UserFactory;
import data_access.InMemoryUserDataAccessObject;
import org.junit.jupiter.api.Test;
import use_case.manage_dashboard.edit_color.*;

import static org.junit.jupiter.api.Assertions.*;


class EditColorInteractorTest {

    @Test
    void successTest() {
        UserFactory userFactory = new UserFactory();
        User user = userFactory.create("Veronica", "123456", "#FFF4E9");
        InMemoryUserDataAccessObject userRepository = new InMemoryUserDataAccessObject();

        EditColorInputData inputData = new EditColorInputData("Veronica","#FFD4E9");

        userRepository.save(user);

        EditColorOutputBoundary successPresenter = new EditColorOutputBoundary() {
            @Override
            public void prepareSuccessView(EditColorOutputData ouptutData) {
                assertEquals("#FFD4E9", ouptutData.getColor());
                assertEquals("#FFD4E9", userRepository.get("Veronica").getColor());
            }

            @Override
            public void prepareFailView(String errorMessage) {
                fail("Use case failure: Did not save or update color.");

            }
        };
        EditColorInputBoundary interactor = new EditColorInteractor(userRepository, successPresenter);
        interactor.execute(inputData);
    }

    @Test
    void userNotFound() {
        EditColorInputData inputData = new EditColorInputData("Veronica","#FFD4E9");
        InMemoryUserDataAccessObject userRepository = new InMemoryUserDataAccessObject();

        // This creates a presenter that tests whether the test case is as we expect.
        EditColorOutputBoundary failurePresenter = new EditColorOutputBoundary() {
            @Override
            public void prepareSuccessView(EditColorOutputData outputData) {
                // should never be reached since the test case should fail
                fail("Use case success is unexpected.");
            }

            @Override
            public void prepareFailView(String error) {
                assertEquals("Veronica: Account does not exist.", error);
            }
        };

        EditColorInputBoundary interactor = new EditColorInteractor(userRepository, failurePresenter);
        interactor.execute(inputData);
        }

}
