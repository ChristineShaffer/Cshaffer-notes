package ca.ualberta.cs.cshaffer_notes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class AddNewClaimNext2Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_new_claim_next2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_new_claim_next2, menu);
		return true;
	}
	
	public void addClaimAction(View v) {
		Toast.makeText(this, "Done -- Add Claim", Toast.LENGTH_SHORT).show();	
		ClaimListController clc = new ClaimListController();
		//clc.addClaim(new Claim(*NEED CLAIM NAME*));
		
	}

}
