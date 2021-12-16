package learn.idn.tokobisa.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import learn.idn.tokobisa.DetailActivity
import learn.idn.tokobisa.data.Ecom
import learn.idn.tokobisa.databinding.ItemBookmarkBinding

class AdapterBookmark(private val listBook: ArrayList<Ecom>) :
    RecyclerView.Adapter<AdapterBookmark.EcomViewHolder>() {

    inner class EcomViewHolder(val binding: ItemBookmarkBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EcomViewHolder {
        val binding = ItemBookmarkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EcomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EcomViewHolder, position: Int) {
        with(holder) {
            with(listBook[position]) {
                Glide.with(holder.itemView.context)
                    .load(image)
                    .into(binding.imgHome)
                binding.txtTitle.text = title
                binding.txtDetail.text = price
                binding.txtDesk.text = detail
                val mContext = holder.itemView.context
                holder.itemView.setOnClickListener {
                    val dataSend = Ecom(
                        price = listBook[position].price,
                        title = listBook[position].title,
                        detail = listBook[position].detail,
                        image = listBook[position].image

                    )
                    val intentToDetail = Intent(mContext, DetailActivity::class.java)
                    intentToDetail.putExtra(DetailActivity.ECOM_DATA, dataSend)
                    mContext.startActivity(intentToDetail)

                }
            }
        }
    }
    override fun getItemCount(): Int = listBook.size
}