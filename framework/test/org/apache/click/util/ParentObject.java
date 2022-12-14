/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.click.util;

import java.util.Date;

public class ParentObject {
	
    private String name;
    private Object value;
    private Date date;
    private ChildObject child; 
    private Boolean valid;
    
    public ParentObject(String name, Object value, Date date, Boolean valid, ChildObject child) {
        this.name = name;
        this.value = value;
        this.date = date;
        this.valid = valid;
        this.child = child;
    }
    
    public ParentObject() {
    }
    
    public void setName(String name) {
		this.name = name;
	}
    
    public String getName() {
    	return name;
    }

	public void setValue(Object value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Boolean getValid() {
		return valid;
	}

	public Object getValue() {
		return value;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
    
    public ChildObject getChild() {
    	return child;
    }
    
    public void setChild(ChildObject child) {
    	this.child = child;
    }
}

