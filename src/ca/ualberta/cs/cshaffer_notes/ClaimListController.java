package ca.ualberta.cs.cshaffer_notes;

public class ClaimListController {
	
	// Lazy Singleton
	private static ClaimList claimList = null;
	
	static public ClaimList getAllClaims() {
		if( claimList == null ) {
			claimList = new ClaimList();
		}
		return claimList;
	}
	
	public Claim getClaim() {
		return getAllClaims().getClaim();
	}
}
