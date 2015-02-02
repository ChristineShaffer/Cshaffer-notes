package ca.ualberta.cs.cshaffer_notes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class AddNewClaimNextActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_new_claim_next);
		
		Intent intent = getIntent();
		int id = intent.getIntExtra("EXTRA_SESSION_ID", 0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_new_claim_next, menu);
		return true;
	}

	// Method for "Next" button
	public void nextInput(View v1) {
		Toast.makeText(this, "Next", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(AddNewClaimNextActivity.this, AddNewClaimNext2Activity.class);
		startActivity(intent);
	}
	
}
