package pansiyon;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class OdaController {
	 
	  public void SuitBasla() {
		   try {
			   Stage primaryStage =new Stage();
				BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Suit.fxml"));
				Scene scene = new Scene(root,800,450);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	
	   public void KogusBasla() {
		   try {
			   Stage primaryStage =new Stage();
			   BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Kogus.fxml"));
				Scene scene = new Scene(root,800,450);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
		}
	   public void KralBasla() {
		   try {
			   Stage primaryStage =new Stage();
			   BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("Kral.fxml"));
				Scene scene = new Scene(root,800,450);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.show();
			} catch(Exception e1) {
				e1.printStackTrace();
			}
		}

}


