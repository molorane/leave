package com.psybergate.leave.repository;

import com.psybergate.leave.entity.Leave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<Leave,Long> {

}
