package printer;

import calendar.interfaces.Calendar;
import calendar.web.WebCalendar;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by employee on 11/21/16.
 */
public class HtmlPrinter implements Printer {

    @Override
    public void print() {
        Calendar calendar = new WebCalendar();
        PrintWriter e = null;
        try {
            e = new PrintWriter("calendar.html");
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }
        e.println("<tr>" + calendar.getCurrentMonthHeader() + "</tr>");
        e.println(calendar.getWeekNames());
        e.println(calendar.getMonthValues());
        e.close();

    }
}
