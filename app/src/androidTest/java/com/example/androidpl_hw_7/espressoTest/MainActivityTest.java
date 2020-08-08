package com.example.androidpl_hw_7.espressoTest;


import androidx.test.rule.ActivityTestRule;

import com.example.androidpl_hw_7.MainActivity;
import com.example.androidpl_hw_7.R;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void onClickAddButton() {
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("6")));
    }

    @Test
    public void onClickSubtractButton() {
        onView(withId(R.id.btn_subtract)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("0")));
    }

    @Test
    public void onClickMultiplyButton() {
        onView(withId(R.id.btn_multiply)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("9")));
    }

    @Test
    public void onClickDivideButton() {
        onView(withId(R.id.btn_divide)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("1")));
    }
}
