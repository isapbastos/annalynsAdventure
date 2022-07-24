package br.com.apps_1_tarefa_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String CAVALEIRO_STATE = "CAVALEIRO_STATE";
    public static final String ARQUEIRO_STATE = "ARQUEIRO_STATE";
    public static final String PRISIONEIRO_STATE = "PRISIONEIRO_STATE";
    public static final String TIPO_VERIFICACAO = "TIPO_VERIFICACAO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void checkSpy(View view){
        Intent intent = getIntent();
        String prisioneiroState = intent.getStringExtra(MainActivity.PRISIONEIRO_STATE);
        String arqueiroState = intent.getStringExtra(MainActivity.ARQUEIRO_STATE);
        String cavaleiroState = intent.getStringExtra(MainActivity.CAVALEIRO_STATE);
        Intent intent2 = new Intent(this, MainActivity3.class);
        String tipoVerificacao = "ESPIAR";
        intent2.putExtra(TIPO_VERIFICACAO, tipoVerificacao);
        intent2.putExtra(CAVALEIRO_STATE, cavaleiroState);
        intent2.putExtra(PRISIONEIRO_STATE, prisioneiroState);
        intent2.putExtra(ARQUEIRO_STATE, arqueiroState);
        startActivity(intent2);
    }

    public void checkSignal(View view){
        Intent intent = getIntent();
        String prisioneiroState = intent.getStringExtra(MainActivity.PRISIONEIRO_STATE);
        String arqueiroState = intent.getStringExtra(MainActivity.ARQUEIRO_STATE);
        String cavaleiroState = intent.getStringExtra(MainActivity.CAVALEIRO_STATE);
        Intent intent2 = new Intent(this, MainActivity3.class);
        String tipoVerificacao = "ASSOVIAR";
        intent2.putExtra(TIPO_VERIFICACAO, tipoVerificacao);
        intent2.putExtra(CAVALEIRO_STATE, cavaleiroState);
        intent2.putExtra(PRISIONEIRO_STATE, prisioneiroState);
        intent2.putExtra(ARQUEIRO_STATE, arqueiroState);
        startActivity(intent2);
    }
}