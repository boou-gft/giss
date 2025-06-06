/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.response;

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
 * Class DetalharHistoricoEmpresaResponse.
 * 
 * @version $Revision$ $Date$
 */
public class DetalharHistoricoEmpresaResponse implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMensagem
     */
    private java.lang.String _codMensagem;

    /**
     * Field _mensagem
     */
    private java.lang.String _mensagem;

    /**
     * Field _codEmpresaAtualizado
     */
    private int _codEmpresaAtualizado = 0;

    /**
     * keeps track of state for field: _codEmpresaAtualizado
     */
    private boolean _has_codEmpresaAtualizado;

    /**
     * Field _cnpjAtualizado
     */
    private long _cnpjAtualizado = 0;

    /**
     * keeps track of state for field: _cnpjAtualizado
     */
    private boolean _has_cnpjAtualizado;

    /**
     * Field _cnpjFilialAtualizado
     */
    private int _cnpjFilialAtualizado = 0;

    /**
     * keeps track of state for field: _cnpjFilialAtualizado
     */
    private boolean _has_cnpjFilialAtualizado;

    /**
     * Field _cnpjControleAtualizado
     */
    private int _cnpjControleAtualizado = 0;

    /**
     * keeps track of state for field: _cnpjControleAtualizado
     */
    private boolean _has_cnpjControleAtualizado;

    /**
     * Field _nomeEmpresaAtualizado
     */
    private java.lang.String _nomeEmpresaAtualizado;

    /**
     * Field _codUsuarioAtualizado
     */
    private java.lang.String _codUsuarioAtualizado;

    /**
     * Field _dataHoraAtualizado
     */
    private java.lang.String _dataHoraAtualizado;

    /**
     * Field _codIdentAtualizado
     */
    private int _codIdentAtualizado = 0;

    /**
     * keeps track of state for field: _codIdentAtualizado
     */
    private boolean _has_codIdentAtualizado;

    /**
     * Field _descResponsavelAtualizado
     */
    private java.lang.String _descResponsavelAtualizado;

    /**
     * Field _ntFoniAtualizado
     */
    private long _ntFoniAtualizado = 0;

    /**
     * keeps track of state for field: _ntFoniAtualizado
     */
    private boolean _has_ntFoniAtualizado;

    /**
     * Field _emailAtualizado
     */
    private java.lang.String _emailAtualizado;

    /**
     * Field _logradouroAtualizado
     */
    private java.lang.String _logradouroAtualizado;

    /**
     * Field _numeroLogradouroAtualizado
     */
    private java.lang.String _numeroLogradouroAtualizado;

    /**
     * Field _complementoAtualizado
     */
    private java.lang.String _complementoAtualizado;

    /**
     * Field _bairroAtualizado
     */
    private java.lang.String _bairroAtualizado;

    /**
     * Field _cepAtualizado
     */
    private int _cepAtualizado = 0;

    /**
     * keeps track of state for field: _cepAtualizado
     */
    private boolean _has_cepAtualizado;

    /**
     * Field _cepComplAtualizado
     */
    private int _cepComplAtualizado = 0;

    /**
     * keeps track of state for field: _cepComplAtualizado
     */
    private boolean _has_cepComplAtualizado;

    /**
     * Field _codMunicipioAtualizado
     */
    private long _codMunicipioAtualizado = 0;

    /**
     * keeps track of state for field: _codMunicipioAtualizado
     */
    private boolean _has_codMunicipioAtualizado;

    /**
     * Field _codUfAtualizado
     */
    private int _codUfAtualizado = 0;

    /**
     * keeps track of state for field: _codUfAtualizado
     */
    private boolean _has_codUfAtualizado;

    /**
     * Field _codEmpresaAnterior
     */
    private int _codEmpresaAnterior = 0;

    /**
     * keeps track of state for field: _codEmpresaAnterior
     */
    private boolean _has_codEmpresaAnterior;

    /**
     * Field _cnpjAnterior
     */
    private long _cnpjAnterior = 0;

    /**
     * keeps track of state for field: _cnpjAnterior
     */
    private boolean _has_cnpjAnterior;

    /**
     * Field _cnpjFilialAnterior
     */
    private int _cnpjFilialAnterior = 0;

    /**
     * keeps track of state for field: _cnpjFilialAnterior
     */
    private boolean _has_cnpjFilialAnterior;

    /**
     * Field _cnpjControleAnterior
     */
    private int _cnpjControleAnterior = 0;

    /**
     * keeps track of state for field: _cnpjControleAnterior
     */
    private boolean _has_cnpjControleAnterior;

    /**
     * Field _nomeEmpresaAnterior
     */
    private java.lang.String _nomeEmpresaAnterior;

    /**
     * Field _codUsuarioAnterior
     */
    private java.lang.String _codUsuarioAnterior;

    /**
     * Field _dataHoraManutencaoAterior
     */
    private java.lang.String _dataHoraManutencaoAterior;

    /**
     * Field _codIdentAterior
     */
    private int _codIdentAterior = 0;

    /**
     * keeps track of state for field: _codIdentAterior
     */
    private boolean _has_codIdentAterior;

    /**
     * Field _descResponsavelAnterior
     */
    private java.lang.String _descResponsavelAnterior;

    /**
     * Field _ntFoniAnterior
     */
    private long _ntFoniAnterior = 0;

    /**
     * keeps track of state for field: _ntFoniAnterior
     */
    private boolean _has_ntFoniAnterior;

    /**
     * Field _emailAnterior
     */
    private java.lang.String _emailAnterior;

    /**
     * Field _logradouroAnterior
     */
    private java.lang.String _logradouroAnterior;

    /**
     * Field _numeroLogradouroAnterior
     */
    private java.lang.String _numeroLogradouroAnterior;

    /**
     * Field _complementoAnterior
     */
    private java.lang.String _complementoAnterior;

    /**
     * Field _bairroAnterior
     */
    private java.lang.String _bairroAnterior;

    /**
     * Field _cepAnterior
     */
    private int _cepAnterior = 0;

    /**
     * keeps track of state for field: _cepAnterior
     */
    private boolean _has_cepAnterior;

    /**
     * Field _cepComplementoAnterior
     */
    private int _cepComplementoAnterior = 0;

    /**
     * keeps track of state for field: _cepComplementoAnterior
     */
    private boolean _has_cepComplementoAnterior;

    /**
     * Field _codMunicipioAnterior
     */
    private long _codMunicipioAnterior = 0;

    /**
     * keeps track of state for field: _codMunicipioAnterior
     */
    private boolean _has_codMunicipioAnterior;

    /**
     * Field _codUfAnterior
     */
    private int _codUfAnterior = 0;

    /**
     * keeps track of state for field: _codUfAnterior
     */
    private boolean _has_codUfAnterior;


      //----------------/
     //- Constructors -/
    //----------------/

    public DetalharHistoricoEmpresaResponse() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.response.DetalharHistoricoEmpresaResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCepAnterior
     * 
     */
    public void deleteCepAnterior()
    {
        this._has_cepAnterior= false;
    } //-- void deleteCepAnterior() 

    /**
     * Method deleteCepAtualizado
     * 
     */
    public void deleteCepAtualizado()
    {
        this._has_cepAtualizado= false;
    } //-- void deleteCepAtualizado() 

    /**
     * Method deleteCepComplAtualizado
     * 
     */
    public void deleteCepComplAtualizado()
    {
        this._has_cepComplAtualizado= false;
    } //-- void deleteCepComplAtualizado() 

    /**
     * Method deleteCepComplementoAnterior
     * 
     */
    public void deleteCepComplementoAnterior()
    {
        this._has_cepComplementoAnterior= false;
    } //-- void deleteCepComplementoAnterior() 

    /**
     * Method deleteCnpjAnterior
     * 
     */
    public void deleteCnpjAnterior()
    {
        this._has_cnpjAnterior= false;
    } //-- void deleteCnpjAnterior() 

    /**
     * Method deleteCnpjAtualizado
     * 
     */
    public void deleteCnpjAtualizado()
    {
        this._has_cnpjAtualizado= false;
    } //-- void deleteCnpjAtualizado() 

    /**
     * Method deleteCnpjControleAnterior
     * 
     */
    public void deleteCnpjControleAnterior()
    {
        this._has_cnpjControleAnterior= false;
    } //-- void deleteCnpjControleAnterior() 

    /**
     * Method deleteCnpjControleAtualizado
     * 
     */
    public void deleteCnpjControleAtualizado()
    {
        this._has_cnpjControleAtualizado= false;
    } //-- void deleteCnpjControleAtualizado() 

    /**
     * Method deleteCnpjFilialAnterior
     * 
     */
    public void deleteCnpjFilialAnterior()
    {
        this._has_cnpjFilialAnterior= false;
    } //-- void deleteCnpjFilialAnterior() 

    /**
     * Method deleteCnpjFilialAtualizado
     * 
     */
    public void deleteCnpjFilialAtualizado()
    {
        this._has_cnpjFilialAtualizado= false;
    } //-- void deleteCnpjFilialAtualizado() 

    /**
     * Method deleteCodEmpresaAnterior
     * 
     */
    public void deleteCodEmpresaAnterior()
    {
        this._has_codEmpresaAnterior= false;
    } //-- void deleteCodEmpresaAnterior() 

    /**
     * Method deleteCodEmpresaAtualizado
     * 
     */
    public void deleteCodEmpresaAtualizado()
    {
        this._has_codEmpresaAtualizado= false;
    } //-- void deleteCodEmpresaAtualizado() 

    /**
     * Method deleteCodIdentAterior
     * 
     */
    public void deleteCodIdentAterior()
    {
        this._has_codIdentAterior= false;
    } //-- void deleteCodIdentAterior() 

    /**
     * Method deleteCodIdentAtualizado
     * 
     */
    public void deleteCodIdentAtualizado()
    {
        this._has_codIdentAtualizado= false;
    } //-- void deleteCodIdentAtualizado() 

    /**
     * Method deleteCodMunicipioAnterior
     * 
     */
    public void deleteCodMunicipioAnterior()
    {
        this._has_codMunicipioAnterior= false;
    } //-- void deleteCodMunicipioAnterior() 

    /**
     * Method deleteCodMunicipioAtualizado
     * 
     */
    public void deleteCodMunicipioAtualizado()
    {
        this._has_codMunicipioAtualizado= false;
    } //-- void deleteCodMunicipioAtualizado() 

    /**
     * Method deleteCodUfAnterior
     * 
     */
    public void deleteCodUfAnterior()
    {
        this._has_codUfAnterior= false;
    } //-- void deleteCodUfAnterior() 

    /**
     * Method deleteCodUfAtualizado
     * 
     */
    public void deleteCodUfAtualizado()
    {
        this._has_codUfAtualizado= false;
    } //-- void deleteCodUfAtualizado() 

    /**
     * Method deleteNtFoniAnterior
     * 
     */
    public void deleteNtFoniAnterior()
    {
        this._has_ntFoniAnterior= false;
    } //-- void deleteNtFoniAnterior() 

    /**
     * Method deleteNtFoniAtualizado
     * 
     */
    public void deleteNtFoniAtualizado()
    {
        this._has_ntFoniAtualizado= false;
    } //-- void deleteNtFoniAtualizado() 

    /**
     * Returns the value of field 'bairroAnterior'.
     * 
     * @return String
     * @return the value of field 'bairroAnterior'.
     */
    public java.lang.String getBairroAnterior()
    {
        return this._bairroAnterior;
    } //-- java.lang.String getBairroAnterior() 

    /**
     * Returns the value of field 'bairroAtualizado'.
     * 
     * @return String
     * @return the value of field 'bairroAtualizado'.
     */
    public java.lang.String getBairroAtualizado()
    {
        return this._bairroAtualizado;
    } //-- java.lang.String getBairroAtualizado() 

    /**
     * Returns the value of field 'cepAnterior'.
     * 
     * @return int
     * @return the value of field 'cepAnterior'.
     */
    public int getCepAnterior()
    {
        return this._cepAnterior;
    } //-- int getCepAnterior() 

    /**
     * Returns the value of field 'cepAtualizado'.
     * 
     * @return int
     * @return the value of field 'cepAtualizado'.
     */
    public int getCepAtualizado()
    {
        return this._cepAtualizado;
    } //-- int getCepAtualizado() 

    /**
     * Returns the value of field 'cepComplAtualizado'.
     * 
     * @return int
     * @return the value of field 'cepComplAtualizado'.
     */
    public int getCepComplAtualizado()
    {
        return this._cepComplAtualizado;
    } //-- int getCepComplAtualizado() 

    /**
     * Returns the value of field 'cepComplementoAnterior'.
     * 
     * @return int
     * @return the value of field 'cepComplementoAnterior'.
     */
    public int getCepComplementoAnterior()
    {
        return this._cepComplementoAnterior;
    } //-- int getCepComplementoAnterior() 

    /**
     * Returns the value of field 'cnpjAnterior'.
     * 
     * @return long
     * @return the value of field 'cnpjAnterior'.
     */
    public long getCnpjAnterior()
    {
        return this._cnpjAnterior;
    } //-- long getCnpjAnterior() 

    /**
     * Returns the value of field 'cnpjAtualizado'.
     * 
     * @return long
     * @return the value of field 'cnpjAtualizado'.
     */
    public long getCnpjAtualizado()
    {
        return this._cnpjAtualizado;
    } //-- long getCnpjAtualizado() 

    /**
     * Returns the value of field 'cnpjControleAnterior'.
     * 
     * @return int
     * @return the value of field 'cnpjControleAnterior'.
     */
    public int getCnpjControleAnterior()
    {
        return this._cnpjControleAnterior;
    } //-- int getCnpjControleAnterior() 

    /**
     * Returns the value of field 'cnpjControleAtualizado'.
     * 
     * @return int
     * @return the value of field 'cnpjControleAtualizado'.
     */
    public int getCnpjControleAtualizado()
    {
        return this._cnpjControleAtualizado;
    } //-- int getCnpjControleAtualizado() 

    /**
     * Returns the value of field 'cnpjFilialAnterior'.
     * 
     * @return int
     * @return the value of field 'cnpjFilialAnterior'.
     */
    public int getCnpjFilialAnterior()
    {
        return this._cnpjFilialAnterior;
    } //-- int getCnpjFilialAnterior() 

    /**
     * Returns the value of field 'cnpjFilialAtualizado'.
     * 
     * @return int
     * @return the value of field 'cnpjFilialAtualizado'.
     */
    public int getCnpjFilialAtualizado()
    {
        return this._cnpjFilialAtualizado;
    } //-- int getCnpjFilialAtualizado() 

    /**
     * Returns the value of field 'codEmpresaAnterior'.
     * 
     * @return int
     * @return the value of field 'codEmpresaAnterior'.
     */
    public int getCodEmpresaAnterior()
    {
        return this._codEmpresaAnterior;
    } //-- int getCodEmpresaAnterior() 

    /**
     * Returns the value of field 'codEmpresaAtualizado'.
     * 
     * @return int
     * @return the value of field 'codEmpresaAtualizado'.
     */
    public int getCodEmpresaAtualizado()
    {
        return this._codEmpresaAtualizado;
    } //-- int getCodEmpresaAtualizado() 

    /**
     * Returns the value of field 'codIdentAterior'.
     * 
     * @return int
     * @return the value of field 'codIdentAterior'.
     */
    public int getCodIdentAterior()
    {
        return this._codIdentAterior;
    } //-- int getCodIdentAterior() 

    /**
     * Returns the value of field 'codIdentAtualizado'.
     * 
     * @return int
     * @return the value of field 'codIdentAtualizado'.
     */
    public int getCodIdentAtualizado()
    {
        return this._codIdentAtualizado;
    } //-- int getCodIdentAtualizado() 

    /**
     * Returns the value of field 'codMensagem'.
     * 
     * @return String
     * @return the value of field 'codMensagem'.
     */
    public java.lang.String getCodMensagem()
    {
        return this._codMensagem;
    } //-- java.lang.String getCodMensagem() 

    /**
     * Returns the value of field 'codMunicipioAnterior'.
     * 
     * @return long
     * @return the value of field 'codMunicipioAnterior'.
     */
    public long getCodMunicipioAnterior()
    {
        return this._codMunicipioAnterior;
    } //-- long getCodMunicipioAnterior() 

    /**
     * Returns the value of field 'codMunicipioAtualizado'.
     * 
     * @return long
     * @return the value of field 'codMunicipioAtualizado'.
     */
    public long getCodMunicipioAtualizado()
    {
        return this._codMunicipioAtualizado;
    } //-- long getCodMunicipioAtualizado() 

    /**
     * Returns the value of field 'codUfAnterior'.
     * 
     * @return int
     * @return the value of field 'codUfAnterior'.
     */
    public int getCodUfAnterior()
    {
        return this._codUfAnterior;
    } //-- int getCodUfAnterior() 

    /**
     * Returns the value of field 'codUfAtualizado'.
     * 
     * @return int
     * @return the value of field 'codUfAtualizado'.
     */
    public int getCodUfAtualizado()
    {
        return this._codUfAtualizado;
    } //-- int getCodUfAtualizado() 

    /**
     * Returns the value of field 'codUsuarioAnterior'.
     * 
     * @return String
     * @return the value of field 'codUsuarioAnterior'.
     */
    public java.lang.String getCodUsuarioAnterior()
    {
        return this._codUsuarioAnterior;
    } //-- java.lang.String getCodUsuarioAnterior() 

    /**
     * Returns the value of field 'codUsuarioAtualizado'.
     * 
     * @return String
     * @return the value of field 'codUsuarioAtualizado'.
     */
    public java.lang.String getCodUsuarioAtualizado()
    {
        return this._codUsuarioAtualizado;
    } //-- java.lang.String getCodUsuarioAtualizado() 

    /**
     * Returns the value of field 'complementoAnterior'.
     * 
     * @return String
     * @return the value of field 'complementoAnterior'.
     */
    public java.lang.String getComplementoAnterior()
    {
        return this._complementoAnterior;
    } //-- java.lang.String getComplementoAnterior() 

    /**
     * Returns the value of field 'complementoAtualizado'.
     * 
     * @return String
     * @return the value of field 'complementoAtualizado'.
     */
    public java.lang.String getComplementoAtualizado()
    {
        return this._complementoAtualizado;
    } //-- java.lang.String getComplementoAtualizado() 

    /**
     * Returns the value of field 'dataHoraAtualizado'.
     * 
     * @return String
     * @return the value of field 'dataHoraAtualizado'.
     */
    public java.lang.String getDataHoraAtualizado()
    {
        return this._dataHoraAtualizado;
    } //-- java.lang.String getDataHoraAtualizado() 

    /**
     * Returns the value of field 'dataHoraManutencaoAterior'.
     * 
     * @return String
     * @return the value of field 'dataHoraManutencaoAterior'.
     */
    public java.lang.String getDataHoraManutencaoAterior()
    {
        return this._dataHoraManutencaoAterior;
    } //-- java.lang.String getDataHoraManutencaoAterior() 

    /**
     * Returns the value of field 'descResponsavelAnterior'.
     * 
     * @return String
     * @return the value of field 'descResponsavelAnterior'.
     */
    public java.lang.String getDescResponsavelAnterior()
    {
        return this._descResponsavelAnterior;
    } //-- java.lang.String getDescResponsavelAnterior() 

    /**
     * Returns the value of field 'descResponsavelAtualizado'.
     * 
     * @return String
     * @return the value of field 'descResponsavelAtualizado'.
     */
    public java.lang.String getDescResponsavelAtualizado()
    {
        return this._descResponsavelAtualizado;
    } //-- java.lang.String getDescResponsavelAtualizado() 

    /**
     * Returns the value of field 'emailAnterior'.
     * 
     * @return String
     * @return the value of field 'emailAnterior'.
     */
    public java.lang.String getEmailAnterior()
    {
        return this._emailAnterior;
    } //-- java.lang.String getEmailAnterior() 

    /**
     * Returns the value of field 'emailAtualizado'.
     * 
     * @return String
     * @return the value of field 'emailAtualizado'.
     */
    public java.lang.String getEmailAtualizado()
    {
        return this._emailAtualizado;
    } //-- java.lang.String getEmailAtualizado() 

    /**
     * Returns the value of field 'logradouroAnterior'.
     * 
     * @return String
     * @return the value of field 'logradouroAnterior'.
     */
    public java.lang.String getLogradouroAnterior()
    {
        return this._logradouroAnterior;
    } //-- java.lang.String getLogradouroAnterior() 

    /**
     * Returns the value of field 'logradouroAtualizado'.
     * 
     * @return String
     * @return the value of field 'logradouroAtualizado'.
     */
    public java.lang.String getLogradouroAtualizado()
    {
        return this._logradouroAtualizado;
    } //-- java.lang.String getLogradouroAtualizado() 

    /**
     * Returns the value of field 'mensagem'.
     * 
     * @return String
     * @return the value of field 'mensagem'.
     */
    public java.lang.String getMensagem()
    {
        return this._mensagem;
    } //-- java.lang.String getMensagem() 

    /**
     * Returns the value of field 'nomeEmpresaAnterior'.
     * 
     * @return String
     * @return the value of field 'nomeEmpresaAnterior'.
     */
    public java.lang.String getNomeEmpresaAnterior()
    {
        return this._nomeEmpresaAnterior;
    } //-- java.lang.String getNomeEmpresaAnterior() 

    /**
     * Returns the value of field 'nomeEmpresaAtualizado'.
     * 
     * @return String
     * @return the value of field 'nomeEmpresaAtualizado'.
     */
    public java.lang.String getNomeEmpresaAtualizado()
    {
        return this._nomeEmpresaAtualizado;
    } //-- java.lang.String getNomeEmpresaAtualizado() 

    /**
     * Returns the value of field 'ntFoniAnterior'.
     * 
     * @return long
     * @return the value of field 'ntFoniAnterior'.
     */
    public long getNtFoniAnterior()
    {
        return this._ntFoniAnterior;
    } //-- long getNtFoniAnterior() 

    /**
     * Returns the value of field 'ntFoniAtualizado'.
     * 
     * @return long
     * @return the value of field 'ntFoniAtualizado'.
     */
    public long getNtFoniAtualizado()
    {
        return this._ntFoniAtualizado;
    } //-- long getNtFoniAtualizado() 

    /**
     * Returns the value of field 'numeroLogradouroAnterior'.
     * 
     * @return String
     * @return the value of field 'numeroLogradouroAnterior'.
     */
    public java.lang.String getNumeroLogradouroAnterior()
    {
        return this._numeroLogradouroAnterior;
    } //-- java.lang.String getNumeroLogradouroAnterior() 

    /**
     * Returns the value of field 'numeroLogradouroAtualizado'.
     * 
     * @return String
     * @return the value of field 'numeroLogradouroAtualizado'.
     */
    public java.lang.String getNumeroLogradouroAtualizado()
    {
        return this._numeroLogradouroAtualizado;
    } //-- java.lang.String getNumeroLogradouroAtualizado() 

    /**
     * Method hasCepAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCepAnterior()
    {
        return this._has_cepAnterior;
    } //-- boolean hasCepAnterior() 

    /**
     * Method hasCepAtualizado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCepAtualizado()
    {
        return this._has_cepAtualizado;
    } //-- boolean hasCepAtualizado() 

    /**
     * Method hasCepComplAtualizado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCepComplAtualizado()
    {
        return this._has_cepComplAtualizado;
    } //-- boolean hasCepComplAtualizado() 

    /**
     * Method hasCepComplementoAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCepComplementoAnterior()
    {
        return this._has_cepComplementoAnterior;
    } //-- boolean hasCepComplementoAnterior() 

    /**
     * Method hasCnpjAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjAnterior()
    {
        return this._has_cnpjAnterior;
    } //-- boolean hasCnpjAnterior() 

    /**
     * Method hasCnpjAtualizado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjAtualizado()
    {
        return this._has_cnpjAtualizado;
    } //-- boolean hasCnpjAtualizado() 

    /**
     * Method hasCnpjControleAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjControleAnterior()
    {
        return this._has_cnpjControleAnterior;
    } //-- boolean hasCnpjControleAnterior() 

    /**
     * Method hasCnpjControleAtualizado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjControleAtualizado()
    {
        return this._has_cnpjControleAtualizado;
    } //-- boolean hasCnpjControleAtualizado() 

    /**
     * Method hasCnpjFilialAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjFilialAnterior()
    {
        return this._has_cnpjFilialAnterior;
    } //-- boolean hasCnpjFilialAnterior() 

    /**
     * Method hasCnpjFilialAtualizado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpjFilialAtualizado()
    {
        return this._has_cnpjFilialAtualizado;
    } //-- boolean hasCnpjFilialAtualizado() 

    /**
     * Method hasCodEmpresaAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresaAnterior()
    {
        return this._has_codEmpresaAnterior;
    } //-- boolean hasCodEmpresaAnterior() 

    /**
     * Method hasCodEmpresaAtualizado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresaAtualizado()
    {
        return this._has_codEmpresaAtualizado;
    } //-- boolean hasCodEmpresaAtualizado() 

    /**
     * Method hasCodIdentAterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodIdentAterior()
    {
        return this._has_codIdentAterior;
    } //-- boolean hasCodIdentAterior() 

    /**
     * Method hasCodIdentAtualizado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodIdentAtualizado()
    {
        return this._has_codIdentAtualizado;
    } //-- boolean hasCodIdentAtualizado() 

    /**
     * Method hasCodMunicipioAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipioAnterior()
    {
        return this._has_codMunicipioAnterior;
    } //-- boolean hasCodMunicipioAnterior() 

    /**
     * Method hasCodMunicipioAtualizado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipioAtualizado()
    {
        return this._has_codMunicipioAtualizado;
    } //-- boolean hasCodMunicipioAtualizado() 

    /**
     * Method hasCodUfAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodUfAnterior()
    {
        return this._has_codUfAnterior;
    } //-- boolean hasCodUfAnterior() 

    /**
     * Method hasCodUfAtualizado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodUfAtualizado()
    {
        return this._has_codUfAtualizado;
    } //-- boolean hasCodUfAtualizado() 

    /**
     * Method hasNtFoniAnterior
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNtFoniAnterior()
    {
        return this._has_ntFoniAnterior;
    } //-- boolean hasNtFoniAnterior() 

    /**
     * Method hasNtFoniAtualizado
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNtFoniAtualizado()
    {
        return this._has_ntFoniAtualizado;
    } //-- boolean hasNtFoniAtualizado() 

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
     * Sets the value of field 'bairroAnterior'.
     * 
     * @param bairroAnterior the value of field 'bairroAnterior'.
     */
    public void setBairroAnterior(java.lang.String bairroAnterior)
    {
        this._bairroAnterior = bairroAnterior;
    } //-- void setBairroAnterior(java.lang.String) 

    /**
     * Sets the value of field 'bairroAtualizado'.
     * 
     * @param bairroAtualizado the value of field 'bairroAtualizado'
     */
    public void setBairroAtualizado(java.lang.String bairroAtualizado)
    {
        this._bairroAtualizado = bairroAtualizado;
    } //-- void setBairroAtualizado(java.lang.String) 

    /**
     * Sets the value of field 'cepAnterior'.
     * 
     * @param cepAnterior the value of field 'cepAnterior'.
     */
    public void setCepAnterior(int cepAnterior)
    {
        this._cepAnterior = cepAnterior;
        this._has_cepAnterior = true;
    } //-- void setCepAnterior(int) 

    /**
     * Sets the value of field 'cepAtualizado'.
     * 
     * @param cepAtualizado the value of field 'cepAtualizado'.
     */
    public void setCepAtualizado(int cepAtualizado)
    {
        this._cepAtualizado = cepAtualizado;
        this._has_cepAtualizado = true;
    } //-- void setCepAtualizado(int) 

    /**
     * Sets the value of field 'cepComplAtualizado'.
     * 
     * @param cepComplAtualizado the value of field
     * 'cepComplAtualizado'.
     */
    public void setCepComplAtualizado(int cepComplAtualizado)
    {
        this._cepComplAtualizado = cepComplAtualizado;
        this._has_cepComplAtualizado = true;
    } //-- void setCepComplAtualizado(int) 

    /**
     * Sets the value of field 'cepComplementoAnterior'.
     * 
     * @param cepComplementoAnterior the value of field
     * 'cepComplementoAnterior'.
     */
    public void setCepComplementoAnterior(int cepComplementoAnterior)
    {
        this._cepComplementoAnterior = cepComplementoAnterior;
        this._has_cepComplementoAnterior = true;
    } //-- void setCepComplementoAnterior(int) 

    /**
     * Sets the value of field 'cnpjAnterior'.
     * 
     * @param cnpjAnterior the value of field 'cnpjAnterior'.
     */
    public void setCnpjAnterior(long cnpjAnterior)
    {
        this._cnpjAnterior = cnpjAnterior;
        this._has_cnpjAnterior = true;
    } //-- void setCnpjAnterior(long) 

    /**
     * Sets the value of field 'cnpjAtualizado'.
     * 
     * @param cnpjAtualizado the value of field 'cnpjAtualizado'.
     */
    public void setCnpjAtualizado(long cnpjAtualizado)
    {
        this._cnpjAtualizado = cnpjAtualizado;
        this._has_cnpjAtualizado = true;
    } //-- void setCnpjAtualizado(long) 

    /**
     * Sets the value of field 'cnpjControleAnterior'.
     * 
     * @param cnpjControleAnterior the value of field
     * 'cnpjControleAnterior'.
     */
    public void setCnpjControleAnterior(int cnpjControleAnterior)
    {
        this._cnpjControleAnterior = cnpjControleAnterior;
        this._has_cnpjControleAnterior = true;
    } //-- void setCnpjControleAnterior(int) 

    /**
     * Sets the value of field 'cnpjControleAtualizado'.
     * 
     * @param cnpjControleAtualizado the value of field
     * 'cnpjControleAtualizado'.
     */
    public void setCnpjControleAtualizado(int cnpjControleAtualizado)
    {
        this._cnpjControleAtualizado = cnpjControleAtualizado;
        this._has_cnpjControleAtualizado = true;
    } //-- void setCnpjControleAtualizado(int) 

    /**
     * Sets the value of field 'cnpjFilialAnterior'.
     * 
     * @param cnpjFilialAnterior the value of field
     * 'cnpjFilialAnterior'.
     */
    public void setCnpjFilialAnterior(int cnpjFilialAnterior)
    {
        this._cnpjFilialAnterior = cnpjFilialAnterior;
        this._has_cnpjFilialAnterior = true;
    } //-- void setCnpjFilialAnterior(int) 

    /**
     * Sets the value of field 'cnpjFilialAtualizado'.
     * 
     * @param cnpjFilialAtualizado the value of field
     * 'cnpjFilialAtualizado'.
     */
    public void setCnpjFilialAtualizado(int cnpjFilialAtualizado)
    {
        this._cnpjFilialAtualizado = cnpjFilialAtualizado;
        this._has_cnpjFilialAtualizado = true;
    } //-- void setCnpjFilialAtualizado(int) 

    /**
     * Sets the value of field 'codEmpresaAnterior'.
     * 
     * @param codEmpresaAnterior the value of field
     * 'codEmpresaAnterior'.
     */
    public void setCodEmpresaAnterior(int codEmpresaAnterior)
    {
        this._codEmpresaAnterior = codEmpresaAnterior;
        this._has_codEmpresaAnterior = true;
    } //-- void setCodEmpresaAnterior(int) 

    /**
     * Sets the value of field 'codEmpresaAtualizado'.
     * 
     * @param codEmpresaAtualizado the value of field
     * 'codEmpresaAtualizado'.
     */
    public void setCodEmpresaAtualizado(int codEmpresaAtualizado)
    {
        this._codEmpresaAtualizado = codEmpresaAtualizado;
        this._has_codEmpresaAtualizado = true;
    } //-- void setCodEmpresaAtualizado(int) 

    /**
     * Sets the value of field 'codIdentAterior'.
     * 
     * @param codIdentAterior the value of field 'codIdentAterior'.
     */
    public void setCodIdentAterior(int codIdentAterior)
    {
        this._codIdentAterior = codIdentAterior;
        this._has_codIdentAterior = true;
    } //-- void setCodIdentAterior(int) 

    /**
     * Sets the value of field 'codIdentAtualizado'.
     * 
     * @param codIdentAtualizado the value of field
     * 'codIdentAtualizado'.
     */
    public void setCodIdentAtualizado(int codIdentAtualizado)
    {
        this._codIdentAtualizado = codIdentAtualizado;
        this._has_codIdentAtualizado = true;
    } //-- void setCodIdentAtualizado(int) 

    /**
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Sets the value of field 'codMunicipioAnterior'.
     * 
     * @param codMunicipioAnterior the value of field
     * 'codMunicipioAnterior'.
     */
    public void setCodMunicipioAnterior(long codMunicipioAnterior)
    {
        this._codMunicipioAnterior = codMunicipioAnterior;
        this._has_codMunicipioAnterior = true;
    } //-- void setCodMunicipioAnterior(long) 

    /**
     * Sets the value of field 'codMunicipioAtualizado'.
     * 
     * @param codMunicipioAtualizado the value of field
     * 'codMunicipioAtualizado'.
     */
    public void setCodMunicipioAtualizado(long codMunicipioAtualizado)
    {
        this._codMunicipioAtualizado = codMunicipioAtualizado;
        this._has_codMunicipioAtualizado = true;
    } //-- void setCodMunicipioAtualizado(long) 

    /**
     * Sets the value of field 'codUfAnterior'.
     * 
     * @param codUfAnterior the value of field 'codUfAnterior'.
     */
    public void setCodUfAnterior(int codUfAnterior)
    {
        this._codUfAnterior = codUfAnterior;
        this._has_codUfAnterior = true;
    } //-- void setCodUfAnterior(int) 

    /**
     * Sets the value of field 'codUfAtualizado'.
     * 
     * @param codUfAtualizado the value of field 'codUfAtualizado'.
     */
    public void setCodUfAtualizado(int codUfAtualizado)
    {
        this._codUfAtualizado = codUfAtualizado;
        this._has_codUfAtualizado = true;
    } //-- void setCodUfAtualizado(int) 

    /**
     * Sets the value of field 'codUsuarioAnterior'.
     * 
     * @param codUsuarioAnterior the value of field
     * 'codUsuarioAnterior'.
     */
    public void setCodUsuarioAnterior(java.lang.String codUsuarioAnterior)
    {
        this._codUsuarioAnterior = codUsuarioAnterior;
    } //-- void setCodUsuarioAnterior(java.lang.String) 

    /**
     * Sets the value of field 'codUsuarioAtualizado'.
     * 
     * @param codUsuarioAtualizado the value of field
     * 'codUsuarioAtualizado'.
     */
    public void setCodUsuarioAtualizado(java.lang.String codUsuarioAtualizado)
    {
        this._codUsuarioAtualizado = codUsuarioAtualizado;
    } //-- void setCodUsuarioAtualizado(java.lang.String) 

    /**
     * Sets the value of field 'complementoAnterior'.
     * 
     * @param complementoAnterior the value of field
     * 'complementoAnterior'.
     */
    public void setComplementoAnterior(java.lang.String complementoAnterior)
    {
        this._complementoAnterior = complementoAnterior;
    } //-- void setComplementoAnterior(java.lang.String) 

    /**
     * Sets the value of field 'complementoAtualizado'.
     * 
     * @param complementoAtualizado the value of field
     * 'complementoAtualizado'.
     */
    public void setComplementoAtualizado(java.lang.String complementoAtualizado)
    {
        this._complementoAtualizado = complementoAtualizado;
    } //-- void setComplementoAtualizado(java.lang.String) 

    /**
     * Sets the value of field 'dataHoraAtualizado'.
     * 
     * @param dataHoraAtualizado the value of field
     * 'dataHoraAtualizado'.
     */
    public void setDataHoraAtualizado(java.lang.String dataHoraAtualizado)
    {
        this._dataHoraAtualizado = dataHoraAtualizado;
    } //-- void setDataHoraAtualizado(java.lang.String) 

    /**
     * Sets the value of field 'dataHoraManutencaoAterior'.
     * 
     * @param dataHoraManutencaoAterior the value of field
     * 'dataHoraManutencaoAterior'.
     */
    public void setDataHoraManutencaoAterior(java.lang.String dataHoraManutencaoAterior)
    {
        this._dataHoraManutencaoAterior = dataHoraManutencaoAterior;
    } //-- void setDataHoraManutencaoAterior(java.lang.String) 

    /**
     * Sets the value of field 'descResponsavelAnterior'.
     * 
     * @param descResponsavelAnterior the value of field
     * 'descResponsavelAnterior'.
     */
    public void setDescResponsavelAnterior(java.lang.String descResponsavelAnterior)
    {
        this._descResponsavelAnterior = descResponsavelAnterior;
    } //-- void setDescResponsavelAnterior(java.lang.String) 

    /**
     * Sets the value of field 'descResponsavelAtualizado'.
     * 
     * @param descResponsavelAtualizado the value of field
     * 'descResponsavelAtualizado'.
     */
    public void setDescResponsavelAtualizado(java.lang.String descResponsavelAtualizado)
    {
        this._descResponsavelAtualizado = descResponsavelAtualizado;
    } //-- void setDescResponsavelAtualizado(java.lang.String) 

    /**
     * Sets the value of field 'emailAnterior'.
     * 
     * @param emailAnterior the value of field 'emailAnterior'.
     */
    public void setEmailAnterior(java.lang.String emailAnterior)
    {
        this._emailAnterior = emailAnterior;
    } //-- void setEmailAnterior(java.lang.String) 

    /**
     * Sets the value of field 'emailAtualizado'.
     * 
     * @param emailAtualizado the value of field 'emailAtualizado'.
     */
    public void setEmailAtualizado(java.lang.String emailAtualizado)
    {
        this._emailAtualizado = emailAtualizado;
    } //-- void setEmailAtualizado(java.lang.String) 

    /**
     * Sets the value of field 'logradouroAnterior'.
     * 
     * @param logradouroAnterior the value of field
     * 'logradouroAnterior'.
     */
    public void setLogradouroAnterior(java.lang.String logradouroAnterior)
    {
        this._logradouroAnterior = logradouroAnterior;
    } //-- void setLogradouroAnterior(java.lang.String) 

    /**
     * Sets the value of field 'logradouroAtualizado'.
     * 
     * @param logradouroAtualizado the value of field
     * 'logradouroAtualizado'.
     */
    public void setLogradouroAtualizado(java.lang.String logradouroAtualizado)
    {
        this._logradouroAtualizado = logradouroAtualizado;
    } //-- void setLogradouroAtualizado(java.lang.String) 

    /**
     * Sets the value of field 'mensagem'.
     * 
     * @param mensagem the value of field 'mensagem'.
     */
    public void setMensagem(java.lang.String mensagem)
    {
        this._mensagem = mensagem;
    } //-- void setMensagem(java.lang.String) 

    /**
     * Sets the value of field 'nomeEmpresaAnterior'.
     * 
     * @param nomeEmpresaAnterior the value of field
     * 'nomeEmpresaAnterior'.
     */
    public void setNomeEmpresaAnterior(java.lang.String nomeEmpresaAnterior)
    {
        this._nomeEmpresaAnterior = nomeEmpresaAnterior;
    } //-- void setNomeEmpresaAnterior(java.lang.String) 

    /**
     * Sets the value of field 'nomeEmpresaAtualizado'.
     * 
     * @param nomeEmpresaAtualizado the value of field
     * 'nomeEmpresaAtualizado'.
     */
    public void setNomeEmpresaAtualizado(java.lang.String nomeEmpresaAtualizado)
    {
        this._nomeEmpresaAtualizado = nomeEmpresaAtualizado;
    } //-- void setNomeEmpresaAtualizado(java.lang.String) 

    /**
     * Sets the value of field 'ntFoniAnterior'.
     * 
     * @param ntFoniAnterior the value of field 'ntFoniAnterior'.
     */
    public void setNtFoniAnterior(long ntFoniAnterior)
    {
        this._ntFoniAnterior = ntFoniAnterior;
        this._has_ntFoniAnterior = true;
    } //-- void setNtFoniAnterior(long) 

    /**
     * Sets the value of field 'ntFoniAtualizado'.
     * 
     * @param ntFoniAtualizado the value of field 'ntFoniAtualizado'
     */
    public void setNtFoniAtualizado(long ntFoniAtualizado)
    {
        this._ntFoniAtualizado = ntFoniAtualizado;
        this._has_ntFoniAtualizado = true;
    } //-- void setNtFoniAtualizado(long) 

    /**
     * Sets the value of field 'numeroLogradouroAnterior'.
     * 
     * @param numeroLogradouroAnterior the value of field
     * 'numeroLogradouroAnterior'.
     */
    public void setNumeroLogradouroAnterior(java.lang.String numeroLogradouroAnterior)
    {
        this._numeroLogradouroAnterior = numeroLogradouroAnterior;
    } //-- void setNumeroLogradouroAnterior(java.lang.String) 

    /**
     * Sets the value of field 'numeroLogradouroAtualizado'.
     * 
     * @param numeroLogradouroAtualizado the value of field
     * 'numeroLogradouroAtualizado'.
     */
    public void setNumeroLogradouroAtualizado(java.lang.String numeroLogradouroAtualizado)
    {
        this._numeroLogradouroAtualizado = numeroLogradouroAtualizado;
    } //-- void setNumeroLogradouroAtualizado(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return DetalharHistoricoEmpresaResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.response.DetalharHistoricoEmpresaResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.response.DetalharHistoricoEmpresaResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.response.DetalharHistoricoEmpresaResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoempresa.response.DetalharHistoricoEmpresaResponse unmarshal(java.io.Reader) 

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
