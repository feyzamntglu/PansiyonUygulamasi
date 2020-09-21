package pansiyon;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class KralController {

    @FXML
    private TableView<KralDairesi> kralListe;

    @FXML
    private TableColumn<Oda, String> odaNoC;

    @FXML
    private TableColumn<Oda, Float> gunlukFiyatC;

    @FXML
    private TableColumn<KralDairesi, Integer> odaSayisiC;

    @FXML
    private TableColumn<KralDairesi, Integer> jakuziSayisiC;

    @FXML
    private TableColumn<KralDairesi, Integer> klimaSayisiC;

    @FXML
    private TableColumn<KralDairesi, Integer> banyoSayisiC;

    @FXML
    private Button listeleBtn;

    //ObservableList<KralDairesi> liste = FXCollections.observableArrayList(new KralDairesi("301", "300","4","2","4","3"));
    @FXML
    void Listele() {

    }

}
