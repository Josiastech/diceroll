package me.josiasemanuel.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Click on button event
        val rollButon: Button = findViewById(R.id.roll_button)
        rollButon.text = "Let's roll"

        // show a toas when button is clicked
        rollButon.setOnClickListener{
            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
