package complements;

import base.KiaPicanto;

public class AluminumRin14grayB extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public AluminumRin14grayB(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "14-inch aluminum rin gray tipe 2 ";
	  }

	  public double cost(){
	    return 450000 + kiapicanto.cost();
	  }
}