package com.sch.springboot.repository;

import com.sch.springboot.dto.Employee;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class JdbcTemplateEmployeeRepository implements EmployeeRepositoryInterface {

    // DB 연동 객체 생성 및 호출
    //사원객체를 저장하는 List<Employee>
    private List<Employee> list = new ArrayList<Employee>();
    private final JdbcTemplate jdbcTemplate;

    public JdbcTemplateEmployeeRepository(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }




    /** 회원 리스트 조회 */
    @Override
    public List<Employee> selectAll() {
        String sql = "SELECT sno, name, address,department,edate FROM employee";
        return jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Employee.class)); //bean이 하나하나 추가해주는 거임
    }

    /** 회원 가입 */
    @Override
    public int insert(Employee employee) {
        String sql = "insert into employee (sno, name, address,department, edate) VALUES (?, ?, ?, ?, now())";    //?는 사람이 등록하는 것 (매번 바뀌는것)
        int rows = jdbcTemplate.update(sql,
                employee.getSno() ,
                employee.getName(),
                employee.getAddress(),
                employee.getDepartment());
        return rows;
    }

}
