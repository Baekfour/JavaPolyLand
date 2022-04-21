package project;


	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Calendar;
	import java.util.Scanner;



	public class Input {
		
		Scanner scanner = new Scanner(System.in);
		OrderData orderItem = new OrderData();
		public Object applymethod;
		FirstClass first = new FirstClass();
		RealAgeType RealAge = new RealAgeType();
		FeeType feetype = new FeeType();
		PriceType pricetype = new PriceType();
		DisPriceType dispricetype = new DisPriceType();
		
		public void LastWhile() {
			ArrayList<OrderData> orderList = new ArrayList<OrderData>();
			if (pricetype.orderItem.getPrice() == StaticValue.AllDayOlderTK || pricetype.orderItem.getPrice() == StaticValue.ParkDayOlderTK
					|| pricetype.orderItem.getPrice() == StaticValue.AllAfter4OlderTK
					|| pricetype.orderItem.getPrice() == StaticValue.ParkAfter4OlderTK) {
				dispricetype.orderItem.setDisprice(pricetype.orderItem.getPrice()); // 노인 가격
				System.out.printf("티켓 금액은 %d원 입니다.\n\n", dispricetype.orderItem.getDisprice());
			} else {
				System.out.printf("티켓 금액은 %d원 입니다.\n\n", dispricetype.orderItem.getDisprice());
			}
			orderItem.setTotalmoney(orderItem.getTotalmoney() + dispricetype.orderItem.getDisprice());

			orderList.add(orderItem);
			System.out.printf("계속 발권 하시겠습니까?\n");
			System.out.printf("티켓 발권 : 1\n");
			System.out.printf("종료 : 2\n");
			System.out.printf("처음으로 : 3\n");
			orderItem.setExtend(scanner.nextInt());
			System.out.printf("%d", first.orderItem.getExtend());
			System.out.printf("\n");
		}

		public void ArrayPart() {
			ArrayList<OrderData> orderList = new ArrayList<OrderData>();
			System.out.printf(
					"\n\n*************************************** 결제 정보 *****************************************\n");
			System.out.printf("이용권 종류\t이용권 옵션\t나이별 권종\t가격\t\t우대사항\n");
			for (int index = 0; index < orderList.size(); index++) {
				switch (orderList.get(index).getInputTicketType()) {
				case 1:
					System.out.printf("종합이용권\t\t");
					break;

				case 2:
					System.out.printf("파크이용권\t\t");
					break;

				}
				switch (orderList.get(index).getInputTicketType()) {
				case 1:
					System.out.printf("1Day\t\t");
					break;

				case 2:
					System.out.printf("After4\t\t");
					break;

				}
				switch (orderList.get(index).getBasicFeeType()) {
				case 1:
					System.out.printf("노인\t\t");
					break;

				case 2:
					System.out.printf("성인\t\t");
					break;

				case 3:
					System.out.printf("청소년\t\t");
					break;

				case 4:
					System.out.printf("어린이\t\t");
					break;

				case 5:
					System.out.printf("베이비\t\t");
					break;

				}
//				orderList[orderCount][3] = 1;
				orderList.get(index).setDisprice(dispricetype.orderItem.getDisprice());
				System.out.printf("%d\t\t", orderList.get(index).getDisprice());
				if (orderList.get(index).getInputbenefit() == 2) {
					System.out.printf("*장애인 우대\n");
				} else if (orderList.get(index).getInputbenefit() == 3) {
					System.out.printf("*국가유공자 우대\n");
				} else if (orderItem.getInputTicketType() == 1 && orderList.get(index).getInputbenefit() == 4) {
					System.out.printf("*휴가장병 우대\n");
				} else if (orderItem.getInputTicketType() == 1 && orderList.get(index).getInputbenefit() == 5) {
					System.out.printf("*임산부 우대\n");
				} else if (orderItem.getInputTicketType() == 1 && orderList.get(index).getInputbenefit() == 6) {
					System.out.printf("*다둥이 행복카드 우대\n");
				} else {
					System.out.printf("*우대사항 없음\n");
				}
			}
			System.out.printf("\n---------------------------------------------------------------------------\n");
			System.out.printf("결제 금액\t\t\t\t\t\t\t%d원\n\n", orderItem.getTotalmoney());
		}
	}



