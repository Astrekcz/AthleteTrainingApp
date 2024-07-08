package com.example.athletestrainingdiary.Controller;

import com.example.athletestrainingdiary.Model.Diary;
import com.example.athletestrainingdiary.Model.dto.DiaryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.athletestrainingdiary.service.DiaryService;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
public class DiaryController {


    private final DiaryService diaryService;

  @PostMapping("/createDiary")
   public ResponseEntity<Diary> createdDiary(@RequestBody DiaryDto diaryDto) {
      Diary createDiary = diaryService.createdDiary(diaryDto);
      return new ResponseEntity<>(createDiary, HttpStatus.CREATED);
  }

}
