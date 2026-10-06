package complements;

import base.KiaPicanto;

public class FloorMatSet extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public FloorMatSet(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "3-piece floor mat set ";
	  }

	  public double cost(){
	    return 92000 + kiapicanto.cost();
	  }
}
