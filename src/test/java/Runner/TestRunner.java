
  package Runner;
  
  import org.junit.runner.RunWith;
  
  import io.cucumber.junit.Cucumber; import io.cucumber.junit.CucumberOptions;
  
  @RunWith(Cucumber.class)
  
  @CucumberOptions(features = {"src/test/resources/Login/login.feature"},glue =
  "StepDefination" ,plugin =
  {"html:testoutput/cucumber.html\",\"junit:testoutput/cucumber.xml\",\"json:testoutput/cucumberjason.xml"
  })
  
  public class TestRunner {
  
  }
 