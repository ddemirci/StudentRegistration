package com.demo.StudentRegistration.entity.dto;

import com.demo.StudentRegistration.entity.Lecture;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LectureResponseDTO {

    public Lecture Lecture;
    public String Message;
}
