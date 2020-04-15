package com.phatcat.app.ui.home

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.phatcat.app.R
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeFragmentTest {

  @Test
  fun showsHomeText() {
    launchFragmentInContainer<HomeFragment>()
    onView(withId(R.id.text_home)).check(matches(withText("This is the home Fragment")))
  }

}
