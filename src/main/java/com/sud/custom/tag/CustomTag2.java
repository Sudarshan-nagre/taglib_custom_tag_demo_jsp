package com.sud.custom.tag;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomTag2 extends SimpleTagSupport {

	private String fromName;
	private String toName;

	public void setFromName(final String fromName) {
		this.fromName = fromName;
	}

	public void setToName(final String toName) {
		this.toName = toName;
	}

	public void doTag() throws JspException, IOException {
		final StringWriter s = new StringWriter();
		getJspBody().invoke(s);
		getJspContext().getOut().println( "Welcome from '" +
				fromName + "' to '" + toName +"'<br>Body : "+ s.toString() );
	}
}
