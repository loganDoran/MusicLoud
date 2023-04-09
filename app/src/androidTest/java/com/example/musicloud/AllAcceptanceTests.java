package com.example.musicloud;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.example.musicloud.presentation.LoginActivityTest;
import com.example.musicloud.presentation.PlayActivityTest;
import com.example.musicloud.presentation.RegisterActivityTest;

@RunWith(Suite.class)
@Suite.SuiteClasses(value = {
        LoginActivityTest.class,
        RegisterActivityTest.class,
        PlayActivityTest.class,
})
public class AllAcceptanceTests {
    // This class is just a holder for the suite of tests.
    // It does not contain any tests itself.
}
