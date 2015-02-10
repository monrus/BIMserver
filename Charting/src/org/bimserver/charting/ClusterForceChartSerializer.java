package org.bimserver.charting;

/******************************************************************************
 * Copyright (C) 2009-2015  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;

import org.bimserver.charting.Charts.ClusterForce;
import org.bimserver.emf.IfcModelInterface;
import org.bimserver.emf.PackageMetaData;
import org.bimserver.plugins.PluginManager;
import org.bimserver.plugins.renderengine.RenderEnginePlugin;
import org.bimserver.plugins.serializers.ProjectInfo;
import org.bimserver.plugins.serializers.SerializerException;
import org.bimserver.utils.UTF8PrintWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClusterForceChartSerializer extends ChartEmfSerializer {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClusterForceChartSerializer.class);

	@Override
	public void init(IfcModelInterface model, ProjectInfo projectInfo, PluginManager pluginManager, RenderEnginePlugin renderEnginePlugin, PackageMetaData packageMetaData, boolean normalizeOids) throws SerializerException {
		super.init(model, projectInfo, pluginManager, renderEnginePlugin, packageMetaData, normalizeOids);
		// Pick chart.
		chart = new ClusterForce();
		integrateSettings();
		chart.setOption("Show Labels", true);
		// Prepare for data.
		rawData = new ArrayList<>();
	}

	@Override
	protected boolean write(OutputStream outputStream) throws SerializerException {
		if (getMode() == Mode.BODY) {
			// Get data.
			rawData = SupportFunctions.getClusterStructureWithAreaFromIFCData(model, chart);
			// If no diameter is explicitly set, increase the overall size by 4500 pixels for every 100 items.
			if (!hasOption("Diameter")) {
				int count = rawData.size();
				double diameter = 1000 + (count / 100) * 4500;
				chart.setOption("Diameter", diameter);
				if (diameter > 1000)
					chart.FitToSize = false;
			}
			// Write chart.
			PrintWriter writer = new UTF8PrintWriter(outputStream);
			try {
				writer.print(chart.writeSVG(rawData));
				writer.flush();
			} catch (Exception e) {
				LOGGER.error("", e);
			}
			writer.close();
			setMode(Mode.FINISHED);
			return true;
		} else if (getMode() == Mode.FINISHED)
			return false;
		//
		return false;
	}
}