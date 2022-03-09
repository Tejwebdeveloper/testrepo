package com.map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int Qid;
	
	@OneToOne
	@JoinColumn
	private String Ans;
	
	public String getAns() {
		return Ans;
	}
	public void setAns(String ans) {
		Ans = ans;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String ques,String ans) {
		super();
		Qid = qid;
		Ques = ques;
		Ans = ans;
	}
	public int getQid() {
		return Qid;
	}
	public void setQid(int qid) {
		Qid = qid;
	}
	public String getQues() {
		return Ques;
	}
	public void setQues(String ques) {
		Ques = ques;
	}
	private String Ques;

	public void setAns(Answer ans2) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
