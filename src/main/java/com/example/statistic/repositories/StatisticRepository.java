package com.example.statistic.repositories;

import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StatisticRepository {

    private Map<Long, Date> waitingBirthday = new HashMap<>();
    private Map<Long, Date> watchVideoInitial = new HashMap<>();
    private Map<Long, Date> startVideo = new HashMap<>();
    private Map<Long, Date> pauseVideo = new HashMap<>();
    private Long waitingBirthdayNumber = 0L;
    private Long watchVideoInitialNumber = 0L;
    private Long startVideoNumber = 0L;
    private Long pauseVideoNumber = 0L;

    public void waitingBirthday() {
        Date now = new Date();
        waitingBirthday.put(++waitingBirthdayNumber, new Date(now.getTime() + 7 * 3600*1000));
    }

    public void watchVideoInitial() {
        Date now = new Date();
        watchVideoInitial.put(++watchVideoInitialNumber, new Date(now.getTime() + 7 * 3600*1000));
    }

    public void startVideo() {
        Date now = new Date();
        startVideo.put(++startVideoNumber, new Date(now.getTime() + 7 * 3600*1000));
    }

    public void pauseVideo() {
        Date now = new Date();
        pauseVideo.put(++pauseVideoNumber, new Date(now.getTime() + 7 * 3600*1000));
    }

    public Map<String, Map<Long, Date>> getAll() {
        Map<String, Map<Long, Date>> data = new HashMap<>();
        data.put("waitingBirthday", waitingBirthday);
        data.put("watchVideoInitial", watchVideoInitial);
        data.put("startVideo", startVideo);
        data.put("pauseVideo", pauseVideo);
        return data;
    }

    public void reset() {
        waitingBirthday = new HashMap<>();
        watchVideoInitial = new HashMap<>();
        startVideo = new HashMap<>();
        pauseVideo = new HashMap<>();
    }
}
