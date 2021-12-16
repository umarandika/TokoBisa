package learn.idn.tokobisa.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import learn.idn.tokobisa.adapter.AdapterBookmark
import learn.idn.tokobisa.data.Ecom
import learn.idn.tokobisa.data.EcomData
import learn.idn.tokobisa.databinding.FragmentBookmarkBinding

class BookmarkFragment : Fragment() {

    private lateinit var breakfastBinding: FragmentBookmarkBinding
    private var list: ArrayList<Ecom> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        breakfastBinding = FragmentBookmarkBinding.inflate(inflater, container, false)
        return breakfastBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        list.addAll(EcomData.listDataEcomm)
        breakfastBinding.rvBookmark.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, 2)
            val AdapterBookmark = AdapterBookmark(list)
            adapter = AdapterBookmark
        }

    }


}