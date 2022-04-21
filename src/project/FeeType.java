package project;

import java.util.Scanner;

public class FeeType {
	Scanner scanner = new Scanner(System.in);
	OrderData orderItem = new OrderData();
	public Object applymethod;
	FirstClass first = new FirstClass();
	RealAgeType RealAge = new RealAgeType();

	public void basicFeeTypeMethod() {
		if (RealAge.orderItem.RealAge > 65) { // 노인
			orderItem.basicFeeType = 1;

		} else if (RealAge.orderItem.RealAge < 65 && RealAge.orderItem.RealAge > 18) { // 성인
			orderItem.basicFeeType = 2;
			System.out.println(RealAge.orderItem.basicFeeType);
		} else if (RealAge.orderItem.RealAge > 12 && RealAge.orderItem.RealAge < 19) { // 청소년
			orderItem.basicFeeType = 3;
		} else if (RealAge.orderItem.RealAge > 3 && RealAge.orderItem.RealAge < 13) { // 어린아
			orderItem.basicFeeType = 4;
		} else if (RealAge.orderItem.RealAge < 4) { // 아기
			orderItem.basicFeeType = 5;
		}
	}
}
