package com.ada.modeloTestes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AgendamentoTest.class, ClienteTest.class, OperadorTest.class, UsuarioTest.class })
public class AllTests {

}
