import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import printer.Printer;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by employee on 11/21/16.
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");

        System.out.println("Press 1 to html or 2 to console");

        List<String> beans = Arrays.asList("html", "console");
        Printer obj = (Printer) context.getBean(beans.get(new Scanner(System.in).nextInt() - 1));

        obj.print();
    }


}
