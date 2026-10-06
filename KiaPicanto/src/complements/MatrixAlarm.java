package complements;

import base.KiaPicanto;

public class MatrixAlarm extends AdditionsDecorator {
	  KiaPicanto kiapicanto;

	  public MatrixAlarm(KiaPicanto kiapicanto) {
	    this.kiapicanto = kiapicanto;
	  }

	  public String getDescription() {
	    return kiapicanto.getDescription() + "2 controler matrix alarms ";
	  }

	  public double cost(){
	    return 205000 + kiapicanto.cost();
	  }
}
