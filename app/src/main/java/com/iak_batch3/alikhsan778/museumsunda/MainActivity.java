package com.iak_batch3.alikhsan778.museumsunda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupToolBar();
    }

    public void buttonStart(View view) {
        diplayValidasi();

    }

    public void diplayValidasi() {
        boolean validasi = true;
        TextView name = (TextView) findViewById(R.id.edit_name);
        TextView email = (TextView) findViewById(R.id.edit_email);
        TextView handphone = (TextView) findViewById(R.id.edit_hp);
        if (TextUtils.isEmpty(name.getText().toString())) {
            validasi = false;
            name.setError("Required");
        }
        if (TextUtils.isEmpty(email.getText().toString())) {
            validasi = false;
            email.setError("Required");
        }
        if (TextUtils.isEmpty(handphone.getText().toString())) {
            validasi = false;
            handphone.setError("Required");
        }
        if (validasi) {
            String gt_name = name.getText().toString();
            String gt_email = email.getText().toString();
            String gt_handphone = handphone.getText().toString();

            CheckBox cb = (CheckBox) findViewById(R.id.checkbox_agree);

            if (cb.isChecked()) {
                Bundle bundle = new Bundle();
                bundle.putString("data1",gt_name);
                bundle.putString("data2",gt_email);
                bundle.putString("data3",gt_handphone);
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                homeIntent.putExtras(bundle);
                MainActivity.this.startActivity(homeIntent);
                Toast.makeText(getApplicationContext(), "Welcome To Museum Sunda Mrs/Ms " + gt_name, Toast.LENGTH_LONG).show();
            }
        }
    }

    private void setupToolBar() {
        Toolbar toolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        final ActionBar ab = getSupportActionBar();
        ab.setTitle(R.string.tittle_activity_main);

    }
}
