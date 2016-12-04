package com.maxbassoul.at3jokenpo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    int placarJogador = 0;
    int placarComputador = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telainicial);
    }
    public void pedra (View view){
        int escolhaComputador = (int) (Math.random()*3)+1;

        if(escolhaComputador == 1){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);

            Toast.makeText(
                 MainActivity.this,
                    "Ops, deu empate!",
                    Toast.LENGTH_SHORT
            ).show();
        }else if(escolhaComputador == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);

            placarComputador++;
            TextView pontos = (TextView) findViewById(R.id.placarComputador);
            pontos.setText(String.valueOf(this.placarComputador));

        }else if(escolhaComputador == 3){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);

            placarJogador++;
            TextView pontos = (TextView) findViewById(R.id.placarJogador);
            pontos.setText(String.valueOf(this.placarJogador));
        }

    }
    public void papel (View view){
        int escolhaComputador = (int) (Math.random()*3)+1;

        if(escolhaComputador == 1){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);
        }else if(escolhaComputador == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);
        }else if(escolhaComputador == 3){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);
        }

    }
    public void tesoura (View view){
        int escolhaComputador = (int) (Math.random()*3)+1;

        if(escolhaComputador == 1){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);
        }else if(escolhaComputador == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);
        }else if(escolhaComputador == 3){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);
        }

    }

}
