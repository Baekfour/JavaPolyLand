package project;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	ArrayList<OrderData> orderList = new ArrayList<OrderData>();
	Scanner scanner = new Scanner(System.in);
	OrderData orderItem = new OrderData();
	MethodZip methodZip = new MethodZip();
	Dowh printmethod = new Dowh();
	
	public static void main(String[] args) {
		main ls = new main();
		ls.printmethod.dowhile(); 
	}
}
