package com.example.statistic.services.impl;

import com.example.statistic.repositories.StatisticRepository;
import com.example.statistic.services.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    StatisticRepository statisticRepository;

    @Override
    public void waitingBirthday() {
        statisticRepository.waitingBirthday();
    }

    @Override
    public void watchVideoInitial() {
        statisticRepository.watchVideoInitial();
    }

    @Override
    public void startVideo() {
        statisticRepository.startVideo();
    }

    @Override
    public void pauseVideo() {
        statisticRepository.pauseVideo();
    }

    @Override
    public Map<String, Map<Long, Date>> getAll(){
        return statisticRepository.getAll();
    }

    @Override
    public void reset(){
        statisticRepository.reset();
    }
}
