package com.example.lucas.lubo_1507b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    private Button btnBack;
    public static final String TCC = "hoho";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = this.getIntent();
        Toast.makeText(this,intent.getStringExtra(MainActivity.TGC),Toast.LENGTH_SHORT).show();

        initBtnShow();
    }

    private void initBtnShow() {
       btnBack = (Button) findViewById(R.id.btn_second);
        btnBack.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btn_second:
                intent = new Intent(this,MainActivity.class);
                intent.putExtra(TCC,"I'm back");
                startActivity(intent);
                this.finish();
                break;

        }
    }
}
