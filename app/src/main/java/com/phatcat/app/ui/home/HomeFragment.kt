package com.phatcat.app.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.phatcat.app.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

  private val viewModel by viewModels<HomeViewModel>()
  private var binding: FragmentHomeBinding? = null

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    binding = FragmentHomeBinding.inflate(inflater)
    return binding?.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    viewModel.text.observe(viewLifecycleOwner, Observer {
      binding?.textHome?.text = it
    })
  }

  override fun onDestroyView() {
    super.onDestroyView()
    binding = null
  }

}
