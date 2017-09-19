package edu.matc.exercise3;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import org.apache.log4j.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ExerciseThree extends SimpleTagSupport {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        int currentTime;
        JspWriter out = getJspContext().getOut();

        currentTime = getTime();

        if (currentTime == 13) {
            out.println("Hello It's 1!");
        } else {
            out.println("It's Not 1!");
        }
    }

    /**
     * https://stackoverflow.com/questions/907170/java-getminutes-and-gethours
     */
    public int getTime() {
        int currentHour;
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        currentHour = calendar.get(Calendar.HOUR_OF_DAY);

        logger.info(currentHour);
        return currentHour;
    }
}

