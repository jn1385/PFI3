package se.mah.k3.pfi3.nilsson.johannes;


import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.widget.AdapterView.OnItemClickListener;
import android.view.*;
import android.view.View.OnClickListener;
import se.k3.goransson.andreas.essemmesslib.*;
// import android.text.*;

public class ListViewjn extends Activity implements EssemmessListener {

ListView listview;
Essemmess mServer = EssemmessHelper.getServer( this );
ArrayList <String> Posts; 
ArrayAdapter<String> adapter;

@Override
public void onCreate(Bundle savedInstanceState) {
    setContentView(R.layout.listview);
super.onCreate(savedInstanceState);

Posts = new ArrayList<String>();

mServer.addEssemmessEventListener(this);

listview =  (ListView) findViewById(R.id.listView1);

adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Posts);

listview.setAdapter(adapter);

Button button = (Button) findViewById(R.id.button1);
button.setOnClickListener(new OnClickListener(){

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		mServer.read("");
	}});





}

@Override
public void NewEssemmessPosts(EssemmessReadEvent evt) {
// TODO Auto-generated method stub
	ArrayList<Post> newposts = evt.getPosts();

	for( Post p : newposts ){
		Posts.add(p.user + "-" + p.tag + "-" + p.message);
		
		
	}
	
	adapter.notifyDataSetChanged();

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

