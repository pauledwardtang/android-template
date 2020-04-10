package com.phatcat.app.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.phatcat.app.R

class SlideshowFragment : Fragment() {

  private val viewModel by viewModels<SlideshowViewModel>()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val root = inflater.inflate(R.layout.fragment_slideshow, container, false)
    val textView: TextView = root.findViewById(R.id.text_slideshow)
    viewModel.text.observe(viewLifecycleOwner, Observer {
      textView.text = it
    })
    return root
  }
}
