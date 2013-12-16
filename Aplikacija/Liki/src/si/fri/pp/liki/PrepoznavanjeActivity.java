package si.fri.pp.liki;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class PrepoznavanjeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prepoznavanje);
	}
	
	public void krogIgra(View view){
		TextView tv = (TextView) findViewById(R.id.textView2);
		tv.setText("Izbral si krog.");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.prepoznavanje, menu);
		return true;
	}

}
