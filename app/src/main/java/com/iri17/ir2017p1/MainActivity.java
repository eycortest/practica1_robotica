package com.iri17.ir2017p1;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.io.UnsupportedEncodingException;

public class MainActivity extends Activity {

    private SeekBar s1;
    private SeekBar s2;
    private SeekBar s3;
    private SeekBar s4;
    private SeekBar s5;

    private TextView ts1;
    private TextView ts2;
    private TextView ts3;
    private TextView ts4;
    private TextView ts5;

    private TextView tvd;
    private TextView tvdc;

    private int vs1=0;
    private int vs2=0;
    private int vs3=0;
    private int vs4=0;
    private int vs5=0;


    private TextView te;
    private TextView td;

    private EditText ed;
    private ToggleButton tb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Instrucciones", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();



            }
        });

        ts1 = (TextView) findViewById(R.id.txtBarra1);
        ts1.setText("25");
        s1= (SeekBar) findViewById(R.id.sb1);
        s1.setProgress(25);
        s1.setMax(100);

        ts2 = (TextView) findViewById(R.id.txtBarra2);
        ts2.setText("25");
        s2= (SeekBar) findViewById(R.id.sb2);
        s2.setProgress(25);
        s2.setMax(100);

        ts3 = (TextView) findViewById(R.id.txtBarra3);
        ts3.setText("25");
        s3= (SeekBar) findViewById(R.id.sb3);
        s3.setProgress(25);
        s3.setMax(100);

        ts4 = (TextView) findViewById(R.id.txtBarra4);
        ts4.setText("25");
        s4 = (SeekBar) findViewById(R.id.sb4);
        s4.setProgress(25);
        s4.setMax(100);

        ts5 = (TextView) findViewById(R.id.txtBarra5);
        ts5.setText("25");
        s5 = (SeekBar) findViewById(R.id.sb5);
        s5.setProgress(25);
        s5.setMax(100);

        tvd= (TextView) findViewById(R.id.textView8);
        tvdc= (TextView) findViewById(R.id.textView);

        te= (TextView) findViewById(R.id.txtConectando);
        td= (TextView) findViewById(R.id.txtConectandoIP);
        ed= (EditText) findViewById(R.id.txtDireccionIP);
        tb= (ToggleButton) findViewById(R.id.tbtnConectar);
        td.setText("IP: ");
        te.setText("Desconectado");

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked==true){
                    te.setText("Conectando a");
                    td.setText("IP: "+ ed.getText());
                }
                else {

                    te.setText("Desconectado");
                    td.setText("IP: ");
                }
            }
        });


        s1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
               ts1.setText("" + progress);
               vs1 = progress;
               mensaje();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        s2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ts2.setText("" + progress);
                vs2 = progress;
                mensaje();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        s3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ts3.setText("" + progress);
                vs3 = progress;
                mensaje();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        s4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ts4.setText("" + progress);
                vs4 = progress;
                mensaje();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        s5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                ts5.setText("" + progress);
                vs5 = progress;
                mensaje();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });








    }



    public void mensaje() {
        //byte b =(byte) 126;
        byte[] b = {(byte) 126,(byte) vs1, (byte) vs2, (byte) vs3, (byte) vs4, (byte) vs5};
        String s="";

        String s1=""+vs1+" "+ vs2 + " "+ vs3 + " "+ vs4 + " "+ vs5;

        try {
            s = new String(b, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        tvd.setText("Datos: "+s1);
        tvdc.setText(s);
/*
        if (mTcpClient != null) {
            mTcpClient.sendMessage(s);
            IP.setText(mTcpClient.conection());
        }
        */
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
