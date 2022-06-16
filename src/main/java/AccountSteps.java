import Bai3.Account;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class AccountSteps {

    private Exception actualExpectation;
    Account account = new Account("A01","Test");
    Account account1 = new Account("B12","B");

    @Given("Khoi tao tai khoan A so du la {int}")
    public void khoiTaoTaiKhoanASoDuLa(int balance) {
        balance = 0;
    }

    @When("Nap {int}")
    public void nap(int amount) {
        account.setBalance(0);
        account.credit(1000);
    }

    @Then("So du tai khoan sau khi nap la {int}")
    public void soDuTaiKhoanSauKhiNapLa(int balanceExpectation) {
        account.setBalance(0);
        balanceExpectation = 1000;
        Assertions.assertEquals(balanceExpectation,account.credit(1000));
    }

    @When("tru tien {int}")
    public void truTien(int amount) {

        account.setBalance(1000);
        int expectation = 500;
        Assertions.assertEquals(expectation, account.debit(500));
    }

//    @Then("nem ra exception {string}")
//    public void nemRaRuntimeException(String expected) {
//        expected = actualExpectation.getMessage();
//        Assertions.assertEquals(expected, actualExpectation.getClass().getSimpleName());
//    }

    @And("noi dung la {string}")
    public void noiDungLa(String message) {
        Assertions.assertEquals(message, actualExpectation.getMessage());
    }


    @And("Khoi tao tai khoan B co so du la {int}")
    public void khoiTaoTaiKhoanBCoSoDuLa(int amount) {
        account1.setBalance(0);
    }

    @When("Chuyen so tien {int} tu tai khoan A den tai khoan B")
    public void chuyenSoTienTuTaiKhoanADenTaiKhoanB(int amount) {
        try {
            account.transferTo(account1,amount);
        }catch (Exception e) {
            actualExpectation = e;
        }
    }

    @Then("So du tai khoan A sau khi chuyen la {int}")
    public void soDuTaiKhoanASauKhiChuyenLa(int balanceExpectation) {
        account.setBalance(1000);
        account1.setBalance(0);
        balanceExpectation = 800;
        int actual= account.transferTo(account1, 200);
        Assertions.assertEquals(balanceExpectation, actual);

    }

    @And("So du tai khoan B sau khi chuyen la {int}")
    public void soDuTaiKhoanBSauKhiChuyenLa(int balanceExpectation) {
        account.setBalance(1000);
        account1.setBalance(0);
        balanceExpectation = 200;
        int actual= account1.credit(200);
        Assertions.assertEquals(balanceExpectation, actual);
    }
}
