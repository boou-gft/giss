/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultartarifascobradas.request;

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
 * Class ConsultarTarifasCobradasRequest.
 * 
 * @version $Revision$ $Date$
 */
public class ConsultarTarifasCobradasRequest implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _dataInicio
     */
    private java.lang.String _dataInicio;

    /**
     * Field _dataFim
     */
    private java.lang.String _dataFim;

    /**
     * Field _cdTipoPesquisa
     */
    private int _cdTipoPesquisa = 0;

    /**
     * keeps track of state for field: _cdTipoPesquisa
     */
    private boolean _has_cdTipoPesquisa;

    /**
     * Field _nomeCliente
     */
    private int _nomeCliente = 0;

    /**
     * keeps track of state for field: _nomeCliente
     */
    private boolean _has_nomeCliente;

    /**
     * Field _cdJuncao
     */
    private int _cdJuncao = 0;

    /**
     * keeps track of state for field: _cdJuncao
     */
    private boolean _has_cdJuncao;

    /**
     * Field _cdMunicipioJuncao
     */
    private long _cdMunicipioJuncao = 0;

    /**
     * keeps track of state for field: _cdMunicipioJuncao
     */
    private boolean _has_cdMunicipioJuncao;

    /**
     * Field _cdUfJuncao
     */
    private int _cdUfJuncao = 0;

    /**
     * keeps track of state for field: _cdUfJuncao
     */
    private boolean _has_cdUfJuncao;

    /**
     * Field _cdTipoRelatorio
     */
    private java.lang.String _cdTipoRelatorio;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarTarifasCobradasRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultartarifascobradas.request.ConsultarTarifasCobradasRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCdJuncao
     * 
     */
    public void deleteCdJuncao()
    {
        this._has_cdJuncao= false;
    } //-- void deleteCdJuncao() 

    /**
     * Method deleteCdMunicipioJuncao
     * 
     */
    public void deleteCdMunicipioJuncao()
    {
        this._has_cdMunicipioJuncao= false;
    } //-- void deleteCdMunicipioJuncao() 

    /**
     * Method deleteCdTipoPesquisa
     * 
     */
    public void deleteCdTipoPesquisa()
    {
        this._has_cdTipoPesquisa= false;
    } //-- void deleteCdTipoPesquisa() 

    /**
     * Method deleteCdUfJuncao
     * 
     */
    public void deleteCdUfJuncao()
    {
        this._has_cdUfJuncao= false;
    } //-- void deleteCdUfJuncao() 

    /**
     * Method deleteNomeCliente
     * 
     */
    public void deleteNomeCliente()
    {
        this._has_nomeCliente= false;
    } //-- void deleteNomeCliente() 

    /**
     * Returns the value of field 'cdJuncao'.
     * 
     * @return int
     * @return the value of field 'cdJuncao'.
     */
    public int getCdJuncao()
    {
        return this._cdJuncao;
    } //-- int getCdJuncao() 

    /**
     * Returns the value of field 'cdMunicipioJuncao'.
     * 
     * @return long
     * @return the value of field 'cdMunicipioJuncao'.
     */
    public long getCdMunicipioJuncao()
    {
        return this._cdMunicipioJuncao;
    } //-- long getCdMunicipioJuncao() 

    /**
     * Returns the value of field 'cdTipoPesquisa'.
     * 
     * @return int
     * @return the value of field 'cdTipoPesquisa'.
     */
    public int getCdTipoPesquisa()
    {
        return this._cdTipoPesquisa;
    } //-- int getCdTipoPesquisa() 

    /**
     * Returns the value of field 'cdTipoRelatorio'.
     * 
     * @return String
     * @return the value of field 'cdTipoRelatorio'.
     */
    public java.lang.String getCdTipoRelatorio()
    {
        return this._cdTipoRelatorio;
    } //-- java.lang.String getCdTipoRelatorio() 

    /**
     * Returns the value of field 'cdUfJuncao'.
     * 
     * @return int
     * @return the value of field 'cdUfJuncao'.
     */
    public int getCdUfJuncao()
    {
        return this._cdUfJuncao;
    } //-- int getCdUfJuncao() 

    /**
     * Returns the value of field 'dataFim'.
     * 
     * @return String
     * @return the value of field 'dataFim'.
     */
    public java.lang.String getDataFim()
    {
        return this._dataFim;
    } //-- java.lang.String getDataFim() 

    /**
     * Returns the value of field 'dataInicio'.
     * 
     * @return String
     * @return the value of field 'dataInicio'.
     */
    public java.lang.String getDataInicio()
    {
        return this._dataInicio;
    } //-- java.lang.String getDataInicio() 

    /**
     * Returns the value of field 'nomeCliente'.
     * 
     * @return int
     * @return the value of field 'nomeCliente'.
     */
    public int getNomeCliente()
    {
        return this._nomeCliente;
    } //-- int getNomeCliente() 

    /**
     * Method hasCdJuncao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdJuncao()
    {
        return this._has_cdJuncao;
    } //-- boolean hasCdJuncao() 

    /**
     * Method hasCdMunicipioJuncao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdMunicipioJuncao()
    {
        return this._has_cdMunicipioJuncao;
    } //-- boolean hasCdMunicipioJuncao() 

    /**
     * Method hasCdTipoPesquisa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdTipoPesquisa()
    {
        return this._has_cdTipoPesquisa;
    } //-- boolean hasCdTipoPesquisa() 

    /**
     * Method hasCdUfJuncao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCdUfJuncao()
    {
        return this._has_cdUfJuncao;
    } //-- boolean hasCdUfJuncao() 

    /**
     * Method hasNomeCliente
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNomeCliente()
    {
        return this._has_nomeCliente;
    } //-- boolean hasNomeCliente() 

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
     * Sets the value of field 'cdJuncao'.
     * 
     * @param cdJuncao the value of field 'cdJuncao'.
     */
    public void setCdJuncao(int cdJuncao)
    {
        this._cdJuncao = cdJuncao;
        this._has_cdJuncao = true;
    } //-- void setCdJuncao(int) 

    /**
     * Sets the value of field 'cdMunicipioJuncao'.
     * 
     * @param cdMunicipioJuncao the value of field
     * 'cdMunicipioJuncao'.
     */
    public void setCdMunicipioJuncao(long cdMunicipioJuncao)
    {
        this._cdMunicipioJuncao = cdMunicipioJuncao;
        this._has_cdMunicipioJuncao = true;
    } //-- void setCdMunicipioJuncao(long) 

    /**
     * Sets the value of field 'cdTipoPesquisa'.
     * 
     * @param cdTipoPesquisa the value of field 'cdTipoPesquisa'.
     */
    public void setCdTipoPesquisa(int cdTipoPesquisa)
    {
        this._cdTipoPesquisa = cdTipoPesquisa;
        this._has_cdTipoPesquisa = true;
    } //-- void setCdTipoPesquisa(int) 

    /**
     * Sets the value of field 'cdTipoRelatorio'.
     * 
     * @param cdTipoRelatorio the value of field 'cdTipoRelatorio'.
     */
    public void setCdTipoRelatorio(java.lang.String cdTipoRelatorio)
    {
        this._cdTipoRelatorio = cdTipoRelatorio;
    } //-- void setCdTipoRelatorio(java.lang.String) 

    /**
     * Sets the value of field 'cdUfJuncao'.
     * 
     * @param cdUfJuncao the value of field 'cdUfJuncao'.
     */
    public void setCdUfJuncao(int cdUfJuncao)
    {
        this._cdUfJuncao = cdUfJuncao;
        this._has_cdUfJuncao = true;
    } //-- void setCdUfJuncao(int) 

    /**
     * Sets the value of field 'dataFim'.
     * 
     * @param dataFim the value of field 'dataFim'.
     */
    public void setDataFim(java.lang.String dataFim)
    {
        this._dataFim = dataFim;
    } //-- void setDataFim(java.lang.String) 

    /**
     * Sets the value of field 'dataInicio'.
     * 
     * @param dataInicio the value of field 'dataInicio'.
     */
    public void setDataInicio(java.lang.String dataInicio)
    {
        this._dataInicio = dataInicio;
    } //-- void setDataInicio(java.lang.String) 

    /**
     * Sets the value of field 'nomeCliente'.
     * 
     * @param nomeCliente the value of field 'nomeCliente'.
     */
    public void setNomeCliente(int nomeCliente)
    {
        this._nomeCliente = nomeCliente;
        this._has_nomeCliente = true;
    } //-- void setNomeCliente(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarTarifasCobradasRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultartarifascobradas.request.ConsultarTarifasCobradasRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultartarifascobradas.request.ConsultarTarifasCobradasRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultartarifascobradas.request.ConsultarTarifasCobradasRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultartarifascobradas.request.ConsultarTarifasCobradasRequest unmarshal(java.io.Reader) 

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
