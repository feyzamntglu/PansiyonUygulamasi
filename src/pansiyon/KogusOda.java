package pansiyon;

public class KogusOda extends Oda{
	

	private int yatakSayisi;
	private int camasirMakineSayisi;
	private int radyoSayisi;
	private int buzdolabiSayisi;

	public KogusOda() {
		
	}
	
	public KogusOda(float gunlukFiyat, String odaNo, Musteri musteri,int yatakSayisi,int camasirMakineSayisi,int radyoSayisi,int buzdolabiSayisi) {
		super(gunlukFiyat, odaNo, musteri);
		this.buzdolabiSayisi=buzdolabiSayisi;
		this.camasirMakineSayisi=camasirMakineSayisi;
		this.radyoSayisi=radyoSayisi;
		
		// TODO Auto-generated constructor stub
	}
	public KogusOda(int radyoSayisi) {
		
		
		
	}
	
	@Override
	public float getGunlukFiyat() {
		// TODO Auto-generated method stub
		return 50;
	}
	
	public int getYatakSayisi() {
		return yatakSayisi;
	}
	public void setYatakSayisi(int yatakSayisi) {
		this.yatakSayisi = yatakSayisi;
	}
	public int getCamas�rmakineSayisi() {
		return camasirMakineSayisi;
	}
	public void setCamas�rmakineSayisi(int camas�rmakineSayisi) {
		this.camasirMakineSayisi = camas�rmakineSayisi;
	}
	public int getRadyoSayisi() {
		return radyoSayisi;
	}
	
	
	public int getBuzdolab�Sayisi() {
		return buzdolabiSayisi;
	}
	public void setBuzdolab�Sayisi(int buzdolab�Sayisi) {
		this.buzdolabiSayisi = buzdolab�Sayisi;
	}

	public float Ucret(int g�nSayisi) {
		// TODO Auto-generated method stub
		return getGunlukFiyat() * g�nSayisi;
	}


}
