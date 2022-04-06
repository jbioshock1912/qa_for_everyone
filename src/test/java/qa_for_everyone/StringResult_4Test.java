package qa_for_everyone;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class StringResult_4Test {

    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private String myTestString1 = "Перестановочный алгоритм быстрого действия";
    private String myTestString2 = "Перес@тановочный     *&@алгоритм быстрого действия   *&@";
    private String myTestString3 = " тут четыре пробела ";
    private String myTestString4 = "Посмотрите как Рите нравится ритм";
    private String myTestString5 = "рит";
    private char myTestChar1 = 'о';
    private char myTestChar2 = '@';
    private char myTestChar3 = ' ';


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public void getSymbol1() {
        StringResult_4.getSymbol(myTestString1, myTestChar1);
        String result = "ооооо";
        Assert.assertEquals(result, output.toString());

    }

    @Test
    public void getSymbol2() {
        StringResult_4.getSymbol(myTestString2, myTestChar2);
        String result = "@@@";
        Assert.assertEquals(result, output.toString());

    }

    @Test
    public void getSymbol3() {
        StringResult_4.getSymbol(myTestString3, myTestChar3);
        String result = "    ";
        Assert.assertEquals(result, output.toString());

    }

    @Test
    public void getNumberOfSymbol(){
        Assert.assertEquals(3, StringResult_4.getNumberOfSymbol(myTestString2, myTestChar2));
    }

    @Test
    public void getIndex(){
        StringResult_4.getIndex(myTestString4, myTestString5);
        String result = "6 15 29 ";
        Assert.assertEquals(result, output.toString());

    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}