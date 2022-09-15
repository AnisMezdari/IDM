public class TimeDuration {

	
	private int duration;
	
	
	public TimeDuration(int duration) {
		
		if(duration > 0)
			this.duration = duration;
		
		else {
			try {
				
				throw new BadBadBalueException();
			}catch(BadBadBalueException  e) {
				System.out.println(e);
			}
		}
		
		
	}
	
	
	public int hourDivision(int duration) {
		return duration / 60;
	}
	
	public int minuteDivision( int hourDivision) {
		return hourDivision % 60;
	}
	
	public int secondeDivision(int duration) {
		return duration % 60;
	}
	
	public String toString() {
		int seconde= secondeDivision(duration);
		int hourdivision = hourDivision(duration);
		int minute = minuteDivision(hourdivision);	
		int hour = hourdivision / 60;
		
		String result = hour + "h " + minute + "m " + seconde + "s";
		if(hour == 0) {
			result = minute + "m " + seconde +"s";
		}
		if(minute == 0 && hour == 0) {
			result = seconde +"s";
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		
		
		TimeDuration timeDuration = new TimeDuration(25000);
		
		System.out.println(timeDuration.toString());
	}
	
}
