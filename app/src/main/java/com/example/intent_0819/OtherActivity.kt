package com.example.intent_0819

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_0819.databinding.ActivityMainBinding
import com.example.intent_0819.databinding.ActivityOtherBinding

class OtherActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOtherBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtherBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        activityChange()
    }

    private fun activityChange() {
        binding.firstAcBtn.setOnClickListener {
            val intent = Intent(this@OtherActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}