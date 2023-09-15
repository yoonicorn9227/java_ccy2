package p0915_학생성적;

import java.util.Scanner;

public class J0915_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("[헬로우 마켓 쇼핑몰 로그인]");
		String id = "aaa";
		String pw = "1111";
		String name = "홍길동";

		Buyer b1 = new Buyer("id", "name");
		int choice = 0;
		while (true) {
			System.out.println("[헬로우 마켓 가전 쇼핑몰]");
			System.out.println("1.TV");
			System.out.println("2.컴퓨터");
			System.out.println("3.오디오");
			System.out.println("4.세탁기");
			System.out.println("5.현재 <<잔액조회>>");
			System.out.println("8.총구매목록");
			System.out.println("9.금액충전");
			System.out.println("0.프로그램종료");
			System.out.println("---------------------------------");
			System.out.println("구매를 원하는 <번호>를 입력하세요.");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println("[TV구매]");
				System.out.println("결제를 진행할까요? <<1.YES 2.NO>>");
				choice = scan.nextInt();
				if (choice == 1) {
					b1.buy(new Tv());
					System.out.println("TV를 구매를 |선택|하셨습니다.");
					System.out.printf("구매후 잔액 : %,d원 \n", b1.money);
					System.out.println();
				} else {
					System.out.println("컴퓨터 구매를 |취소| 하셨습니다.");
					System.out.println();
				}
				break;

			case 2:
				System.out.println("[컴퓨터 구매]");
				System.out.println("결제를 진행할까요? <<1.YES 2.NO>>");
				choice = scan.nextInt();
				if (choice == 1) {
					b1.buy(new Computer());
					System.out.println("컴퓨터를 구매를 |선택|하셨습니다.");
					System.out.printf("구매후 잔액 : %,d원 \n", b1.money);
					System.out.println();
				} else {
					System.out.println("컴퓨터 구매를 |취소| 하셨습니다.");
					System.out.println();
				}
				break;
			case 3:
				System.out.println("[오디오 구매]");
				System.out.println("결제를 진행할까요? <<1.YES 2.NO>>");
				choice = scan.nextInt();
				if (choice == 1) {
					b1.buy(new Audio());
					System.out.println("오디오를 구매를 |선택|하셨습니다.");
					System.out.printf("구매후 잔액 : %,d원 \n", b1.money);
					System.out.println();
				} else {
					System.out.println("오디오 구매를 |취소| 하셨습니다.");
					System.out.println();
				}
				break;
			case 4:
				System.out.println("[세탁기 구매]");
				System.out.println("결제를 진행할까요? <<1.YES 2.NO>>");
				choice = scan.nextInt();
				if (choice == 1) {
					b1.buy(new Washing());
					System.out.println("세탁기를 구매를 |선택|하셨습니다.");
					System.out.printf("구매후 잔액 : %,d원 \n", b1.money);
					System.out.println();
				} else {
					System.out.println("세탁기 구매를 |취소| 하셨습니다.");
					System.out.println();
				}
				break;

			case 5:
				System.out.println("[잔액 조회]");
				System.out.println("---------------------------------------------------------------------");
				System.out.printf("[%s]님의 현재잔액 :[%,d원] | 포인트 : [%,dP]", b1.name, b1.money, b1.bonusPoint);
				System.out.println();
				break;

			case 8:
				System.out.println("[상품 구매목록]");
				System.out.println("---------------------------------------------------------------------");

				System.out.println();
				System.out.println("---------------------------------------------------------------------");
				System.out.println();
				break;
			case 9:
				System.out.println("[금액 충전]");
				System.out.println("---------------------------------------------------------------------");
				System.out.println("충전하려는 금액을 입력하세요.");
				int coin = scan.nextInt();
				b1.money += coin;
			case 0:

				break;

			}// switch
		} // while

	}// MAIN

}// CLASS
