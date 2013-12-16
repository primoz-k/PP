package si.fri.pp.liki;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(new Circle(this));
        setContentView(R.layout.activity_main);
//        Bitmap bmp = Bitmap.createBitmap(100, 100,  Bitmap.Config.ARGB_8888);
//
//        Paint paint = new Paint();
//        paint.setAntiAlias(true);
//        paint.setColor(Color.BLUE);
//
//        Canvas c = new Canvas(bmp);
//        c.drawCircle(60,50,25, paint);
//        ImageView img = (ImageView) findViewById(R.id.img);
//        img.setImageBitmap(bmp);
    }


    public void prepoznava(View view) {
        // Kabloey
    	Intent intent = new Intent(this, PrepoznavanjeActivity.class);
    	startActivity(intent);
    }
    
    public void sestavljanje(View view) {
        // Kabloey
    	Intent intent = new Intent(this, SestavljanjeActivity.class);
    	startActivity(intent);
    }
    
    public void stDiagonal(View view) {
        // Kabloey
    	Intent intent = new Intent(this, SteviloDiagonalActivity.class);
    	startActivity(intent);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
