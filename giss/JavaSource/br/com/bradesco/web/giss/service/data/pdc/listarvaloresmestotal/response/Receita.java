/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Receita.java,v 1.1 2012/11/22 15:40:48 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response;

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
 * Class Receita.
 * 
 * @version $Revision: 1.1 $ $Date: 2012/11/22 15:40:48 $
 */
public class Receita implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalReceita
     */
    private java.lang.String _sinalReceita;

    /**
     * Field _valorReceita
     */
    private double _valorReceita = 0;

    /**
     * keeps track of state for field: _valorReceita
     */
    private boolean _has_valorReceita;


      //----------------/
     //- Constructors -/
    //----------------/

    public Receita() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Receita()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteValorReceita
     * 
     */
    public void deleteValorReceita()
    {
        this._has_valorReceita= false;
    } //-- void deleteValorReceita() 

    /**
     * Returns the value of field 'sinalReceita'.
     * 
     * @return String
     * @return the value of field 'sinalReceita'.
     */
    public java.lang.String getSinalReceita()
    {
        return this._sinalReceita;
    } //-- java.lang.String getSinalReceita() 

    /**
     * Returns the value of field 'valorReceita'.
     * 
     * @return double
     * @return the value of field 'valorReceita'.
     */
    public double getValorReceita()
    {
        return this._valorReceita;
    } //-- double getValorReceita() 

    /**
     * Method hasValorReceita
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorReceita()
    {
        return this._has_valorReceita;
    } //-- boolean hasValorReceita() 

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
     * Sets the value of field 'sinalReceita'.
     * 
     * @param sinalReceita the value of field 'sinalReceita'.
     */
    public void setSinalReceita(java.lang.String sinalReceita)
    {
        this._sinalReceita = sinalReceita;
    } //-- void setSinalReceita(java.lang.String) 

    /**
     * Sets the value of field 'valorReceita'.
     * 
     * @param valorReceita the value of field 'valorReceita'.
     */
    public void setValorReceita(double valorReceita)
    {
        this._valorReceita = valorReceita;
        this._has_valorReceita = true;
    } //-- void setValorReceita(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Receita
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Receita unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Receita) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Receita.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarvaloresmestotal.response.Receita unmarshal(java.io.Reader) 

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
