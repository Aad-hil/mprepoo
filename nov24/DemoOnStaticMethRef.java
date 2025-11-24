package com.demo.nov24;

import java.util.function.*;
import java.util.function.Predicate;

public class DemoOnStaticMethRef {
	static class NumberUtil {
		public static int sqn(int num) {
			return num * num;
		}

		public static double log(double num) {
			return Math.log(num);
		}

		public static boolean evenorodd(int num) {
			return num % 2 == 0;
		}
	}

	static class StringUtil {
		public static int stringLength(String str) {
			return str.length();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer, Integer> sqn = (num) -> NumberUtil.sqn(num);
		Function<Integer, Integer> sqnMR = NumberUtil::sqn;
		System.out.println(sqn.apply(100));
		System.out.println(sqnMR.apply(122));

		Function<Double, Double> logg = (num) -> NumberUtil.log(num);
		Function<Double, Double> loggMR = NumberUtil::log;
		System.out.println(logg.apply(12.0));
		System.out.println(loggMR.apply(11.0));

		Predicate<Integer> isevenorodd = (num) -> NumberUtil.evenorodd(num);
		Predicate<Integer> isevenoroddMR = NumberUtil::evenorodd;
		System.out.println(isevenorodd.test(12));
		System.out.println(isevenoroddMR.test(11));
		
		
		String s= "hehe";
		Supplier<Integer> slen = () ->StringUtil.stringLength(s);
		Function<String,Integer> slenMR = StringUtil::stringLength;
		System.out.println(slen.get());
		System.out.println(slenMR.apply(s));

		
	}

}
