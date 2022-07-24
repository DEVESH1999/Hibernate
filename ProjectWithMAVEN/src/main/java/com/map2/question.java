package com.map2;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity(name="new_question")
public class question {
	@Id
	private int questionId;
	private String question;
	@OneToMany(mappedBy="question")
	private List<answer>answers;
	public question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<answer> answers) {
		this.answers = answers;
	}
	

}
