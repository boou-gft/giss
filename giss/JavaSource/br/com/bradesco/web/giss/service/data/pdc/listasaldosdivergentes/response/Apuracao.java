/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Apuracao.java,v 1.1 2017/04/11 14:10:08 gmichelini Exp $
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
 * Class Apuracao.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:08 $
 */
public class Apuracao implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalSaldoApuracao
     */
    private java.lang.String _sinalSaldoApuracao;

    /**
     * Field _valorSaldoApuracao
     */
    private java.math.BigDecimal _valorSaldoApuracao = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Apuracao() 
     {
        super();
        setValorSaldoApuracao(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Apuracao()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'sinalSaldoApuracao'.
     * 
     * @return String
     * @return the value of field 'sinalSaldoApuracao'.
     */
    public java.lang.String getSinalSaldoApuracao()
    {
        return this._sinalSaldoApuracao;
    } //-- java.lang.String getSinalSaldoApuracao() 

    /**
     * Returns the value of field 'valorSaldoApuracao'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorSaldoApuracao'.
     */
    public java.math.BigDecimal getValorSaldoApuracao()
    {
        return this._valorSaldoApuracao;
    } //-- java.math.BigDecimal getValorSaldoApuracao() 

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
     * Sets the value of field 'sinalSaldoApuracao'.
     * 
     * @param sinalSaldoApuracao the value of field
     * 'sinalSaldoApuracao'.
     */
    public void setSinalSaldoApuracao(java.lang.String sinalSaldoApuracao)
    {
        this._sinalSaldoApuracao = sinalSaldoApuracao;
    } //-- void setSinalSaldoApuracao(java.lang.String) 

    /**
     * Sets the value of field 'valorSaldoApuracao'.
     * 
     * @param valorSaldoApuracao the value of field
     * 'valorSaldoApuracao'.
     */
    public void setValorSaldoApuracao(java.math.BigDecimal valorSaldoApuracao)
    {
        this._valorSaldoApuracao = valorSaldoApuracao;
    } //-- void setValorSaldoApuracao(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Apuracao
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Apuracao unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Apuracao) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Apuracao.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listasaldosdivergentes.response.Apuracao unmarshal(java.io.Reader) 

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
