package com.zenith.hrportal.dto.leave;

/**
 * The type Leave by month ws dto.
 */
public class LeaveByMonthWsDTO {

    private String month;
    private long count;

    /**
     * Instantiates a new Leave by month ws dto.
     */
    public LeaveByMonthWsDTO() {
    }

    /**
     * Instantiates a new Leave by month ws dto.
     *
     * @param month the month
     * @param count the count
     */
    public LeaveByMonthWsDTO(String month, long count) {
        this.month = month;
        this.count = count;
    }

    /**
     * Gets month.
     *
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * Sets month.
     *
     * @param month the month
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * Gets count.
     *
     * @return the count
     */
    public long getCount() {
        return count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    public void setCount(long count) {
        this.count = count;
    }
}
