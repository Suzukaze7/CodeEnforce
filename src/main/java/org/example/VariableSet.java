package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class VariableSet {
	private final HashMap<String, ValueSet> variables = new HashMap<String, ValueSet>();

	public String getVariable(String variableName) {
		ValueSet valueSet = variables.get(variableName);
		if (valueSet == null) {
			return "";
		}
		return valueSet.getValue();
	}

	public void addVariable(String variableName, ValueSet valueSet) {
		variables.put(variableName, valueSet);
	}

	public void appendValueToVariable(String variableName, Value value) {
		ValueSet valueSet = variables.get(variableName);
		if (valueSet == null) {
			valueSet = new ValueSet(new ArrayList<>());
			valueSet.values.add(value);
			addVariable(variableName, valueSet);
		} else {
			valueSet.values.add(value);
		}
	}

	abstract public class Value {
		public abstract String getValue();
	}

	public class Text extends Value {
		private final String text;

		public Text(String text) {
			this.text = text;
		}

		@Override
		public String getValue() {
			return text;
		}
	}

	public class ValueSet extends Value {
		private final ArrayList<Value> values;

		public ValueSet(ArrayList<Value> values) {
			this.values = values;
		}

		@Override
		public String getValue() {
			StringBuilder res = new StringBuilder();
			for (Value child : values) {
				res.append(child.getValue());
			}
			return res.toString();
		}
	}

	public class Variable extends ValueSet {
		public Variable(ArrayList<Value> values) {
			super(values);
		}

		@Override
		public String getValue() {
			return getVariable(super.getValue());
		}
	}
}