package se.mah.k3.pfi3.nilsson.johannes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PostQuestion extends Activity {
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//Log.d("k3", "PostQuestion onCreate()");
		setContentView(R.layout.post_questions);
		
		
		final EditText questionHeadlineEditText = (EditText) findViewById(R.id.questionHeadlineEditText);		
		final Button submitQuestionButton = (Button) findViewById(R.id.submitQuestionButton);
		final EditText questionContentEditText = (EditText) findViewById(R.id.questionContentEditText);
		
		
		
		
		

		
		
		submitQuestionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	
            	FakeDatabase.postNewQuestion(new Question(questionHeadlineEditText.getText().toString(), questionContentEditText.getText().toString(), "testanvändare", "test-tagg"));
            	Log.d("k3", questionHeadlineEditText.getText().toString());
            	
            	Intent intent = new Intent(PostQuestion.this, BrowseQuestions.class);
            	startActivity(intent); 
            	
            }
            
            
        });
	}
	

	
	
	

}
