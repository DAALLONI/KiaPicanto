package complements;

import base.KiaPicanto;

public class BicycleRack extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public BicycleRack(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "Bicycle rak for 2 bikes ";
	  }

	  public double cost(){
	    return 910000 + kiapicanto.cost();
	  }
}
