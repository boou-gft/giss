/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ValorMovimento.java,v 1.1 2017/04/11 14:08:55 gmichelini Exp $
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
 * Class ValorMovimento.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:08:55 $
 */
public class ValorMovimento implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _sinalValorMovimento
     */
    private java.lang.String _sinalValorMovimento;

    /**
     * Field _valorValorMovimento
     */
    private double _valorValorMovimento = 0;

    /**
     * keeps track of state for field: _valorValorMovimento
     */
    private boolean _has_valorValorMovimento;


      //----------------/
     //- Constructors -/
    //----------------/

    public ValorMovimento() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorMovimento()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteValorValorMovimento
     * 
     */
    public void deleteValorValorMovimento()
    {
        this._has_valorValorMovimento= false;
    } //-- void deleteValorValorMovimento() 

    /**
     * Returns the value of field 'sinalValorMovimento'.
     * 
     * @return String
     * @return the value of field 'sinalValorMovimento'.
     */
    public java.lang.String getSinalValorMovimento()
    {
        return this._sinalValorMovimento;
    } //-- java.lang.String getSinalValorMovimento() 

    /**
     * Returns the value of field 'valorValorMovimento'.
     * 
     * @return double
     * @return the value of field 'valorValorMovimento'.
     */
    public double getValorValorMovimento()
    {
        return this._valorValorMovimento;
    } //-- double getValorValorMovimento() 

    /**
     * Method hasValorValorMovimento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorValorMovimento()
    {
        return this._has_valorValorMovimento;
    } //-- boolean hasValorValorMovimento() 

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
     * Sets the value of field 'sinalValorMovimento'.
     * 
     * @param sinalValorMovimento the value of field
     * 'sinalValorMovimento'.
     */
    public void setSinalValorMovimento(java.lang.String sinalValorMovimento)
    {
        this._sinalValorMovimento = sinalValorMovimento;
    } //-- void setSinalValorMovimento(java.lang.String) 

    /**
     * Sets the value of field 'valorValorMovimento'.
     * 
     * @param valorValorMovimento the value of field
     * 'valorValorMovimento'.
     */
    public void setValorValorMovimento(double valorValorMovimento)
    {
        this._valorValorMovimento = valorValorMovimento;
        this._has_valorValorMovimento = true;
    } //-- void setValorValorMovimento(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ValorMovimento
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorMovimento unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorMovimento) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorMovimento.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.ValorMovimento unmarshal(java.io.Reader) 

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
