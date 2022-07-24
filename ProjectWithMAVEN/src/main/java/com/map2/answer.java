package com.map2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity(name="new_answer")
public class answer {

	@Id
private int answerId;
private String answer;
@ManyToOne
private question question;

public question getQuestion() {
	return question;
}
public void setQuestion(question question) {
	this.question = question;
}
public answer() {
	super();
}
public int getAnswerId() {
	return answerId;
}
public void setAnswerId(int answerId) {
	this.answerId = answerId;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}


}


