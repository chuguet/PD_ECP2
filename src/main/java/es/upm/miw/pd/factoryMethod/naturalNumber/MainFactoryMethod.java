package es.upm.miw.pd.factoryMethod.naturalNumber;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainFactoryMethod {

    private static Logger LOG = LogManager.getLogger(MainFactoryMethod.class);

    public static void main(String args[]) {
        NaturalNumberManager naturalNumberManager = new NaturalNumberManager();
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberESCreator());
        NaturalNumber naturalNumber = naturalNumberManager.createNaturalNumber(1);
        LOG.info(naturalNumber.getTextValue());

        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberENCreator());
        naturalNumber = naturalNumberManager.createNaturalNumber(2);
        LOG.info(naturalNumber.getTextValue());
    }
}
