package test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.java.cases.Java8SimpleListCollectorTest;
import test.java.cases.Java8SimpleLogAnalyzer2Test;
import test.java.cases.Java8SimpleLogAnalyzer3Test;
import test.java.cases.Java8SimpleLogAnalyzerTest;
import test.java.cases.Java8SimpleMaxCollectorTest;
import test.java.cases.Java8StreamVariableAssignmentsTest;
import test.java.cases.Java8WordCountStreamsTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Java8SimpleLogAnalyzerTest.class,
        Java8SimpleLogAnalyzer2Test.class,
        Java8SimpleLogAnalyzer3Test.class,
        Java8WordCountStreamsTest.class,
        Java8SimpleListCollectorTest.class,
        Java8SimpleMaxCollectorTest.class,
        Java8StreamVariableAssignmentsTest.class
})
public class JavaStreamsJobAnalyzerTestSuite {}