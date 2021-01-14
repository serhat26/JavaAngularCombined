package com.zenith.hrportal.dto.employee;

import com.zenith.hrportal.dto.trade.TradeWsDTO;
import com.zenith.hrportal.entities.employee.EmployeeType;

public class SalaryIncrementHistoryRequestDTO {

    private Long empNo;
    private TradeWsDTO profession;
    private EmployeeType position;

    public SalaryIncrementHistoryRequestDTO() {
    }

    public SalaryIncrementHistoryRequestDTO(Long empNo, TradeWsDTO profession, EmployeeType position) {
        this.empNo = empNo;
        this.profession = profession;
        this.position = position;
    }

    public Long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Long empNo) {
        this.empNo = empNo;
    }

    public TradeWsDTO getProfession() {
        return profession;
    }

    public void setProfession(TradeWsDTO profession) {
        this.profession = profession;
    }

    public EmployeeType getPosition() {
        return position;
    }

    public void setPosition(EmployeeType position) {
        this.position = position;
    }
}
