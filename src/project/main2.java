package project;

import java.util.ArrayList;
import java.util.Scanner;

public class main2 {
	ArrayList<OrderData> orderList = new ArrayList<OrderData>();
	Scanner scanner = new Scanner(System.in);
	OrderData orderItem = new OrderData();
	MethodZip methodZip = new MethodZip();
	Dowh printmethod = new Dowh();
	
	public static void main(String[] args) {
		main2 ls = new main2();
		ls.printmethod.dowhile(); 
	}
}
