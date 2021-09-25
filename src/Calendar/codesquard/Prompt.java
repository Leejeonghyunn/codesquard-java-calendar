package Calendar.codesquard;

import java.util.Scanner;

public class Prompt {
	private final static String PROMPT = "cal>";
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar3 cal = new Calendar3();
		int month = 1;
		while(true) {
			System.out.println("달을 입력하세요");
		    System.out.print(PROMPT);
		    month = scanner.nextInt();
		    if(month==-1) {
		    	break;
		    }
		    if(month>12) {
		    	continue;
		    }
		    cal.printCalendar(2017, month);
		    }
		System.out.println("bye~");
		scanner.close();
		}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
		

	}

}
