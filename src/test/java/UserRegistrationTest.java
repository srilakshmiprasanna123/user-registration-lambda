
import org.junit.Assert;
import org.junit.Test;



public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Sri");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenOurOfFormat_ShouldReturnFlase() {
        boolean result = userRegistration.firstName("Sri");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenLastName_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.lastName("Lucky");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.lastName("lucky");
        Assert.assertEquals(false, result);

    }

    /*
     * methods to check mail addresss
     */
    @Test
    public void givenEmail_WhenInFormat_ShouldReturnTrue() {
        boolean result = userRegistration.emailAddress("abc@gmail.com.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenOurOfFormat_ShouldReturnFalse() {
        boolean result = userRegistration.emailAddress("abc()*@gmail.com");
        Assert.assertEquals(false, result);
    }

}