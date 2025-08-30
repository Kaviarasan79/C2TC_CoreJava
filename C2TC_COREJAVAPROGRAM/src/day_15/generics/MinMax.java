//Program to demonstrate generic interface
package day_15.generics;

//Generic Interface
public interface MinMax<T extends Comparable<T>> {

	T min();

	T max();
}

