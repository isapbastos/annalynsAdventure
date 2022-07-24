package br.com.apps_1_tarefa_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    public static final String MESSAGE_FINAL = "MESSAGE_FINAL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        String messagefinal = intent.getStringExtra(MainActivity3.MESSAGE_NEXT_SCREEN);
        TextView textView = findViewById(R.id.textView);
        textView.setText(messagefinal);
    }

    public void voltar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}