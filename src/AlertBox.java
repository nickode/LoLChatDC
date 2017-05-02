import javafx.stage.*;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.*;
public class AlertBox {

	
	public static void display1(String title, String message){
		Stage alertWindow = new Stage();
		
		alertWindow.initModality(Modality.APPLICATION_MODAL);
		alertWindow.setTitle("LolChatDc");
		alertWindow.setMinWidth(250);
		alertWindow.setHeight(100);
		
		Label label = new Label("Disconnect Successful!");
		Button closeButton = new Button("Close");
		closeButton.setOnAction(e -> alertWindow.close());
		
		
		VBox layout = new VBox(10);
		layout.getChildren().addAll(label,closeButton);
		layout.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(layout);
		alertWindow.setScene(scene);
		alertWindow.showAndWait();
	}
	
}