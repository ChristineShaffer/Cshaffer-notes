// Claim is done

package ca.ualberta.cs.cshaffer_notes.test;

import ca.ualberta.cs.cshaffer_notes.Claim;
import junit.framework.TestCase;

public class ClaimTest extends TestCase {
	
	public void testClaimName() {
		String claimName = "A claim";
		Claim claim = new Claim(claimName);
		// Want to see if our Claim class' constructor is working properly
		assertTrue("Claim name is not equal", claimName.equals(claim.getClaimName()));
	}

}
