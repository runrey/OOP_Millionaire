package game;

public abstract class Questions {
	private String question;
	private String a;
	private String b;
	private String c;
	private String d;
	private String answer;
	
	Questions(String question, String a, String b, String c, String d, String answer){
		this.setQuestion(question);
		this.setA(a);
		this.setB(b);
		this.setC(c);
		this.setD(d);
		this.setAnswer(answer);
	}
	
	public String getQuestion() {
		return question;
	}
	private void setQuestion(String question) {
		this.question = question;
	}
	public String getA() {
		return a;
	}
	private void setA(String a) {
		this.a = a;
	}
	public String getD() {
		return d;
	}
	private void setD(String d) {
		this.d = d;
	}
	public String getB() {
		return b;
	}
	private void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	private void setC(String c) {
		this.c = c;
	}
	public String getAnswer() {
		return answer;
	}
	private void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
