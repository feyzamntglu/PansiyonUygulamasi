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
	public int getCamasýrmakineSayisi() {
		return camasirMakineSayisi;
	}
	public void setCamasýrmakineSayisi(int camasýrmakineSayisi) {
		this.camasirMakineSayisi = camasýrmakineSayisi;
	}
	public int getRadyoSayisi() {
		return radyoSayisi;
	}
	
	
	public int getBuzdolabýSayisi() {
		return buzdolabiSayisi;
	}
	public void setBuzdolabýSayisi(int buzdolabýSayisi) {
		this.buzdolabiSayisi = buzdolabýSayisi;
	}

	public float Ucret(int günSayisi) {
		// TODO Auto-generated method stub
		return getGunlukFiyat() * günSayisi;
	}


}
