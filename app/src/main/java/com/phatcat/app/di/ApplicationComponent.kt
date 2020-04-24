package com.phatcat.app.di

import android.content.Context
import android.content.res.Resources
import com.phatcat.app.MainApplication
import com.phatcat.app.di.ApplicationComponent.ApplicationModule
import com.phatcat.app.ui.gallery.GalleryFragment
import com.phatcat.app.ui.home.HomeFragment
import com.phatcat.app.ui.slideshow.SlideshowFragment
import dagger.Binds
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
  modules = [
    AndroidSupportInjectionModule::class,
    ApplicationModule::class
  ]
)
interface ApplicationComponent : AndroidInjector<MainApplication> {

  @Component.Factory
  interface Factory : AndroidInjector.Factory<MainApplication>

  @Module
  interface ApplicationModule {

    @Binds
    fun bindsContext(application: MainApplication): Context

    companion object {
      @Provides
      fun resources(context: Context): Resources = context.resources
    }

    @ContributesAndroidInjector(modules = [HomeModule::class])
    fun homeFragment(): HomeFragment

    @ContributesAndroidInjector(modules = [GalleryModule::class])
    fun galleryFragment(): GalleryFragment

    @ContributesAndroidInjector(modules = [SlideshowModule::class])
    fun slideshowFragment(): SlideshowFragment
  }

}
