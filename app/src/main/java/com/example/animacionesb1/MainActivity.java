package com.example.animacionesb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Atributos -> Vistas
    private ImageView ivImagen;
    private Button btnAnimar;

    //Atributos -> Animaciones
    private Animation leftRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        inicializarAnimaciones();
    }

    private void inicializarAnimaciones() {
        leftRight = AnimationUtils.loadAnimation(
                this,
                R.anim.left_right
                );
        leftRight.setDuration(5000);
    }

    private void inicializarVistas() {
        ivImagen = findViewById(R.id.ivImagen);
        btnAnimar = findViewById(R.id.btnAnimar);
    }
}