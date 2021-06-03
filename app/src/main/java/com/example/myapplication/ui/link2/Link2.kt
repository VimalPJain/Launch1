package com.example.myapplication.ui.link2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R

class Link2 : Fragment() {

    private lateinit var link2ViewModel: Link2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        link2ViewModel =
            ViewModelProvider(this).get(Link2ViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_link2, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        link2ViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}