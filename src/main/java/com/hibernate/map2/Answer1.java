package com.hibernate.map2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name= "answer1")
public class Answer1 {

	@Id
	@Column(name = "answer_id")
	private int answerId;
	private String Answer;
	
	@ManyToOne
	private question1 question;

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return Answer;
	}

	public void setAnswer(String answer) {
		Answer = answer;
	}

	public question1 getQuestion() {
		return question;
	}

	public void setQuestion(question1 question) {
		this.question = question;
	}

	public Answer1(int answerId, String answer, question1 question) {
		super();
		this.answerId = answerId;
		Answer = answer;
		this.question = question;
	}

	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
