package learn.idn.tokobisa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*
import learn.idn.tokobisa.data.Ecom
import learn.idn.tokobisa.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var detailBinding: ActivityDetailBinding

    companion object {
        const val ECOM_DATA = "ecom_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)

        

        val dataEcom = intent.getParcelableExtra<Ecom>(ECOM_DATA) as Ecom
        Glide.with(this)
            .load(dataEcom.image)
            .into(detailBinding.imageDetail)

        detailBinding.name.text = dataEcom.title
        detailBinding.price.text = dataEcom.price
        detailBinding.desk.text = dataEcom.detail

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

//    override fun onCreateOptionsMenu(menu: Menu?):Boolean {
//        menuInflater.inflate(R.menu.menu_languages, menu)
//        return true
//    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_languages, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.english -> Toast.makeText(this, "English", Toast.LENGTH_LONG).show()
            R.id.indonesia -> Toast.makeText(this, "Bahasa Indonesia", Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}