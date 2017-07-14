package banke;

public class Test {
	public static void main(String[] args) {
		NarodnaBanka nb = NarodnaBanka.INSTANCE;
		Banka b = new Banka("Intesa");

		nb.registrujBanku(b);
		
		NarodnaBanka nb2 = NarodnaBanka.INSTANCE;
		
		Banka b2 = new Banka("Unicredit");
		
		nb2.registrujBanku(b2);
	}
}
