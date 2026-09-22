package id.ndiappink.myapplication

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layout_dashboard)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.navbarnya)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, ProfileFragment())
            .commit()

        bottomNavigation.selectedItemId = R.id.menu_profile

        bottomNavigation.setOnItemSelectedListener { item ->

            when (item.itemId) {

                R.id.menu_home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.fragmentContainer,
                            HomeFragment()
                        )
                        .commit()
                    true
                }

                R.id.menu_reels -> {
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.fragmentContainer,
                            ReelsFragment()
                        )
                        .commit()
                    true
                }

                R.id.menu_send -> {
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.fragmentContainer,
                            SendFragment()
                        )
                        .commit()
                    true
                }

                R.id.menu_search -> {
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.fragmentContainer,
                            SearchFragment()
                        )
                        .commit()
                    true
                }

                R.id.menu_profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(
                            R.id.fragmentContainer,
                            ProfileFragment()
                        )
                        .commit()
                    true
                }

                else -> false
            }
        }
    }
}