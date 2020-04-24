package com.phatcat.app.di

import android.content.res.Resources
import com.phatcat.app.R
import dagger.Module
import dagger.Provides

@Module
class HomeModule {

  @Provides
  fun greetingMessage(resources: Resources) = resources.getString(R.string.home_greeting)

}
