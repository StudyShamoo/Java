package singleton_prac;

public class TicketMarker {
	private static TicketMarker tk = new TicketMarker();
	private int ticket = 1000;
	
	private TicketMarker() {
		
	}
	
	public static TicketMarker getInstance() {
		return tk;
	}
	
	public synchronized int getNextTicketNumber() {
		return ticket++;
	}
}
