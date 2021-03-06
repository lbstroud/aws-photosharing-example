/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */

package com.amazon.photosharing.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SelectModel extends HashMap<Long, Boolean>{
	
	private static final long serialVersionUID = 5891057946131346836L;
	
	public int getSelectedCount() {		
		int result = 0;
		for (Map.Entry<Long, Boolean> selected : this.entrySet()) {
			if (selected.getValue())
				result+=1;
		}		
		return result;
	}	
	
	public List<Long> getSelectedList() {		
		List<Long> result = new LinkedList<Long>();
		for (Map.Entry<Long, Boolean> selected : this.entrySet()) {
			if (selected.getValue())
				result.add(selected.getKey());
		}		
		return result;
	}
	
	
	@Override
	public Boolean put(Long key, Boolean value) {		
		return super.put(key, value);
	}
	
	@Override
	public Boolean get(Object key) {
		if (super.get(key) == null)
			super.put((Long) key, false);		
		return super.get(key);
	}
}
