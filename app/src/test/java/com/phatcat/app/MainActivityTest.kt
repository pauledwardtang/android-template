package com.phatcat.app

import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.LooperMode

@RunWith(AndroidJUnit4::class)
@LooperMode(LooperMode.Mode.PAUSED)
class MainActivityTest {
  @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

  @Test
  fun showsFabIcon() {
    // GIVEN
    val scenario = activityScenarioRule.scenario

    // WHEN
    scenario.moveToState(Lifecycle.State.RESUMED)

    // THEN
    onView(withId(R.id.fab)).check(matches(isDisplayed()))
  }

}
