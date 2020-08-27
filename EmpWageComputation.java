class EmpWageComputation {

	public static int isFullDay = 1;
	public static int wagePerHour = 20; 

	public static void main(String[] args) {
	
		int workHour = 0;
		int totalWorkHour = 0;
		int dailyWage = 0;
		int attendence = (int)(Math.random()*2)+1;
		
		if(isFullDay == attendence) {
		
			workHour = 8;
		}
		else {
		
			workHour = 0;
		}
		totalWorkHour += workHour;
		dailyWage = totalWorkHour * wagePerHour;
		System.out.println("Daily wage is: "+dailyWage);

	}
}
