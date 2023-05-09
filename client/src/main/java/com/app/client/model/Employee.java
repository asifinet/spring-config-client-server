package com.app.client.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee implements Serializable {
	/**
	 * 
	 */
	Employee(){}
	private static final long serialVersionUID = 1L;
	@Id	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private Integer empno;
	private String name;
	private String dob;
	private String job;
	private String hiredate;
	private int mgrno;
	private long salary;
	private long comm;
	private int deptno;

	public Employee(int id, Integer empno, String name, String dob, String job, String hiredate, int mgrno, long salary,
			long comm, int deptno) {
		super();
		this.id = id;
		this.empno = empno;
		this.name = name;
		this.dob = dob;
		this.job = job;
		this.hiredate = hiredate;
		this.mgrno = mgrno;
		this.salary = salary;
		this.comm = comm;
		this.deptno = deptno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getEmpno() {
		return empno;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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

	public int getMgrno() {
		return mgrno;
	}

	public void setMgrno(int mgrno) {
		this.mgrno = mgrno;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public long getComm() {
		return comm;
	}

	public void setComm(long comm) {
		this.comm = comm;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

}
