import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(400, 300);
    }

    @Test
    public void checkSheetsLefts(){
        assertEquals(400, printer.getSheetsLeft());
    }

    @Test
    public void checkPrintFunction(){
        printer.print(5, 40);
        assertEquals(200, printer.getSheetsLeft());
        assertEquals(100, printer.getTonerVolume());
    }

    @Test
    public void checkPrintFailingBecauseInsufficientSheets(){
        printer.print(10, 350);
        assertEquals(300, printer.getTonerVolume());
        assertEquals(400, printer.getSheetsLeft());
    }
}
