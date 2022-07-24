package br.com.apps_1_tarefa_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    public static final String MESSAGE_NEXT_SCREEN = "MESSAGE_NEXT_SCREEN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        String prisioneiroAcordado = intent.getStringExtra(MainActivity2.PRISIONEIRO_STATE);
        String arqueiroAcordado = intent.getStringExtra(MainActivity2.ARQUEIRO_STATE);
        String cavaleiroAcordado = intent.getStringExtra(MainActivity2.CAVALEIRO_STATE);
        String tipoVerificacao = intent.getStringExtra(MainActivity2.TIPO_VERIFICACAO);

        if((tipoVerificacao).equals("ESPIAR")) {
            String message;
            if((arqueiroAcordado).equals("true")) {
                message = "O Arqueiro está acordado";
            } else {
                message = "O arqueiro não está acordado, o cavaleiro está acordado? " + cavaleiroAcordado +
                        ", o prisioneiro está acordado? " + prisioneiroAcordado;
            }
            TextView textView = findViewById(R.id.textView);
            textView.setText(message);
        } else {
            if(prisioneiroAcordado.equals("false")) {
                String message = "";
                TextView textView = findViewById(R.id.textView);
                textView.setText(message);
            } else if((cavaleiroAcordado).equals("true")) {
                String message = "O cavaleiro está acordado!";
                TextView textView = findViewById(R.id.textView);
                textView.setText(message);
            } else {
                String message = "O cavaleiro não está acordado, o prisioneiro está acordado, e o arqueiro está acordado? " +
                        arqueiroAcordado;
                TextView textView = findViewById(R.id.textView);
                textView.setText(message);
            }
        }
    }
    public void actionAttack(View view){
        Intent intent = getIntent();
        String cavaleiroAcordado = intent.getStringExtra(MainActivity2.CAVALEIRO_STATE);
        if((cavaleiroAcordado).equals("true")) {
            Intent intent5 = new Intent(this, MainActivity5.class);
            String messageScreenFive = "O cavaleiro está acordado! Seu ataque falhou!";
            intent5.putExtra(MESSAGE_NEXT_SCREEN, messageScreenFive);
            startActivity(intent5);
        } else {
            Intent intent4 = new Intent(this, MainActivity4.class);
            String messageScreenFour = "O cavaleiro nao esta acordado! Seu ataque foi bem sucedido!";
            intent4.putExtra(MESSAGE_NEXT_SCREEN, messageScreenFour);
            startActivity(intent4);
        }

    }

    public void actionFreePrisoner(View view){
        Intent intent = getIntent();
        String prisioneiroAcordado = intent.getStringExtra(MainActivity2.PRISIONEIRO_STATE);
        String arqueiroAcordado = intent.getStringExtra(MainActivity2.ARQUEIRO_STATE);
        if(((arqueiroAcordado).equals("true"))) {
            Intent intent5 = new Intent(this, MainActivity5.class);
            String messageScreenFive = "O arqueiro esta acordado ou o prisioneiro nao esta acordado! Seu ataque falhou!";
            intent5.putExtra(MESSAGE_NEXT_SCREEN, messageScreenFive);
            startActivity(intent5);
        } else {
            Intent intent4 = new Intent(this, MainActivity4.class);
            String messageScreenFour = "O cavaleiro nao esta acordado! Seu ataque foi bem sucedido!";
            intent4.putExtra(MESSAGE_NEXT_SCREEN, messageScreenFour);
            startActivity(intent4);
        }
    }
}