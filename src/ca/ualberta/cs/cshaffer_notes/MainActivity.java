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

package ca.ualberta.cs.cshaffer_notes;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void addNewClaim(View v1) {
		Toast.makeText(this, "Add New Claim", Toast.LENGTH_SHORT).show();
		ClaimListController clc = new ClaimListController();
		Claim c = clc.getClaim();
		if( c.getClaimName() == "-1" ) {
			Toast.makeText(this, "There are no existing claims!", Toast.LENGTH_SHORT).show();
		}
	}

}
