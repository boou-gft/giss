/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.response;

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
 * Class Lista.
 * 
 * @version $Revision$ $Date$
 */
public class Lista implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataAtualizacao
     */
    private java.lang.String _dataAtualizacao;

    /**
     * Field _sinalJustificativa
     */
    private java.lang.String _sinalJustificativa;

    /**
     * Field _valorJustificativa
     */
    private double _valorJustificativa = 0;

    /**
     * keeps track of state for field: _valorJustificativa
     */
    private boolean _has_valorJustificativa;

    /**
     * Field _descJustificativa
     */
    private java.lang.String _descJustificativa;

    /**
     * Field _codUsuarioManut
     */
    private java.lang.String _codUsuarioManut;


      //----------------/
     //- Constructors -/
    //----------------/

    public Lista() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.response.Lista()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteValorJustificativa
     * 
     */
    public void deleteValorJustificativa()
    {
        this._has_valorJustificativa= false;
    } //-- void deleteValorJustificativa() 

    /**
     * Returns the value of field 'codUsuarioManut'.
     * 
     * @return String
     * @return the value of field 'codUsuarioManut'.
     */
    public java.lang.String getCodUsuarioManut()
    {
        return this._codUsuarioManut;
    } //-- java.lang.String getCodUsuarioManut() 

    /**
     * Returns the value of field 'dataAtualizacao'.
     * 
     * @return String
     * @return the value of field 'dataAtualizacao'.
     */
    public java.lang.String getDataAtualizacao()
    {
        return this._dataAtualizacao;
    } //-- java.lang.String getDataAtualizacao() 

    /**
     * Returns the value of field 'descJustificativa'.
     * 
     * @return String
     * @return the value of field 'descJustificativa'.
     */
    public java.lang.String getDescJustificativa()
    {
        return this._descJustificativa;
    } //-- java.lang.String getDescJustificativa() 

    /**
     * Returns the value of field 'sinalJustificativa'.
     * 
     * @return String
     * @return the value of field 'sinalJustificativa'.
     */
    public java.lang.String getSinalJustificativa()
    {
        return this._sinalJustificativa;
    } //-- java.lang.String getSinalJustificativa() 

    /**
     * Returns the value of field 'valorJustificativa'.
     * 
     * @return double
     * @return the value of field 'valorJustificativa'.
     */
    public double getValorJustificativa()
    {
        return this._valorJustificativa;
    } //-- double getValorJustificativa() 

    /**
     * Method hasValorJustificativa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorJustificativa()
    {
        return this._has_valorJustificativa;
    } //-- boolean hasValorJustificativa() 

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
     * Sets the value of field 'codUsuarioManut'.
     * 
     * @param codUsuarioManut the value of field 'codUsuarioManut'.
     */
    public void setCodUsuarioManut(java.lang.String codUsuarioManut)
    {
        this._codUsuarioManut = codUsuarioManut;
    } //-- void setCodUsuarioManut(java.lang.String) 

    /**
     * Sets the value of field 'dataAtualizacao'.
     * 
     * @param dataAtualizacao the value of field 'dataAtualizacao'.
     */
    public void setDataAtualizacao(java.lang.String dataAtualizacao)
    {
        this._dataAtualizacao = dataAtualizacao;
    } //-- void setDataAtualizacao(java.lang.String) 

    /**
     * Sets the value of field 'descJustificativa'.
     * 
     * @param descJustificativa the value of field
     * 'descJustificativa'.
     */
    public void setDescJustificativa(java.lang.String descJustificativa)
    {
        this._descJustificativa = descJustificativa;
    } //-- void setDescJustificativa(java.lang.String) 

    /**
     * Sets the value of field 'sinalJustificativa'.
     * 
     * @param sinalJustificativa the value of field
     * 'sinalJustificativa'.
     */
    public void setSinalJustificativa(java.lang.String sinalJustificativa)
    {
        this._sinalJustificativa = sinalJustificativa;
    } //-- void setSinalJustificativa(java.lang.String) 

    /**
     * Sets the value of field 'valorJustificativa'.
     * 
     * @param valorJustificativa the value of field
     * 'valorJustificativa'.
     */
    public void setValorJustificativa(double valorJustificativa)
    {
        this._valorJustificativa = valorJustificativa;
        this._has_valorJustificativa = true;
    } //-- void setValorJustificativa(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Lista
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.response.Lista unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.response.Lista) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.response.Lista.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharjustificativaapuracao.response.Lista unmarshal(java.io.Reader) 

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
