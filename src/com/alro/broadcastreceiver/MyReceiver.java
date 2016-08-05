package com.alro.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		if ((intent.getAction()).equalsIgnoreCase("com.alro.WifiOn")) {
			
			Toast.makeText(context, "Wifi Turned On", Toast.LENGTH_SHORT).show();
			
		} else if((intent.getAction()).equalsIgnoreCase("com.alro.WifiOff")){
			
			Toast.makeText(context, "Wifi Turned off", Toast.LENGTH_SHORT).show();
			
		}

	}

}
