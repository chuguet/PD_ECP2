package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NaturalNumberManagerTest {

    @Test
    public void creatorNumberEnglishTest() {
        NaturalNumberManager naturalNumberManager = new NaturalNumberManager();
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberENCreator());
        NaturalNumber naturalNumber = naturalNumberManager.createNaturalNumber(1);
        assertEquals("one", naturalNumber.getTextValue());
    }

    @Test
    public void creatorNumberEnglishOutIndexTest() {
        NaturalNumberManager naturalNumberManager = new NaturalNumberManager();
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberENCreator());
        NaturalNumber naturalNumber = naturalNumberManager.createNaturalNumber(10);
        assertEquals("???", naturalNumber.getTextValue());
    }

    @Test
    public void creatorNumberSpanishOutIndexTest() {
        NaturalNumberManager naturalNumberManager = new NaturalNumberManager();
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberESCreator());
        NaturalNumber naturalNumber = naturalNumberManager.createNaturalNumber(9);
        assertEquals("???", naturalNumber.getTextValue());
    }

    @Test
    public void creatorNumberSpanishTest() {
        NaturalNumberManager naturalNumberManager = new NaturalNumberManager();
        naturalNumberManager.setNaturalNumberCreator(new NaturalNumberESCreator());
        NaturalNumber naturalNumber = naturalNumberManager.createNaturalNumber(3);
        assertEquals("tres", naturalNumber.getTextValue());
    }

}
