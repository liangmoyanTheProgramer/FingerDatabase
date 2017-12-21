package io.github.liang.moyan.development.android.fingerdatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class FingerActivity extends AppCompatActivity {
    Toolbar toolbar = findViewById(R.id.toolbar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finger);



    }
}
