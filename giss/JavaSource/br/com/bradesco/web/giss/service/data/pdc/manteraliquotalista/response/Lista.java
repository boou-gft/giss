/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.response;

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
 * Class Lista.
 * 
 * @version $Revision$ $Date$
 */
public class Lista implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _descricaoMunicipio
     */
    private java.lang.String _descricaoMunicipio;

    /**
     * Field _aliquota
     */
    private java.math.BigDecimal _aliquota = new java.math.BigDecimal("0");

    /**
     * Field _competenciaInicial
     */
    private java.lang.String _competenciaInicial;

    /**
     * Field _competenciaFinal
     */
    private java.lang.String _competenciaFinal;

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
        setAliquota(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.response.Lista()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Returns the value of field 'aliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquota'.
     */
    public java.math.BigDecimal getAliquota()
    {
        return this._aliquota;
    } //-- java.math.BigDecimal getAliquota() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Returns the value of field 'competenciaFinal'.
     * 
     * @return String
     * @return the value of field 'competenciaFinal'.
     */
    public java.lang.String getCompetenciaFinal()
    {
        return this._competenciaFinal;
    } //-- java.lang.String getCompetenciaFinal() 

    /**
     * Returns the value of field 'competenciaInicial'.
     * 
     * @return String
     * @return the value of field 'competenciaInicial'.
     */
    public java.lang.String getCompetenciaInicial()
    {
        return this._competenciaInicial;
    } //-- java.lang.String getCompetenciaInicial() 

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
     * Returns the value of field 'descricaoMunicipio'.
     * 
     * @return String
     * @return the value of field 'descricaoMunicipio'.
     */
    public java.lang.String getDescricaoMunicipio()
    {
        return this._descricaoMunicipio;
    } //-- java.lang.String getDescricaoMunicipio() 

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
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

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
     * Sets the value of field 'aliquota'.
     * 
     * @param aliquota the value of field 'aliquota'.
     */
    public void setAliquota(java.math.BigDecimal aliquota)
    {
        this._aliquota = aliquota;
    } //-- void setAliquota(java.math.BigDecimal) 

    /**
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Sets the value of field 'competenciaFinal'.
     * 
     * @param competenciaFinal the value of field 'competenciaFinal'
     */
    public void setCompetenciaFinal(java.lang.String competenciaFinal)
    {
        this._competenciaFinal = competenciaFinal;
    } //-- void setCompetenciaFinal(java.lang.String) 

    /**
     * Sets the value of field 'competenciaInicial'.
     * 
     * @param competenciaInicial the value of field
     * 'competenciaInicial'.
     */
    public void setCompetenciaInicial(java.lang.String competenciaInicial)
    {
        this._competenciaInicial = competenciaInicial;
    } //-- void setCompetenciaInicial(java.lang.String) 

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
     * Sets the value of field 'descricaoMunicipio'.
     * 
     * @param descricaoMunicipio the value of field
     * 'descricaoMunicipio'.
     */
    public void setDescricaoMunicipio(java.lang.String descricaoMunicipio)
    {
        this._descricaoMunicipio = descricaoMunicipio;
    } //-- void setDescricaoMunicipio(java.lang.String) 

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
    public static br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.response.Lista unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.response.Lista) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.response.Lista.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotalista.response.Lista unmarshal(java.io.Reader) 

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
