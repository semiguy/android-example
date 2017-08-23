package com.example.daemonservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startButton = (Button) this.findViewById(R.id.startbutton);
        startButton.setOnClickListener(this);

        Button stopButton = (Button)this.findViewById(R.id.stopbutton);
        stopButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Intent intent = null;

        switch (v.getId())
        {
            case R.id.startbutton:
                intent = new Intent(this, DaemonService.class);
                startService(intent);
                break;
            case R.id.stopbutton:
                intent = new Intent(this, DaemonService.class);
                this.stopService(intent);
                break;
            default:
                break;
        }
    }
}
