
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.*;

public class Lolchat extends Application implements EventHandler<ActionEvent> {

	Button button1;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label1 = new Label("Welcome to LolChatDc!");
		Label label2 = new Label("ONLY WAY IT WORKS: Open up a fresh client of League of Legends and before hitting on launch, click \"Disconnect from LolChat server\"");
		Label label3 = new Label("If you are not able to disconnect, login to the main lobby, close the game and try again following the above step.");

		primaryStage.setTitle("LolChatDc");
		button1 = new Button();
		button1.setText("Disconnect from LolChat server");
		button1.setOnAction(this);

		GridPane layout = new GridPane();
		layout.setPadding(new Insets(10,10,10,10));
		layout.setVgap(5);
		layout.setHgap(5);
		
		GridPane.setConstraints(label1, 1, 1);
		GridPane.setConstraints(label2, 1, 5);
		GridPane.setConstraints(label3, 1, 7);
		GridPane.setConstraints(button1, 1, 10);
		
		
		layout.getChildren().addAll(button1, label1, label2, label3);

		Scene scene = new Scene(layout, 750, 150);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	@SuppressWarnings("static-access")
	@Override
	public void handle(ActionEvent event) {
		AlertBox alert1 = new AlertBox();
		if (event.getSource() == button1) {
			filewriter lolEdit = new filewriter();
			lolEdit.readFile();
			lolEdit.editText();
			lolEdit.overwrite();
			
			alert1.display1("", "");

			}
			
		}

	}

