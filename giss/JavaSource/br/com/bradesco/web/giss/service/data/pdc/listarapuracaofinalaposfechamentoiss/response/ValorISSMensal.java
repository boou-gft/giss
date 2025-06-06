/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ValorISSMensal.java,v 1.1 2017/04/11 14:08:54 gmichelini Exp $
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
 * Class ValorISSMensal.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:08:54 $
 */
public class ValorISSMensal implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalValorISSMensal
     */
    private java.lang.String _sinalValorISSMensal;

    /**
     * Field _valorValorISSMensal
     */
    private double _valorValorISSMensal = 0;

    /**
     * keeps track of state for field: _valorValorISSMensal
     */
    private boolean _has_valorValorISSMensal;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValorISSMensal() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorISSMensal()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteValorValorISSMensal
     * 
     */
    public void deleteValorValorISSMensal()
    {
        this._has_valorValorISSMensal= false;
    } //-- void deleteValorValorISSMensal() 

    /**
     * Returns the value of field 'sinalValorISSMensal'.
     * 
     * @return String
     * @return the value of field 'sinalValorISSMensal'.
     */
    public java.lang.String getSinalValorISSMensal()
    {
        return this._sinalValorISSMensal;
    } //-- java.lang.String getSinalValorISSMensal() 

    /**
     * Returns the value of field 'valorValorISSMensal'.
     * 
     * @return double
     * @return the value of field 'valorValorISSMensal'.
     */
    public double getValorValorISSMensal()
    {
        return this._valorValorISSMensal;
    } //-- double getValorValorISSMensal() 

    /**
     * Method hasValorValorISSMensal
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorValorISSMensal()
    {
        return this._has_valorValorISSMensal;
    } //-- boolean hasValorValorISSMensal() 

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
     * Sets the value of field 'sinalValorISSMensal'.
     * 
     * @param sinalValorISSMensal the value of field
     * 'sinalValorISSMensal'.
     */
    public void setSinalValorISSMensal(java.lang.String sinalValorISSMensal)
    {
        this._sinalValorISSMensal = sinalValorISSMensal;
    } //-- void setSinalValorISSMensal(java.lang.String) 

    /**
     * Sets the value of field 'valorValorISSMensal'.
     * 
     * @param valorValorISSMensal the value of field
     * 'valorValorISSMensal'.
     */
    public void setValorValorISSMensal(double valorValorISSMensal)
    {
        this._valorValorISSMensal = valorValorISSMensal;
        this._has_valorValorISSMensal = true;
    } //-- void setValorValorISSMensal(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ValorISSMensal
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorISSMensal unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorISSMensal) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorISSMensal.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorISSMensal unmarshal(java.io.Reader) 

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
