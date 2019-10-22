package me.josiasemanuel.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Click on button event
        val rollButon: Button = findViewById(R.id.roll_button)
        rollButon.text = "Let's roll"
    }
}
