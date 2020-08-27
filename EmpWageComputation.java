class EmpWageComputation {

	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	public static final int wagePerHour = 20; 
	public static final int workDayPerMonth = 20; 

	public static void main(String[] args) {
	
		int workHour = 0;
		int totalWorkHour = 0;
		int dailyWage = 0;
		
		for(int i=1;i<=workDayPerMonth;i++){
			int attendence = (int)(Math.random()*3)+1;
		
			switch(attendence){

				case isFullTime:
					workHour = 8;
					break;
				case isPartTime:
					workHour = 4;
					break;
				default:
					workHour = 0;
					break;
			}
			totalWorkHour += workHour;
			dailyWage = workHour * wagePerHour;
			System.out.println("wage of day "+i+" is: "+dailyWage);
		}
		int monthWage = wagePerHour * totalWorkHour;
		System.out.println("Total wage of month is: "+monthWage);
	}
}
