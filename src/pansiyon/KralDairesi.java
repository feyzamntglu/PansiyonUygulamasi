package pansiyon;

public class KralDairesi extends Oda {
	
	private int odaSayisi;
	private int jakuzisayisi;
	private int klimasayisi;
	private int banyosayisi;
	
	
	public KralDairesi(float gunlukFiyat, String odaNo, Musteri musteri,int odaSayisi,int jakuzisayisi,int klimasayisi,int banyosayisi) {
		super(gunlukFiyat, odaNo, musteri);
		
		this.odaSayisi=odaSayisi;
		this.klimasayisi=klimasayisi;
		this.banyosayisi=banyosayisi;
		this.jakuzisayisi=jakuzisayisi;
		
	}
	public KralDairesi() {
		
	}
	
	public KralDairesi(int klimasayisi) {
		
		
	}
	
	@Override
	public float getGunlukFiyat() {
		return 300;
	}

	public int getOdaSayisi() {
		return odaSayisi;
	}

	public void setOdaSayisi(int odaSayisi) {
		this.odaSayisi = odaSayisi;
	}
	public int getKlimasayisi() {
		return klimasayisi;
	}
	public void setKlimasayisi(int klimasayisi) {
		this.klimasayisi = klimasayisi;
	}
	
	public int getJakuzisayisi() {
		return jakuzisayisi;
	}
	public void setJakuzisayisi(int jakuzisayisi) {
		this.jakuzisayisi = jakuzisayisi;
	}
	public int getBanyosayisi() {
		return banyosayisi;
	}
	public void setBanyosayisi(int banyosayisi) {
		this.banyosayisi = banyosayisi;
	}
	
	public float Ucret(int günSayisi) {
		// TODO Auto-generated method stub
		return getGunlukFiyat() * günSayisi;
	}

/*
	@Override
	public void odaListele() {
		// TODO Auto-generated method stub
		System.out.println("Günlük fiyat:"+this.getGunlukFiyat());
		System.out.println("Oda No:"+this.getOdaNo());
		System.out.println("Musteri:"+this.getMusteri());
		System.out.println("Oda Sayisi:"+this.odaSayisi);
		
	}
	
	@Override
	public void odaDurumu(int odaNo) {
		// TODO Auto-generated method stub
		
	}*/

	
	
	
}
