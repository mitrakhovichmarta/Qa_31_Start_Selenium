import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

    public class LoginTest {


    @BeforeClass
    public void preCondition(){
        //open browser
        //open site

    }
    @Test
    public void loginSuccess(){
    //open form(find element + click)
    //fill form (email (find element + click + clear + type)
    // fill form (password (find element + click + clear + type)
    //submit form (find + click)

}
    @Test
    public void loginWrongEmail() {
        //open form(find element + click)
        //fill form (email (find element + click + clear + type)
        // fill form (password (find element + click + clear + type)
        //submit form (find + click)
    }
    @Test
    public void loginWrongPassword() {
        //open form(find element + click)
        //fill form (email (find element + click + clear + type)
        // fill form (password (find element + click + clear + type)
        //submit form (find + click)
}
    @Test
    public void loginWrongUnregisteredUser() {
        //open form(find element + click)
        //fill form (email (find element + click + clear + type)
        // fill form (password (find element + click + clear + type)
        //submit form (find + click)
}

    @AfterClass
    public void postCondition(){
    //close browser

}

}
