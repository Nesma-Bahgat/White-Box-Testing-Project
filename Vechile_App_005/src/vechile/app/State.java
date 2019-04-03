package vechile.app;

import vechile.hal.Temp;

public class State {
  public boolean bValidateLowPerformace() {
	  boolean ret = false;
	  
	  if(Temp.iReadT1()<60 && Temp.iReadT2() >50) {
		  ret = true;
	  }
	  else {
		  ret = false;
	  }
	  
	  return ret;
  }
}
