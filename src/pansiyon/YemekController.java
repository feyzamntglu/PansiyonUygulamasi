package pansiyon;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class YemekController {

    @FXML
    private Label Fiyat;

    @FXML
    private Label yemekAdi;

    @FXML
    private TextField TextFieldYemekAdi;

    @FXML
    private TextField TextFieldFiyati;

    @FXML
    private Button hesaplabtn;

    @FXML
    private Button Listelebtn;

    @FXML
    private Button Eklebtn;

    @FXML
    private TableView<Yemek> YemekListe;

    @FXML
    private Label Adet;

    @FXML
    private TextField TextFieldAdet;

    @FXML
    private Label ToplamFiyat1;

    @FXML
    private TextField TextFieldToplamFiyat;

    @FXML
    void Ekle() {
    	Yemek yemek = new Yemek();
    	yemek.setYemekAdi(TextFieldYemekAdi.getText().toString());
    	yemek.setAdet(TextFieldAdet.getText().toString());
    	yemek.setFiyat(TextFieldFiyati.getText().toString());
    	
    	yemek.Kaydet(yemek);
    }

    @FXML
    void Hesapla() {
    	int adet = Integer.parseInt(TextFieldAdet.getText().toString());
    	float fiyati = Float.parseFloat(TextFieldFiyati.getText().toString());
    	
    	float result = adet * fiyati;
    	
    	TextFieldToplamFiyat.setText(result + "");
    }

    @FXML
    void yemek_Liste(ActionEvent event) {
    	Yemek yemek = new Yemek();
        List<Yemek> liste = yemek.Listele();

        ObservableList<Yemek> data = YemekListe.getItems();
        data.clear();

        for (Yemek model : liste) {
            data.add(model);
        }

        YemekListe.setItems(data);

    }
    public void initialize(URL url, ResourceBundle rb) {
        Yemek yemek = new Yemek();
        List<Yemek> liste = yemek.Listele();

        ObservableList<Yemek> data = YemekListe.getItems();
        data.clear();

        for (Yemek model : liste) {
            data.add(model);
        }
    }
 

}
