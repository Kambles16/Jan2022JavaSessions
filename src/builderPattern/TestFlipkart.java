package builderPattern;

public class TestFlipkart {

	public static void main(String[] args) {

		Flipkart fp = new Flipkart();

		fp.login().login("Sujata", "123").search("watch").doPayment(53636).logout();

	}

}
