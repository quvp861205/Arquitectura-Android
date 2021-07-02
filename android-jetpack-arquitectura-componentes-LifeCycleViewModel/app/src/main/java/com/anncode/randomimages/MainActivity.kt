package com.anncode.randomimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.lifecycle.ViewModelProviders
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imagePhoto: ImageView = findViewById(R.id.ivImagen1)
        var imagePhoto2: ImageView = findViewById(R.id.ivImagen2)
        var button: Button = findViewById(R.id.btnObserver)

        // Instancia la clase que obtiene la url de las imagenes aleatorias
        // pero cada vez que se gira el telefono cambia de imagen
        // debido a que no tiene consistencia cada vez que el estado de la app cambia
        //var model: MainActivityViewModel = MainActivityViewModel()

        // con viewmodelproviders persiste los datos a pesar que el estado de la app cambie
        var model = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        Picasso.get().load(model.callUrlImage()).into(imagePhoto)



    }
}
