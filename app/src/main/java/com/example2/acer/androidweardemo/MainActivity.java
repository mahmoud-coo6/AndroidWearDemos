package com.example2.acer.androidweardemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    public void sayHello(View view){
        Toast.makeText(getApplicationContext(),"Hi!",Toast.LENGTH_LONG).show();
    }

   // private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
         //       mTextView = (TextView) stub.findViewById(R.id.text);

                /*
                 if (findViewById(R.id.rect_layout) != null){
                   // we have rectangular layout
                 }else{
                     // we have round layout
                 }
                 */
            }
        });
    }
}
