package br.com.bicmsystems.demofragment

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.widget.Button
import kotlinx.android.synthetic.main.activity_back_stack.*

class BackStackActivity : AppCompatActivity() {

    private var btFrag1WithBack: Button? = null
    private var btFrag2WithBack: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back_stack)

        btFragment1.setOnClickListener {
            val pf = PrimeiroFragment()
            val bundle = Bundle()
            bundle.putString("mensagem", "Primeiro Fragment")
            bundle.putInt("color", Color.GREEN)
            bundle.putInt("textColor", Color.RED)
            pf.arguments = bundle
            trocaFragment(pf)
        }

        btFragment2.setOnClickListener {
            val sf = SegundoFragment()
            val bundle = Bundle()
            bundle.putString("mensagem", "Segundo Fragment")
            bundle.putInt("color", Color.RED)
            bundle.putInt("textColor", Color.YELLOW)
            sf.arguments = bundle
            trocaFragment(sf)
        }

    }

    private fun trocaFragment(fragment: Fragment) {
        var ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.containerFragment, fragment)
        // para adicionar uma pilha de fragments... usar addToBackStack
        //ft.addToBackStack(null)
        ft.commit()
    }

}
