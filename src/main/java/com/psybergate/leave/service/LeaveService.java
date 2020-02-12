package com.psybergate.leave.service;

import com.psybergate.leave.entity.Leave;

import java.time.LocalDate;

public interface LeaveService {
    Leave createLeave(Leave leave);
}
