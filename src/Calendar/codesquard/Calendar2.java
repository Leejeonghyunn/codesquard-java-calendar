package Calendar.codesquard;
import java.util.Scanner;
public class Calendar2 {
	private static final int[] Max_Days= {31,28,31,30,31,30,30,31,30,31,30,31};
	public int getMaxDaysOfMonth(int month) {
		return Max_Days[month-1];
	}

	public static void main(String[] args) {
		String PROMPT = "Cal >";
		Scanner scanner = new Scanner(System.in);
		Calendar2 cal = new Calendar2();
		
		int month = 1;
		while(true) {
			System.out.println("달을 입력하세요");
		    System.out.println(PROMPT);
		    month = scanner.nextInt();
		    if(month == -1) {
		    	break;
		    }
		    if(month>12) {
		    	continue;
		    }
		    System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
		System.out.println("Bye~~");
		scanner.close();
	}
	}

}
