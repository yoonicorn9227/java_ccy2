package p0921;

public class J0921_10 {

	public static void main(String[] args) {

		ColAction2 col2 = new ColAction2();

		Card[] kard = col2.kardInsert();
		for (int i = 0; i < kard.length; i++) {
			System.out.printf("[%s, %d]\n", kard[i].getKind(), kard[i].getNumber());
		}

	}// MAIN

}// CLASS
