package project;

import java.util.ArrayList;
import java.util.Scanner;

public class DisPriceType {
	ArrayList<OrderData> orderList = new ArrayList<OrderData>();
	Scanner scanner = new Scanner(System.in);
	OrderData orderItem = new OrderData();
	public Object applymethod;
	FirstClass first = new FirstClass();
	RealAgeType RealAge = new RealAgeType();
	FeeType feetype = new FeeType();
	PriceType pricetype = new PriceType();
	
	public void disPrice() {
		if(first.orderItem.inputTicketType == 1) {
		switch (first.orderItem.inputbenefit) {
		case 1:
			orderItem.disprice = pricetype.orderItem.price;
			break;
		case 2:
			orderItem.disprice = pricetype.orderItem.price * 5 / 10;
			break;
		case 3:
			orderItem.disprice = pricetype.orderItem.price * 5 / 8;
			break;
		case 4:
			orderItem.disprice = pricetype.orderItem.price * 49 / 100;
			break;
		case 5:
			orderItem.disprice = pricetype.orderItem.price * 5 / 10;
			break;
		case 6:
			orderItem.disprice = pricetype.orderItem.price * 70 / 100;
			break;
		}
	} else if (first.orderItem.inputTicketType == 2) {
		switch (first.orderItem.inputbenefit) {
		case 1:
			orderItem.disprice = pricetype.orderItem.price;
			break;
		case 2:
			orderItem.disprice = pricetype.orderItem.price * 5 / 10;
			break;
		case 3:
			orderItem.disprice = pricetype.orderItem.price * 5 / 10;
			break;
		case 4:
			orderItem.disprice = pricetype.orderItem.price;
			System.out.printf("휴가장병 우대는 종합이용권만 할인됩니다\n");
			break;
		case 5:
			orderItem.disprice = pricetype.orderItem.price;
			System.out.printf("임산부 우대는 종합이용권만 할인됩니다\n");
			break;
		case 6:
			orderItem.disprice = pricetype.orderItem.price;
			System.out.printf("다둥이 행복카드 우대는 종합이용권만 할인됩니다\n");
			break;

		}
	}
	}
}
