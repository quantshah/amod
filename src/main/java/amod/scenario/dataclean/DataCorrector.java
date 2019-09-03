/* amodeus - Copyright (c) 2018, ETH Zurich, Institute for Dynamic Systems and Control */
package amod.scenario.dataclean;

import java.io.File;

import ch.ethz.idsc.amodeus.net.MatsimAmodeusDatabase;

public interface DataCorrector {

    public File correctFile(File taxiData, MatsimAmodeusDatabase db) throws Exception;

}
