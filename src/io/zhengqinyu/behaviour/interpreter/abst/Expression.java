package io.zhengqinyu.behaviour.interpreter.abst;

import io.zhengqinyu.behaviour.interpreter.po.PlayContext;

public abstract class Expression {
	
	public void interpret(PlayContext context) {
		String text = context.getText();
		if (text == null || text.length() == 0) {
			return;
		} else {
			String playKey = text.substring(0, 1);
			text = text.substring(2);
			double playValue = Double.valueOf(text.substring(0, text.indexOf(' ')));
			text = text.substring(text.indexOf(' ') + 1);
			context.setText(text);
			excute(playKey, playValue);
		}
	}

	public abstract void excute(String key, double value);
}
