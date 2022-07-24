package oneTOoneMapping;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class question {
	@Id
	private int questionId;
	private String question;
	@OneToOne
	private answer answer;
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
	public answer getAnswer() {
		return answer;
	}
	public void setAnswer(answer answer) {
		this.answer = answer;
	}
	
}
