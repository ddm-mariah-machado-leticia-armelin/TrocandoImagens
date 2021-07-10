package com.example.trocandoimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;

public class MainActivity extends AppCompatActivity {

    private View imgParis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imgParis.setOnClickListener (new EscutadorBotao());

    }

    private class EscutadorBotao implements View.OnClickListener {
        private ImageSwitcher imgParis;

        @Override
        public void onClick(View view) {
            Button b = (Button) view;
            switch ( b.getId() ) {
                case R.id.btnParis:
                    imgParis.setImageResource(R.drawable.paris);
                    break;
                case R.id.btnToscana:
                    imgParis.setImageResource(R.drawable.toscana);
                    break;
                case R.id.btnMykonos:
                    imgParis.setImageResource(R.drawable.mykonos);
                    break;
            }
        }
    }


    // Dupla: Maria Helena e Letícia Armelin
}