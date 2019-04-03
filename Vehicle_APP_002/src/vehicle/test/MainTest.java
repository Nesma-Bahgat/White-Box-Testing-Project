package vehicle.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import vehicle.app.Global;
import vehicle.app.*;
import vehicle.hal.LCD;
import vehicle.hal.Motor;


class MainTest {

	@Test
	public void testVidMain() {
		
      Main.vidMain();
      
      assertAll(
    	() -> assertEquals(4,Global.iState),
    	() -> assertEquals(1,LCD.validateCall),
    	() -> assertEquals(1,Motor.validateCall),
    	() -> assertEquals(1,State.validateCall),
    	() -> assertEquals(4, LCD.LCDState),
    	() -> assertEquals(4, Motor.MotorState),
    	() -> assertTrue((Global.validateSeq1==2) && (Global.validateSeq2==3)),
    	() -> assertEquals(2,Global.validateSeq1),
    	() -> assertEquals(3,Global.validateSeq2)

    		  );
      
	}

}
