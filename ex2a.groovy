int factorial (int n) {
	if (n == 1) {
		return 1;
	}
	else {
	int result = n * factorial (n-1);
	return result;
	}
}

println ("give me a number to calculate factorial?");
String Input = System.console().readLine();
int inp = Integer.parseInt(Input);

int answer = factorial(inp);

println (answer);
