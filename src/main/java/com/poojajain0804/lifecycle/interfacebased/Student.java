package com.poojajain0804.lifecycle.interfacebased;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {

	private String studentName;
	private int studentId;

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + "]";
	}

	public Student() {
		super();
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		System.out.println("Lets set name first");
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		System.out.println("Lets set student ID");
		this.studentId = studentId;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("inside interface destroy");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("inside interface afterPropertiesSet ");
	}

}
