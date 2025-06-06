/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: MovReceitaApuracao.java,v 1.1 2017/04/11 14:08:10 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response;

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
 * Class MovReceitaApuracao.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:08:10 $
 */
public class MovReceitaApuracao implements java.io.Serializable {


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
    private double _valor = 0;

    /**
     * keeps track of state for field: _valor
     */
    private boolean _has_valor;


      //----------------/
     //- Constructors -/
    //----------------/

    public MovReceitaApuracao() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.MovReceitaApuracao()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteValor
     * 
     */
    public void deleteValor()
    {
        this._has_valor= false;
    } //-- void deleteValor() 

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
     * @return double
     * @return the value of field 'valor'.
     */
    public double getValor()
    {
        return this._valor;
    } //-- double getValor() 

    /**
     * Method hasValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValor()
    {
        return this._has_valor;
    } //-- boolean hasValor() 

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
    public void setValor(double valor)
    {
        this._valor = valor;
        this._has_valor = true;
    } //-- void setValor(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return MovReceitaApuracao
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.MovReceitaApuracao unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.MovReceitaApuracao) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.MovReceitaApuracao.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.MovReceitaApuracao unmarshal(java.io.Reader) 

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
