/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Contabil.java,v 1.1 2017/04/11 14:10:08 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response;

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
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:08 $
 */
public class Contabil implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalSaldoContabil
     */
    private java.lang.String _sinalSaldoContabil;

    /**
     * Field _valorSaldoContabil
     */
    private java.math.BigDecimal _valorSaldoContabil = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Contabil() 
     {
        super();
        setValorSaldoContabil(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Contabil()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'sinalSaldoContabil'.
     * 
     * @return String
     * @return the value of field 'sinalSaldoContabil'.
     */
    public java.lang.String getSinalSaldoContabil()
    {
        return this._sinalSaldoContabil;
    } //-- java.lang.String getSinalSaldoContabil() 

    /**
     * Returns the value of field 'valorSaldoContabil'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorSaldoContabil'.
     */
    public java.math.BigDecimal getValorSaldoContabil()
    {
        return this._valorSaldoContabil;
    } //-- java.math.BigDecimal getValorSaldoContabil() 

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
     * Sets the value of field 'sinalSaldoContabil'.
     * 
     * @param sinalSaldoContabil the value of field
     * 'sinalSaldoContabil'.
     */
    public void setSinalSaldoContabil(java.lang.String sinalSaldoContabil)
    {
        this._sinalSaldoContabil = sinalSaldoContabil;
    } //-- void setSinalSaldoContabil(java.lang.String) 

    /**
     * Sets the value of field 'valorSaldoContabil'.
     * 
     * @param valorSaldoContabil the value of field
     * 'valorSaldoContabil'.
     */
    public void setValorSaldoContabil(java.math.BigDecimal valorSaldoContabil)
    {
        this._valorSaldoContabil = valorSaldoContabil;
    } //-- void setValorSaldoContabil(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Contabil
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Contabil unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Contabil) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Contabil.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Contabil unmarshal(java.io.Reader) 

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
