int fib(int n) {
	if ((n== 1) || (n==2)) {
		return 1;
		
	}
	else {
		int result = fib (n-1) + fib(n-2);
		return result;
	}
}

println ("give me a number to calculate fibonacci?");
String Input = System.console().readLine();
int inp = Integer.parseInt(Input);

int answer = fib(inp);

println (answer);
