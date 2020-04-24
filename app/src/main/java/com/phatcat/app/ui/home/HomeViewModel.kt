package com.phatcat.app.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor(
  greetingMessage: String
) : ViewModel() {

  private val _text = MutableLiveData(greetingMessage)

  val text: LiveData<String> = _text
}
