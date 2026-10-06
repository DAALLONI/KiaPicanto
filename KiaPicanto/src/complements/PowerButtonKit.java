package complements;

import base.KiaPicanto;

public class PowerButtonKit extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public PowerButtonKit(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "Power Button Kit with allarm and 2 controllers ";
	  }

	  public double cost(){
	    return 1500000 + kiapicanto.cost();
	  }
}