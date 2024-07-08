package com.example.athletestrainingdiary.service;

import com.example.athletestrainingdiary.Model.Diary;
import com.example.athletestrainingdiary.Model.dto.DiaryDto;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public interface DiaryService {


    Diary createdDiary(DiaryDto diaryDto);



}
