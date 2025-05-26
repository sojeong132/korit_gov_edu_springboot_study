package com.korit.springboot.dto.clinic;

//import com.korit.springboot.mapper.dto.Visit;
import com.korit.springboot.domain.visit.Visit;
import lombok.Data;

import java.time.LocalDateTime;

/*
    "
        {
            "patientId" : ?,
            "doctorId" : ?,
            "treatmentId" : ?,
            "visitDate" : "0000-00-00 00:00:00",
            "fee" : 0
        }
    "
 */

@Data
public class VisitRegisterDto {
    private Integer patientId;
    private Integer doctorId;
    private Integer treatmentId;
    private LocalDateTime visitDate;
    private Integer fee;

    public Visit toEntity() {
        return Visit.builder()
                .patientId(patientId)
                .doctorId(doctorId)
                .treatmentId(treatmentId)
                .visitDate(visitDate)
                .fee(fee)
                .build();
    }


}
