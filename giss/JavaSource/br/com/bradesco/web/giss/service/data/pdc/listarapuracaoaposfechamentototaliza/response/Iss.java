/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Iss.java,v 1.1 2017/04/11 14:10:17 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response;

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
 * Class Iss.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:17 $
 */
public class Iss implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalISS
     */
    private java.lang.String _sinalISS;

    /**
     * Field _valorISS
     */
    private double _valorISS = 0;

    /**
     * keeps track of state for field: _valorISS
     */
    private boolean _has_valorISS;


      //----------------/
     //- Constructors -/
    //----------------/

    public Iss() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteValorISS
     * 
     */
    public void deleteValorISS()
    {
        this._has_valorISS= false;
    } //-- void deleteValorISS() 

    /**
     * Returns the value of field 'sinalISS'.
     * 
     * @return String
     * @return the value of field 'sinalISS'.
     */
    public java.lang.String getSinalISS()
    {
        return this._sinalISS;
    } //-- java.lang.String getSinalISS() 

    /**
     * Returns the value of field 'valorISS'.
     * 
     * @return double
     * @return the value of field 'valorISS'.
     */
    public double getValorISS()
    {
        return this._valorISS;
    } //-- double getValorISS() 

    /**
     * Method hasValorISS
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorISS()
    {
        return this._has_valorISS;
    } //-- boolean hasValorISS() 

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
     * Sets the value of field 'sinalISS'.
     * 
     * @param sinalISS the value of field 'sinalISS'.
     */
    public void setSinalISS(java.lang.String sinalISS)
    {
        this._sinalISS = sinalISS;
    } //-- void setSinalISS(java.lang.String) 

    /**
     * Sets the value of field 'valorISS'.
     * 
     * @param valorISS the value of field 'valorISS'.
     */
    public void setValorISS(double valorISS)
    {
        this._valorISS = valorISS;
        this._has_valorISS = true;
    } //-- void setValorISS(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Iss
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Iss unmarshal(java.io.Reader) 

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
