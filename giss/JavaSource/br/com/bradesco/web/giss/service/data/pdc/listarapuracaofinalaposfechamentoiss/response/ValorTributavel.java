/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ValorTributavel.java,v 1.1 2017/04/11 14:08:54 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response;

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
 * Class ValorTributavel.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:08:54 $
 */
public class ValorTributavel implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalvalorTributavel
     */
    private java.lang.String _sinalvalorTributavel;

    /**
     * Field _valorvalorTributavel
     */
    private double _valorvalorTributavel = 0;

    /**
     * keeps track of state for field: _valorvalorTributavel
     */
    private boolean _has_valorvalorTributavel;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValorTributavel() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorTributavel()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteValorvalorTributavel
     * 
     */
    public void deleteValorvalorTributavel()
    {
        this._has_valorvalorTributavel= false;
    } //-- void deleteValorvalorTributavel() 

    /**
     * Returns the value of field 'sinalvalorTributavel'.
     * 
     * @return String
     * @return the value of field 'sinalvalorTributavel'.
     */
    public java.lang.String getSinalvalorTributavel()
    {
        return this._sinalvalorTributavel;
    } //-- java.lang.String getSinalvalorTributavel() 

    /**
     * Returns the value of field 'valorvalorTributavel'.
     * 
     * @return double
     * @return the value of field 'valorvalorTributavel'.
     */
    public double getValorvalorTributavel()
    {
        return this._valorvalorTributavel;
    } //-- double getValorvalorTributavel() 

    /**
     * Method hasValorvalorTributavel
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorvalorTributavel()
    {
        return this._has_valorvalorTributavel;
    } //-- boolean hasValorvalorTributavel() 

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
     * Sets the value of field 'sinalvalorTributavel'.
     * 
     * @param sinalvalorTributavel the value of field
     * 'sinalvalorTributavel'.
     */
    public void setSinalvalorTributavel(java.lang.String sinalvalorTributavel)
    {
        this._sinalvalorTributavel = sinalvalorTributavel;
    } //-- void setSinalvalorTributavel(java.lang.String) 

    /**
     * Sets the value of field 'valorvalorTributavel'.
     * 
     * @param valorvalorTributavel the value of field
     * 'valorvalorTributavel'.
     */
    public void setValorvalorTributavel(double valorvalorTributavel)
    {
        this._valorvalorTributavel = valorvalorTributavel;
        this._has_valorvalorTributavel = true;
    } //-- void setValorvalorTributavel(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ValorTributavel
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorTributavel unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorTributavel) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorTributavel.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorTributavel unmarshal(java.io.Reader) 

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
