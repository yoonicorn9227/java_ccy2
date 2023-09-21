package p0921;

public class ColAction2 {

	Card[] kard = new Card[52];
	String[] shape = { "Spade", "Heart", "Diamond", "Clover" };

	ColAction2() {
	} // 기본생성자

	void kardAll() {
		for (int i = 0; i < kard.length; i++) {
			int Num = i % 13 + 1;
			String kind = shape[i / 13];
			kard[i] = new Card(Num, kind);
		} // for
	}// cardAll

	//카드52장 리턴
	Card[] kardInsert() {
		kardAll();
		return kard;
	}

}// CLASS
