package com.zjy.elets.bean;

import java.io.Serializable;

public class Exam_info implements Serializable{
	/*
	"course":"android",
 	"total":20,
 	"time":10,
 	"question":"android.json" 
	*/
	private String course;
	private int total;
	private int time;
	private String question;
	private User user;
	public Exam_info(){}
	public Exam_info(String course,int total,int time,String question,User user){
		this.course=course;
		this.total=total;
		this.time=time;
		this.question=question;
		this.user=user;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	@Override
	public String toString() {
		int userId=1001;
		return 	"考试科目："+course+
				"\t考生编号:"+userId+
				"\t考题数量:"+total+
				"\t考试时间"+time;
	}
	public static void main(){
		Exam_info ei=new Exam_info();
		System.out.println(ei.toString());
	}
}
