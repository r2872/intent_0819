package com.example.intent_0819

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intent_0819.databinding.ActivityEditNickNameBinding

class EditNickNameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEditNickNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditNickNameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}