package Model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class DiaryDto {

    private LocalDateTime date;
    private LocalDateTime time;
    private String Title;
    private Long DurOfTraining;  //duration of training in hours
    private String warmUp;
    private String runs;
    private Long durOfrun;        //duration of runs... 200m break 1min etc
    private Long distanceOfrun;
}
