package com.zenith.hrportal.dto.mastergrade;

public class EmployeeCategoryGradeWsDTO {

  private String code;
  private String description;
  private String approvedBy;
  private String transferDetails;

  public void setCode(String code) {
    this.code = code;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setApprovedBy(String approvedBy) {
    this.approvedBy = approvedBy;
  }

  public void setTransferDetails(String transferDetails) {
    this.transferDetails = transferDetails;
  }

  public String getTransferDetails() {
    return transferDetails;
  }

  public String getApprovedBy() {
    return approvedBy;
  }

  public String getCode() {
    return code;
  }

  public String getDescription() {
    return description;
  }
}
