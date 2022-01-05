package cane.brothers.solid.isp.solution;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class ChargingStationTest {

    private PrintStream realSysOut;
    private ByteArrayOutputStream sysOutBuffer;

    @BeforeEach
    void init() {
        realSysOut = System.out;
        sysOutBuffer = new ByteArrayOutputStream();
        System.setErr(new PrintStream(sysOutBuffer));
    }

    @Test
    public void test_charging() {
        ChargeableVehicle vehicle = new ElectricCar(55);
        vehicle.connect(ChargeableVehicle.Current.DC, 400);
        vehicle.charge();

        // Assert that a given string was written in the meantime to System.err
        assertThat(new String(sysOutBuffer.toByteArray()), containsString("rapid charge"));
    }

    @AfterEach
    void tearDown() {
        // Don't forget to bring back the real System.err at the end of the test
        System.setOut(realSysOut);
    }
}