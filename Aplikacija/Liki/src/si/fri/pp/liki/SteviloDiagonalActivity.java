package si.fri.pp.liki;

import java.util.ArrayList;
import java.util.Random;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SteviloDiagonalActivity extends Activity {

	String stDiagonal = "2";
	ArrayList<LinearLayout> tabela = new ArrayList<LinearLayout>();
	LinearLayout l1, l2, l3, l4, l5;
	String[] stevila = { "2", "0", "5,", "9", "14" };
	int index;
	int st = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stevilo_diagonal);
		l1 = (LinearLayout) findViewById(R.id.linearLayout1);
		l2 = (LinearLayout) findViewById(R.id.linearLayout2);
		l3 = (LinearLayout) findViewById(R.id.petkotnik);
		l4 = (LinearLayout) findViewById(R.id.sestkotnik);
		l5 = (LinearLayout) findViewById(R.id.sedemkotnik);
		tabela.add(l1);
		tabela.add(l2);
		tabela.add(l3);
		tabela.add(l4);
		tabela.add(l5);
		l1.setVisibility(View.VISIBLE);
	}

	public void zamenjaj(View view) {
		this.preveri(view);
		int size = tabela.size();
		Random r = new Random();
		index = r.nextInt(size);
		LinearLayout o = tabela.get(index);
		for (int i = 0; i < tabela.size(); i++) {
			if (i == index) {
				if (tabela.get(i).isShown()) {
					this.zamenjaj(view);
				} else
					tabela.get(i).setVisibility(View.VISIBLE);
			} else
				tabela.get(i).setVisibility(View.INVISIBLE);
		}

	}

	@SuppressLint("NewApi")
	public void preveri(View view) {
		String rb0Text = (String) ((RadioButton) findViewById(R.id.radio0))
				.getText();
		String rb1Text = (String) ((RadioButton) findViewById(R.id.radio1))
				.getText();
		String rb2Text = (String) ((RadioButton) findViewById(R.id.radio2))
				.getText();
		RadioButton rb2 = (RadioButton) findViewById(R.id.radio2);
		RadioButton rb1 = (RadioButton) findViewById(R.id.radio1);
		RadioButton rb0 = (RadioButton) findViewById(R.id.radio0);
		RadioButton rb3 = (RadioButton) findViewById(R.id.radio3);
		RadioButton rb4 = (RadioButton) findViewById(R.id.radio4);
		RadioButton rb5 = (RadioButton) findViewById(R.id.radio5);
		TextView resitev = (TextView) findViewById(R.id.tv_resitev);
		LinearLayout layoutResitev = (LinearLayout) findViewById(R.id.layoutResitev);
		if (rb0.isChecked()) { // šestkotnik
			if (l4.isShown()) {
				resitev.setText("6*(6-3) / 2 = 9");
				st++;
				if (st == 10) {
					Toast.makeText(getApplicationContext(), "Odlièno! Dokazal/a si, da ti diagonale ne predstavljajo težav",
							Toast.LENGTH_SHORT).show();
				}
				layoutResitev.setBackground(getResources().getDrawable(
						R.drawable.sestkotnik_resen));
			} else
				Toast.makeText(getApplicationContext(), "Napaèno!",
						Toast.LENGTH_SHORT).show();
		} else if (rb1.isChecked()) {
			if (l3.isShown()) {
				resitev.setText("5*(5-3) / 2 = 5");
				layoutResitev.setBackground(getResources().getDrawable(
						R.drawable.petkotnik_resen));
				st++;
				if (st == 10) {
					Toast.makeText(getApplicationContext(), "Odlièno! Dokazal/a si, da ti diagonale ne predstavljajo težav!",
							Toast.LENGTH_SHORT).show();
				}
			} else
				Toast.makeText(getApplicationContext(), "Napaèno!",
						Toast.LENGTH_SHORT).show();
		} else if (rb2.isChecked()) {
			if (l1.isShown()) {
				resitev.setText("4*(4-3) / 2 = 2");
				layoutResitev.setBackground(getResources().getDrawable(
						R.drawable.stirikotnik_resen));
				st++;
				if (st == 10) {
					Toast.makeText(getApplicationContext(), "Odlièno! Dokazal/a si, da ti diagonale ne predstavljajo težav!",
							Toast.LENGTH_SHORT).show();
				}
			} else
				Toast.makeText(getApplicationContext(), "Napaèno!",
						Toast.LENGTH_SHORT).show();
		} else if (rb3.isChecked()) {
			if (l2.isShown()) {
				resitev.setText("0*(0-3) / 2 = 0");
				layoutResitev.setBackground(getResources().getDrawable(
						R.drawable.circle));
				st++;
				if (st == 10) {
					Toast.makeText(getApplicationContext(), "Odlièno! Dokazal/a si, da ti diagonale ne predstavljajo težav!",
							Toast.LENGTH_SHORT).show();
				}
			} else
				Toast.makeText(getApplicationContext(), "Napaèno!",
						Toast.LENGTH_SHORT).show();
		} else if (rb4.isChecked()) {
			if (l5.isShown()) {
				resitev.setText("7*(7-3) / 2 = 14");
				layoutResitev.setBackground(getResources().getDrawable(
						R.drawable.sedemkotnik_resen));
				st++;
				if (st == 10) {
					Toast.makeText(getApplicationContext(), "Odlièno! Dokazal/a si, da ti "
							+ "diagonale ne predstavljajo težav!",
							Toast.LENGTH_SHORT).show();
				}
			} else
				Toast.makeText(getApplicationContext(), "Napaèno!",
						Toast.LENGTH_SHORT).show();
		} else if (rb5.isChecked()) {
			Toast.makeText(getApplicationContext(), "Napaèno!",
					Toast.LENGTH_SHORT).show();
			layoutResitev.setBackground(null);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.stevilo_diagonal, menu);
		return true;
	}

}
