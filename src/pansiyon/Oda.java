package pansiyon;

public abstract class Oda implements InterfacePansiyon{
	private float gunlukFiyat;
	private String odaNo;
	private Musteri musteri;

	public Oda(float gunlukFiyat, String odaNo, Musteri musteri) {
		// TODO Auto-generated constructor stub
		this.gunlukFiyat=gunlukFiyat;
		this.odaNo=odaNo;
		this.musteri=musteri;
	}
	public Oda() {
		
	}
	public float getGunlukFiyat() {
    	return gunlukFiyat;
    }
    public void setKullaniciAdi(float gunlukFiyat) {
    	this.gunlukFiyat=gunlukFiyat;
    }
    public String getOdaNo() {
    	return odaNo;
    }
    public void setOdaNo(String odaNo) {
    	this.odaNo=odaNo;
    }
    public Musteri getMusteri() {
		return musteri;
	}
	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}
	
	
	@Override
	public String toString() {
		return "Oda [gunlukFiyat=" + gunlukFiyat + ", odaNo=" + odaNo + ", musteri=" + musteri + "]";
	}
	
}
