/*
 * Copyright (c) 2011-2025 PiChen
 */

package org.summerframework.beans.propertyeditors;

import java.beans.PropertyEditorSupport;

import org.summerframework.util.StringUtils;
import org.summerframework.beans.BeanWrapperImpl;

/**
 * Properties editor for String[] type. Strings must be in CSV format.
 * This property editor is automatically registered by BeanWrapperImpl.
 *
 * @author Rod Johnson
 * @see BeanWrapperImpl
 */
public class StringArrayPropertyEditor extends PropertyEditorSupport {

    public void setAsText(String s) throws IllegalArgumentException {
        String[] sa = StringUtils.commaDelimitedListToStringArray(s);
        setValue(sa);
    }

    public String getAsText() {
        String[] array = (String[]) this.getValue();
        return StringUtils.arrayToCommaDelimitedString(array);
    }

}