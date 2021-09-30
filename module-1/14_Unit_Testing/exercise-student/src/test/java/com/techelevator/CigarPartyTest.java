package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CigarPartyTest {

    private CigarParty partyTime;

    @Before
    public void setup() {
        partyTime = new CigarParty();
    }

    @Test
    public void have_a_party_with_30() {
        boolean result = partyTime.haveParty(30, false);
        Assert.assertFalse(result);
    }

    @Test
    public void party_with_80_cigars() {
        boolean result = partyTime.haveParty(80, true);
        Assert.assertTrue(result);
    }

    @Test
    public void weekday_party_with_50() {
        boolean result = partyTime.haveParty(50, false);
        Assert.assertTrue(result);;
    }

    @Test
    public void party_with_20() {
        boolean result = partyTime.haveParty(20, true);
            Assert.assertFalse(result);
    }
}
