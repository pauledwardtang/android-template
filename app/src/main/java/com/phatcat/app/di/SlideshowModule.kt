package com.phatcat.app.di

import android.content.res.Resources
import com.phatcat.app.R
import dagger.Module
import dagger.Provides

@Module
class SlideshowModule {

  @Provides
  fun greetingMessage(resources: Resources) = resources.getString(R.string.slideshow_greeting)

}
