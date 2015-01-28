package ca.ualberta.cs.cshaffer_notes;

public class Claim {
	protected String claimName;

	public Claim(String claimName) {
		this.claimName = claimName;
	}

	public String getName() {
		return this.claimName;
	}

}
