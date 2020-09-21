package pansiyon;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    
   public void MusteriBasla() {
	   try {
		   Stage primaryStage =new Stage();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Musteri.fxml"));
			Scene scene = new Scene(root,800,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e1) {
			e1.printStackTrace();
		}
	}

    
   public void OdaBasla() {
	   try {
		   Stage primaryStage =new Stage();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Oda.fxml"));
			Scene scene = new Scene(root,800,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e1) {
			e1.printStackTrace();
		}

    }

    
   public void YemekBasla() {
	   try {
		   Stage primaryStage =new Stage();
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Yemek.fxml"));
			Scene scene = new Scene(root,800,800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e1) {
			e1.printStackTrace();
		}


    }

}
