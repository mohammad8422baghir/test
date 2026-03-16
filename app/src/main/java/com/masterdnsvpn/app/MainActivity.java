package com.masterdnsvpn.app;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("🚀 MasterDnsVPN Engine is Ready!");
        tv.setTextSize(24);
        tv.setTextColor(Color.parseColor("#007BFF"));
        tv.setGravity(Gravity.CENTER);
        setContentView(tv);
    }
}
