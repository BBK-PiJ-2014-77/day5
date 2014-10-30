

// 2 power n  -1

//if value equals 1 return 1

//else return 2 * hannoi (n-1)


//n = 2 a = 3
//n = 3 a = 7
//n = 4 a = 15
//n = 5 a = 31
//n = 6 a = 63


//if n = 5

//		2 * hannoi(4)
//			2	*  hannoi(3)
//					2	*	hannoi(2)
//							2	* 	hannoi(1)
//									2
//									
println ("How many discs?");
String Input = System.console().readLine();
int inp = Integer.parseInt(Input);

int powertwo(int n) {
	if (n == 0) {
		return 1;
	}
	else {
		int result = 2 * powertwo(n -1);
		return result;
	}
}
	
int hannoi (int n) {
	int result = powertwo(n) - 1;
	return result;
}

println("number of moves is " + hannoi(inp) );

 
									
									
									
