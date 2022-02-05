package com.dedalow;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

import com.dedalow.utils.Constant;
import com.dedalow.utils.Utils;
import com.dedalow.report.Report;

public class Launcher {

	public static Constant constant = new Constant();

	public static void main(String[] args) {

		try {
			ArrayList<String> testCases = Utils.getTestCasesSelected();

			LauncherDiscoveryRequest discoveryRequest = LauncherDiscoveryRequestBuilder.request()
					.selectors(testCases.stream().map(DiscoverySelectors::selectClass).collect(Collectors.toList()))
					.build();

			org.junit.platform.launcher.Launcher launcher = LauncherFactory.create();
			launcher.execute(discoveryRequest);

		} catch (Exception e) {
			Report.reportErrors(e.getMessage());
		}
	}

}