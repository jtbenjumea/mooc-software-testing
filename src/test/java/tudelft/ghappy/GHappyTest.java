package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;


public class GHappyTest {

/*
    @Test
    @ParameterizedTest(name = "str={0}, result={1}")
    @CsvSource({ "xxggxx,true" })
    public void gHappyOnStart(String str, String expectedResult) {

        boolean result = new GHappy().gHappy(str);
        boolean bExpectedResult = false;
        if ( expectedResult == "true")
            bExpectedResult = true;
        Assertions.assertEquals(bExpectedResult,
                result);
    }
*/
    @Test
    public void gHappyOnStart1() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("g");
        Assertions.assertFalse(result);
    }

    @Test
    public void gHappyOnStart2() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("gg");
        Assertions.assertTrue(result);
    }

    @Test
    public void gHappyOnStart3() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("ggx");
        Assertions.assertTrue(result);
    }

    @Test
    public void gHappyOnMiddle1() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxggxx");
        Assertions.assertTrue(result);
    }

    @Test
    public void gHappyOnMiddle2() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxgxx");
        Assertions.assertFalse(result);
    }

    @Test
    public void gHappyOnEnd1() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxgg");
        Assertions.assertTrue(result);
    }

    @Test
    public void gHappyOnEnd2() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("xxg");
        Assertions.assertFalse(result);
    }

    @Test
    public void gHappyOnEnd3() {
        GHappy gh = new GHappy();
        boolean result = gh.gHappy("g");
        Assertions.assertFalse(result);
    }
}
