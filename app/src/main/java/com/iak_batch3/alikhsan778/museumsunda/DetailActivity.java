package com.iak_batch3.alikhsan778.museumsunda;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setupToolBar();
        Bundle bundle = getIntent().getExtras();
        TextView namavalue = (TextView)findViewById(R.id.nama_value);
        TextView emailvalue = (TextView)findViewById(R.id.email_value);
        TextView hpvalue = (TextView)findViewById(R.id.phone_value);
        TextView tiketValue = (TextView)findViewById(R.id.nama_tiket_value);
        TextView hargaTiket = (TextView)findViewById(R.id.harga_tiket);
        namavalue.setText(bundle.getCharSequence("data1"));
        emailvalue.setText(bundle.getCharSequence("data2"));
        hpvalue.setText(bundle.getCharSequence("data3"));
        String harga = Integer.toString(bundle.getInt("data4"));
        hargaTiket.setText("Rp. "+harga);
        tiketValue.setText(bundle.getCharSequence("data5"));


    }
    private void setupToolBar(){
        Toolbar toolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolBar);
        final ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setTitle("INFORMATION ORDER");


    }
    public void buttonMinus(View view){
        if (count ==0){
            count = 0;
            display();

        }
        else if (count>0){
            count = count - 1;
            display();
        }

    }
    public void buttonPlus (View view){
        count = count + 1;
        display();

    }
    public void display(){
        Bundle bundle = getIntent().getExtras();
        TextView textQuan = (TextView)findViewById(R.id.quantity);
        TextView hargaTotal = (TextView)findViewById(R.id.harga_total);
        textQuan.setText(Integer.toString(count));
        int total = count*bundle.getInt("data4");
        hargaTotal.setText("Rp. "+Integer.toString(total));


    }
    public void buttonSubmit(View view){
        if (count>0) {
            TextView tiketValue = (TextView) findViewById(R.id.nama_tiket_value);
            Intent i = new Intent(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("mailto: " + tiketValue.getText().toString()));
            i.putExtra(Intent.EXTRA_SUBJECT, "Order " + tiketValue.getText().toString());
            i.putExtra(Intent.EXTRA_TEXT, displayMessage());
            if (i.resolveActivity(getPackageManager()) != null) {
                startActivity(i);
            }
        }
        else if (count==0){
            Toast.makeText(getApplicationContext(), "Order ticket is 0, Please select quantity order ticket to continue submit", Toast.LENGTH_LONG).show();
        }

    }
    public void buttonSubmit2(View view){
        if (count>0) {
            TextView tiketValue = (TextView) findViewById(R.id.nama_tiket_value);
            Intent i = new Intent(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("mailto: " + tiketValue.getText().toString()));
            i.putExtra(Intent.EXTRA_SUBJECT, "Order " + tiketValue.getText().toString());
            i.putExtra(Intent.EXTRA_TEXT, displayMessage());
            if (i.resolveActivity(getPackageManager()) != null) {
                startActivity(i);
            }
        }
        else if (count==0){
            Toast.makeText(getApplicationContext(), "Order ticket is 0, Please select quantity order ticket to continue submit", Toast.LENGTH_LONG).show();
        }

    }
    public  String displayMessage(){
        TextView namaValue = (TextView)findViewById(R.id.nama_value);
        TextView textQuan = (TextView)findViewById(R.id.quantity);
        TextView tiketValue = (TextView)findViewById(R.id.nama_tiket_value);
        String message = "Dear Admin,";
        message+="\n\nMy name is "+namaValue.getText().toString();
        message+=", I want to order tiket "+tiketValue.getText().toString();
        message+=", for "+textQuan.getText().toString()+" ticket";
        message+="\nState for balance is payment";
        message+="\n\nRegard,\nMuseum Sunda";
        return message;


    }
}
