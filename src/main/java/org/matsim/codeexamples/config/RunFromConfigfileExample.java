/* *********************************************************************** *
 * project: org.matsim.*
 * MyControler1.java
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2007 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */

package org.matsim.codeexamples.config;

import org.matsim.api.core.v01.Scenario;
import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.config.groups.ControlerConfigGroup;
import org.matsim.core.controler.Controler;
import org.matsim.core.scenario.ScenarioUtils;


/**
 * runs a mobsim and writes events output.  See the config file for configuration details.
 * 
 * @author nagel
 *
 */
public final class RunFromConfigfileExample {

	public static void main( final String[] args ) {

		Config config ;
		if ( args!=null && args.length>=1 ) {
			config = ConfigUtils.loadConfig( args ) ; // note that this may process command line options
		} else {
			config = ConfigUtils.loadConfig(  "scenarios/equil/config.xml" ) ;
		}

		Scenario scenario = ScenarioUtils.loadScenario(config );

		Controler controler = new Controler(scenario);

		controler.run();
	}

}
