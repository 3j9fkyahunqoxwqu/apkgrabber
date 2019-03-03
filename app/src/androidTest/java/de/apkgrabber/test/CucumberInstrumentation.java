package de.apkgrabber.test;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import android.os.Bundle;
import android.support.test.runner.MonitoringInstrumentation;

import cucumber.api.android.CucumberInstrumentationCore;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class CucumberInstrumentation
	extends MonitoringInstrumentation
{
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	private final CucumberInstrumentationCore mInstrumentationCore = new CucumberInstrumentationCore(this);

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void onCreate(
		Bundle arguments
	) {
		super.onCreate(arguments);
		mInstrumentationCore.create(arguments);
		start();
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void onStart(
	) {
		super.onStart();
		waitForIdleSync();
		mInstrumentationCore.start();
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////