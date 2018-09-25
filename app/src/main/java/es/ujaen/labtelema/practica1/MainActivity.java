package es.ujaen.labtelema.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO Añadir algo aquí
        Log.d("ARRANCANDO","La aplicación móvil se está iniciando");
    }
}
