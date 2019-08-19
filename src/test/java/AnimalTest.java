import Animals.IBear;
import Animals.ILivingBear;
import Bears.PolarBear;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;

public class AnimalTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void getWeight_forPolarBear_returns200_Test() {
        // AAA: Arrange, Act, Assert
        // Arrange / Given
        //IBear bear = new PolarBear();
        IBear bear = mock(IBear.class);
        Mockito.when(bear.getWeight()).thenReturn(37);

        int expectedWeight = 200;

        // Act / When
        int actualWeight = bear.getWeight();

        // Assert / Then
        Assert.assertEquals(expectedWeight, actualWeight);
    }

    @Test
    public void attack_forPolarBear_returns_correct_Message_on_consoleOutput_Test() {
        // AAA: Arrange, Act, Assert
        // Arrange / Given
        ILivingBear bear = new PolarBear();
        String expected = "Kill the target!".trim();

        // Act / When
        bear.attack();
        String actual = outContent.toString().trim();

        // Assert / Then
        Assert.assertEquals(expected, actual);
    }

    @After
    public void tearDown() {

        System.setOut(originalOut);
    }
}











