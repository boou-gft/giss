/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: GISSW671HEADER.java,v 1.1 2018/01/12 17:35:13 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.response;

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
 * Class GISSW671HEADER.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/01/12 17:35:13 $
 */
public class GISSW671HEADER implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _GISSW671CODLAYOUT
     */
    private java.lang.String _GISSW671CODLAYOUT = "GISSW671";

    /**
     * Field _GISSW671TAMLAYOUT
     */
    private int _GISSW671TAMLAYOUT = 0013;

    /**
     * keeps track of state for field: _GISSW671TAMLAYOUT
     */
    private boolean _has_GISSW671TAMLAYOUT;


      //----------------/
     //- Constructors -/
    //----------------/

    public GISSW671HEADER() 
     {
        super();
        setGISSW671CODLAYOUT("GISSW671");
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.response.GISSW671HEADER()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteGISSW671TAMLAYOUT
     * 
     */
    public void deleteGISSW671TAMLAYOUT()
    {
        this._has_GISSW671TAMLAYOUT= false;
    } //-- void deleteGISSW671TAMLAYOUT() 

    /**
     * Returns the value of field 'GISSW671CODLAYOUT'.
     * 
     * @return String
     * @return the value of field 'GISSW671CODLAYOUT'.
     */
    public java.lang.String getGISSW671CODLAYOUT()
    {
        return this._GISSW671CODLAYOUT;
    } //-- java.lang.String getGISSW671CODLAYOUT() 

    /**
     * Returns the value of field 'GISSW671TAMLAYOUT'.
     * 
     * @return int
     * @return the value of field 'GISSW671TAMLAYOUT'.
     */
    public int getGISSW671TAMLAYOUT()
    {
        return this._GISSW671TAMLAYOUT;
    } //-- int getGISSW671TAMLAYOUT() 

    /**
     * Method hasGISSW671TAMLAYOUT
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasGISSW671TAMLAYOUT()
    {
        return this._has_GISSW671TAMLAYOUT;
    } //-- boolean hasGISSW671TAMLAYOUT() 

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
     * Sets the value of field 'GISSW671CODLAYOUT'.
     * 
     * @param GISSW671CODLAYOUT the value of field
     * 'GISSW671CODLAYOUT'.
     */
    public void setGISSW671CODLAYOUT(java.lang.String GISSW671CODLAYOUT)
    {
        this._GISSW671CODLAYOUT = GISSW671CODLAYOUT;
    } //-- void setGISSW671CODLAYOUT(java.lang.String) 

    /**
     * Sets the value of field 'GISSW671TAMLAYOUT'.
     * 
     * @param GISSW671TAMLAYOUT the value of field
     * 'GISSW671TAMLAYOUT'.
     */
    public void setGISSW671TAMLAYOUT(int GISSW671TAMLAYOUT)
    {
        this._GISSW671TAMLAYOUT = GISSW671TAMLAYOUT;
        this._has_GISSW671TAMLAYOUT = true;
    } //-- void setGISSW671TAMLAYOUT(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return GISSW671HEADER
     */
    public static br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.response.GISSW671HEADER unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.response.GISSW671HEADER) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.response.GISSW671HEADER.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.response.GISSW671HEADER unmarshal(java.io.Reader) 

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
