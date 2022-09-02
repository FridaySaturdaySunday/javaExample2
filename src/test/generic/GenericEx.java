package test.generic;

import java.util.Arrays;

import inherit.sample.Child;

public class GenericEx <T, K extends Child, V> { //Child가 상한선

	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public void aaa(K a) { // 범용자료형 K인 a를 데려옴
		System.out.println(a);
	}
	
	public <M> M[] out(M...args) { // 가변인자
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		Arrays.sort(args); // 정렬
		return args;	
	}
	
	
	
	
	
	
	
	
	
}
