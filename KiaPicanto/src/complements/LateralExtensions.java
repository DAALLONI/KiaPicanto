package complements;

import base.KiaPicanto;

public class LateralExtensions extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public LateralExtensions(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "lateral extensions kit ";
	  }

	  public double cost(){
	    return 1500000 + kiapicanto.cost();
	  }
}
