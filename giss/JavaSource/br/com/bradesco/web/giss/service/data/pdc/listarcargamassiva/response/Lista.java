/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcargamassiva.response;

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
     * Field _numeroRemessa
     */
    private long _numeroRemessa = 0;

    /**
     * keeps track of state for field: _numeroRemessa
     */
    private boolean _has_numeroRemessa;

    /**
     * Field _codigoSituacao
     */
    private int _codigoSituacao = 0;

    /**
     * keeps track of state for field: _codigoSituacao
     */
    private boolean _has_codigoSituacao;

    /**
     * Field _usuarioCarga
     */
    private java.lang.String _usuarioCarga;

    /**
     * Field _dataHoraCarga
     */
    private java.lang.String _dataHoraCarga;

    /**
     * Field _usuarioConferencia
     */
    private java.lang.String _usuarioConferencia;

    /**
     * Field _dataHoraConferencia
     */
    private java.lang.String _dataHoraConferencia;

    /**
     * Field _usuarioAprovacao
     */
    private java.lang.String _usuarioAprovacao;

    /**
     * Field _dataHoraAprovacao
     */
    private java.lang.String _dataHoraAprovacao;


      //----------------/
     //- Constructors -/
    //----------------/

    public Lista() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcargamassiva.response.Lista()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoSituacao
     * 
     */
    public void deleteCodigoSituacao()
    {
        this._has_codigoSituacao= false;
    } //-- void deleteCodigoSituacao() 

    /**
     * Method deleteNumeroRemessa
     * 
     */
    public void deleteNumeroRemessa()
    {
        this._has_numeroRemessa= false;
    } //-- void deleteNumeroRemessa() 

    /**
     * Returns the value of field 'codigoSituacao'.
     * 
     * @return int
     * @return the value of field 'codigoSituacao'.
     */
    public int getCodigoSituacao()
    {
        return this._codigoSituacao;
    } //-- int getCodigoSituacao() 

    /**
     * Returns the value of field 'dataHoraAprovacao'.
     * 
     * @return String
     * @return the value of field 'dataHoraAprovacao'.
     */
    public java.lang.String getDataHoraAprovacao()
    {
        return this._dataHoraAprovacao;
    } //-- java.lang.String getDataHoraAprovacao() 

    /**
     * Returns the value of field 'dataHoraCarga'.
     * 
     * @return String
     * @return the value of field 'dataHoraCarga'.
     */
    public java.lang.String getDataHoraCarga()
    {
        return this._dataHoraCarga;
    } //-- java.lang.String getDataHoraCarga() 

    /**
     * Returns the value of field 'dataHoraConferencia'.
     * 
     * @return String
     * @return the value of field 'dataHoraConferencia'.
     */
    public java.lang.String getDataHoraConferencia()
    {
        return this._dataHoraConferencia;
    } //-- java.lang.String getDataHoraConferencia() 

    /**
     * Returns the value of field 'numeroRemessa'.
     * 
     * @return long
     * @return the value of field 'numeroRemessa'.
     */
    public long getNumeroRemessa()
    {
        return this._numeroRemessa;
    } //-- long getNumeroRemessa() 

    /**
     * Returns the value of field 'usuarioAprovacao'.
     * 
     * @return String
     * @return the value of field 'usuarioAprovacao'.
     */
    public java.lang.String getUsuarioAprovacao()
    {
        return this._usuarioAprovacao;
    } //-- java.lang.String getUsuarioAprovacao() 

    /**
     * Returns the value of field 'usuarioCarga'.
     * 
     * @return String
     * @return the value of field 'usuarioCarga'.
     */
    public java.lang.String getUsuarioCarga()
    {
        return this._usuarioCarga;
    } //-- java.lang.String getUsuarioCarga() 

    /**
     * Returns the value of field 'usuarioConferencia'.
     * 
     * @return String
     * @return the value of field 'usuarioConferencia'.
     */
    public java.lang.String getUsuarioConferencia()
    {
        return this._usuarioConferencia;
    } //-- java.lang.String getUsuarioConferencia() 

    /**
     * Method hasCodigoSituacao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoSituacao()
    {
        return this._has_codigoSituacao;
    } //-- boolean hasCodigoSituacao() 

    /**
     * Method hasNumeroRemessa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroRemessa()
    {
        return this._has_numeroRemessa;
    } //-- boolean hasNumeroRemessa() 

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
     * Sets the value of field 'codigoSituacao'.
     * 
     * @param codigoSituacao the value of field 'codigoSituacao'.
     */
    public void setCodigoSituacao(int codigoSituacao)
    {
        this._codigoSituacao = codigoSituacao;
        this._has_codigoSituacao = true;
    } //-- void setCodigoSituacao(int) 

    /**
     * Sets the value of field 'dataHoraAprovacao'.
     * 
     * @param dataHoraAprovacao the value of field
     * 'dataHoraAprovacao'.
     */
    public void setDataHoraAprovacao(java.lang.String dataHoraAprovacao)
    {
        this._dataHoraAprovacao = dataHoraAprovacao;
    } //-- void setDataHoraAprovacao(java.lang.String) 

    /**
     * Sets the value of field 'dataHoraCarga'.
     * 
     * @param dataHoraCarga the value of field 'dataHoraCarga'.
     */
    public void setDataHoraCarga(java.lang.String dataHoraCarga)
    {
        this._dataHoraCarga = dataHoraCarga;
    } //-- void setDataHoraCarga(java.lang.String) 

    /**
     * Sets the value of field 'dataHoraConferencia'.
     * 
     * @param dataHoraConferencia the value of field
     * 'dataHoraConferencia'.
     */
    public void setDataHoraConferencia(java.lang.String dataHoraConferencia)
    {
        this._dataHoraConferencia = dataHoraConferencia;
    } //-- void setDataHoraConferencia(java.lang.String) 

    /**
     * Sets the value of field 'numeroRemessa'.
     * 
     * @param numeroRemessa the value of field 'numeroRemessa'.
     */
    public void setNumeroRemessa(long numeroRemessa)
    {
        this._numeroRemessa = numeroRemessa;
        this._has_numeroRemessa = true;
    } //-- void setNumeroRemessa(long) 

    /**
     * Sets the value of field 'usuarioAprovacao'.
     * 
     * @param usuarioAprovacao the value of field 'usuarioAprovacao'
     */
    public void setUsuarioAprovacao(java.lang.String usuarioAprovacao)
    {
        this._usuarioAprovacao = usuarioAprovacao;
    } //-- void setUsuarioAprovacao(java.lang.String) 

    /**
     * Sets the value of field 'usuarioCarga'.
     * 
     * @param usuarioCarga the value of field 'usuarioCarga'.
     */
    public void setUsuarioCarga(java.lang.String usuarioCarga)
    {
        this._usuarioCarga = usuarioCarga;
    } //-- void setUsuarioCarga(java.lang.String) 

    /**
     * Sets the value of field 'usuarioConferencia'.
     * 
     * @param usuarioConferencia the value of field
     * 'usuarioConferencia'.
     */
    public void setUsuarioConferencia(java.lang.String usuarioConferencia)
    {
        this._usuarioConferencia = usuarioConferencia;
    } //-- void setUsuarioConferencia(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Lista
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcargamassiva.response.Lista unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcargamassiva.response.Lista) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcargamassiva.response.Lista.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcargamassiva.response.Lista unmarshal(java.io.Reader) 

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
