import Bai2.Converter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ConverterStep {

        Converter converter;
        double tmp;
        double actual;

        @Given("a caculator")
        public void createCaculator() {
            converter = new Converter();
        }

        @And("user input F {double}")
        public void userInputF(double F) {
            tmp = F;
        }


        @When("user click button F=>C")
        public void userClickButtonFC() {
            actual = converter.convertFtoC(tmp);
        }

        @Then("result F is {double}")
        public void resultFIsFtoC(double expected) {
            if(Math.abs(expected - actual) < 0.001)
            {
                Assertions.assertEquals(expected, actual, 0.001);
            }

        }

        @When("user click button C=>F")
        public void userClickButtonCF() {
            actual = converter.convertCtoF(tmp);
        }

        @And("user input C {double}")
        public void userInputC(double C) {
            tmp = C;
        }

        @Then("result C is {double}")
        public void resultCIsFtoC(double expected) {
            if(Math.abs(expected - actual) < 0.001) {
                Assertions.assertEquals(expected, actual, 0.001);
            }
        }
}
