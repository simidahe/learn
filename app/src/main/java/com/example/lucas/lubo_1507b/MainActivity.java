package com.example.lucas.lubo_1507b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnJump;
    public static final String TGC = "hello";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBtnShow();
        Intent intent = this.getIntent();
        Toast.makeText(this,intent.getStringExtra(Main2Activity.TCC),Toast.LENGTH_SHORT).show();
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
                intent.putExtra(TGC,"I'm coming");
                startActivity(intent);
                this.finish();
                break;

        }

    }
}
