package com.thoughtworks.capability.gtb.entrancequiz.domain;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    Integer id;
    String studentName;
}
