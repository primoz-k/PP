package si.fri.pp.liki;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PrepoznavanjeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prepoznavanje);
	}
	
	public void krogIgra(View view){
		Intent intent = new Intent(this, KrogActivity.class);
    	startActivity(intent);
	}
	
	public void kvadratIgra(View view){
		Intent intent = new Intent(this, KvadratActivity.class);
    	startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.prepoznavanje, menu);
		return true;
	}


}
