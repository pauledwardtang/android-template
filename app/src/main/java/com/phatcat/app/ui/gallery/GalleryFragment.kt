package com.phatcat.app.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.phatcat.app.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

  private val viewModel by viewModels<GalleryViewModel>()
  private var binding: FragmentGalleryBinding? = null

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = FragmentGalleryBinding.inflate(inflater)
    return binding?.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    viewModel.text.observe(viewLifecycleOwner, Observer {
      binding?.textGallery?.text = it
    })
  }

  override fun onDestroyView() {
    super.onDestroyView()
    binding = null
  }

}
