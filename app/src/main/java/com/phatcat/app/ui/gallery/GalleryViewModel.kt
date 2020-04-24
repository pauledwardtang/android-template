package com.phatcat.app.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class GalleryViewModel @Inject constructor(
  greetingMessage: String
) : ViewModel() {

  private val _text = MutableLiveData(greetingMessage)

  val text: LiveData<String> = _text
}
