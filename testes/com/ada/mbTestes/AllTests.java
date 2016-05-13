package com.ada.mbTestes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AgendamentoMBTest.class, ClienteMBTest.class, OperadorMBTest.class })
public class AllTests {

}
