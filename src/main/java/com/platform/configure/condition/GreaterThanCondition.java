package com.platform.configure.condition;

public class GreaterThanCondition<T> extends BaseCondition {
	private static final long serialVersionUID = -7784339067853586776L;
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
}
