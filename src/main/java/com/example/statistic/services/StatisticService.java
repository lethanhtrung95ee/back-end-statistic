package com.example.statistic.services;

import java.util.Date;
import java.util.Map;

public interface StatisticService {
    public void waitingBirthday();
    public void watchVideoInitial();
    public void startVideo();
    public void pauseVideo();

    Map<String, Map<Long, Date>> getAll();

    void reset();
}
