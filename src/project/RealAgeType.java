package project;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RealAgeType {
	OrderData orderItem = new OrderData();
	FirstClass first = new FirstClass();
	public void RealAgeMethod() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat printday = new SimpleDateFormat("YYMMdd");
		orderItem.today = Integer.parseInt(printday.format(cal.getTime()));
		orderItem.year = 2000 + orderItem.today / 10000;
		orderItem.month = orderItem.today % 10000 / 100;
		orderItem.day = orderItem.today % 100;
		if (first.orderItem.inputRegisterNum2 == 1 || first.orderItem.inputRegisterNum2 == 2) {
			if (first.orderItem.inputRegisterNum % 10000 > first.orderItem.today % 10000) {
				orderItem.RealAge = first.orderItem.year - (1900 + first.orderItem.inputRegisterNum / 10000) - 1;
			} else if (first.orderItem.inputRegisterNum % 10000 < first.orderItem.today % 10000) {
				orderItem.RealAge = first.orderItem.year - (1900 + first.orderItem.inputRegisterNum / 10000);
			}
		} else if (first.orderItem.inputRegisterNum2 == 3 || first.orderItem.inputRegisterNum2 == 4) {
			if (first.orderItem.inputRegisterNum % 10000 > first.orderItem.today % 10000) {
				orderItem.RealAge = first.orderItem.year - (2000 + first.orderItem.inputRegisterNum / 10000) - 1;
			} else if (first.orderItem.inputRegisterNum % 10000 < first.orderItem.today % 10000) {
				orderItem.RealAge = orderItem.year - (2000 + first.orderItem.inputRegisterNum / 10000);
			}
		}
	}
}
