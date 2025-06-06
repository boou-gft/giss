/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Contabil.java,v 1.1 2017/04/11 14:10:41 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Contabil.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:41 $
 */
public class Contabil implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinal
     */
    private java.lang.String _sinal;

    /**
     * Field _valor
     */
    private java.math.BigDecimal _valor = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Contabil() 
     {
        super();
        setValor(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'sinal'.
     * 
     * @return String
     * @return the value of field 'sinal'.
     */
    public java.lang.String getSinal()
    {
        return this._sinal;
    } //-- java.lang.String getSinal() 

    /**
     * Returns the value of field 'valor'.
     * 
     * @return BigDecimal
     * @return the value of field 'valor'.
     */
    public java.math.BigDecimal getValor()
    {
        return this._valor;
    } //-- java.math.BigDecimal getValor() 

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
     * Sets the value of field 'sinal'.
     * 
     * @param sinal the value of field 'sinal'.
     */
    public void setSinal(java.lang.String sinal)
    {
        this._sinal = sinal;
    } //-- void setSinal(java.lang.String) 

    /**
     * Sets the value of field 'valor'.
     * 
     * @param valor the value of field 'valor'.
     */
    public void setValor(java.math.BigDecimal valor)
    {
        this._valor = valor;
    } //-- void setValor(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Contabil
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciassaldorecolhimento.response.Contabil unmarshal(java.io.Reader) 

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
