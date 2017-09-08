package kr.co.tjeit.pushtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.firebase.iid.FirebaseInstanceId;

public class MainActivity extends AppCompatActivity {

    private android.widget.TextView tokenTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tokenTxt = (TextView) findViewById(R.id.tokenTxt);

        tokenTxt.setText(FirebaseInstanceId.getInstance().getToken());
    }
}
