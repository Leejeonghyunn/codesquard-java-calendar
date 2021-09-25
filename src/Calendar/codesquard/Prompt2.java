package Calendar.codesquard;

import java.util.Scanner;

public class Prompt2 {
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar4 cal = new Calendar4();
		int month = 1;
		int year = 1;
		while(true) {
			System.out.println("년 을 입력하세요");
			System.out.print("Year>");
			year=scanner.nextInt();
		    System.out.println("월 을 입력하세요");
		    System.out.print("Month>");
		    month = scanner.nextInt();
		    if(month==-1) {
		    	break;
		    }
		    if(month>12) {
		    	continue;
		    }
		    cal.printCalendar(year, month);
		    }
		System.out.println("bye~");
		scanner.close();
		}

	public static void main(String[] args) {
		Prompt2 p = new Prompt2();
		p.runPrompt();
		

	}

}


