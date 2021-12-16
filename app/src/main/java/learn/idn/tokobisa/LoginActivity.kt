package learn.idn.tokobisa

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import learn.idn.tokobisa.view.SettingsFragment


class LoginActivity : AppCompatActivity() {

    private lateinit var dataEmail: Array<String>
    private lateinit var dataPassword: Array<String>
    private var progressBar: ProgressBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val edtEmail : EditText = findViewById(R.id.edt_email)
        val edtPassword : EditText = findViewById(R.id.edt_password)
        val btnLogin : Button =  findViewById(R.id.btn_login)


        dataEmail = arrayOf("rizkia", "febri", "hardiansyah")
        dataPassword = arrayOf("1234", "4321", "1423")

        btnLogin.setOnClickListener {
            progressBar?.visibility = View.VISIBLE
            signIn(edtEmail.text.toString(), edtPassword.text.toString())
        }

//        val BtnOpenFragment : Button = findViewById(R.id.btn_logout)
//        BtnOpenFragment.setOnClickListener {
//            val settingsFragment = SettingsFragment()
//            val fragments : Fragment? = supportFragmentManager.findFragmentByTag(SettingsFragment::class.java.simpleName)
//
//            if (fragments !is SettingsFragment){
//                supportFragmentManager.beginTransaction()
//                    .add(R.id.container_fragment, settingsFragment, SettingsFragment::class.java.simpleName)
//                    .commit()
//            }
//            BtnOpenFragment.visibility = View.GONE
//        }

    }

    fun signIn(email: String, password: String)
    {
        for (i in dataEmail.indices){
            val takeDataEmail = dataEmail.get(i)
            val takeDataPass = dataPassword.get(i)
            if (takeDataEmail == email && takeDataPass == password){
                Toast.makeText(this, "LogedIn", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MainActivity::class.java))
                break
            }else{
                progressBar?.visibility = View.GONE
                Toast.makeText(this, "Akun Salah", Toast.LENGTH_SHORT).show()
            }
        }
    }




}