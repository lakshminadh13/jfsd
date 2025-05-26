package com.example.management.model;

import java.math.BigDecimal;
import java.time.LocalDate;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "salaries")
public class Salary {

 
    @Id
    private Integer id;
    @Column (name = "employee_id")
    private String employeeeId;
    @Column
    private BigDecimal amount;
    @Column
     private LocalDate payDate;
    public void setId(Integer id2) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }


}
