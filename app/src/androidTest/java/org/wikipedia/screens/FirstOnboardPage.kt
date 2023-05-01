package org.wikipedia.screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import org.hamcrest.Matchers.allOf
import org.wikipedia.R

class FirstOnboardPage {
    private val skipButtonMatcher = allOf(withText(R.string.onboarding_skip), isDisplayed())

    fun clickOnboardSkipButton()
    {
        onView(skipButtonMatcher)
                .perform(click())
    }
}