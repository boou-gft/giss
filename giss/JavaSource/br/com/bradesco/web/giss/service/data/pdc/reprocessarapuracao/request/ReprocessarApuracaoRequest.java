/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.reprocessarapuracao.request;

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
 * Class ReprocessarApuracaoRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ReprocessarApuracaoRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _anoMesCompetencia
     */
    private int _anoMesCompetencia = 0;

    /**
     * keeps track of state for field: _anoMesCompetencia
     */
    private boolean _has_anoMesCompetencia;

    /**
     * Field _codigoEmpresa
     */
    private int _codigoEmpresa = 0;

    /**
     * keeps track of state for field: _codigoEmpresa
     */
    private boolean _has_codigoEmpresa;

    /**
     * Field _codigoProduto
     */
    private int _codigoProduto = 0;

    /**
     * keeps track of state for field: _codigoProduto
     */
    private boolean _has_codigoProduto;

    /**
     * Field _numeroApuracao
     */
    private int _numeroApuracao = 0;

    /**
     * keeps track of state for field: _numeroApuracao
     */
    private boolean _has_numeroApuracao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReprocessarApuracaoRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.reprocessarapuracao.request.ReprocessarApuracaoRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAnoMesCompetencia
     * 
     */
    public void deleteAnoMesCompetencia()
    {
        this._has_anoMesCompetencia= false;
    } //-- void deleteAnoMesCompetencia() 

    /**
     * Method deleteCodigoEmpresa
     * 
     */
    public void deleteCodigoEmpresa()
    {
        this._has_codigoEmpresa= false;
    } //-- void deleteCodigoEmpresa() 

    /**
     * Method deleteCodigoProduto
     * 
     */
    public void deleteCodigoProduto()
    {
        this._has_codigoProduto= false;
    } //-- void deleteCodigoProduto() 

    /**
     * Method deleteNumeroApuracao
     * 
     */
    public void deleteNumeroApuracao()
    {
        this._has_numeroApuracao= false;
    } //-- void deleteNumeroApuracao() 

    /**
     * Returns the value of field 'anoMesCompetencia'.
     * 
     * @return int
     * @return the value of field 'anoMesCompetencia'.
     */
    public int getAnoMesCompetencia()
    {
        return this._anoMesCompetencia;
    } //-- int getAnoMesCompetencia() 

    /**
     * Returns the value of field 'codigoEmpresa'.
     * 
     * @return int
     * @return the value of field 'codigoEmpresa'.
     */
    public int getCodigoEmpresa()
    {
        return this._codigoEmpresa;
    } //-- int getCodigoEmpresa() 

    /**
     * Returns the value of field 'codigoProduto'.
     * 
     * @return int
     * @return the value of field 'codigoProduto'.
     */
    public int getCodigoProduto()
    {
        return this._codigoProduto;
    } //-- int getCodigoProduto() 

    /**
     * Returns the value of field 'numeroApuracao'.
     * 
     * @return int
     * @return the value of field 'numeroApuracao'.
     */
    public int getNumeroApuracao()
    {
        return this._numeroApuracao;
    } //-- int getNumeroApuracao() 

    /**
     * Method hasAnoMesCompetencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoMesCompetencia()
    {
        return this._has_anoMesCompetencia;
    } //-- boolean hasAnoMesCompetencia() 

    /**
     * Method hasCodigoEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoEmpresa()
    {
        return this._has_codigoEmpresa;
    } //-- boolean hasCodigoEmpresa() 

    /**
     * Method hasCodigoProduto
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoProduto()
    {
        return this._has_codigoProduto;
    } //-- boolean hasCodigoProduto() 

    /**
     * Method hasNumeroApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroApuracao()
    {
        return this._has_numeroApuracao;
    } //-- boolean hasNumeroApuracao() 

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
     * Sets the value of field 'anoMesCompetencia'.
     * 
     * @param anoMesCompetencia the value of field
     * 'anoMesCompetencia'.
     */
    public void setAnoMesCompetencia(int anoMesCompetencia)
    {
        this._anoMesCompetencia = anoMesCompetencia;
        this._has_anoMesCompetencia = true;
    } //-- void setAnoMesCompetencia(int) 

    /**
     * Sets the value of field 'codigoEmpresa'.
     * 
     * @param codigoEmpresa the value of field 'codigoEmpresa'.
     */
    public void setCodigoEmpresa(int codigoEmpresa)
    {
        this._codigoEmpresa = codigoEmpresa;
        this._has_codigoEmpresa = true;
    } //-- void setCodigoEmpresa(int) 

    /**
     * Sets the value of field 'codigoProduto'.
     * 
     * @param codigoProduto the value of field 'codigoProduto'.
     */
    public void setCodigoProduto(int codigoProduto)
    {
        this._codigoProduto = codigoProduto;
        this._has_codigoProduto = true;
    } //-- void setCodigoProduto(int) 

    /**
     * Sets the value of field 'numeroApuracao'.
     * 
     * @param numeroApuracao the value of field 'numeroApuracao'.
     */
    public void setNumeroApuracao(int numeroApuracao)
    {
        this._numeroApuracao = numeroApuracao;
        this._has_numeroApuracao = true;
    } //-- void setNumeroApuracao(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ReprocessarApuracaoRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.reprocessarapuracao.request.ReprocessarApuracaoRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.reprocessarapuracao.request.ReprocessarApuracaoRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.reprocessarapuracao.request.ReprocessarApuracaoRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.reprocessarapuracao.request.ReprocessarApuracaoRequest unmarshal(java.io.Reader) 

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
