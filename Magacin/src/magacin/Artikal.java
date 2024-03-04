package magacin;

import java.util.Objects;

public abstract class Artikal {
	private String naziv;
	private int sifra;
	private String opis;
	private int kolicina;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null) {
			throw new NullPointerException("Naziv ne sme biti null");
		}
		this.naziv = naziv;
	}
	public int getSifra() {
		return sifra;
	}
	public void setSifra(int sifra) throws Exception {
		if(sifra == 0) {
			throw new Exception("Sifra ne sme biti 0");
		}
		this.sifra = sifra;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
		if(opis == null) {
			throw new NullPointerException("Opis ne sme biti null");
		}
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(sifra);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return sifra == other.sifra;
	}
	
	
	
}
