package pansiyon;

public class SuitOda extends Oda{
	private String pencereDurumu;
	private int balkonSayisi;
	private int tvSayisi;
	
	public SuitOda() {
		super();
		tvSayisi=0;
	}
	public SuitOda(String pencereDurumu,int balkonSayisi,int tvSayisi,float gunlukFiyat,String odaNo,Musteri musteri) {
		super( gunlukFiyat, odaNo,musteri);
		this.pencereDurumu=pencereDurumu;
		this.balkonSayisi=balkonSayisi;
		this.tvSayisi=tvSayisi;
	}
	
	@Override
	public float getGunlukFiyat() {
		return 100;
	}

	public String getPencereDurumu() {
		return pencereDurumu;
	}

	public void setPencereDurumu(String pencereDurumu) {
		this.pencereDurumu = pencereDurumu;
	}
	public int getBalkonSayisi() {
		return balkonSayisi;
	}
	public void setBalkonSayisi(int balkonSayisi) {
		this.balkonSayisi = balkonSayisi;
	}
	public int getTvSayisi() {
		return tvSayisi;
	}
	public void setTvSayisi(int tvSayisi) {
		this.tvSayisi = tvSayisi;
	}

	@Override
	public String toString() {
		return super.toString()+"SuitOda [pencereDurumu=" + pencereDurumu + ", balkonSayisi=" + balkonSayisi + ", tvSayisi=" + tvSayisi
				+ "]";
	}

	public float Ucret(int günSayisi) {
		return getGunlukFiyat() * günSayisi;
	}

	/*@Override
	public void odaDurumu(int odaNo) {
		// TODO Auto-generated method stub
	
		}
		
	}*/
}
