package com.jetbasrawi.googleglass.glassvideoplayerexample;

import com.jetbasrawi.googleglass.glassvideoplayerexample.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

	private static final String TAG = MainActivity.class.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		Intent videoIntent = new Intent();
		videoIntent.setAction("com.google.glass.action.VIDEOPLAYER");
		videoIntent.putExtra("video_url", "https://www.youtube.com/watch?v=6jl9FMOpt50"); 
		startActivity(videoIntent);
	}
	
	
	

	@Override
	protected void onDestroy() {
		
		super.onDestroy();
	
		finish();
	}




	

}
