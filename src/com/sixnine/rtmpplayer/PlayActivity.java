package com.sixnine.rtmpplayer;

import com.sixinine.rtmpplayer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;

public class PlayActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.surfaceview);
		
		PlayerViewController playerViewController = new PlayerViewController(this,null);
		playerViewController.initPlayerView();
		
		Intent intent = getIntent();
		String isPlay = intent.getStringExtra("isPlay");
		String roomId = intent.getStringExtra("roomId");
		String roomTag = intent.getStringExtra("roomTag");
		
		if("1".equals(isPlay)){
			playerViewController.startPlay(roomTag, roomId);
		}
	}
	
	private void onClick(){
		
	}


}
