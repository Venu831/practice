package com.example.demo.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DoaImpl {
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	@Autowired
	JdbcTemplate jdbcTemplate11;

	public List<Employee> get() {
		return jdbcTemplate11.query("select sal,mgr,job,hiredate,ename,empno,deptno,comm from emp",
				new BeanPropertyRowMapper<>(Employee.class));
	}

	public List<String> get1() {
		return jdbcTemplate11.queryForList("select sal from emp where deptno=?", String.class, 10);
	}

	public List<Employee> get2() {
		List<Employee> list1 = new ArrayList<>();
		jdbcTemplate11.query("select sal,mgr,job,hiredate,ename,empno,deptno,comm from emp", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();
				emp.setSal(rs.getInt("sal"));
				emp.setMgr(rs.getString("mgr"));
				emp.setJob(rs.getString("job"));
				emp.setHiredate(rs.getString("hiredate"));
				emp.setEname(rs.getString("ename"));
				emp.setEmpno(rs.getInt("empno"));
				emp.setDeptno(rs.getInt("deptno"));
				emp.setComm(rs.getString("comm"));
				list1.add(emp);

				return emp;
			}

		});
		return list1;
	}

	public int insert() {
		Date date =new Date();
		System.out.println(date.getTime());
		return jdbcTemplate11.update(
				"insert into emp (sal,mgr,job,hiredate,ename,empno,deptno,comm) values(?,?,?,?,?,?,?,?)", 1000, 2000,"developer",date,"ram",258,852,20220729);

	}

}
