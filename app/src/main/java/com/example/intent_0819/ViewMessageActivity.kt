package com.example.intent_0819

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_0819.databinding.ActivityOtherBinding
import com.example.intent_0819.databinding.ActivityViewMessageBinding

class ViewMessageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewMessageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        getMessage()
        activityChange()
    }

    private fun activityChange() {
        binding.firstAcBtn.setOnClickListener {
            finish()
        }
    }

    private fun getMessage() {
        val receivedMessage = intent.getStringExtra("message")
        binding.getMessage.text = receivedMessage
    }
}