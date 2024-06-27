package service;

import Model.Diary;
import Model.dto.DiaryDto;
import org.springframework.stereotype.Service;

@Service
public interface DiaryService {
    Diary createdDiary(DiaryDto diaryDto);

}
