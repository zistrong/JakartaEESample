package com.zistrong.jakartaee.schedule;

import com.zistrong.jakartaee.filter.RestLoginFilter;
import jakarta.ejb.Schedule;
import jakarta.ejb.Singleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.DateFormat;
import java.util.Date;

@Singleton
public class JakartaEESchedule {
    private static final Logger LOGGER = LogManager.getLogger(RestLoginFilter.class);

    @Schedule(second = "30", minute = "*", hour = "*")
    public void scheduleRun() {
        LOGGER.info("now = {}", DateFormat.getDateInstance().format(new Date()));
    }
}
