package com.example.counter51

import android.annotation.SuppressLint
import android.graphics.Color.green
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter51.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View {
    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
        presenter.attachView(this)
    }

    private fun initClickers() {
        with(binding) {
            binding.incrementBtn.setOnClickListener {
                presenter.increment()
                presenter.showT()
                presenter.changeColor()

            }
        }
    }

    override fun changeCount(count: Int) {
        binding.tvZero.text = count.toString()


    }

    override fun showToast() {
        Toast.makeText(this, "Поздравляем!", Toast.LENGTH_SHORT).show()
    }

    @SuppressLint("ResourceType")
    override fun changeColor() {
        binding.tvZero.setTextColor(resources.getColor(R.color.green))
    }
}