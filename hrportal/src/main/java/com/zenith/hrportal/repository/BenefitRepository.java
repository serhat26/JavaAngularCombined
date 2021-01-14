package com.zenith.hrportal.repository;

import com.zenith.hrportal.entities.benefit.Benefit;
import com.zenith.hrportal.entities.benefit.BenefitIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The interface Benefit repository.
 */
@Repository
public interface BenefitRepository extends JpaRepository< Benefit, BenefitIdentity > {

    /**
     * Find number of employees per salary bracket list.
     *
     * @return the list
     */
    @Query(value = "select c.description, COUNT(*) FROM ORYX.PP_EMPLOYEES e \n" +
            "JOIN ORYX.PP_BENEFITS b\n" +
            "ON \n" +
            "e.id = b.emp_id\n" +
            "AND e.pml_id = b.emp_pml_id\n" +
            "JOIN ORYX.PP_TRX_TYPES c \n" +
            "ON \n" +
            "b.pptrx_trx_id = c.trx_id\n" +
            "AND b.pptrx_pml_id = c.pml_id\n" +

            "AND NVL(b.current_benf,'N')='Y'\n" +
            " GROUP BY c.description",nativeQuery = true)
    List< Object[] > findNumberOfEmployeesPerSalaryBracket();


    /**
     * Find salary increment history list.
     *
     * @param empNos the emp nos
     * @return the list
     */
    @Query(value = "SELECT" +
            " c.description, b.amount, b.create_date , a.id FROM ORYX.PP_EMPLOYEES a,ORYX.PP_BENEFITS b,ORYX.PP_TRX_TYPES c \n" +
            "WHERE a.id = b.emp_id \n" +
            "AND a.pml_id = b.emp_pml_id \n" +
            "AND b.pptrx_trx_id = c.trx_id \n" +
            "AND b.pptrx_pml_id = c.pml_id \n" +
            "AND nvl(b.current_benf,'N')='Y' \n" +
            "AND a.id IN ?1 \n" +
            "ORDER BY b.create_date , amount ASC \n",nativeQuery = true)
    List< Object[]> findSalaryIncrementHistory(List<Long> empNos);

    /**
     * Find number of employees per salary total list.
     *
     * @return the list
     */
    @Query(value = "SELECT \n" +
            "CASE WHEN y.total_benefit < 500 THEN '0-500' \n" +
            "WHEN y.total_benefit < 1000 THEN '500-1000' \n" +
            "WHEN y.total_benefit < 1500 THEN '1000-1500' \n" +
            "ELSE '2000-' END AS intervals \n" +
            ",SUM(y.employee_count) as Employee_Count \n" +
            "FROM \n" +
            "( \n" +
            "SELECT COUNT(x.employee) AS Employee_Count, x.benefit_total AS Total_Benefit \n" +
            "FROM \n" +
            "( \n" +
            "SELECT a.empno as employee, SUM(b.amount) benefit_total \n" +
            "FROM ORYX.pp_employees a \n" +
            "JOIN ORYX.pp_benefits b ON a.id = b.emp_id AND a.pml_id = b.emp_pml_id \n" +
            "WHERE NVL(b.current_benf,'N') = 'Y' \n" +
            "AND b.valıd_upto >= SYSDATE \n" +
            "GROUP BY a.empno \n" +
            ")x \n" +
            "GROUP BY x.benefit_total \n" +
            ")y \n" +
            "GROUP BY  \n" +
            "CASE WHEN y.total_benefit < 500 THEN '0-500'  \n" +
            "WHEN y.total_benefit < 1000 THEN '500-1000'  \n" +
            "WHEN y.total_benefit < 1500 THEN '1000-1500'  \n" +
            "ELSE '2000-' END  ", nativeQuery = true)
    List< Object[] > findNumberOfEmployeesPerSalaryTotal();
}
