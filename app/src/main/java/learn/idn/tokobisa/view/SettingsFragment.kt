package learn.idn.tokobisa.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_settings.*
import kotlinx.android.synthetic.main.fragment_settings.view.*
import learn.idn.tokobisa.LoginActivity
import learn.idn.tokobisa.R
import learn.idn.tokobisa.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view: View = inflater!!.inflate(R.layout.fragment_settings, container, false)

        _binding = FragmentSettingsBinding.inflate(inflater, container, false)

        return binding.root


         //Inflate the layout for this fragment


        val bind = FragmentSettingsBinding.inflate(layoutInflater)

        bind.btnLogout.setOnClickListener {
            val intent = Intent (this@SettingsFragment.requireContext(), LoginActivity::class.java)
            startActivity(intent)
        }

        return bind.root
    }




    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}