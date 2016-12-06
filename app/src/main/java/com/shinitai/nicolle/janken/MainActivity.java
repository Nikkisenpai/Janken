package com.shinitai.nicolle.janken;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
public class MainActivity extends ActionBarActivity {

    int placarJogador = 0;
    int placarComputador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telainicial);
    }
    public void pedra (View View)
    {
        int escolhaComputador =(int) (Math.random()*3)+1;
        if(escolhaComputador == 1)
        {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.guu);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.guu);
        }
        else if (escolhaComputador == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.guu);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.paa);

            placarComputador++;

            TextView pontos = (TextView) findViewById(R.id.placarcomputador);
            pontos.setText(String.valueOf(this.placarComputador));
        }
        else {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.guu);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.choki);

            placarJogador++;

            TextView pontos = (TextView) findViewById(R.id.placarjogador);
            pontos.setText(String.valueOf(this.placarJogador));
        }
    }
    public void papel (View View)
    {
        int escolhaComputador =(int) (Math.random()*3)+1;
        if(escolhaComputador == 1)
        {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.paa);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.guu);

            placarJogador++;

            TextView pontos = (TextView) findViewById(R.id.placarjogador);
            pontos.setText(String.valueOf(this.placarJogador));
        }
        else if (escolhaComputador == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.paa);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.paa);
        }
        else {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.paa);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.choki);

            placarComputador++;

            TextView pontos = (TextView) findViewById(R.id.placarcomputador);
            pontos.setText(String.valueOf(this.placarComputador));
        }
    }
    public void tesoura (View View)
    {
        int escolhaComputador =(int) (Math.random()*3)+1;
        if(escolhaComputador == 1)
        {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.choki);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.guu);

            placarComputador++;

            TextView pontos = (TextView) findViewById(R.id.placarcomputador);
            pontos.setText(String.valueOf(this.placarComputador));
        }
        else if (escolhaComputador == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.choki);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.paa);

            placarJogador++;

            TextView pontos = (TextView) findViewById(R.id.placarjogador);
            pontos.setText(String.valueOf(this.placarJogador));
        }
        else {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.choki);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.choki);
        }
    }
}
