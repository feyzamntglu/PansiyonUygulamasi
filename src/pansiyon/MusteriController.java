package pansiyon;

import pansiyon.Musteri;
import java.net.URL;
import java.time.chrono.Chronology;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DateCell;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

public class MusteriController {

    @FXML
    private Label Soyad1;

    @FXML
    private Label TcNo1;

    @FXML
    private Label TelNo1;

    @FXML
    private Label Cinsiyet1;

    @FXML
    private Button kaydetbtn1;

    @FXML
    private TextField TextFieldAd1;

    @FXML
    private TextField TextFieldSoyad1;

    @FXML
    private TextField TextFieldTcNo1;

    @FXML
    private TextField TextFieldTelNo1;

    @FXML
    private TextField TextFieldCinsiyet1;

    @FXML
    private Label Ad1;

    @FXML
    private Label OdaTipi1;

    @FXML
    private TextField TextFieldOdaNo1;

    @FXML
    private Label OdaNo1;

    @FXML
    private Label Ucret1;

    @FXML
    private Label CikisTarihi1;

    @FXML
    private Label GirisTarihi1;

    @FXML
    private DatePicker dpGirisTarihi1;

    @FXML
    private DatePicker dpCikisTarihi1;

    @FXML
    private TextField TextFieldUcret1;
    @FXML
    private TextField TextFieldGunSayisi;

    @FXML
    private Button silbtn1;

    @FXML
    private Button guncellebtn1;

    @FXML
    private TableView<Musteri> MusteriListe;

    @FXML
    private TableColumn<Musteri, String> adC;

    @FXML
    private TableColumn<Musteri, String> soyadC;

    @FXML
    private TableColumn<Musteri, String> tcC;

    @FXML
    private TableColumn<Musteri, String> telnoC;

    @FXML
    private TableColumn<Musteri, String> cinsiyetC;

    @FXML
    private TableColumn<Musteri, String> odatipiC;

    @FXML
    private TableColumn<Musteri, String> odanoC;

    @FXML
    private TableColumn<Musteri, String> gunSayisiC;

    @FXML
    private TableColumn<Musteri, String> ucretC;
    
    @FXML
    private TextField TextFieldOdaTipi;
    
    ObservableList<Musteri> liste = FXCollections.observableArrayList(new Musteri("Feyza", "Minnetoðlu", "689879844", "05422585221","Kadýn","suit", "202" ,"5","100"));

    @FXML
    public void Kaydet(ActionEvent e) {

		String ad = TextFieldAd1.getText();
		String soyad = TextFieldSoyad1.getText();
		String tcNo = TextFieldTcNo1.getText();
		String odaNo = TextFieldOdaNo1.getText();
		String odaTipi = TextFieldOdaTipi.getText();
		String cinsiyet = TextFieldCinsiyet1.getText();
		String telNo = TextFieldTelNo1.getText();
		String gunSayisi=TextFieldGunSayisi.getText();
		String ucret = TextFieldUcret1.getText();
		
		
		Musteri musteri = new Musteri (ad , soyad,tcNo, odaNo, odaTipi, cinsiyet, telNo, gunSayisi, ucret);
		
		musteri.Kaydet(musteri);
		//System.out.println(liste) ;
    }
    int index;
    /*public void musterigetir ()
    {
    	index = MusteriListe.getSelectionModel().getSelectedIndex();
    	if (index <= -1)
    	{
    		return ;
    	}
    	TextFieldAd1.setText(adC.getCellData(index));
    	TextFieldSoyad1.setText(soyadC.getCellData(index));
    	TextFieldTcNo1.setText(tcC.getCellData(index));
    	TextFieldTelNo1.setText(telnoC.getCellData(index));
    	TextFieldOdaNo1.setText(odanoC.getCellData(index));
    	TextFieldOdaTipi.setText(odatipiC.getCellData(index));
    	TextFieldCinsiyet1.setText(cinsiyetC.getCellData(index));
    	TextFieldGunSayisi.setText(gunSayisiC.getCellData(index));
    	TextFieldUcret1.setText(ucretC.getCellData(index));
    	
    }
    
    @FXML void Guncelle() {
    	liste.set(index, tableAkter());

    }
    public Musteri tableAkter()
    {

    	String ad = TextFieldAd1.getText();
		String soyad = TextFieldSoyad1.getText();
		String tcNo = TextFieldTcNo1.getText();
		String odaNo = TextFieldOdaNo1.getText();
		String odaTipi = TextFieldOdaTipi.getText();
		String cinsiyet = TextFieldCinsiyet1.getText();
		String telNo = TextFieldTelNo1.getText();
		String gunSayisi=TextFieldGunSayisi.getText();
		String ucret = TextFieldUcret1.getText();
    	
    	return new Musteri (ad , soyad,tcNo, odaNo, odaTipi, cinsiyet, telNo, gunSayisi, ucret) ;
    }
   /* public void clear ()
    {
    	TextFieldAd1.clear();
    	TextFieldSoyad1.clear();
    	TextFieldTcNo1.clear();
    	TextFieldOdaNo1.clear();
    	//cbOdaTipi1
    	TextFieldCinsiyet1.clear();
    	TextFieldTelNo1.clear();
    	//dpCikisTarihi1
    	//dpGirisTarihi1.clear();
    	
    	TextFieldAd1.isFocused();
    }*/

    @FXML
    void MListele(ActionEvent event) {
    	Musteri musteri = new Musteri();
        List<Musteri> liste = musteri.Listele();

        ObservableList<Musteri> data = MusteriListe.getItems();
        //data.clear();
        
        for (Musteri model : liste) {
            data.add(model);
            adC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("ad"));
        	soyadC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("soyad"));
    		telnoC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("tcNo"));
    		odanoC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("odaNo"));
    		odatipiC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("odaTipi"));
    		cinsiyetC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("cinsiyet"));
    		telnoC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("telNo"));
    		
    		
    		gunSayisiC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("gün sayisi"));
    		ucretC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("ucret"));
        }
        

        MusteriListe.setItems(data);
    }
    /*
    public void initialize(URL url, ResourceBundle rb) {
        Musteri musteri = new Musteri();
        List<Musteri> liste = musteri.Listele();

        ObservableList<Musteri> data = MusteriListe.getItems();
        data.clear();
       


        for (Musteri model : liste) {
            data.add(model);
        }
    }*/
    public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		adC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("ad"));
		soyadC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("soyad"));
		telnoC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("tcNo"));
		odanoC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("odaNo"));
		odatipiC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("odaTipi"));
		cinsiyetC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("cinsiyet"));
		telnoC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("telNo"));
		
		
		gunSayisiC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("gün sayisi"));
		ucretC.setCellValueFactory(new PropertyValueFactory<Musteri, String>("ucret"));
		
		MusteriListe.setItems(liste);
	}

    @FXML
    void Hesapla(ActionEvent event) {
    	
    	String odaTipiInput = TextFieldOdaTipi.getText().toString();
		
		int gunSayisi = Integer.parseInt(TextFieldGunSayisi.getText().toString());
		
		float resultUcret = 0;
		
		if(odaTipiInput.equalsIgnoreCase("Kogus")) {
			KogusOda kogusOda = new KogusOda();
			resultUcret = kogusOda.Ucret(gunSayisi);
			
		}else if(odaTipiInput.equalsIgnoreCase("Suit")) {
			SuitOda suitOda = new SuitOda();
			resultUcret = suitOda.Ucret(gunSayisi);
		}
		else if(odaTipiInput.equalsIgnoreCase("Kral")) {
			KralDairesi kralOda = new KralDairesi();
			resultUcret = kralOda.Ucret(gunSayisi);
		}
		
		TextFieldUcret1.setText(resultUcret + "");
    }
    
  
}
