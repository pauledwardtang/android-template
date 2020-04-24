package com.phatcat.app.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.phatcat.app.databinding.FragmentSlideshowBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SlideshowFragment : DaggerFragment() {

  @Inject lateinit var viewModel: SlideshowViewModel
  private var binding: FragmentSlideshowBinding? = null

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = FragmentSlideshowBinding.inflate(inflater)
    return binding?.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    viewModel.text.observe(viewLifecycleOwner, Observer {
      binding?.textSlideshow?.text = it
    })
  }

  override fun onDestroyView() {
    super.onDestroyView()
    binding = null
  }

}
