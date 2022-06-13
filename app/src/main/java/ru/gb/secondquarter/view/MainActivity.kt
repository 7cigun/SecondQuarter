package ru.gb.secondquarter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.gb.secondquarter.R
import ru.gb.secondquarter.view.picture.PictureOfTheDayFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction().replace(R.id.container,PictureOfTheDayFragment.newInstance()).commit()
        }
    }
}