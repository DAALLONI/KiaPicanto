package complements;

import base.KiaPicanto;

public class AluminumRin13 extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public AluminumRin13(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "13-inch aluminum rin ";
	  }

	  public double cost(){
	    return 250000 + kiapicanto.cost();
	  }
}
