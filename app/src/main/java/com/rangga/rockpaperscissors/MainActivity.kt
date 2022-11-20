package com.rangga.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.rangga.rockpaperscissors.Game.computerPick
import com.rangga.rockpaperscissors.Game.isDraw
import com.rangga.rockpaperscissors.Game.isWin
import com.rangga.rockpaperscissors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    fun startGame(you: String) {
        var pick = computerPick()
        var gambar = when (pick) {
            "Rock" -> R.drawable.rock
            "Paper" -> R.drawable.paper
            else -> R.drawable.scissors
        }
        binding?.ivComputer?.setImageResource(gambar)
        var result = when {
            isDraw(you, pick) -> R.drawable.draw
            isWin(you, pick) -> R.drawable.win
            else -> R.drawable.lose
        }
        binding?.ivResult?.setImageResource(result)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.ibRock?.setOnClickListener {
            startGame("Rock")
        }
        binding?.ibPaper?.setOnClickListener {
            startGame("Paper")
        }
        binding?.ibScissors?.setOnClickListener {
            startGame("Scissors")
        }


    }
}