package se.mah.k3.pfi3.nilsson.johannes;

import se.k3.goransson.andreas.essemmesslib.Essemmess;
import se.k3.goransson.andreas.essemmesslib.EssemmessHelper;
import se.k3.goransson.andreas.essemmesslib.EssemmessListener;
import se.k3.goransson.andreas.essemmesslib.EssemmessLoginEvent;
import se.k3.goransson.andreas.essemmesslib.EssemmessPublishEvent;
import se.k3.goransson.andreas.essemmesslib.EssemmessReadEvent;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class LoginView extends Activity /*implements OnClickListener*/ implements EssemmessListener{
    // Called when the activity is first created. 
	
	Essemmess essemmess;

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.loginview);
        
        final EditText edittext1 = (EditText) findViewById(R.id.editText1);
        final EditText edittext2 = (EditText) findViewById(R.id.editText2);
        final Button submitButton = (Button) findViewById(R.id.button1);
        
        essemmess = EssemmessHelper.getServer(this);
        essemmess.addEssemmessEventListener(this);
        
        OnClickListener C = new OnClickListener(){
        	//@Override
        	public void onClick(View v) {
        		
        		String username = edittext1.getText().toString();
        		String password = edittext2.getText().toString();
        		
        		essemmess.login(username, password);
        		
        			
        		//finish();
        		}
        	
        	};
        	
        	 submitButton.setOnClickListener(C);	
    }

	@Override
	public void NewEssemmessPosts(EssemmessReadEvent evt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NewEssemmessLogin(EssemmessLoginEvent evt) {
		// TODO Auto-generated method stub
		/*
		Intent explicit = new Intent(LoginView.this, Essemess.class);
		startActivity(explicit);
		*/
		if(evt.getLoggedin() != true){
			
		}else{
			Intent bytSkarm = new Intent (LoginView.this, Essemess.class);
			this.startActivity(bytSkarm);
		
		
		Toast.makeText(LoginView.this, "logged in", 3000).show();
		}
	}

	@Override
	public void NewEssemmessPublish(EssemmessPublishEvent evt) {
		// TODO Auto-generated method stub
		
	}

        
}   
        
       

	

    

