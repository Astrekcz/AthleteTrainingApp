package com.example.athletestrainingdiary.service;

import com.example.athletestrainingdiary.Model.Diary;
import com.example.athletestrainingdiary.Model.dto.DiaryDto;
import com.example.athletestrainingdiary.Repository.DiaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("DiaryServiceImpl")
@RequiredArgsConstructor
@Component
public class DiaryServiceImpl implements DiaryService {

    private final DiaryRepository diaryRepository;

    @Override
    public Diary createdDiary(DiaryDto diaryDto){
        Diary diary = new Diary(
                diaryDto.getDate(),
                diaryDto.getTime(),
                diaryDto.getTitle(),
                diaryDto.getDurOfTraining(),
                diaryDto.getWarmUp(),
                diaryDto.getRuns(),
                diaryDto.getDurOfrun(),
                diaryDto.getDistanceOfrun()

        );
        return diaryRepository.save(diary);


    }
}
