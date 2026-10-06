package complements;

import base.KiaPicanto;

public class ParkingSensor extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public ParkingSensor(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "parking sensor ";
	  }

	  public double cost(){
	    return 150000 + kiapicanto.cost();
	  }
}
