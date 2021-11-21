
	public class OPUSCard {
	private int month;
	private int year;
	private String name;
	private String type;
	
	
	public OPUSCard(int month, int year, String name, String type) {
		this.month = month;
		if (month < 1 || month > 12) this.month = 0;
		
		this.year = year;
		this.name = name;
		this.type = type;
	}
	
	public void expiryMonth(int newMonth) {
		this.month = newMonth;
		if (newMonth < 1 || newMonth > 12) newMonth = 0;
	}
	
	public void expiryYear(int newYear) {
		this.year = newYear;
	}
	
	public boolean equals(OPUSCard a) {
		boolean equal = false;
		if (a.month == this.month && a.year == this.year && a.type == this.type && a.name == this.name) {
			equal = true;
		}
		return equal;
	}

	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	@Override
	public String toString() {
		String newoutput;
		if (this.month < 10 && this.month != 0) { 
		String dateUnder10 = "0" + this.month;
		newoutput = "The OPUS card is of type " + this.type + ", the name of the card holder is " + this.name + ", the expiry month is " + dateUnder10 
				+ " and the expiry year is " + this.year + ".";
		} else {
		newoutput = "The OPUS card is of type " + this.type + ", the name of the card holder is " + this.name + ", the expiry month is " + this.month 
					+ " and the expiry year is " + this.year + ".";
		}
		return newoutput;
	}
	
	
	
}
	
	
	
