package ca.ualberta.cs.cshaffer_notes;

import java.util.GregorianCalendar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class AddNewClaimNext2Activity extends Activity {
	// Variables to grab extras and use them in nextInput() method
	String inProgressClaim;
	String inProgressClaimDes;
	GregorianCalendar inProgressStart;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_new_claim_next2);
		
		// Get Extras (claimName and claimDescription) so we can find the Claim in the ClaimList
		Bundle extras = getIntent().getExtras();
		inProgressClaim = (String) extras.get("claimName");
		inProgressClaimDes = (String) extras.getString("claimDes");
		inProgressStart = (GregorianCalendar) extras.get("startDate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_new_claim_next2, menu);
		return true;
	}
	
	public void addClaimAction(View v) {
		Toast.makeText(this, "Thanks for the Claim!", Toast.LENGTH_SHORT).show();	
		
		DatePicker userInputEndDate = (DatePicker) findViewById(R.id.addNewClaimNext2Date);
		ClaimListController clc = new ClaimListController();
		Claim claim = new Claim(inProgressClaim, inProgressClaimDes, inProgressStart, null);
		GregorianCalendar calendar = new GregorianCalendar(userInputEndDate.getYear(),userInputEndDate.getMonth(),userInputEndDate.getDayOfMonth());
		clc.editClaimEnd(claim, calendar);
		
		// Done creating Claim -- exit
	}

}
