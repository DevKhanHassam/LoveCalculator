package com.lc.Dto.Handler;

import java.beans.PropertyEditorSupport;

public class MytextHandler extends PropertyEditorSupport  {

	
	 public void setAsText(String text) throws IllegalArgumentException {
	        if (text != null) {
	            text = text.toUpperCase();
	        }
	        setValue(text);
	    }
	
}
