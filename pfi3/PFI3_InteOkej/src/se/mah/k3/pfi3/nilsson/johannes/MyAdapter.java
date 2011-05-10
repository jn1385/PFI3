package se.mah.k3.pfi3.nilsson.johannes;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class MyAdapter extends ArrayAdapter<Question> {

	private ArrayList items;
	private LayoutInflater inflater;
	private BrowseQuestions myParent;

	public MyAdapter(Context context, int textViewResourceId, ArrayList items) {
		super(context, textViewResourceId, items);
		this.items = items;
		this.myParent = (BrowseQuestions) context;
	}


	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflater = myParent.getLayoutInflater();
		View row = inflater.inflate(R.layout.question_list_item, parent, false);
		TextView label = (TextView)row.findViewById(R.id.list_content);
		
		Question question = (Question) items.get(position);
		
		label.setText(question.getTitle());
		/*
		QuestionStatsView qsw = (QuestionStatsView) row.findViewById(R.id.statsview);
		qsw.setValues(q.getAnswers().size(), q.getNumSupporters());
		*/
		TextView numReplies = (TextView) row.findViewById(R.id.num_replies);
		numReplies.setText(Integer.toString(question.getAnswers().size()));
		TextView numSupporters = (TextView) row.findViewById(R.id.num_supports);
		numSupporters.setText(Integer.toString(question.getNumSupporters()));
		return row;
	}

}
