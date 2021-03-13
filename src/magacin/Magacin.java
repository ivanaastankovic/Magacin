package magacin;

import java.util.LinkedList;

import magacininterfejs.MagacinInterface;

public class Magacin implements MagacinInterface{
	public LinkedList<Artikal> artikli= new LinkedList<Artikal>();

	@Override
	public void dodajArtikal(Artikal artikal) {
		if(artikal !=null)
			artikli.add(artikal);
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		// TODO Auto-generated method stub
		return null;
	}
}
