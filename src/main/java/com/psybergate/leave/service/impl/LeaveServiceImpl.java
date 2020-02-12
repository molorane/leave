package com.psybergate.leave.service.impl;

import com.psybergate.leave.entity.Leave;
import com.psybergate.leave.repository.LeaveRepository;
import com.psybergate.leave.service.LeaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class LeaveServiceImpl implements LeaveService {

    private final LeaveRepository leaveRepository;

    @Override
    public Leave createLeave(Leave leave) {
        return leaveRepository.save(leave);
    }
}
