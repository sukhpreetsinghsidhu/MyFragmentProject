package com.example.myfragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val frag1 : Button = findViewById(R.id.frag1)
        val frag2 : Button = findViewById(R.id.frag2)

        frag1.setOnClickListener{
            setFragment(BlankFragment())
        }

        frag2.setOnClickListener{
            setFragment(BlankFragment2())
        }
    }
    fun setFragment(fragment : Fragment){
        var fm = supportFragmentManager
        var ft = fm.beginTransaction()
        ft.replace(R.id.conatiner,  fragment)
        ft.commit()
    }
}