package ca.ualberta.cs.cshaffer_notes.test;

import ca.ualberta.cs.cshaffer_notes.Claim;
import ca.ualberta.cs.cshaffer_notes.ClaimList;
import junit.framework.TestCase;

public class ClaimListTest extends TestCase {
	
	public void testEmptyClaimList() {
		ClaimList claimList = new ClaimList();
		assertTrue("The created ClaimList is nonempty", claimList.size() == 0);
	}
	
	public void testClaimListAdd() {
		ClaimList claimList = new ClaimList();
		
		String claimName = "Claim1";
		Claim claim = new Claim(claimName);
		
		claimList.addClaim(claim);
		
		assertTrue("ClaimList size is not zero", claimList.size() == 1);
	}
	
	public void testClaimListSize() {
		ClaimList claimList = new ClaimList();
		
		String claimName1 = "Claim1";
		String claimName2 = "Claim2";
		Claim claim1 = new Claim(claimName1);
		Claim claim2 = new Claim(claimName2);
		claimList.addClaim(claim1);
		claimList.addClaim(claim2);
		
		assertTrue("Claim list size is not 2", claimList.size() == 2);
	}

	public void testClaimListRemove() {
		ClaimList claimList = new ClaimList();
		
		String claimName1 = "Claim1";
		String claimName2 = "Claim2";
		Claim claim1 = new Claim(claimName1);
		Claim claim2 = new Claim(claimName2);
		claimList.addClaim(claim1);
		claimList.addClaim(claim2);
		
		claimList.removeClaim(claim1);
		
		assertTrue("ClaimList size is not 1", claimList.size() == 1);

	}
	
	public void testClaimListContains() {
		ClaimList claimList = new ClaimList();
		String claimName = "Claim1";
		Claim claim = new Claim(claimName);
		claimList.addClaim(claim);
		assertTrue("ClaimList doesn't contain claim", claimList.contains(claim));
		
		String claimName2 = "Claim2";
		Claim claim2 = new Claim(claimName2);
		assertFalse("ClaimList does contain the claim", claimList.contains(claim2));
	}
	
	public void testGetClaim() {
		ClaimList claimList = new ClaimList();
		String claimName = "Claim1";
		Claim claim = new Claim(claimName);
		String claimName2 = "Claim2";
		Claim claim2 = new Claim(claimName2);
		claimList.addClaim(claim);
		claimList.addClaim(claim2);
		
		assertTrue("Claim returned is not equal to the desired claim", claimList.getClaim(claim).equals(claim));
		
		claimList.removeClaim(claim);
		Claim defClaim = new Claim("-1");
		assertFalse("Didn't return default Claim as expected", claimList.getClaim(claim).equals(defClaim));
	}

}
