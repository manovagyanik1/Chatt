package com.chatt.demo;

import android.app.Application;

import com.parse.Parse;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class ChattApp extends Application
{

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();

		Parse.initialize(this, "9ANC6IDMwgJWbHNnFHHiQu60RB01xCkzDItGBm5J",
				"8Tz6fmIhOOxPclRbeg2WXuBXlBN6XvfYQR6DsZW5");

	}
}
