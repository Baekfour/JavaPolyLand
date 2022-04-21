package project;

public class PriceType {
	OrderData orderItem = new OrderData();
	FirstClass first = new FirstClass();
	FeeType feetype = new FeeType();
	
	public void PriceType() {
		if(first.orderItem.inputTicketType == 1) {
		if (first.orderItem.inputTicketTime == 1) {
			if (feetype.orderItem.inputbasicFeeType == 1) { // 노인
				orderItem.price = StaticValue.AllDayOlderTK;
			} else if (feetype.orderItem.inputbasicFeeType == 2) { // 성인
				orderItem.price = StaticValue.AllDayAdultTK;
			} else if (feetype.orderItem.inputbasicFeeType == 3) { // 청소년
				orderItem.price = StaticValue.AllDayTeenTK;
			} else if (feetype.orderItem.inputbasicFeeType == 4) { // 어린아
				orderItem.price = StaticValue.AllDayChildTK;
			} else if (feetype.orderItem.inputbasicFeeType == 5) { // 아기
				orderItem.price = StaticValue.AllDayBabyTK;
			}
		} else if (first.orderItem.inputTicketType == 2) {
			if (first.orderItem.inputTicketTime == 1) { // 노인
				if (feetype.orderItem.inputbasicFeeType == 1) {
					orderItem.price = StaticValue.ParkDayOlderTK;
			} else if (feetype.orderItem.inputbasicFeeType == 2) { // 성인
				orderItem.price = StaticValue.ParkDayAdultTK;
			} else if (feetype.orderItem.inputbasicFeeType == 3) { // 청소년
				orderItem.price = StaticValue.ParkDayTeenTK;
			} else if (feetype.orderItem.inputbasicFeeType == 4) { // 어린아
				orderItem.price = StaticValue.ParkDayChildTK;
			} else if (feetype.orderItem.inputbasicFeeType == 5) { // 아기
				orderItem.price = StaticValue.ParkDayBabyTK;
			}
		} else if(first.orderItem.inputTicketType == 2) {
			if (first.orderItem.inputTicketTime == 1) {
			if (feetype.orderItem.inputbasicFeeType == 1) { // 노인
				orderItem.price = StaticValue.AllAfter4OlderTK;
			} else if (feetype.orderItem.inputbasicFeeType == 2) { // 성인
				orderItem.price = StaticValue.AllAfter4AdultTK;
			} else if (feetype.orderItem.inputbasicFeeType == 3) { // 청소년
				orderItem.price = StaticValue.AllAfter4TeenTK;
			} else if (feetype.orderItem.inputbasicFeeType == 4) { // 어린아
				orderItem.price = StaticValue.AllAfter4ChildTK;
			} else if (feetype.orderItem.inputbasicFeeType == 5) { // 아기
				orderItem.price = StaticValue.AllAfter4BabyTK;
			}
		} else if (first.orderItem.inputTicketTime == 2) {
			if (feetype.orderItem.inputbasicFeeType == 1) { // 노인
				orderItem.price = StaticValue.ParkAfter4OlderTK;
			} else if (feetype.orderItem.inputbasicFeeType == 2) { // 성인
				orderItem.price = StaticValue.ParkAfter4AdultTK;
			} else if (feetype.orderItem.inputbasicFeeType == 3) { // 청소년
				orderItem.price = StaticValue.ParkAfter4TeenTK;
			} else if (feetype.orderItem.inputbasicFeeType == 4) { // 어린아
				orderItem.price = StaticValue.ParkAfter4ChildTK;
			} else if (feetype.orderItem.inputbasicFeeType == 5) { // 아기
				orderItem.price = StaticValue.ParkAfter4BabyTK;
			}
		}
		}
		}
		}
	}
}
