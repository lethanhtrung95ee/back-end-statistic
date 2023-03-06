package com.example.statistic.controllers;

import com.example.statistic.services.impl.StatisticServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/statistic")
@CrossOrigin
public class StatisticController {

    @Autowired
    StatisticServiceImpl statisticServiceImpl;

    @GetMapping("/waiting-birthday")
    public void waitingBirthday() {
        statisticServiceImpl.waitingBirthday();
    }

    @GetMapping("/watch-video-initial")
    public void watchVideoInitial() {
        statisticServiceImpl.watchVideoInitial();
    }

    @GetMapping("/start-video")
    public void startVideo() {
        statisticServiceImpl.startVideo();
    }

    @GetMapping("/pause-video")
    public void pauseVideo() {
        statisticServiceImpl.pauseVideo();
    }

    @GetMapping("/getAll")
    public Map<String, Map<Long, Date>> getAll() {
        return statisticServiceImpl.getAll();
    }

    @GetMapping("/reset")
    public void reset() {
        statisticServiceImpl.reset();
    }
}
