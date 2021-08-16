import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
features = {"E:\\New folder\\abc\\eclipsefiles\\quikrtestngg\\features"},
glue = {"stepdefinition"},
tags = ""
)
public class testrunner extends AbstractTestNGCucumberTests
{
@Override
@DataProvider(parallel = false)
public Object[][] scenarios() {
return super.scenarios();
}
}