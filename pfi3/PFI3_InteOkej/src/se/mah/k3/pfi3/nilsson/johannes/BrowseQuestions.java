package se.mah.k3.pfi3.nilsson.johannes;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class BrowseQuestions extends Activity implements OnItemClickListener {
	
	private ListView listView;
	
	private ArrayList<Question> questions;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browse_questions);
		
		FakeDatabase.create();
		questions = FakeDatabase.getUnansweredQuestions();
		
		listView = (ListView) findViewById(R.id.questionlist);
		listView.setTextFilterEnabled(true);
		
		listView.setOnItemClickListener(this);
		listView.setAdapter(new MyAdapter(
	            this, R.layout.question_list_item, questions));
		
		
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View view, int index, long arg3) {
		//view.setBackgroundColor(Color.BLUE);
		Toast.makeText(this, questions.get(index).getContent(), Toast.LENGTH_LONG).show();
		/*
		ReadQuestion.setQuestion(questions.get(index));
		Intent intent = new Intent(this, ReadQuestion.class);
		startActivity(intent);
		*/
	}
	
}
