/*
Cshaffer-notes: Keep track of travel expenses

Copyright 2015 Christine Shaffer cshaffer@ualberta.ca

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

// http://youtu.be/5PPD0ncJU1g [Feb2, 2015]
// http://youtu.be/VKVYUXNuDDg [Feb2, 2015]
// http://youtu.be/k9ZNbsc0Qgo [Feb2, 2015]
// http://youtu.be/fxjIA4HIruU [Feb2, 2015]
// http://youtu.be/uLnoI7mbuEo [Feb2, 2015]

package ca.ualberta.cs.cshaffer_notes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//ClaimList claimList
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	// Method for "Add New Claim" button
	public void addNewClaim(View v1) {
		Toast.makeText(this, "Add New Claim", Toast.LENGTH_SHORT).show();
		
		// We want this method to actually go to another activity (the screen to enter info)
		// so we make an intent that refers to the current activity, and the activity we 
		// want to go to.  When we call this method (when the button is pressed) this activity
		// will be started
		Intent intent = new Intent(MainActivity.this, AddNewClaimActivity.class);
		startActivity(intent);
	}
	
	// Method for "Update Existing Claim" button
	public void updateExistingClaim(View v1) {
		Toast.makeText(this, "Update Existing Claim", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(MainActivity.this, UpdateExistingClaimActivity.class);
		startActivity(intent);
	}

}








