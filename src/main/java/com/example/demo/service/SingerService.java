package com.example.demo.service;

import com.example.demo.entity.Singer;
import com.example.demo.repository.SingerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SingerService {

    @Autowired
    private SingerRepository singerRepository;

    public List<Singer> findSingerAll() {
        return singerRepository.findAll();
    }

    public Singer findSingerById(long id) {
        Optional<Singer> singer = singerRepository.findById(id);
        return singer.get();
    }

    public void saveSinger(Singer singer) {
        singerRepository.save(singer);
    }

    public void deleteSinger(long id) {
        singerRepository.deleteById(id);
    }
}
