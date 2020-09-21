package pansiyon;

import java.util.ArrayList;
import java.util.List;

public class Yemek implements InterfaceYemek{
	private String yemekAdi;
	private String fiyat;
	private String adet;
	
	private DosyaYolu dy;
	
	public Yemek() {
		dy = new DosyaYolu("YemekKayit.txt");
	}
	
	public Yemek(String yemekAdi,String fiyat) {
		this.yemekAdi=yemekAdi;
		this.fiyat=fiyat;
		this.adet=adet;
		dy = new DosyaYolu("YemekKayit.txt");
	}
//*******OVERLOAD***************

	public Yemek(String yemekAdi, float fiyat, int adet) {
		// TODO Auto-generated constructor stub
	}


	public void setFiyat(String fiyat) {
		this.fiyat = fiyat;
	}

	public String getYemekAdi() {
    	return yemekAdi;
    }
    public void setYemekAdi(String yemekAdi) {
    	this.yemekAdi=yemekAdi;
    }
    public String getFiyat() {
    	return fiyat;
    }
    
	public String getAdet() {
		return adet;
	}

	public void setAdet(String adet) {
		this.adet = adet;
	}

	@Override
	public String toString() {
		return "Yemek [yemekAdi=" + yemekAdi + ", fiyat=" + fiyat + ", adet=" + adet + "]";
	}
	
	public void Kaydet(Yemek yemek) {
    	dy.SatirlaraEkle(yemek.getYemekAdi() + "@" +
    					yemek.getAdet() + "@" +
    					yemek.getFiyat() + "@");
    }

	public float yemek_Ucret(float fiyat,int adet) {
		// TODO Auto-generated method stub
		float ucret=fiyat*adet;
		return ucret;
	}

	public List<Yemek> Listele() {
	List<Yemek> list = new ArrayList();
    	
    	dy = new DosyaYolu("YemekKayýt.txt");
    	String satirlar = dy.TumSatirlariGetir();
    	
    	if("".equals(satirlar)) {
    		
    		return list;
    	}
    	String[] yemekler = satirlar.split("#");
        for (String yemekStr : yemekler) {
            String[] ozellikler = yemekStr.split("@");

            Yemek model = new Yemek();
            if (ozellikler.length > 0) {
                model.setYemekAdi(ozellikler[0]);
            }
            if (ozellikler.length > 1) {
                model.setFiyat(ozellikler[1]);
            }
            if (ozellikler.length > 2) {
            	model.setAdet(ozellikler[2]);
            }
            list.add(model);
        }
    	
        for(Yemek yemek : list) {
        	System.out.println(yemek.yemekAdi + "Pizza");
        }
        
    	return list;
    }
	

  
    
    
}
