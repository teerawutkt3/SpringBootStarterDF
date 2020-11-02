package com.example.demo.controller;

import com.example.demo.entity.Singer;
import com.example.demo.service.SingerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/singer")
public class SingerController {

    @Autowired
    private SingerService singerService;

    @GetMapping("/")
    public ResponseEntity<List<Singer>> findSingerAll() {
        List<Singer> result = singerService.findSingerAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Singer> findSingerById(@PathVariable long id) {
        Singer result = singerService.findSingerById(id);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/")
    public ResponseEntity<String> saveSinger(@RequestBody Singer singer) {
        singerService.saveSinger(singer);
        return  ResponseEntity.ok("Save Success");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteSinger(@PathVariable long id) {
        singerService.deleteSinger(id);
        return ResponseEntity.ok("Delete Success");
    }
}
