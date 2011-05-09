package se.mah.k3.pfi3.nilsson.johannes;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

public class BrowseQuestions extends Activity {
	
	private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browse_questions);
		
		FakeDatabase.create();
		
		listView = (ListView) findViewById(R.id.questionlist);
		
		final String[] PENS = new String[]{
			"lorem ipsum lorem ipsum ad et cae lorem ipsum mumsi pumsi",
			"Gucci",
			"Parker",
			"Sailor",
			"Porsche Design",
			"Rotring",
			"Sheaffer",
			"Waterman"
			};
		
		listView.setAdapter(new ArrayAdapter<String>(
	            this,R.layout.question_list_item, R.id.list_content, PENS));
	}

}
