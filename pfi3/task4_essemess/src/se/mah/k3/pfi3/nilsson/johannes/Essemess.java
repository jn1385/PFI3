package se.mah.k3.pfi3.nilsson.johannes;

//import se.mah.k3.pfi3.goransson.andreas.intenttests.ExplicitName;
//import se.mah.k3.pfi3.goransson.andreas.intenttests.IntentTests;
//import se.mah.k3.pfi3.goransson.andreas.intenttests.R;
import se.k3.goransson.andreas.essemmesslib.Essemmess;
import se.k3.goransson.andreas.essemmesslib.EssemmessHelper;
import se.k3.goransson.andreas.essemmesslib.EssemmessListener;
import se.k3.goransson.andreas.essemmesslib.EssemmessLoginEvent;
import se.k3.goransson.andreas.essemmesslib.EssemmessPublishEvent;
import se.k3.goransson.andreas.essemmesslib.EssemmessReadEvent;
import se.mah.k3.pfi3.nilsson.johannes.LoginView;
import se.mah.k3.pfi3.nilsson.johannes.Essemess;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Essemess extends Activity implements EssemmessListener  {
	//public class PostMessage extends Activity implements EssemmessListener {
		/** Called when the activity is first created. */
		// @Override

		Essemmess mServer = EssemmessHelper.getServer( this );

		public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// final EditText edittext1 = (EditText) findViewById(R.id.editText1);
		// final EditText edittext2 = (EditText) findViewById(R.id.editText2);

		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

		EditText tagField = (EditText) findViewById(R.id.editText1); 
		EditText textField = (EditText) findViewById(R.id.editText2);

		mServer.post( textField.getText().toString(), tagField.getText().toString());
		
		tagField.setText ("");
		textField.setText ("");
		Intent bytSkarm = new Intent(Essemess.this, ListViewjn.class);
		startActivity(bytSkarm);
		
		

		}

		});
		}

		@Override
		public void NewEssemmessPosts(EssemmessReadEvent evt) {
		// TODO Auto-generated method stub



		}

		@Override
		public void NewEssemmessLogin(EssemmessLoginEvent evt) {
		// TODO Auto-generated method stub



		}

		@Override
		public void NewEssemmessPublish(EssemmessPublishEvent evt) {
		// TODO Auto-generated method stub

		}
		
}
		