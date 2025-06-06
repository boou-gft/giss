/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:09:42 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request;

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
 * Class Ocorrencias.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:42 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _valorInicial
     */
    private java.math.BigDecimal _valorInicial = new java.math.BigDecimal("0");

    /**
     * Field _valorFinal
     */
    private java.math.BigDecimal _valorFinal = new java.math.BigDecimal("0");

    /**
     * Field _valorAliquota
     */
    private java.math.BigDecimal _valorAliquota = new java.math.BigDecimal("0");

    /**
     * Field _valorRedutor
     */
    private java.math.BigDecimal _valorRedutor = new java.math.BigDecimal("0");

    /**
     * Field _numeroSequencial
     */
    private int _numeroSequencial = 0;

    /**
     * keeps track of state for field: _numeroSequencial
     */
    private boolean _has_numeroSequencial;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
        setValorInicial(new java.math.BigDecimal("0"));
        setValorFinal(new java.math.BigDecimal("0"));
        setValorAliquota(new java.math.BigDecimal("0"));
        setValorRedutor(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteNumeroSequencial
     * 
     */
    public void deleteNumeroSequencial()
    {
        this._has_numeroSequencial= false;
    } //-- void deleteNumeroSequencial() 

    /**
     * Returns the value of field 'numeroSequencial'.
     * 
     * @return int
     * @return the value of field 'numeroSequencial'.
     */
    public int getNumeroSequencial()
    {
        return this._numeroSequencial;
    } //-- int getNumeroSequencial() 

    /**
     * Returns the value of field 'valorAliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorAliquota'.
     */
    public java.math.BigDecimal getValorAliquota()
    {
        return this._valorAliquota;
    } //-- java.math.BigDecimal getValorAliquota() 

    /**
     * Returns the value of field 'valorFinal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorFinal'.
     */
    public java.math.BigDecimal getValorFinal()
    {
        return this._valorFinal;
    } //-- java.math.BigDecimal getValorFinal() 

    /**
     * Returns the value of field 'valorInicial'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorInicial'.
     */
    public java.math.BigDecimal getValorInicial()
    {
        return this._valorInicial;
    } //-- java.math.BigDecimal getValorInicial() 

    /**
     * Returns the value of field 'valorRedutor'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorRedutor'.
     */
    public java.math.BigDecimal getValorRedutor()
    {
        return this._valorRedutor;
    } //-- java.math.BigDecimal getValorRedutor() 

    /**
     * Method hasNumeroSequencial
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequencial()
    {
        return this._has_numeroSequencial;
    } //-- boolean hasNumeroSequencial() 

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
     * Sets the value of field 'numeroSequencial'.
     * 
     * @param numeroSequencial the value of field 'numeroSequencial'
     */
    public void setNumeroSequencial(int numeroSequencial)
    {
        this._numeroSequencial = numeroSequencial;
        this._has_numeroSequencial = true;
    } //-- void setNumeroSequencial(int) 

    /**
     * Sets the value of field 'valorAliquota'.
     * 
     * @param valorAliquota the value of field 'valorAliquota'.
     */
    public void setValorAliquota(java.math.BigDecimal valorAliquota)
    {
        this._valorAliquota = valorAliquota;
    } //-- void setValorAliquota(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorFinal'.
     * 
     * @param valorFinal the value of field 'valorFinal'.
     */
    public void setValorFinal(java.math.BigDecimal valorFinal)
    {
        this._valorFinal = valorFinal;
    } //-- void setValorFinal(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorInicial'.
     * 
     * @param valorInicial the value of field 'valorInicial'.
     */
    public void setValorInicial(java.math.BigDecimal valorInicial)
    {
        this._valorInicial = valorInicial;
    } //-- void setValorInicial(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorRedutor'.
     * 
     * @param valorRedutor the value of field 'valorRedutor'.
     */
    public void setValorRedutor(java.math.BigDecimal valorRedutor)
    {
        this._valorRedutor = valorRedutor;
    } //-- void setValorRedutor(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.mantertipoincidencia.request.Ocorrencias unmarshal(java.io.Reader) 

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
