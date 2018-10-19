package edu.android.temproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.btnTest);
        editText = findViewById(R.id.editText);

    }

    public void ChangeText(View view) {
    String text = editText.getText().toString();
    textView.setText(text);

    }
}
