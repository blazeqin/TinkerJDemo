package com.tinker.tinkerjdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.meituan.android.walle.WalleChannelReader;
import com.tinkerpatch.sdk.TinkerPatch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ((TextView) findViewById(R.id.textview)).setText("have patched..............");
        TinkerPatch.with().fetchPatchUpdate(true);
        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TinkerPatch.with().fetchPatchUpdate(true);
            }
        });

        ((Button) findViewById(R.id.button)).setText(WalleChannelReader.getChannel(getApplicationContext()));
    }
}
