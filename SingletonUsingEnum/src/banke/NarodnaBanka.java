package banke;

import java.util.ArrayList;

public enum NarodnaBanka {
	INSTANCE;

	private String potpis = "Narodna Banka";
	private ArrayList<Banka> registrovaneBanke = new ArrayList<>();
	private int kursEvra = 122;

	public void registrujBanku(Banka b) {
		registrovaneBanke.add(b);
		System.out.println("Banka "+ b.getImeBanke() +" uspesno registrovana od strane : " + potpis);
	}

	public boolean daLiJeRegistrovana(Banka b) {
		return registrovaneBanke.contains(b);
	}

	public int postaviKursEvra(Banka b) {
		if (daLiJeRegistrovana(b)) {
			return kursEvra;
		}
		return -1;
	}
}
