package id.ndiappink.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layout_login)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)

        btnLogin.setOnClickListener {
            val keDashboard = Intent(this, DashboardActivity::class.java)
            startActivity(keDashboard)
        }

        setSupportActionBar(toolbar)
//        supportActionBar?.setDisplayShowHomeEnabled(true)
//        supportActionBar?.setIcon(R.drawable.jtik)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(
            R.menu.main_menu,
            menu
        )

        return true
    }

    // Menangani klik menu
    override fun onOptionsItemSelected(
        item: MenuItem
    ): Boolean {

        when (item.itemId) {
            R.id.menu_home -> {
                Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.menu_reels -> {
                Toast.makeText(this, "Reels clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.menu_send -> {
                Toast.makeText(this, "Send clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.menu_search -> {
                Toast.makeText(this, "Search clicked", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.menu_profile -> {
                Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }
}