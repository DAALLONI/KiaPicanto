package complements;

import base.KiaPicanto;

public class TrunkCover extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public TrunkCover(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "cover for the trunk ";
	  }

	  public double cost(){
	    return 250000 + kiapicanto.cost();
	  }
}
