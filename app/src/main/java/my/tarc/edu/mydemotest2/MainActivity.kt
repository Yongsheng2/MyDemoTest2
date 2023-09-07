package my.tarc.edu.mydemotest2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.tarc.edu.mydemotest2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCheck.setOnClickListener {
            val score = binding.editTextNumberScore.text.toString().toInt()
            var grade = ""

            if (score <= 100 && score >= 80){
                grade = "A"
            }
            else if (score <= 79 && score >= 75){
                grade = "A-"
            }
            else if (score <= 74 && score >= 70){
                grade = "B+"
            }
            else if (score <= 69 && score >= 65){
                grade = "B"
            }
            else{
                grade = "D"
            }

            binding.textViewG.text = grade.toString()
        }

        binding.buttonPhoneNum.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("tel:0361261600"))
            startActivity(intent)
        }
    }
}