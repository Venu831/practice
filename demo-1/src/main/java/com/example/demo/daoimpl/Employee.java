package com.example.demo.daoimpl;

public class Employee {
private int sal;
private String mgr;
private String job;
private String hiredate;
private String ename;
private int empno;
private int deptno;
private String comm;
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public String getMgr() {
	return mgr;
}
public void setMgr(String mgr) {
	this.mgr = mgr;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public String getHiredate() {
	return hiredate;
}
public void setHiredate(String hiredate) {
	this.hiredate = hiredate;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getComm() {
	return comm;
}
public void setComm(String comm) {
	this.comm = comm;
}
@Override
public String toString() {
	return "Employee [sal=" + sal + ", mgr=" + mgr + ", job=" + job + ", hiredate=" + hiredate + ", ename=" + ename
			+ ", empno=" + empno + ", deptno=" + deptno + ", comm=" + comm + "]";
}

}
