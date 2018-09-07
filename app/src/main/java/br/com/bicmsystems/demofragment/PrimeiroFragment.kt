package br.com.bicmsystems.demofragment

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_main.*

class PrimeiroFragment() : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        tvMensagem.text = arguments?.getString("mensagem") ?: "Vazio"
        val colorBackground = arguments?.getInt("color") ?: Color.BLACK
        val textColor = arguments?.getInt("textColor") ?: Color.BLACK
        view?.setBackgroundColor(colorBackground)
        tvMensagem.setTextColor(textColor)
    }

}