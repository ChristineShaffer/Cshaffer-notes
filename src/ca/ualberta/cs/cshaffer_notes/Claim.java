package ca.ualberta.cs.cshaffer_notes;

// http://tutorials.jenkov.com/java-date-time/java-util-calendar.html [Feb. 1, 2015]
// http://www.mkyong.com/java/java-date-and-calendar-examples/ [Feb.1, 2015]
import java.util.GregorianCalendar;

public class Claim {
	protected String claimName;
	protected String claimDescription;
	protected GregorianCalendar claimStartDate;
	protected GregorianCalendar claimEndDate;
	
	// Constructor
	public Claim(String claimName, String claimDescription, GregorianCalendar startDate, GregorianCalendar endDate) {
		this.claimName = claimName;
		this.claimDescription = claimDescription;
		this.claimStartDate = startDate;
		this.claimEndDate = endDate;
	}

	public String getClaimName() {
		return this.claimName;
	}
	
	public String getClaimDescription() {
		return this.claimDescription;
	}
	
	public GregorianCalendar getClaimStartDate() {
		return this.claimStartDate;	
	}
	
	public GregorianCalendar getClaimEndDate() {
		return this.claimEndDate;
	}
	
	public void setClaimEndDate(GregorianCalendar claimEndDate) {
		this.claimEndDate = claimEndDate;
	}
	
	public void setClaimStartDate(GregorianCalendar claimStartDate) {
		this.claimStartDate = claimStartDate;
	}

}
