/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Tributavel.java,v 1.1 2017/04/11 14:10:17 gmichelini Exp $
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
 * Class Tributavel.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:17 $
 */
public class Tributavel implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalTributavel
     */
    private java.lang.String _sinalTributavel;

    /**
     * Field _valorTributavel
     */
    private double _valorTributavel = 0;

    /**
     * keeps track of state for field: _valorTributavel
     */
    private boolean _has_valorTributavel;


      //----------------/
     //- Constructors -/
    //----------------/

    public Tributavel() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteValorTributavel
     * 
     */
    public void deleteValorTributavel()
    {
        this._has_valorTributavel= false;
    } //-- void deleteValorTributavel() 

    /**
     * Returns the value of field 'sinalTributavel'.
     * 
     * @return String
     * @return the value of field 'sinalTributavel'.
     */
    public java.lang.String getSinalTributavel()
    {
        return this._sinalTributavel;
    } //-- java.lang.String getSinalTributavel() 

    /**
     * Returns the value of field 'valorTributavel'.
     * 
     * @return double
     * @return the value of field 'valorTributavel'.
     */
    public double getValorTributavel()
    {
        return this._valorTributavel;
    } //-- double getValorTributavel() 

    /**
     * Method hasValorTributavel
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTributavel()
    {
        return this._has_valorTributavel;
    } //-- boolean hasValorTributavel() 

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
     * Sets the value of field 'sinalTributavel'.
     * 
     * @param sinalTributavel the value of field 'sinalTributavel'.
     */
    public void setSinalTributavel(java.lang.String sinalTributavel)
    {
        this._sinalTributavel = sinalTributavel;
    } //-- void setSinalTributavel(java.lang.String) 

    /**
     * Sets the value of field 'valorTributavel'.
     * 
     * @param valorTributavel the value of field 'valorTributavel'.
     */
    public void setValorTributavel(double valorTributavel)
    {
        this._valorTributavel = valorTributavel;
        this._has_valorTributavel = true;
    } //-- void setValorTributavel(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Tributavel
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Tributavel unmarshal(java.io.Reader) 

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
