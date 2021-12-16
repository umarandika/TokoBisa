package learn.idn.tokobisa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import learn.idn.tokobisa.databinding.ActivityMainBinding
import learn.idn.tokobisa.view.BookmarkFragment
import learn.idn.tokobisa.view.HomeFragment
import learn.idn.tokobisa.view.SettingsFragment


class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        //supportActionBar?.hide()
        setCurrentFragment(HomeFragment())
        mainBinding.navMain.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home_menu -> setCurrentFragment(HomeFragment())
                R.id.setting_menu -> setCurrentFragment(SettingsFragment())
                R.id.bookmark_menu -> setCurrentFragment(BookmarkFragment())
            }
            true
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?):Boolean {
        menuInflater.inflate(R.menu.menu_languages, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.english -> {
                Toast.makeText(this, "English", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.indonesia -> {
                Toast.makeText(this, "Indonesia", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_main,fragment)
            commit()
        }
}