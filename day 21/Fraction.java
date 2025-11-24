package com.demo.Maven;

public class Fraction {
	private int num;
	private int denom;
	private float result;
	public Fraction(int i, int j) {
		// TODO Auto-generated constructor stub
		this.num = i;
		this.denom = j;
		this.result = (float)i/j; 
	}
	public Fraction add(Fraction other) {
        int newNumerator = this.num * other.denom + other.num * this.denom;
        int newDenominator = this.denom * other.denom;
        return new Fraction(newNumerator, newDenominator);
    }
	@Override
	public String toString() {
		return "Fraction [num=" + num + ", denom=" + denom +", rest=" + result + "]";
	}

	

}
