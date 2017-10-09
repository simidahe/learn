package com.example.lucas.lubo_1507b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnJump;
    private static final String TGC = "hello";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBtnShow();
    }
    private void initBtnShow() {
        btnJump = (Button) findViewById(R.id.btn_jump);
        btnJump.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_jump:
                Intent intent = new Intent(this, Main2Activity.class);
                intent.putExtra("TGC","I'm coming");
                startActivity(intent);
                this.finish();
                break;

        }

    }
}
