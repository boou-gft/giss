/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Issmensal.java,v 1.1 2017/04/11 14:10:18 gmichelini Exp $
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
 * Class Issmensal.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:18 $
 */
public class Issmensal implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalISSMensal
     */
    private java.lang.String _sinalISSMensal;

    /**
     * Field _valorISSMensal
     */
    private double _valorISSMensal = 0;

    /**
     * keeps track of state for field: _valorISSMensal
     */
    private boolean _has_valorISSMensal;


      //----------------/
     //- Constructors -/
    //----------------/

    public Issmensal() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteValorISSMensal
     * 
     */
    public void deleteValorISSMensal()
    {
        this._has_valorISSMensal= false;
    } //-- void deleteValorISSMensal() 

    /**
     * Returns the value of field 'sinalISSMensal'.
     * 
     * @return String
     * @return the value of field 'sinalISSMensal'.
     */
    public java.lang.String getSinalISSMensal()
    {
        return this._sinalISSMensal;
    } //-- java.lang.String getSinalISSMensal() 

    /**
     * Returns the value of field 'valorISSMensal'.
     * 
     * @return double
     * @return the value of field 'valorISSMensal'.
     */
    public double getValorISSMensal()
    {
        return this._valorISSMensal;
    } //-- double getValorISSMensal() 

    /**
     * Method hasValorISSMensal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorISSMensal()
    {
        return this._has_valorISSMensal;
    } //-- boolean hasValorISSMensal() 

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
     * Sets the value of field 'sinalISSMensal'.
     * 
     * @param sinalISSMensal the value of field 'sinalISSMensal'.
     */
    public void setSinalISSMensal(java.lang.String sinalISSMensal)
    {
        this._sinalISSMensal = sinalISSMensal;
    } //-- void setSinalISSMensal(java.lang.String) 

    /**
     * Sets the value of field 'valorISSMensal'.
     * 
     * @param valorISSMensal the value of field 'valorISSMensal'.
     */
    public void setValorISSMensal(double valorISSMensal)
    {
        this._valorISSMensal = valorISSMensal;
        this._has_valorISSMensal = true;
    } //-- void setValorISSMensal(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Issmensal
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoaposfechamentototaliza.response.Issmensal unmarshal(java.io.Reader) 

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
