package com.example.myapplication.ui.level1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView

class Level1 : Fragment() {

    private lateinit var level1ViewModel: Level1ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        level1ViewModel =
            ViewModelProvider(this).get(Level1ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_level1, container, false)
        
            val textView: TextView = root.findViewById(R.id.text_gallery)
            level1ViewModel.text.observe(viewLifecycleOwner) {
                textView.text = it
            }

        ComposeView(requireContext()).apply {
            textShield(context.getString(R.string.VinnysReference))
        }

            return root
    }

    @Composable
    fun textShield(placed: String)
    {
        Text(text= "My shield is made of $placed")
    }
}