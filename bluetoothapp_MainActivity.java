package com.example.bluetoothapp;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button b1,b2;
    BluetoothAdapter ba;
    private boolean bluetooth = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 =(Button)findViewById(R.id.button);
        b2 =(Button)findViewById(R.id.button2);

        ba =BluetoothAdapter.getDefaultAdapter();

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ba.enable();
                bluetooth = true;
                Toast.makeText(MainActivity.this, "openning bluetooth", Toast.LENGTH_SHORT).show();

            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ba.disable();
                bluetooth = false;
                Toast.makeText(MainActivity.this,"closing bluetooth",Toast.LENGTH_SHORT).show();

            }
        });


    }
}