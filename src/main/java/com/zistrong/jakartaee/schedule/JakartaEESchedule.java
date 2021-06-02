package com.zistrong.jakartaee.schedule;

import jakarta.ejb.Schedule;
import jakarta.ejb.Singleton;
import jakarta.ejb.Stateless;

import java.util.Date;

@Stateless
@Singleton
public class JakartaEESchedule {

    @Schedule(second = "30", minute = "*", hour = "*")
    public void scheduleRun() {

        System.out.println(new Date());
    }
}
