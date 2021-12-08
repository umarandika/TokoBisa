package learn.idn.tokobisa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import learn.idn.tokobisa.databinding.ActivityMainBinding
import learn.idn.tokobisa.view.HomeFragment
import learn.idn.tokobisa.view.SettingsFragment


class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        supportActionBar?.hide()
        setCurrentFragment(HomeFragment())
        mainBinding.navMain.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home_menu -> setCurrentFragment(HomeFragment())
                R.id.setting_menu -> setCurrentFragment(SettingsFragment())

            }
            true
        }
    }
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_main,fragment)
            commit()
        }
}