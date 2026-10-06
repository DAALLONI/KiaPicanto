package complements;

import base.KiaPicanto;

public class SecurityBolts extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public SecurityBolts(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "security bolts ";
	  }

	  public double cost(){
	    return 156100 + kiapicanto.cost();
	  }
}
