package ca.ualberta.cs.cshaffer_notes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddNewClaimActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_new_claim_1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_new_claim, menu);
		return true;
	}
	
	// Method for "Next" button
	public void nextInput(View v1) {
		Toast.makeText(this, "Next", Toast.LENGTH_SHORT).show();
		//EditText textView =	(EditText) findViewById(R.id.addNewClaimEditText1);
		
		// Take the info from the input fields and make a claim; add it to the claimList
		
		// Switch to the next activity; update the claim there as needed
		Intent intent = new Intent(AddNewClaimActivity.this, AddNewClaimNextActivity.class);
		//http://stackoverflow.com/questions/2091465/how-do-i-pass-data-between-activities-in-android [Feb. 1, 2015]
		//intent.putExtra("EXTRA_SESSION_ID", R.id.addNewClaimEditText1);
		startActivity(intent);
	}

}
