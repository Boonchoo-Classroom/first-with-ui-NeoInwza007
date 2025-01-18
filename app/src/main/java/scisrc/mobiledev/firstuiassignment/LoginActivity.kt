package scisrc.mobiledev.firstuiassignment

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    private lateinit var backToMainBtn: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Use the root layout's ID for applying window insets
        val rootView = findViewById<androidx.core.widget.NestedScrollView>(R.id.rootScrollView)
        ViewCompat.setOnApplyWindowInsetsListener(rootView) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize the Back to Main button
        backToMainBtn = findViewById(R.id.loginBackToMainBtn)
        backToMainBtn.setOnClickListener {
            finish() // Ends this activity and returns to the previous one
        }
    }
}
