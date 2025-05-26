package com.korit.springboot.controller.clinic;

import com.korit.springboot.domain.visit.VisitRepository;
import com.korit.springboot.dto.clinic.VisitRegisterDto;
import com.korit.springboot.mapper.VisitMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class VisitController {

    private VisitMapper visitMapper;
    private VisitRepository visitRepository;

//    @PostMapping("/api/clinic/visits")
//    public ResponseEntity<?> register(@RequestBody VisitRegisterDto visitRegisterDto) {
//        System.out.println(visitRegisterDto);
//        Visit visit = Visit.builder()
//                .patientId(VisitRegisterDto.getPatientId())
//                .doctorId(visitRegisterDto.getDoctorId())
//                .build();
//        visitMapper.insert(visit);
//        return ResponseEntity.ok("응답");
//    }

    @PostMapping("/api/clinic/visits")
    public ResponseEntity<?> register(@RequestBody VisitRegisterDto visitRegisterDto) {
        System.out.println(visitRegisterDto);
//        visitMapper.insert(visitRegisterDto.toEntity());
        visitRepository.save(visitRegisterDto.toEntity());
        return ResponseEntity.ok("응답");
    }

    }
