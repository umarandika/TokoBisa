package learn.idn.tokobisa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
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
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}