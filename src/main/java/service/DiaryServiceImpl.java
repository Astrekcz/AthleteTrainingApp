package service;

import Model.Diary;
import Model.dto.DiaryDto;
import Repository.DiaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiaryServiceImpl {

    private final DiaryRepository diaryRepository;

   // @Override
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
