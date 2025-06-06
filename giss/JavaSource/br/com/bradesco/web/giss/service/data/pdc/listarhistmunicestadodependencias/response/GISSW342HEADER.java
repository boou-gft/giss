/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: GISSW342HEADER.java,v 1.1 2017/04/11 14:12:25 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class GISSW342HEADER.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:25 $
 */
public class GISSW342HEADER implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _GISSW342CODLAYOUT
     */
    private java.lang.String _GISSW342CODLAYOUT = "GISSW342";

    /**
     * Field _GISSW342TAMLAYOUT
     */
    private int _GISSW342TAMLAYOUT = 7816;

    /**
     * keeps track of state for field: _GISSW342TAMLAYOUT
     */
    private boolean _has_GISSW342TAMLAYOUT;


      //----------------/
     //- Constructors -/
    //----------------/

    public GISSW342HEADER() 
     {
        super();
        setGISSW342CODLAYOUT("GISSW342");
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.response.GISSW342HEADER()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteGISSW342TAMLAYOUT
     * 
     */
    public void deleteGISSW342TAMLAYOUT()
    {
        this._has_GISSW342TAMLAYOUT= false;
    } //-- void deleteGISSW342TAMLAYOUT() 

    /**
     * Returns the value of field 'GISSW342CODLAYOUT'.
     * 
     * @return String
     * @return the value of field 'GISSW342CODLAYOUT'.
     */
    public java.lang.String getGISSW342CODLAYOUT()
    {
        return this._GISSW342CODLAYOUT;
    } //-- java.lang.String getGISSW342CODLAYOUT() 

    /**
     * Returns the value of field 'GISSW342TAMLAYOUT'.
     * 
     * @return int
     * @return the value of field 'GISSW342TAMLAYOUT'.
     */
    public int getGISSW342TAMLAYOUT()
    {
        return this._GISSW342TAMLAYOUT;
    } //-- int getGISSW342TAMLAYOUT() 

    /**
     * Method hasGISSW342TAMLAYOUT
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasGISSW342TAMLAYOUT()
    {
        return this._has_GISSW342TAMLAYOUT;
    } //-- boolean hasGISSW342TAMLAYOUT() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'GISSW342CODLAYOUT'.
     * 
     * @param GISSW342CODLAYOUT the value of field
     * 'GISSW342CODLAYOUT'.
     */
    public void setGISSW342CODLAYOUT(java.lang.String GISSW342CODLAYOUT)
    {
        this._GISSW342CODLAYOUT = GISSW342CODLAYOUT;
    } //-- void setGISSW342CODLAYOUT(java.lang.String) 

    /**
     * Sets the value of field 'GISSW342TAMLAYOUT'.
     * 
     * @param GISSW342TAMLAYOUT the value of field
     * 'GISSW342TAMLAYOUT'.
     */
    public void setGISSW342TAMLAYOUT(int GISSW342TAMLAYOUT)
    {
        this._GISSW342TAMLAYOUT = GISSW342TAMLAYOUT;
        this._has_GISSW342TAMLAYOUT = true;
    } //-- void setGISSW342TAMLAYOUT(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GISSW342HEADER
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.response.GISSW342HEADER unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.response.GISSW342HEADER) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.response.GISSW342HEADER.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarhistmunicestadodependencias.response.GISSW342HEADER unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
