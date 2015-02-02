// Claim is done

package ca.ualberta.cs.cshaffer_notes.test;

import java.util.GregorianCalendar;

import ca.ualberta.cs.cshaffer_notes.Claim;
import junit.framework.TestCase;

public class ClaimTest extends TestCase {
	
	public void testClaimConstructor() {
		String claimName = "A claim";
		String claimDescription = "Uroma Trip";
		GregorianCalendar start = new GregorianCalendar(2013,0,1);
		GregorianCalendar end = new GregorianCalendar(2013,0,20);
		Claim claim = new Claim(claimName, claimDescription, start, end);

		// Want to see if our Claim class' constructor is working properly
		assertTrue("Claim name is not equal", claimName.equals(claim.getClaimName()));
		assertTrue("Claim description not equal", claimDescription.equals(claim.getClaimDescription()));
		assertTrue("Claim start date not equal", start.equals(claim.getClaimStartDate()));
		assertTrue("Claim end date not equal", end.equals(claim.getClaimEndDate()));
	}

}
