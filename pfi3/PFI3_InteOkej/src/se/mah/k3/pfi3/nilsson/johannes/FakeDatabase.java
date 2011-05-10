package se.mah.k3.pfi3.nilsson.johannes;

import java.util.ArrayList;

public class FakeDatabase {
	
	private static ArrayList<Question> questions;
	
	
	public FakeDatabase() {
	}
	
	/**
	 * Creates the database and fills it with garbage
	 */
	public static void create()
	{
		questions = new ArrayList<Question>();
		
		//Fyll fake-databasen med meningsfullt innehåll enligt den här mallen:
		Question q = new Question("Jag blir mobbad på WoW :(", "Det är verkligen jobbigt och jag mår himla dåligt", "kalle_boy_98", "dataspel");
		q.support();
		q.support();
		q.support();
		q.support();
		q.support();
		
		q.getAnswers().add(new Answer("stackars dig!", "crazy_girl_95"));
		q.getAnswers().add(new Answer("det ordnar sig ska du se!", "TonySoprano"));
		Answer a = new Answer("kämpa på!", "kalle");
		a.like();
		a.like();
		q.getAnswers().add(a);
		
		questions.add(q);
		
		Question q2 = new Question("Jag har inga venner på lunar :( ", "", "nogger_black", "sex");
		q2.support();
		
		q2.getAnswers().add(new Answer("", ""));
		questions.add(q2);
		questions.add(new Question("bla1 bla lorem ipsum shipsum lalala hej", "", "", ""));
		questions.add(new Question("bla2", "", "", ""));
		questions.add(new Question("bla bla bla bla", "", "", ""));
		questions.add(new Question("bla bla lorem ipsum", "", "", ""));
	}
	
	/**
	 * 
	 * Returns a list containing all the questions stored in the database
	 */
	public static ArrayList<Question> getAllQuestions()
	{
		return questions;
	}
	
	public static ArrayList<Question> getUnansweredQuestions()
	{
		ArrayList<Question> unansweredQuestions = new ArrayList<Question>();
		for(int i = 0; i < questions.size(); i ++){
			if(questions.get(i).getAnswers().size() == 0){
				unansweredQuestions.add(questions.get(i));
			}
		}
		return unansweredQuestions;
	}
	
	/**
	 * Adds a new question to the database
	 * 
	 * @param question the question
	 */
	public static void postNewQuestion(Question question)
	{
		questions.add(question);
	}
	
	/**
	 * Adds a new answer to a specified question
	 * @param question
	 * @param answer
	 */
	public static void answerQuestion(Question question, Answer answer)
	{
		question.getAnswers().add(answer);
	}
	
	/**
	 * Adds support to a specified question
	 * @param question
	 */
	public static void supportQuestion(Question question)
	{
		question.support();
	}
	
	/**
	 * 
	 * @param answer
	 */
	public static void likeAnswer(Answer answer)
	{
		answer.like();
	}
}
