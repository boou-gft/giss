/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.request;

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
 * Class ListarDependenciaApuracaoMensalRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ListarDependenciaApuracaoMensalRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _numeroMaximoOcorrencia
     */
    private int _numeroMaximoOcorrencia = 0;

    /**
     * keeps track of state for field: _numeroMaximoOcorrencia
     */
    private boolean _has_numeroMaximoOcorrencia;

    /**
     * Field _mesAnoApuracaoContabil
     */
    private int _mesAnoApuracaoContabil = 0;

    /**
     * keeps track of state for field: _mesAnoApuracaoContabil
     */
    private boolean _has_mesAnoApuracaoContabil;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _codigoUndOrgnz
     */
    private int _codigoUndOrgnz = 0;

    /**
     * keeps track of state for field: _codigoUndOrgnz
     */
    private boolean _has_codigoUndOrgnz;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListarDependenciaApuracaoMensalRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.request.ListarDependenciaApuracaoMensalRequest()


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
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteCodigoUndOrgnz
     * 
     */
    public void deleteCodigoUndOrgnz()
    {
        this._has_codigoUndOrgnz= false;
    } //-- void deleteCodigoUndOrgnz() 

    /**
     * Method deleteMesAnoApuracaoContabil
     * 
     */
    public void deleteMesAnoApuracaoContabil()
    {
        this._has_mesAnoApuracaoContabil= false;
    } //-- void deleteMesAnoApuracaoContabil() 

    /**
     * Method deleteNumeroMaximoOcorrencia
     * 
     */
    public void deleteNumeroMaximoOcorrencia()
    {
        this._has_numeroMaximoOcorrencia= false;
    } //-- void deleteNumeroMaximoOcorrencia() 

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
     * Returns the value of field 'codigoPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codigoPessoaJuridica'.
     */
    public long getCodigoPessoaJuridica()
    {
        return this._codigoPessoaJuridica;
    } //-- long getCodigoPessoaJuridica() 

    /**
     * Returns the value of field 'codigoUndOrgnz'.
     * 
     * @return int
     * @return the value of field 'codigoUndOrgnz'.
     */
    public int getCodigoUndOrgnz()
    {
        return this._codigoUndOrgnz;
    } //-- int getCodigoUndOrgnz() 

    /**
     * Returns the value of field 'mesAnoApuracaoContabil'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracaoContabil'.
     */
    public int getMesAnoApuracaoContabil()
    {
        return this._mesAnoApuracaoContabil;
    } //-- int getMesAnoApuracaoContabil() 

    /**
     * Returns the value of field 'numeroMaximoOcorrencia'.
     * 
     * @return int
     * @return the value of field 'numeroMaximoOcorrencia'.
     */
    public int getNumeroMaximoOcorrencia()
    {
        return this._numeroMaximoOcorrencia;
    } //-- int getNumeroMaximoOcorrencia() 

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
     * Method hasCodigoPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaJuridica()
    {
        return this._has_codigoPessoaJuridica;
    } //-- boolean hasCodigoPessoaJuridica() 

    /**
     * Method hasCodigoUndOrgnz
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUndOrgnz()
    {
        return this._has_codigoUndOrgnz;
    } //-- boolean hasCodigoUndOrgnz() 

    /**
     * Method hasMesAnoApuracaoContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracaoContabil()
    {
        return this._has_mesAnoApuracaoContabil;
    } //-- boolean hasMesAnoApuracaoContabil() 

    /**
     * Method hasNumeroMaximoOcorrencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroMaximoOcorrencia()
    {
        return this._has_numeroMaximoOcorrencia;
    } //-- boolean hasNumeroMaximoOcorrencia() 

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
     * Sets the value of field 'codigoPessoaJuridica'.
     * 
     * @param codigoPessoaJuridica the value of field
     * 'codigoPessoaJuridica'.
     */
    public void setCodigoPessoaJuridica(long codigoPessoaJuridica)
    {
        this._codigoPessoaJuridica = codigoPessoaJuridica;
        this._has_codigoPessoaJuridica = true;
    } //-- void setCodigoPessoaJuridica(long) 

    /**
     * Sets the value of field 'codigoUndOrgnz'.
     * 
     * @param codigoUndOrgnz the value of field 'codigoUndOrgnz'.
     */
    public void setCodigoUndOrgnz(int codigoUndOrgnz)
    {
        this._codigoUndOrgnz = codigoUndOrgnz;
        this._has_codigoUndOrgnz = true;
    } //-- void setCodigoUndOrgnz(int) 

    /**
     * Sets the value of field 'mesAnoApuracaoContabil'.
     * 
     * @param mesAnoApuracaoContabil the value of field
     * 'mesAnoApuracaoContabil'.
     */
    public void setMesAnoApuracaoContabil(int mesAnoApuracaoContabil)
    {
        this._mesAnoApuracaoContabil = mesAnoApuracaoContabil;
        this._has_mesAnoApuracaoContabil = true;
    } //-- void setMesAnoApuracaoContabil(int) 

    /**
     * Sets the value of field 'numeroMaximoOcorrencia'.
     * 
     * @param numeroMaximoOcorrencia the value of field
     * 'numeroMaximoOcorrencia'.
     */
    public void setNumeroMaximoOcorrencia(int numeroMaximoOcorrencia)
    {
        this._numeroMaximoOcorrencia = numeroMaximoOcorrencia;
        this._has_numeroMaximoOcorrencia = true;
    } //-- void setNumeroMaximoOcorrencia(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListarDependenciaApuracaoMensalRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.request.ListarDependenciaApuracaoMensalRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.request.ListarDependenciaApuracaoMensalRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.request.ListarDependenciaApuracaoMensalRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciaapuracaomensal.request.ListarDependenciaApuracaoMensalRequest unmarshal(java.io.Reader) 

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
