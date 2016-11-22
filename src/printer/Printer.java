package printer;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Created by employee on 11/21/16.
 */
public abstract class Printer {

    private String localDate;
    private Integer dayOfWeek;
    private List<DayOfWeek> weekend;

    public abstract void print();

    public void setLocalDate(String localDate){
        this.localDate = localDate;
    }

    public void setStartWeek(Integer startWeek){
        this.dayOfWeek = startWeek;
    }

    public void setWeekend(List<DayOfWeek> weekend){
        this.weekend = weekend;
    }

    LocalDate getLocalDate(){
        try {
            String[] date = localDate.split("-");
            return LocalDate.of(parseInt(date[0]), parseInt(date[1]), parseInt(date[2]));
        }catch (Exception e){
            return LocalDate.now();
        }
    }

    DayOfWeek getStartWeek(){
        try {
            return DayOfWeek.of(dayOfWeek);
        }catch (Exception e){
            return getLocalDate().getDayOfWeek();
        }
    }

    List<DayOfWeek> weekends(){
        try {
            return weekend;
        }catch (Exception e){
            return Arrays.asList(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        }
    }

}
