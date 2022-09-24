package com.hibernate.map2;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "question1")
public class question1 {
	@Id
	@Column(name = "question_id", unique = true, nullable = false)
	private int questionId;

	private String question;

	
	@OneToMany(mappedBy = "question")
	//here we mapped for not creating seperate table for joinig
	
	private List<Answer1> answer;


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public List<Answer1> getAnswer() {
		return answer;
	}


	public void setAnswer(List<Answer1> answer) {
		this.answer = answer;
	}


	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}


	public int getQuestionId() {
		return questionId;
	}


	public question1() {
		super();
		// TODO Auto-generated constructor stub
	}


	public question1(int questionId, String question, List<Answer1> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}





}