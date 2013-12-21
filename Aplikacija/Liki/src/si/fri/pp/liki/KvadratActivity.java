package si.fri.pp.liki;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class KvadratActivity extends Activity {

	boolean[] zadeti = {false,false,false};
	LinearLayout l1,l2,l3,l4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kvadrat);
		l1 = (LinearLayout) findViewById(R.id.square);
		l2 = (LinearLayout) findViewById(R.id.square180);
		l3 = (LinearLayout) findViewById(R.id.square225);
	}

	public void zadet(View v) {
	    switch (v.getId()) {
	      case R.id.square:
	        zadeti[0] = true;
	        l1.setBackgroundColor(0);
	        break;
	      case R.id.square180:
	        zadeti[1] = true;
	        l2.setBackgroundColor(0);
	        break;
	      case R.id.square225:
	        zadeti[2] = true;
	        l3.setBackgroundColor(0);
	        break;
	      }
	    boolean vsi = false;
	    for(boolean b : zadeti){
	    	if(!b){
	    		vsi = false;
	    		break;
	    	}else vsi = true;
	    }
	    
	    if(vsi){
	    	TextView tv = (TextView) findViewById(R.id.tv_kvadrat);
			tv.setText("");
	    	TextView tv1 = (TextView) findViewById(R.id.steviloZadetihKvadratov);
			tv1.setText("Bravo, majster, prepoznal si vse kvadrate.");
	    }
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.kvadrat, menu);
		return true;
	}

}
