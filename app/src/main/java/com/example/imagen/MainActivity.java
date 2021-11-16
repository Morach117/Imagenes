package com.example.imagen;

import androidx.appcompat.app.AppCompatActivity;
//Importamos las clases

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {

    //Declaramos los elementos de nuestra vista

    Button btn1, btn2;
    TextView nombre;
    ImageView imagen;

    //Asignamos la ubicación de nuestras imagenes
    int []fotoid={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e};

    //ponemos los nombres de nuestras imagenes
    String []texto={"Me sirve", "Amlo pelon", "Un wey", "cj","un hermoso"};
    int i=0;
    int total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaramos los elementos con su id
        btn1= findViewById(R.id.anterior);
        btn2= findViewById(R.id.siguiente);
        nombre= findViewById(R.id.nombre);
        imagen= findViewById(R.id.image);

        //llamamos a los metodos para que reciban parametros

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        //definimos el id de nuestro recurso
        int id=view.getId();

        //creamos las condiciones para navegar con los botones
        if (id==R.id.siguiente){
            i++;
            if (i==total){
                i=0;
            }
        }
        if(id==R.id.anterior){
            i--;
            if(i==-1) i=total-1;
        }
        imagen.setImageResource(fotoid[i]);
        nombre.setText(texto[i]);

    }
}