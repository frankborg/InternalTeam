package com.statravel.tour.domain.bean.rest;

import javax.xml.bind.annotation.adapters.XmlAdapter;
/**
 * 
 * @author STA developer team
 *
 */
public class AdapterXmlCDATA extends XmlAdapter<String, String> {

    @Override
    public final String marshal(final String value) throws Exception {
        return "<![CDATA["+value+"]]>";
    }
    @Override
    public final String unmarshal(final String value) throws Exception {
        return value;
    }

}