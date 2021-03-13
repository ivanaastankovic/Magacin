package magacininterfejs;

import magacin.Artikal;

public interface MagacinInterface {
	
	public void dodajArtikal(Artikal artikal);
	public void izbaciArtikal(int kolicina);
	public Artikal pronadjiArtikal(int sifra);
}
