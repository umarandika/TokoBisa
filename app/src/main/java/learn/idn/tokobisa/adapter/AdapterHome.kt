package learn.idn.tokobisa.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import learn.idn.tokobisa.DetailActivity
import learn.idn.tokobisa.data.Ecom
import learn.idn.tokobisa.databinding.ItemHomeBinding

class AdapterHome(private val listHom: ArrayList<Ecom>) :
    RecyclerView.Adapter<AdapterHome.EcomViewHolder>() {

    inner class EcomViewHolder(val binding: ItemHomeBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EcomViewHolder {
        val binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EcomViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EcomViewHolder, position: Int) {
        with(holder) {
            with(listHom[position]) {
                Glide.with(holder.itemView.context)
                    .load(image)
                    .into(binding.imgHome)
                binding.txtTitle.text = title
                binding.txtDetail.text = price
                binding.txtDesk.text = detail
                val mContext = holder.itemView.context
                holder.itemView.setOnClickListener {
                    val dataSend = Ecom(
                        price = listHom[position].price,
                        title = listHom[position].title,
                        detail = listHom[position].detail,
                        image = listHom[position].image

                    )
                    val intentToDetail = Intent(mContext, DetailActivity::class.java)
                    intentToDetail.putExtra(DetailActivity.ECOM_DATA, dataSend)
                    mContext.startActivity(intentToDetail)

                }
            }
        }
    }
    override fun getItemCount(): Int = listHom.size
}