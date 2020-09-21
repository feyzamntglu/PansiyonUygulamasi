package pansiyon;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javafx.fxml.FXML;

public class Musteri {
	private String ad;
    private String soyad;
    private String tcNo;
    private String odaNo;
    private String odaTipi;
    private String cinsiyet;
    private String telNo;
   // private String girisTarihi;
    //private String cikisTarihi;
    private String ucret;
    private String gunSayisi;
    
    //private Oda oda=new Oda();
    //private Yemek yemek=new Yemek();
    
    private DosyaYolu dy;
    
	public Musteri( String ad, String soyad, String tcNo, String odaNo, String odaTipi, String cinsiyet, String telNo,String gunSayisi,String ucret) {
    	this.ad=ad;
    	this.soyad=soyad;
    	this.tcNo=tcNo;
    	this.odaNo=odaNo;
    	this.cinsiyet=cinsiyet;
    	this.telNo=telNo;
    	this.gunSayisi=gunSayisi;
    	this.ucret=ucret;
    	dy = new DosyaYolu("MusteriKayýt.txt");
    }
    public Musteri() {
    	
    }
    public String getAd() {
    	return ad;
    }
    public void setAd(String ad) {
    	this.ad=ad;
    }
    public String getSoyad() {
    	return soyad;
    }
    public void setSoyad(String soyad) {
    	this.soyad=soyad;
    }
    public String getTcNo() {
    	return tcNo;
    }
    public void setTcNo(String tcNo) {
    	this.tcNo=tcNo;
    }
    public String getOdaNo() {
    	return odaNo;
    }
    public void setOdaNo(String odaNo) {
    	this.odaNo=odaNo;
    }
    public String getOdaTipi() {
    	return odaTipi;
    }
    public void setOdaTipi(String odaTipi) {
    	this.odaTipi=odaTipi;
    }
    public String getCinsiyet() {
    	return cinsiyet;
    }
    public void setCinsiyet(String cinsiyet) {
    	this.cinsiyet=cinsiyet;
    }
    public String getTelNo() {
    	return telNo;
    }
    public void setTelNo(String telNo) {
    	this.telNo=telNo;
    }
    public String getUcret() {
    	return ucret;
    }
    public void setUcret(String ucret) {
    	this.ucret=ucret;
    }
    
   public String getGunSayisi() {
		return gunSayisi;
	}
	public void setGunSayisi(String gunSayisi) {
		this.gunSayisi = gunSayisi;
	}
	/* public String getGirisTarihi() {
    	return girisTarihi;
    }
    public void setGirisTarihi(String girisTarihi) {
    	this.girisTarihi=girisTarihi;
    }
    public String getCikisTarihi() {
    	return cikisTarihi;
    }
    public void setCikisTarihi(String cikisTarihi) {
    	this.cikisTarihi=cikisTarihi;
    }*/
    @Override
  	public String toString() {
  		return "Musteri [ad=" + ad + ", soyad=" + soyad + ", tcNo=" + tcNo + ", odaNo=" + odaNo + ", odaTipi=" + odaTipi
  				+ ", cinsiyet=" + cinsiyet + ", telNo=" + telNo + ", gunSayisi="+ gunSayisi+ ", ucret=" + ucret + "]";
  	}
    
    public void Kaydet(Musteri musteri) {
    	dy.SatirlaraEkle(musteri.getAd() + "@" +
    			  		musteri.getSoyad()+ "@"+
    					musteri.getTcNo() + "@" +
    					musteri.getTelNo()+ "@"+
    					musteri.getCinsiyet()+ "@"+
    					musteri.getOdaTipi()+ "@"+
    					musteri.getOdaNo()+ "@"+
    					musteri.getGunSayisi()+ "@"+
    					
    					musteri.getUcret()+ "@");
    }
    
    public List<Musteri> Listele() {
    	List<Musteri> list = new ArrayList();
    	
    	dy = new DosyaYolu("MusteriKayýt.txt");
    	String satirlar = dy.TumSatirlariGetir();
    	
    	if("".equals(satirlar)) {
    		
    		return list;
    	}
    	String[] musteriler = satirlar.split("#");
        for (String musteriStr : musteriler) {
            String[] ozellikler = musteriStr.split("@");

            Musteri model = new Musteri();
            if (ozellikler.length > 0) {
                model.setAd(ozellikler[0]);
            }
            if (ozellikler.length > 1) {
                model.setSoyad(ozellikler[1]);
            }
            if (ozellikler.length > 2) {
            	model.setTcNo(ozellikler[2]);
            }
            if (ozellikler.length > 3) {
                model.setTelNo(ozellikler[3]);
            }
            if (ozellikler.length > 4) {
                model.setCinsiyet(ozellikler[4]);
            }
            if (ozellikler.length > 5) {
                model.setOdaTipi(ozellikler[5]);
            }
            if (ozellikler.length > 6) {
                model.setOdaNo(ozellikler[6]);
            }
            if (ozellikler.length > 7) {
                model.setGunSayisi(ozellikler[7]);
            }
            if (ozellikler.length > 8) {
                model.setUcret(ozellikler[8]);
            }
            list.add(model);
        }
    	
        for(Musteri musteri : list) {
        	System.out.println(musteri.ad );
        	System.out.println(musteri.soyad );
        	System.out.println(musteri.tcNo);
        	System.out.println(musteri.telNo );
        	System.out.println(musteri.cinsiyet);
        	System.out.println(musteri.odaTipi );
        	System.out.println(musteri.gunSayisi );
        	System.out.println(musteri.ucret );
        
        }
        
    	return list;
    }
   
    
	
    
    
    
    
    

}
