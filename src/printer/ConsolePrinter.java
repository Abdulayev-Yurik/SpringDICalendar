package printer;

import calendar.console.ConsoleCalendar;
import calendar.interfaces.Calendar;

/**
 * Created by employee on 11/21/16.
 */
public class ConsolePrinter implements Printer {

    @Override
    public void print() {
        Calendar calendar = new ConsoleCalendar();
        calendar.print();
    }
}
