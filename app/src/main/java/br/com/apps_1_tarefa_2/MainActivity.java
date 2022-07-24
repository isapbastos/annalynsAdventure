package br.com.apps_1_tarefa_2;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {
    public static final String CAVALEIRO_STATE = "CAVALEIRO_STATE";
    public static final String ARQUEIRO_STATE = "ARQUEIRO_STATE";
    public static final String PRISIONEIRO_STATE = "PRISIONEIRO_STATE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View view){
        Intent intent = new Intent(this, MainActivity2.class);

        Switch cavaleiroSwitch = (Switch) findViewById(R.id.cavaleiroSwitch);
        String cavaleiroState = String.valueOf(cavaleiroSwitch.isChecked());
        intent.putExtra(CAVALEIRO_STATE, cavaleiroState);

        Switch prisioneiroSwitch = (Switch) findViewById(R.id.prisioneiroSwitch);
        String prisioneiroState = String.valueOf(prisioneiroSwitch.isChecked());
        intent.putExtra(PRISIONEIRO_STATE, prisioneiroState);

        Switch arqueiroSwitch = (Switch) findViewById(R.id.arqueiroSwitch);
        String arqueiroState = String.valueOf(arqueiroSwitch.isChecked());
        intent.putExtra(ARQUEIRO_STATE, arqueiroState);

        startActivity(intent);
    }
}