//Program to demonstrate Functional Interface

package day_19;

@FunctionalInterface
interface Cube {
	int calculate(int a); // only one abstract method
	//int sqr(int n);
}