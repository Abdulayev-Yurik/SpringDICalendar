package printer;

import calendar.interfaces.Calendar;
import calendar.web.WebCalendar;

/**
 * Created by employee on 11/21/16.
 */
public class HtmlPrinter extends Printer {

    @Override
    public void print() {
        Calendar calendar = new WebCalendar(getLocalDate(), getStartWeek(), weekends());
        calendar.print();
    }
}
