package com.example.intent_0819

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_0819.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        activityChange()
        sendMessage()
    }

    private fun activityChange() {
        binding.acChangeBtn.setOnClickListener {
//            val intent = Intent(this@MainActivity, OtherActivity::class.java)
//            startActivity(intent)
            startActivity(Intent(this@MainActivity, OtherActivity::class.java))
        }
    }

    private fun sendMessage() {
        binding.sendMessageBtn.setOnClickListener {
            val editText = binding.messageEdt.text.toString()
            val intent = Intent(this@MainActivity, ViewMessageActivity::class.java)
            intent.putExtra("message", editText)
            startActivity(intent)
        }
    }
}