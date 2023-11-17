package es.iessoterohernandez.daw.endes.fibonacciMain;

import es.iessoterohernandez.daw.endes.fibonacci.Fibonacci;

public class FibonacciMain {

	public class Main {

		public void main(String[] args) {

			int n = 10;

			System.out.println("La serie de Fibonacci para n = " + n + " es:");
			for (int i = 0; i < n; i++) {
				System.out.print(Fibonacci.fibonacci(i) + " ");
			}
		}
	}

}
