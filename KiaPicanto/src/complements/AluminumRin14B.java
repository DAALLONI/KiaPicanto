package complements;

import base.KiaPicanto;

public class AluminumRin14B extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public AluminumRin14B(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "14-inch aluminum rin black tipe 2 ";
	  }

	  public double cost(){
	    return 500000 + kiapicanto.cost();
	  }
}
