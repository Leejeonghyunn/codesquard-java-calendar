package Calendar.codesquard;

public class Calendar3 {
		  private static final int[] Max_Days = {31,28,31,30,31,30,31,31,30,31,30,31};
	      public int getMaxDaysOfMonth(int month){
	    	  return Max_Days[month-1];
	      }
	      public void printCalendar(int year,int month) {
	    	  System.out.printf("  <<%4d년%3d월>>\n",year,month);
	    	  System.out.println(" 일   월   화   수   목   금   토 ");
	    	  System.out.println("------------------------");
	    	  int maxDay = getMaxDaysOfMonth(month);
	    	  for(int i =1; i<=maxDay;i=i+1) {
	    		  System.out.printf("%3d",i);
	    		  if(i%8==0)
	    			  System.out.println();
	    	  }
	    	  System.out.println();
	    	  }
	    	  
	      }

