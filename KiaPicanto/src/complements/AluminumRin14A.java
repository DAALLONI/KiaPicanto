package complements;

import base.KiaPicanto;

public class AluminumRin14A extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public AluminumRin14A(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "14-inch aluminum rin black tipe 1 ";
	  }

	  public double cost(){
	    return 500000 + kiapicanto.cost();
	  }
}
