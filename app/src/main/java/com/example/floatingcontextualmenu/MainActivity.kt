package com.example.floatingcontextualmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

     lateinit var imageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById<ImageView>(R.id.imageView)

        registerForContextMenu(imageView)

    }


    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {

        menuInflater.inflate(R.menu.float_menu,menu)
        super.onCreateContextMenu(menu, v, menuInfo)
    }
}