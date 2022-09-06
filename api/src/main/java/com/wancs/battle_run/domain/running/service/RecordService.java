package com.wancs.battle_run.domain.running.service;

import com.wancs.battle_run.domain.running.Entity.Record;
import com.wancs.battle_run.domain.running.dto.request.SaveRecordRequestDto;
import com.wancs.battle_run.domain.running.repository.RecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RecordService {
    private final RecordRepository recordRepository;

    public List<Record> findRecordsByUserId(Long userId){
        return recordRepository
                .findById(userId)
                .stream()
                .collect(Collectors.toList());
    }

    public Record findByRecord(Long recordId){
        return recordRepository
                .findById(recordId)
                .orElseThrow(() -> new IllegalArgumentException("no data"));
    }

    @Transactional
    public Long save(SaveRecordRequestDto requestDto){
        Record record = requestDto.toEntity();

        return recordRepository
                .save(record)
                .getId();
    }

    @Transactional
    public void deleteById(Long recordId){
        recordRepository.deleteById(recordId);
    }
}