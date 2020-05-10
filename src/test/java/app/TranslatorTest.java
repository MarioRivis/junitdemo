package app;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TranslatorTest {

    public static final String DIGIT_CONVERSION_HAS_FAILED = "Digit conversion has failed";
    private Translator t;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Before
    public void setup() {
        System.out.println("Setup");
        t = new Translator();
    }

    @After
    public void tearDown() {
        System.out.println("Teardown");
        t = null;
    }

    @Test
    public void testTranslateZero() {
        String actualResult = t.translateDigit(0);
        assertEquals(DIGIT_CONVERSION_HAS_FAILED, "zero", actualResult);
    }

    @Test
    public void testTranslateThree() {
        String actualResult = t.translateDigit(3);
        assertEquals(DIGIT_CONVERSION_HAS_FAILED, "three", actualResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnknownDigit() {
        t.translateDigit(4321);
    }
}
