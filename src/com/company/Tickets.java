
	public class Tickets{
		static final double regularValue = 3.50;
		static final double juniorValue = 2.50;
		static final double seniorValue = 1.00;
		static final double dailyValue = 10.0;
		static final double weeklyValue = 40.0;
		
		private int regular;
		private int junior;
		private int senior;
		private int daily;
		private int weekly;
		
		
		public Tickets() {
			
		}
		
		public Tickets(Tickets a) {
			this.regular = a.regular;
			this.junior = a.junior;
			this.senior = a.senior;
			this.daily = a.daily;
			this.weekly = a.weekly;
		}

		public Tickets(int regular, int junior, int senior, int daily, int weekly) {
			this.regular = regular;
			this.junior = junior;
			this.senior = senior;
			this.daily = daily;
			this.weekly = weekly;
			//ticketsTotal();
		}
		
		
		public void addTickets(int regular, int junior, int senior, int daily, int weekly) {
			this.regular  += regular;
			this.junior += junior;
			this.senior += senior;
			this.daily += daily;
			this.weekly += weekly;
		}
		
		public double ticketsTotal() {
			return (regular * regularValue) + (junior * juniorValue) + (senior * seniorValue) + (daily * dailyValue) + (weekly * weeklyValue);
		}
		
		public int getRegular() {
			return regular;
		}

		public void setRegular(int regular) {
			this.regular = regular;
		}

		public int getJunior() {
			return junior;
		}

		public void setJunior(int junior) {
			this.junior = junior;
		}

		public int getSenior() {
			return senior;
		}

		public void setSenior(int senior) {
			this.senior = senior;
		}

		public int getDaily() {
			return daily;
		}

		public void setDaily(int daily) {
			this.daily = daily;
		}

		public int getWeekly() {
			return weekly;
		}

		public void setWeekly(int weekly) {
			this.weekly = weekly;
		}

		public boolean equals(Tickets a) {
			boolean equal;
			if (a.ticketsTotal() == this.ticketsTotal()) {
				equal = true;
			} else if(a.daily == this.daily && a.junior == this.junior && a.regular == this.regular && a.senior == this.senior && a.weekly == this.weekly) {
				equal = true;
			}else {
				equal = false;
			}
			return equal;
			
		}

		@Override
		public String toString() {
			return "You have " + regular + "regular tickets, " + junior + "junior tickets, " + senior + "senior tickets, " + daily + "daily tickets, " + weekly + "weekly tickets.";
		}
		
		


		
		
		
		
		
		
		
	}
