/**
 * LogoutController.java contains methods 
 * which helps employees to be redirected to the 
 * login screen.
 */
package controller;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * @author clitus dmonte
 *
 */
public class LogoutController {
	
    private Stage dialogStage,loginStage;
	
	
	/**
	 * loginButtonOnAction() redirects user to the login screen.
	 */
	@FXML
	public void loginButtonOnAction(){
		try {
		dialogStage.fireEvent(new WindowEvent(dialogStage, WindowEvent.WINDOW_CLOSE_REQUEST));

		Main main = new Main();
		loginStage = new Stage();
		
			main.start(loginStage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	/**
	 * @param dialogStage
	 */
	public void setDialogStage(Stage dialogStage) {
		this.dialogStage = dialogStage;
	}
	}
