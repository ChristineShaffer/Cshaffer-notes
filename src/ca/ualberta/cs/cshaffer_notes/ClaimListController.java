// We want this class in order to keep a persistent ClaimList for our app
// For now we're shoving the ClaimList in this class -- might change later

// THIS IS THE CLAIM LIST FOR THE APP

package ca.ualberta.cs.cshaffer_notes;

import java.util.GregorianCalendar;

public class ClaimListController {
	
	// Lazy Singleton because we don't want to have unnecessary lists initialized (only one)
	private static ClaimList claimList = null;
	
	// Doesn't belong to an instance (b/c static)
	static public ClaimList getClaimList() {
		if( claimList == null ) {
			// If there doesn't exist and instance yet then we'll make a new one!
			claimList = new ClaimList();
		}
		return claimList;
	}

	
	public void addClaim(Claim claim) {
		getClaimList().addClaim(claim);
	}
	
	public void editClaimStart(Claim claim, GregorianCalendar claimStartDate) {
		((Claim) getClaimList().getClaim(claim)).setClaimStartDate(claimStartDate);
	}
	
	public void editClaimEnd(Claim claim, GregorianCalendar claimEndDate) {
		((Claim) getClaimList().getClaim(claim)).setClaimEndDate(claimEndDate);
	}
}
