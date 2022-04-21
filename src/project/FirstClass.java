package project;

import java.util.Scanner;

public class FirstClass {
	OrderData orderItem = new OrderData();
	Scanner scanner = new Scanner(System.in);
	public void First() {
		orderItem.disprice = 0;
		System.out.printf("**********************************************************\n");
		System.out.printf("이용권 종류를 선택하세요.\n");
		System.out.printf("1. 종합이용권(롯데월드 + 민속박물관)\n");
		System.out.printf("2. 파크이용권(롯데월드)\n");
		orderItem.inputTicketType = scanner.nextInt();
		System.out.printf("\n");
		System.out.printf("권종을 선택하세요.\n");
		System.out.printf("1. 주간권\n");
		System.out.printf("2. After4\n");
		orderItem.inputTicketType = scanner.nextInt();
		System.out.printf("\n");
		System.out.printf("주민등록번호앞자리를 입력하세요.\n");
		orderItem.inputRegisterNum = scanner.nextInt();
		System.out.printf("\n");
		System.out.printf("주민등록번호 뒷자리 첫번째숫자를 입력하세요.\n");
		orderItem.inputRegisterNum2 = scanner.nextInt();
		System.out.printf("\n");
		System.out.printf("우대사항을 선택하세요.\n");
		System.out.printf("1. 없음 (나이 우대는 자동처리)\n");
		System.out.printf("2. 장애인\n");
		System.out.printf("3. 국가유공자\n");
		System.out.printf("4. 휴가장병\n");
		System.out.printf("5. 임산부\n");
		System.out.printf("6. 다둥이 행복카드\n");
		orderItem.inputbenefit = scanner.nextInt();
//		System.out.printf("몇장을 선택하시겠습니까?.\n");
//		addTicket = scanner.nextInt();
		System.out.printf("\n");
	}
}
