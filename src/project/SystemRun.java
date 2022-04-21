package project;

import java.util.ArrayList;
import java.util.Scanner;

public class SystemRun {
	ArrayList<OrderData> orderList = new ArrayList<OrderData>();
	OrderData orderItem = new OrderData();
	Input methodZip = new Input();
	Scanner scanner = new Scanner(System.in);
	public Object applymethod;
	FirstClass first = new FirstClass();
	RealAgeType RealAge = new RealAgeType();
	FeeType feetype = new FeeType();
	PriceType pricetype = new PriceType();
	DisPriceType dispricetype = new DisPriceType();
	
	public void dowhile() {
			first.First();
			RealAge.RealAgeMethod();
			feetype.basicFeeTypeMethod();
			pricetype.PriceType();
			dispricetype.disPrice();
			methodZip.LastWhile();	
			methodZip.ArrayPart();
			
	}
	
}



