package si.fri.pp.liki;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class KrogActivity extends Activity {

	boolean[] zadeti = {false,false,false};
	LinearLayout l1,l2,l3,l4;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_krog);
		int st = 0;
//		TextView tv = (TextView) findViewById(R.id.steviloZadetih);
//		tv.setText(Integer.toString(st));
		l1 = (LinearLayout) findViewById(R.id.circle1);
		l2 = (LinearLayout) findViewById(R.id.circleL1);
		l3 = (LinearLayout) findViewById(R.id.circleL2);
		l4 = (LinearLayout) findViewById(R.id.square1);
		
	}


	public void zadet(View v) {
	    switch (v.getId()) {
	      case R.id.circle1:
	        zadeti[0] = true;
	        l1.setBackgroundColor(0);
	        break;
	      case R.id.circleL1:
	        zadeti[1] = true;
	        l2.setBackgroundColor(0);
	        break;
	      case R.id.circleL2:
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
	    	TextView tv = (TextView) findViewById(R.id.tv_krog);
			tv.setText("");
	    	TextView tv1 = (TextView) findViewById(R.id.steviloZadetih);
			tv1.setText("Bravo, prepoznal si vse kroge.");
	    }
	}
	 
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.krog, menu);
		return true;
	}

	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    	case R.id.navodila_krog:
    		AlertDialog instr = new AlertDialog.Builder(this).create();
    		instr.setMessage("Krog je lik brez kotov, v obliki pizze. \n"
    				+ "Sedaj ti ga ne bo te�ko prepoznati.");
    		instr.show();
    		return true;
    	}
    	return super.onOptionsItemSelected(item);
    }
}
