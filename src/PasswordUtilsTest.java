
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordUtilsTest {
    @Test
    void testDescribePasswordLengthShortPassword() {
       //arrange
       String password ="hello";
       //act
       String actual = PasswordUtils.describePasswordLength(password);
       //assert
       assertEquals("short", actual);
    }
    @Test 
    void testDescribePasswordLengthShortPasswordExactly12Chars(){
        //arrange
           String password="12characters";
        //act
    String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("long", actual);

    }
    @Test
    void testDescribePasswordLengthExtraLongPassword(){
        //arrange
        String password="thisisaverylongpasswordthatexceedstwentycharacters";
        //act
        String actual = PasswordUtils.describePasswordLength(password);
        //assert
        assertEquals("extra long", actual);
    }
    @Test 
    void testAlphanumeric(){

        String password =" yellow";
        Boolean actual = PasswordUtils.isAlphanumeric(password);
        assertEquals(true, actual);
    }
}
