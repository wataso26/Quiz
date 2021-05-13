
package app.wataso_.watanabe.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quizIntent: Intent = Intent(this, QuizActivity3::class.java)

        startButton.setOnClickListener {

            startActivity(quizIntent)
        }

    }
}