package com.example.postales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but = (Button)findViewById(R.id.button2);

        final EditText edt = (EditText)findViewById(R.id.editText2);

        but.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(MainActivity.this, Postales.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("SALUDO", edt.getText().toString());
                        intent.putExtras(bundle);
                        startActivity(intent);
                    }
                }

        );
    }
}
