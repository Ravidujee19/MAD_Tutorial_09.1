package com.example.tute09_part01

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview:TextView=findViewById(R.id.textView)
        val button: Button =findViewById(R.id.button)

        CoroutineScope(Dispatchers.Main).launch {
            var count=0

            while(true){
                textview.text= "$count"

                count++
                delay(1000)
            }
        }

        button.setOnClickListener{
            Toast.makeText(this,"This ui is not stuck",Toast.LENGTH_SHORT).show()
            //Thread.sleep(1000)
        }
    }
}

//replace the while loop and check
/*while(true){
    var count=0
    Thread.sleep(1000)
    textview.text= "$count"
    count++
}*/
