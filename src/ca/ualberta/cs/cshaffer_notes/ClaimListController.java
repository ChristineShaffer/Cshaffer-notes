package ca.ualberta.cs.cshaffer_notes;

// We're writing this controller because we want to be able to actually do stuff

public class ClaimListController {
	
	// Lazy Singleton because we want the claimList to be persistent, but we also don't
	// want to have unnecessary lists initialized 
	private static ClaimList claimList = null;
	// Doesn't belong to an instance (b/c static)
	static public ClaimList getClaimList() {
		if( claimList == null ) {
			// If there doesn't exist and instance yet then we'll make a new one!
			claimList = new ClaimList();
		}
		return claimList;
	}
	// NOW WE HAVE SOMETHING WE CAN ACCESS -- but we also want the controller to do
	// something for us
	
	/*
	public Claim getClaim() {
		return getAllClaims().getClaim();
	}
	*/
}
