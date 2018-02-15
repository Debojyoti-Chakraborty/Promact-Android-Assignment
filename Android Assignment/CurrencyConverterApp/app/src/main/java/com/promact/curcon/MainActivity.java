package com.promact.curcon;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    public void clearAll()
    {
        EditText clear=findViewById(R.id.editText);
        clear.getText().clear();
        clear.setError(null);
        clear=findViewById(R.id.editText2);
        clear.getText().clear();
        clear.setError(null);
        clear=findViewById(R.id.editText3);
        clear.getText().clear();
        clear.setError(null);
        clear=findViewById(R.id.editText4);
        clear.getText().clear();
        clear.setError(null);
        clear=findViewById(R.id.editText5);
        clear.getText().clear();
        clear.setError(null);
        clear=findViewById(R.id.editText6);
        clear.getText().clear();
        clear.setError(null);
        clear=findViewById(R.id.editText7);
        clear.getText().clear();
        clear.setError(null);
        clear=findViewById(R.id.editText8);
        clear.getText().clear();
        clear.setError(null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        clearAll();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.editText);

                String err=input.getText().toString();
                if(TextUtils.isEmpty(err))
                {
                    input.setError("Must Enter a Value!");
                    return;
                }
                else{
                    input.setError(null);
                }
                double value = Double.parseDouble(input.getText().toString());

                clearAll();
                double myr=value*1;
                EditText output=findViewById(R.id.editText);
                output.setText(Double.toString(myr));

                double usd=value*0.2555;
                EditText output1=findViewById(R.id.editText3);
                output1.setText(Double.toString(usd));

                double inr=value*16.4344;
                EditText output2=findViewById(R.id.editText2);
                output2.setText(Double.toString(inr));

                double bhd=value*0.0961;
                EditText output3=findViewById(R.id.editText4);
                output3.setText(Double.toString(bhd));

                double rub=value*14.6633;
                EditText output4=findViewById(R.id.editText5);
                output4.setText(Double.toString(rub));

                double huf=value*64.1226;
                EditText output5=findViewById(R.id.editText6);
                output5.setText(Double.toString(huf));

                double jpy=value*27.8328;
                EditText output6=findViewById(R.id.editText7);
                output6.setText(Double.toString(jpy));

                double chf=0.2388;
                EditText output7=findViewById(R.id.editText8);
                output7.setText(Double.toString(chf));

            }
        });
        ImageButton button2 = findViewById(R.id.button);

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.editText2);
                String err=input.getText().toString();
                if(TextUtils.isEmpty(err))
                {
                    input.setError("Must Enter a Value!");
                    return;
                }
                else{
                    input.setError(null);
                }
                double value = Double.parseDouble(input.getText().toString());

                clearAll();
                double myr=value*0.0608;
                EditText output=findViewById(R.id.editText);
                output.setText(Double.toString(myr));

                double usd=value*0.0155;
                EditText output1=findViewById(R.id.editText3);
                output1.setText(Double.toString(usd));

                double inr=value*1;
                EditText output2=findViewById(R.id.editText2);
                output2.setText(Double.toString(inr));

                double bhd=value*0.0058;
                EditText output3=findViewById(R.id.editText4);
                output3.setText(Double.toString(bhd));

                double rub=value*0.8941;
                EditText output4=findViewById(R.id.editText5);
                output4.setText(Double.toString(rub));

                double huf=value*3.9019;
                EditText output5=findViewById(R.id.editText6);
                output5.setText(Double.toString(huf));

                double jpy=value*1.6932;
                EditText output6=findViewById(R.id.editText7);
                output6.setText(Double.toString(jpy));

                double chf=0.0145;
                EditText output7=findViewById(R.id.editText8);
                output7.setText(Double.toString(chf));

            }
        });
        ImageButton button3 = findViewById(R.id.button2);

        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.editText3);
                String err=input.getText().toString();
                if(TextUtils.isEmpty(err))
                {
                    input.setError("Must Enter a Value!");
                    return;
                }
                else{
                    input.setError(null);
                }
                double value = Double.parseDouble(input.getText().toString());
                clearAll();
                double myr=value*3.9126;
                EditText output=findViewById(R.id.editText);
                output.setText(Double.toString(myr));

                double usd=value*1;
                EditText output1=findViewById(R.id.editText3);
                output1.setText(Double.toString(usd));

                double inr=value*64.2903;
                EditText output2=findViewById(R.id.editText2);
                output2.setText(Double.toString(inr));

                double bhd=value*0.376;
                EditText output3=findViewById(R.id.editText4);
                output3.setText(Double.toString(bhd));

                double rub=value*57.4481;
                EditText output4=findViewById(R.id.editText5);
                output4.setText(Double.toString(rub));

                double huf=value*250.8708;
                EditText output5=findViewById(R.id.editText6);
                output5.setText(Double.toString(huf));

                double jpy=value*108.9071;
                EditText output6=findViewById(R.id.editText7);
                output6.setText(Double.toString(jpy));

                double chf=0.9339;
                EditText output7=findViewById(R.id.editText8);
                output7.setText(Double.toString(chf));

            }
        });
        ImageButton button4 = findViewById(R.id.button3);

        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.editText4);
                String err=input.getText().toString();
                if(TextUtils.isEmpty(err))
                {
                    input.setError("Must Enter a Value!");
                    return;
                }
                else{
                    input.setError(null);
                }
                double value = Double.parseDouble(input.getText().toString());

                clearAll();
                double myr=value*10.4095;
                EditText output=findViewById(R.id.editText);
                output.setText(Double.toString(myr));

                double usd=value*2.6595;
                EditText output1=findViewById(R.id.editText3);
                output1.setText(Double.toString(usd));

                double inr=value*170.895;
                EditText output2=findViewById(R.id.editText2);
                output2.setText(Double.toString(inr));

                double bhd=value*1;
                EditText output3=findViewById(R.id.editText4);
                output3.setText(Double.toString(bhd));

                double rub=value*152.6186;
                EditText output4=findViewById(R.id.editText5);
                output4.setText(Double.toString(rub));

                double huf=value*666.9613;
                EditText output5=findViewById(R.id.editText6);
                output5.setText(Double.toString(huf));

                double jpy=value*289.5963;
                EditText output6=findViewById(R.id.editText7);
                output6.setText(Double.toString(jpy));

                double chf=value*2.4839;
                EditText output7=findViewById(R.id.editText8);
                output7.setText(Double.toString(chf));

            }
        });
        ImageButton button5 = findViewById(R.id.button4);

        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.editText5);
                String err=input.getText().toString();
                if(TextUtils.isEmpty(err))
                {
                    input.setError("Must Enter a Value!");
                    return;
                }
                else{
                    input.setError(null);
                }
                double value = Double.parseDouble(input.getText().toString());

                clearAll();
                double myr=value*0.0682;
                EditText output=findViewById(R.id.editText);
                output.setText(Double.toString(myr));

                double usd=value*0.01742;
                EditText output1=findViewById(R.id.editText3);
                output1.setText(Double.toString(usd));

                double inr=value*1.1197;
                EditText output2=findViewById(R.id.editText2);
                output2.setText(Double.toString(inr));

                double bhd=value*0.0065;
                EditText output3=findViewById(R.id.editText4);
                output3.setText(Double.toString(bhd));

                double rub=value*1;
                EditText output4=findViewById(R.id.editText5);
                output4.setText(Double.toString(rub));

                double huf=value*4.3702;
                EditText output5=findViewById(R.id.editText6);
                output5.setText(Double.toString(huf));

                double jpy=value*1.8977;
                EditText output6=findViewById(R.id.editText7);
                output6.setText(Double.toString(jpy));

                double chf=value*0.0163;
                EditText output7=findViewById(R.id.editText8);
                output7.setText(Double.toString(chf));

            }
        });
        ImageButton button6 = findViewById(R.id.button5);

        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.editText6);
                String err=input.getText().toString();
                if(TextUtils.isEmpty(err))
                {
                    input.setError("Must Enter a Value!");
                    return;
                }
                else{
                    input.setError(null);
                }
                double value = Double.parseDouble(input.getText().toString());

                clearAll();
                double myr=value*0.0156;
                EditText output=findViewById(R.id.editText);
                output.setText(Double.toString(myr));

                double usd=value*0.0032;
                EditText output1=findViewById(R.id.editText3);
                output1.setText(Double.toString(usd));

                double inr=value*0.2561;
                EditText output2=findViewById(R.id.editText2);
                output2.setText(Double.toString(inr));

                double bhd=value*0.0014;
                EditText output3=findViewById(R.id.editText4);
                output3.setText(Double.toString(bhd));

                double rub=value*0.2288;
                EditText output4=findViewById(R.id.editText5);
                output4.setText(Double.toString(rub));

                double huf=value*1;
                EditText output5=findViewById(R.id.editText6);
                output5.setText(Double.toString(huf));

                double jpy=value*0.4344;
                EditText output6=findViewById(R.id.editText7);
                output6.setText(Double.toString(jpy));

                double chf=value*0.0037;
                EditText output7=findViewById(R.id.editText8);
                output7.setText(Double.toString(chf));

            }
        });
        ImageButton button7 = findViewById(R.id.button6);

        button7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.editText7);
                String err=input.getText().toString();
                if(TextUtils.isEmpty(err))
                {
                    input.setError("Must Enter a Value!");
                    return;
                }
                else{
                    input.setError(null);
                }
                double value = Double.parseDouble(input.getText().toString());
                clearAll();
                double myr=value*0.0358;
                EditText output=findViewById(R.id.editText);
                output.setText(Double.toString(myr));

                double usd=value*0.0091;
                EditText output1=findViewById(R.id.editText3);
                output1.setText(Double.toString(usd));

                double inr=value*0.587;
                EditText output2=findViewById(R.id.editText2);
                output2.setText(Double.toString(inr));

                double bhd=value*0.0034;
                EditText output3=findViewById(R.id.editText4);
                output3.setText(Double.toString(bhd));

                double rub=value*0.5221;
                EditText output4=findViewById(R.id.editText5);
                output4.setText(Double.toString(rub));

                double huf=value*2.2851;
                EditText output5=findViewById(R.id.editText6);
                output5.setText(Double.toString(huf));

                double jpy=value*1;
                EditText output6=findViewById(R.id.editText7);
                output6.setText(Double.toString(jpy));

                double chf=value*0.0085;
                EditText output7=findViewById(R.id.editText8);
                output7.setText(Double.toString(chf));

            }
        });
        ImageButton button8 = findViewById(R.id.button7);

        button8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText input = findViewById(R.id.editText8);
                String err=input.getText().toString();
                if(TextUtils.isEmpty(err))
                {
                    input.setError("Must Enter a Value!");
                    return;
                }else{
                    input.setError(null);
                }

                double value = Double.parseDouble(input.getText().toString());

                clearAll();
                double myr=value*4.1875;
                EditText output=findViewById(R.id.editText);
                output.setText(Double.toString(myr));

                double usd=value*1.0706;
                EditText output1=findViewById(R.id.editText3);
                output1.setText(Double.toString(usd));

                double inr=value*68.7123;
                EditText output2=findViewById(R.id.editText2);
                output2.setText(Double.toString(inr));

                double bhd=value*0.4025;
                EditText output3=findViewById(R.id.editText4);
                output3.setText(Double.toString(bhd));

                double rub=value*61.2213;
                EditText output4=findViewById(R.id.editText5);
                output4.setText(Double.toString(rub));

                double huf=value*267.7758;
                EditText output5=findViewById(R.id.editText6);
                output5.setText(Double.toString(huf));

                double jpy=value*116.6162;
                EditText output6=findViewById(R.id.editText7);
                output6.setText(Double.toString(jpy));

                double chf=value*1;
                EditText output7=findViewById(R.id.editText8);
                output7.setText(Double.toString(chf));

            }
        });
    }


}
