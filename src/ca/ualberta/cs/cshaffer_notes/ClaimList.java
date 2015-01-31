package ca.ualberta.cs.cshaffer_notes;

import java.util.ArrayList;

public class ClaimList {
	protected ArrayList<Claim> claimList;
	
	public ClaimList() {
		this.claimList = new ArrayList<Claim>();
	}

	public ArrayList<Claim> getAllClaims() {
		return claimList;
	}

	public int size() {
		return claimList.size();
	}

	public void addClaim(Claim claim) {
		claimList.add(claim);
	}

	public void removeClaim(Claim claim) {
		claimList.remove(claim);
	}
	
	public boolean contains(Claim claim) {
		return claimList.contains(claim);
	}

	// Returns desired Claim if in ClaimList; returns Claim with claimName "-1" otherwise
	public Object getClaim(Claim claim) {
		for(int i = 0; i < claimList.size(); i++) {
			Claim currentClaim = claimList.get(i);
			if( currentClaim.equals(claim) ) {
				return currentClaim;
			}
		}
		
		Claim defaultClaim = new Claim("-1");
		return defaultClaim;
	}
	
}
