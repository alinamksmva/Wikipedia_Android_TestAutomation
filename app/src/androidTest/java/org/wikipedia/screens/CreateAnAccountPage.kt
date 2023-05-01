package org.wikipedia.screens

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withHint
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matcher
import org.wikipedia.R

class CreateAnAccountPage {

    private val loginPasswordMatcher = withHint(R.string.login_password_hint)
    private val loginUsernameMatcher = withHint(R.string.login_username_hint)
    private val loginEmailMatcher = withHint(R.string.create_account_email_hint)
    private val createAccountButtonMatcher = withId(R.id.create_account_submit_button)
    private val eyeMatcher = allOf(withId(com.google.android.material.R.id.text_input_end_icon), isDescendantOfA(withParent(withId(R.id.create_account_password_input))))

    private fun clickOn(matcher : Matcher<View>)
    {
        onView(matcher)
                .perform(click())
    }

    private fun inputLogin(matcher : Matcher<View>, input : String)
    {
        onView(matcher)
                .perform(typeText(input))
    }

    fun inputLoginUsername(username : String)
    {
        inputLogin(loginUsernameMatcher, username)
    }

    fun inputLoginPassword(password : String)
    {
        inputLogin(loginPasswordMatcher, password)
    }

    fun inputLoginEmail(email : String)
    {
        inputLogin(loginEmailMatcher, email)
    }

    fun clickLoginUsername()
    {
        clickOn(loginUsernameMatcher)
    }

    fun clickLoginPassword()
    {
        clickOn(loginPasswordMatcher)
    }

    fun clickLoginEmail()
    {
        clickOn(loginEmailMatcher)
    }

    fun clickEye()
    {
        clickOn(eyeMatcher)
    }

    fun clickCreateAccountButton()
    {
        clickOn(createAccountButtonMatcher)
    }

    fun checkPassword(password : String)
    {
        onView(loginPasswordMatcher)
                .check(matches(withText(password)))
    }
}