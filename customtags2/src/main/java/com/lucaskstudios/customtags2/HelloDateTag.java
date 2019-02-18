package com.lucaskstudios.customtags2;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;

public class HelloDateTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        JspWriter out = getJspContext().getOut();
        Calendar cal = Calendar.getInstance();
        int timeOfDay = cal.get(Calendar.HOUR_OF_DAY);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        if (timeOfDay >= 0 && timeOfDay < 12) {
            out.println("Good morning!");
        } else if (timeOfDay >= 12 && timeOfDay < 17) {
            out.println("Good afternoon!");
        } else if (timeOfDay >= 17 && timeOfDay < 24) {
            out.println("Good evening!");
        } else if (month == 7 && day == 4) {
            out.println("Happy 4th of July!");
        }
    }
}