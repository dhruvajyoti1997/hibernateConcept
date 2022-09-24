package com.hibernate.map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class question {
	@Id
	@Column(name = "question_id", unique = true, nullable = false)
	// @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;

	private String question;

	// one to one relation mappring is set for -
	/*
	 * only one answer is for one question unidirectional
	 * 
	 * 
	 */
	/*
	 * save the transient instance before flushing: error is coming so we used
	 * 
	 * @OneToOne(cascade = {CascadeType.ALL}) instead of
	 * 
	 * @OneToOne() So in a nutshell, entity relationships defined with
	 * CascadeType.All will ensure that all persistence events such as persist,
	 * refresh, merge and remove that occur on the parent, will be passed to the
	 * child. Defining other CascadeType options provides the developer with a more
	 * granular level of control over how the entity association handles
	 * persistence.
	 * 
	 * For example if I had an object Book that contained a List of pages and I add
	 * a page object within this list. If the @OneToMany annotation defining the
	 * association between Book and Page is marked as CascadeType.All, persisting
	 * the Book would result in the Page also being persisted to the database.
	 */
	@OneToOne(cascade = { CascadeType.ALL })
	private Answer answer;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public question(int questionId, String question, Answer answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
	}

	public question() {
		super();
		// TODO Auto-generated constructor stub
	}

}
