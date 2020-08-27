class EmpWageComputation {

	public static int isFullTime = 1;
	public static int isPartTime = 2;
	public static int wagePerHour = 20; 

	public static void main(String[] args) {
	
		int workHour = 0;
		int totalWorkHour = 0;
		int dailyWage = 0;
		int attendence = (int)(Math.random()*3)+1;
		
		if(attendence == 1) {
		
			workHour = 8;
		}
		else if(attendence == 2){
		
			workHour = 4;
		}
		else{
		
			workHour = 0;
		}
		totalWorkHour += workHour;
		dailyWage = totalWorkHour * wagePerHour;
		System.out.println("Daily wage is: "+dailyWage);

	}
}
