package complements;

import base.KiaPicanto;

public class TowingHitch extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public TowingHitch(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "little towing hitch for all models ";
	  }

	  public double cost(){
	    return 810000 + kiapicanto.cost();
	  }
}
