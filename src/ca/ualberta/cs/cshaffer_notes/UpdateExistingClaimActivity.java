package ca.ualberta.cs.cshaffer_notes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class UpdateExistingClaimActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.existing_claims);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.update_existing_claim, menu);
		return true;
	}

}
