package se.mah.k3.pfi3.nilsson.johannes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class InteOkej extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        FakeDatabase.create();
        
        Intent intent = new Intent(this, BrowseQuestions.class);
        startActivity(intent);
    }
}