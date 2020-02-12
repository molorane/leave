package com.psybergate.leave.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Data
@RequiredArgsConstructor
@Accessors(fluent = true)
public class Leave {

    private final int id;
    private final LocalDate startDate;
    private final LocalDate endDate;

}
