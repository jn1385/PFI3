package se.mah.k3.nilsson.johannes.essemess;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//public class essemess extends Activity implements OnClickListener {
public class essemess extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        
        final EditText edittext1 = (EditText) findViewById(R.id.editText1);
        final EditText edittext2 = (EditText) findViewById(R.id.editText2);
        final Button submitButton = (Button) findViewById(R.id.button1);
        
        OnClickListener C = new OnClickListener(){
        	//@Override
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		//String s = 
        		
        		Toast.makeText(essemess.this, edittext1.getText().toString(), 100).show();
        		Toast.makeText(essemess.this, edittext2.getText().toString(), 200).show();

        		EditText tagField = (EditText) findViewById(R.id.editText1);
        	    tagField.setText ("");
        		
        		EditText textField = (EditText) findViewById(R.id.editText2);
        		textField.setText ("");
        	}
        	};
        
        
        
        submitButton.setOnClickListener(C);	
	}

    

}