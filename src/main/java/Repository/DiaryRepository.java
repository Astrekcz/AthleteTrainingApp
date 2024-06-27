package Repository;


import Model.Diary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.util.ArrayList;
//import java.util.List;


@Repository
public interface DiaryRepository extends JpaRepository<Diary, Long> {

    //    List<Diary> diaryRecord = new ArrayList<>();


}
