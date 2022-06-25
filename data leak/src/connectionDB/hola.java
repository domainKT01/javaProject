package connectionDB;

import java.util.Scanner;

public class hola {

	public static void main(String[] args) {
		
		hi();
	}
	
	public static void hi() {
		
		System.out.println("hola perras");
		
		Scanner data = new Scanner(System.in);
		
		String swift = data.next();
		
		data.close();
		
		System.out.println(swift);
	}
}
