package com.example.toolbar

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  val  binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

     binding.favoriteslayout.setOnClickListener {
         Toast.makeText(this, "1", Toast.LENGTH_SHORT).show()
     }

        binding.editlayout.setOnClickListener {
            Toast.makeText(this, "2", Toast.LENGTH_SHORT).show()
        }

        binding.shareLayout.setOnClickListener {
            Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
        }

        binding.morelayout.setOnClickListener {
            Toast.makeText(this, "4", Toast.LENGTH_SHORT).show()
        }



    }
}