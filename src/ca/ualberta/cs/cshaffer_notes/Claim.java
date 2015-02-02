package ca.ualberta.cs.cshaffer_notes;

import java.util.GregorianCalendar;

public class Claim {
	protected String claimName;
	protected String claimDescription;
	// http://tutorials.jenkov.com/java-date-time/java-util-calendar.html [Feb. 1, 2015]
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

}
