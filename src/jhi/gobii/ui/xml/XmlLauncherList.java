// Copyright 2017 Information & Computational Sciences, JHI. All rights
// reserved. Use is subject to the accompanying licence terms.

package jhi.gobii.ui.xml;

import java.util.*;
import javax.xml.bind.annotation.*;

@XmlRootElement (name="gobii-launchers")
public class XmlLauncherList
{
	private ArrayList<XmlLauncher> list;

	public ArrayList<XmlLauncher> getList() {
		return list;
	}

	@XmlElement (name="launcher")
	public void setList(ArrayList<XmlLauncher> list) {
		this.list = list;
	}
}