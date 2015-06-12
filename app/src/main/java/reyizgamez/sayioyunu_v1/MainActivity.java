/*package reyizgamez.sayioyunu_v1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
*/


package reyizgamez.sayioyunu_v1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView d1, d2, d3, d4, res;
    Button b1;

    //changes

    int dig1 = 0, dig2 = 0, dig3 = 0, dig4 = 0, num1, num2, num3, num4, dig_n, flag=1 ;
    String asd = "", sum = "";

    public String control_number(int dig[], int s2[] ) {

        int pc = 0;
        int nc = 0;

        String r = "";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (dig[i] == s2[j]) {
                    if (i == j) {
                        pc++;
                    } else {
                        nc++;
                    }

                }
            }

        }
        return r + "+" + pc + " , -" + nc;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        d1 = (TextView) findViewById(R.id.textView);

        d1.setOnTouchListener(new MyTouchListener());


        d2 = (TextView) findViewById(R.id.textView2);
        d3 = (TextView) findViewById(R.id.textView3);
        d4 = (TextView) findViewById(R.id.textView4);
        res = (TextView)  findViewById(R.id.textView5);

        b1 = (Button) findViewById(R.id.button);

/*        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dig1 = (dig1 + 1) % 10;
                d1.setText("" + dig1);

            }
        });*/

        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dig2 = (dig2 + 1) % 10;
                d2.setText("" + dig2);

            }
        });

        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dig3 = (dig3 + 1) % 10;
                d3.setText("" + dig3);

            }
        });

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dig4 = (dig4 + 1) % 10;
                d4.setText("" + dig4);

            }
        });

        num1 = 3;
        num2 = 2;
        num3 = 0;
        num4 = 4;



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum = "" + dig1 + dig2 + dig3 + dig4;

                int sum2[] = {num1, num2, num3, num4};
                int dig[]  = {dig1, dig2, dig3, dig4};

                for (int i = 0; i<4; i++){
                    for (int j = 0 ; j<4 ; j++){
                        if (i!=j){
                            if (dig[i]==dig[j]){
                                flag = 0;
                                break;
                            }
                        }
                    }
                }

                if (flag==0) {

                    Toast.makeText(getApplicationContext(),"Please Enter Different Numbers",Toast.LENGTH_LONG).show();

                    flag=1;
                }
                else {


                    asd = "" + sum + "        " + control_number(dig, sum2) + "\n" + asd;
                    res.setText("" + asd);
                }
            }
        });
    }

    private final class MyTouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_MOVE) {

                Toast.makeText(getApplicationContext(),"UPPPP",Toast.LENGTH_LONG).show();

/*                dig1 = (dig1 + 1) % 10;
                d1.setText("" + dig1);*/

                return true;
            }
            else if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {

                Toast.makeText(getApplicationContext(),"DOWNNNN",Toast.LENGTH_LONG).show();

/*                dig1 = (dig1 - 1) % 10;
                d1.setText("" + dig1);*/

                return true;
            }

            else {
                return false;
            }
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
