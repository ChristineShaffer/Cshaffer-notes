package ca.ualberta.cs.cshaffer_notes;

import java.util.GregorianCalendar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class AddNewClaimNextActivity extends Activity {
	// Variables to grab extras and use them in nextInput() method
	String inProgressClaim;
	String inProgressClaimDes;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_new_claim_next);
		
		// Get Extras (claimName and claimDescription) so we can find the Claim in the ClaimList
		Bundle extras = getIntent().getExtras();
		inProgressClaim = (String) extras.get("claimName");
		inProgressClaimDes = (String) extras.getString("claimDes");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_new_claim_next, menu);
		return true;
	}

	// Method for "Next" button
	public void nextInput(View v1) {
		// Toast.makeText(this, "Next", Toast.LENGTH_SHORT).show();
		
		// Get user's desired start date
		DatePicker userInputStartDate = (DatePicker) findViewById(R.id.addNewClaimNextDate1);
		
		ClaimListController clc = new ClaimListController();
		// Make copy of Claim we're editing so we can grab it with getClaim()
		Claim claim = new Claim(inProgressClaim, inProgressClaimDes, null, null);
		// Edit the claimStartDate
		// http://www.mkyong.com/java/java-date-and-calendar-examples/ [Feb2, 2015]
		GregorianCalendar calendar = new GregorianCalendar(userInputStartDate.getYear(),userInputStartDate.getMonth(),userInputStartDate.getDayOfMonth());
		clc.editClaimStart(claim, calendar);
		
		Intent intent = new Intent(AddNewClaimNextActivity.this, AddNewClaimNext2Activity.class);
		intent.putExtra("claimName", inProgressClaim);
		intent.putExtra("claimDes", inProgressClaimDes);
		intent.putExtra("startDate", calendar);
		startActivity(intent);
	}
	
}
