package org.ruiscoder.myvhr.service;

import org.ruiscoder.myvhr.mapper.SalaryMapper;
import org.ruiscoder.myvhr.model.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author ruiscoder
 * @date 2021- 10-25 下午7:42
 */
@Service
public class SalaryService {
    @Autowired
    SalaryMapper salaryMapper;
    public List<Salary> getAllSalaries() {
        return salaryMapper.getAllSalaries();
    }

    public Integer addSalary(Salary salary) {
        salary.setCreateDate(new Date());
        return salaryMapper.insertSelective(salary);
    }

    public Integer deleteSalaryById(Integer id) {
        return salaryMapper.deleteByPrimaryKey(id);
    }

    public Integer updateSalaryById(Salary salary) {
        return salaryMapper.updateByPrimaryKeySelective(salary);
    }
}
