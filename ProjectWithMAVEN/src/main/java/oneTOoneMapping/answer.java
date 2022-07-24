package oneTOoneMapping;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class answer {
	
	@Id
private int answerId;
private String answer;

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
