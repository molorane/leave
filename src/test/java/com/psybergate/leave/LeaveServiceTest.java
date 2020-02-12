package com.psybergate.leave;

import com.psybergate.leave.entity.Leave;
import com.psybergate.leave.repository.LeaveRepository;
import com.psybergate.leave.service.LeaveService;
import com.psybergate.leave.service.impl.LeaveServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.time.Duration;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
import static org.junit.Assert.assertEquals;


public class LeaveServiceTest {

    private final Leave dummyleave = new Leave(2019, LocalDate.now(),LocalDate.now().plusDays(23));

    @Test
    public void shouldReturnLeaveWith23Days(){

        LeaveRepository leaveRepository = Mockito.mock(LeaveRepository.class);
        LeaveService leaveService = new LeaveServiceImpl(leaveRepository);
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.now().plusDays(23);
        Mockito.when(leaveRepository.save(dummyleave)).thenReturn(dummyleave);

        Leave leave = leaveService.createLeave(dummyleave);
        Assert.assertEquals(startDate, leave.startDate());
        Assert.assertEquals(endDate, leave.endDate());
        assertEquals("Days returned not 23 days.",23, DAYS.between(leave.startDate(), leave.endDate()));
    }

    @Test
    public void shouldCreateLeaveWhenDaysAreAvailable(){
        LeaveRepository leaveRepository = Mockito.mock(LeaveRepository.class);
        LeaveService leaveService = new LeaveServiceImpl(leaveRepository);
        Leave leave = leaveService.createLeave(dummyleave);
        Mockito.when(leaveRepository.save(leave)).thenReturn(leave);
    }

}
