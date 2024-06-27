package com.example.athletestrainingdiary.Controller;

import Model.Diary;
import Model.dto.DiaryDto;
import Repository.DiaryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DiaryService;

@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class DiaryController {

    private final DiaryService diaryService;

  @PostMapping("/createDiary")
   public ResponseEntity<Diary> createdDiary(@RequestBody DiaryDto diaryDto) {
      Diary createdDiary = diaryService.createdDiary(diaryDto);
      return new ResponseEntity<>(createdDiary, HttpStatus.CREATED);
  }

}
