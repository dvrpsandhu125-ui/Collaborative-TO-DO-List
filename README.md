# Collaborative To-Do List
## Team Information
### Team Members
- Aretha Joshanna Octavienne
- Egshiglen Altankhuyag
- Mayumi Chua
- Veronica Kwon 
- Divroop Kaur Sandhu
---
## Project Description
### Organization
Problem: Plans, especially in group environments, often get lost because they're communicated as texts or spoken in conversation. People still have the motivation to do the plan, yet have no formal way to keep track of it because of the way it is communicated.

Solution: A collaborative To-Do list where users can add, modify, and update tasks that groups would like done together. 

---
## User Stories
### As a new user, I want to create a new account so that I can access the application. 

###As a returning user, I want to log in to my account so that I can access my groups and events. 

###As a user, I want to customize my username and profile picture, so that other users can recognise me.

###As a group member, I want to manage the groups that I belong to, such as editing group information or leaving a group, so that I can keep my groups organized and relevant to me.

###As a group member, I want to create a task with a name, description(it has character limit), and optional features such as a deadline (including date, an undecided option, and days remaining), location, assigned roles and task status, so that my group members can view the task details, track deadlines, access relevant resources, and understand who is responsible for the task.

###As a group member, I want to edit the task such as name, description, and optional features such as a deadline (including date, an undecided option, and days remaining), location, assigned roles, and task status, so that I can keep the task information up to date and ensure that all group members can see the changes.

###As a group member, I want to delete an existing task, so that the rest of my group can see it is removed from the group list.

### As a group member, I want to recover a task from trash, so that the rest of my group can see it is back in the group.

---
## Use Cases
###Creating Profile and Logging 

Primary actor: User

Preconditions: The user has access to the application.

Trigger: The user requests to create an account/sign in, log into account.

Success outcome: The user has an account, and can edit the information of the account.

Main success scenario:
	
		   1.The user requests to create an account/ sign in.
		   2.The system prompts the user to provide the name, password and color of the profile.
		   3.The system checks that the username is not already taken/ The system checks if the request is   currently allowed.
		   4.The system creates and saves the user's account.
		   5.The system switches to a log-in screen.
		   6.The user puts the name and password, and requests to log-in.
		   7.The system checks if the request is currently allowed/ checks if username and password matches.
		   8.The system successfully logs in to the account.

Extensions:

		3a. Username already exists
			The system informs the user and asks them to choose another username.
		3b. Invalid login credentials
			The system informs the user and requests their credentials again.
		7a. Username not found
			The system informs the username does not exist.
		10a. Cancel action
			The user can cancel an operation before saving, and the system discards unsaved changes.


###Creating, Editing a Group and Inviting Member

Primary actor: Logged-in user

Preconditions: The user is logged in.

Trigger: The user request to create a group, invite a member, and edit information of the group

Success outcome: The user created, invited to a group and edited the name of the group.

Main success scenario:

		1.The user requests to create a group.
		2.The system prompts the user to provide the name of the group.
		3.The system creates and saves the group.
		4.The user requests to add another user by the username.
		5.The system prompts the user to provide the other user’s username.
		6.The system checks if that username exists.
		7.The system adds the user.
		8.The user requests to edit the name of the group.
		9.The system prompts the user to change the name of the group.
		10.The system saves the updated information.
	
Extensions:

		6a. The other user’s username does not exist
			The system informs the user and asks them try again
	





###Creating and Editing a Task

Primary factor :  The user creating and editing a task

Precondition:

	The user is logged into the application.
	The user has created or joined a group.
	
Trigger: The user requests to create, edit and delete a group.

Success outcome: User added a new task, edited an existing task, and deleted an existing task.

Main success scenario :

			1.The user requests to create a task.
			2.The system prompts the user to provide task information.
			3.The user provides the name and description of the task, and optionally adds a location, deadline date, attaches roles to group members, sorts it by priority and updates task status from ‘not started’, ‘in progress’, and ‘completed’.
			4.The system checks if the request is currently allowed.
			5.The system creates and saves the task.
			6.The user requests to edit an existing task
			7.The system prompts the user to provide current task information.
			8.The user modifies the name and description of the current task, adds, modifies, or removes the deadline, location, assigned roles, priority level, and task status.
			9.The system checks if the request is currently allowed.
			10.The system saves the modified task.
			
Extensions:

			4a. Description length is exceeded character limit:
			 	The system explains it cannot exceed character limit, and asks them to try again.
			3a. If the deadline is unknown, the group member selects "Undecided."
			3b. If a deadline is provided, the system calculates and displays the days remaining.
			3c, 8a. The group member skips any optional feature.
			12a.The system does not delete a task.

###Managing Dashboard and Editing Profile

Primary Actor: The user logging in, and switching between dashboard and group, and editing information of the account.

Preconditions:

	The user logged in
	The user may be in a group
	
Trigger : The user logging in and requesting to go to the dashboard.

Success Outcome: The user is on the dashboard.

Main Success Scenario:

			When the user is logging in, the system shows the dashboard.
			The user requests to go to the dashboard.
			The system checks the request and shows the dashboard.
			The user requests to go to the chosen group.
			The system checks the request and shows the group. 
			The user requests to edit the information of the account such as name, password, and color of the profile.
			The system prompts the user to change the information.
			The system checks if the request is currently allowed.
			The system successfully saves the updated profile.

### Deleting a Task and Recovering from Trash 

Primary Actor : The user deleting tasks, and recovering tasks from trash.

Preconditions:
	The user logged in
	The user may be in a group
	The user may have deleted a task before
	
Trigger : The user deleting task, and recovering task from trash

Success Outcome: The task is in trash, or recovered.

Main Success Scenario:
			The user requests to delete the task.
			The system asks to confirm the delete task.
			The system moves the task to trash.
			The system notifies it is deleted and in trash.
			The user requests to recover trash.
			The user asks to confirm the recovery task.
			The system moves the task to its old place, group.
			The system notifies it is recovered successfully.
Extensions:
			2a. The user does not confirm
		The system does not delete the task
			6a. The user does not confirm
		The system does not recover the task


(Add additional use cases as needed.)
---
## Minimal Viable Product (MVP)
| Team Member | MVP Use Case |
|-------------|--------------|
| Aretha | Creating Profile and Logging  |
| Divroop | Creating, Editing a Group and Inviting Member |
| Veronica | Managing Dashboard and Editing Profile |
| Ella | Creating and Editing a Task |
| Mayumi | Deleting a Task and Recovering from Trash |


---
## Entities
### Entity 1
### Entity 2
(Add additional entities as needed.)
---
## API Usage
**API Name:**
**Documentation:** [Link]
**How it is used in the program:**
---
## Design Diagrams
### UML Class Diagram
### Sequence Diagrams
---
## How to Run
[Instructions for running the program.]
---
## Notes
[Any additional project information.]

