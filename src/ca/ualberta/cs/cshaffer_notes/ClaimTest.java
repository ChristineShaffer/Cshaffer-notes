package ca.ualberta.cs.cshaffer_notes;

import junit.framework.TestCase;
import ca.ualberta.cs.cshaffer_notes.Claim;

public class ClaimTest extends TestCase {
	public void testClaim() {
		String claimName = "A Claim";
		Claim claim = new Claim(claimName);
		assertTrue("Claim name is not equal", claimName.equals(claim.getName()));
	}
}
