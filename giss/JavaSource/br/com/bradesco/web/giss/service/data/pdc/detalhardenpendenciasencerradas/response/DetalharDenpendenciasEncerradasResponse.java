/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: DetalharDenpendenciasEncerradasResponse.java,v 1.1 2017/04/11 14:12:25 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.response;

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
 * Class DetalharDenpendenciasEncerradasResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:12:25 $
 */
public class DetalharDenpendenciasEncerradasResponse implements java.io.Serializable {


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
     * Field _codigoDependencia
     */
    private int _codigoDependencia = 0;

    /**
     * keeps track of state for field: _codigoDependencia
     */
    private boolean _has_codigoDependencia;

    /**
     * Field _nomeDependencia
     */
    private java.lang.String _nomeDependencia;

    /**
     * Field _dataAbertura
     */
    private java.lang.String _dataAbertura;

    /**
     * Field _dataEncerramento
     */
    private java.lang.String _dataEncerramento;

    /**
     * Field _codigoAgenciaIncorporadora
     */
    private int _codigoAgenciaIncorporadora = 0;

    /**
     * keeps track of state for field: _codigoAgenciaIncorporadora
     */
    private boolean _has_codigoAgenciaIncorporadora;

    /**
     * Field _nomeAgenciaIncorporadora
     */
    private java.lang.String _nomeAgenciaIncorporadora;

    /**
     * Field _enderecoAgenciaIncorporadora
     */
    private java.lang.String _enderecoAgenciaIncorporadora;

    /**
     * Field _numeroAgenciaIncorporadora
     */
    private int _numeroAgenciaIncorporadora = 0;

    /**
     * keeps track of state for field: _numeroAgenciaIncorporadora
     */
    private boolean _has_numeroAgenciaIncorporadora;

    /**
     * Field _cepAgenciaIncorporadora
     */
    private int _cepAgenciaIncorporadora = 0;

    /**
     * keeps track of state for field: _cepAgenciaIncorporadora
     */
    private boolean _has_cepAgenciaIncorporadora;

    /**
     * Field _siglaUFAgenciaIncorporadora
     */
    private java.lang.String _siglaUFAgenciaIncorporadora;

    /**
     * Field _paisAgenciaIncorporadora
     */
    private java.lang.String _paisAgenciaIncorporadora;

    /**
     * Field _codigoCadastroContribuinteMobiliario
     */
    private long _codigoCadastroContribuinteMobiliario = 0;

    /**
     * keeps track of state for field:
     * _codigoCadastroContribuinteMobiliario
     */
    private boolean _has_codigoCadastroContribuinteMobiliario;

    /**
     * Field _tipoDepartamento
     */
    private java.lang.String _tipoDepartamento;

    /**
     * Field _codigoDepartamentoAgenciaIncorporadora
     */
    private int _codigoDepartamentoAgenciaIncorporadora = 0;

    /**
     * keeps track of state for field:
     * _codigoDepartamentoAgenciaIncorporadora
     */
    private boolean _has_codigoDepartamentoAgenciaIncorporadora;

    /**
     * Field _descricaoDepartamentoAgenciaIncorporadora
     */
    private java.lang.String _descricaoDepartamentoAgenciaIncorporadora;

    /**
     * Field _inscricaoMunicipal
     */
    private java.lang.String _inscricaoMunicipal;

    /**
     * Field _indicadorTributavelNaoTributavel
     */
    private int _indicadorTributavelNaoTributavel = 0;

    /**
     * keeps track of state for field:
     * _indicadorTributavelNaoTributavel
     */
    private boolean _has_indicadorTributavelNaoTributavel;

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _nomeMunicipio
     */
    private java.lang.String _nomeMunicipio;

    /**
     * Field _estadoIncorporaDepartamento
     */
    private java.lang.String _estadoIncorporaDepartamento;

    /**
     * Field _codigoMunicipioIncorporaDepartamento
     */
    private java.lang.String _codigoMunicipioIncorporaDepartamento;

    /**
     * Field _descricaoMunicipioIncorporaDepartamento
     */
    private java.lang.String _descricaoMunicipioIncorporaDepartamento;

    /**
     * Field _cnpj
     */
    private long _cnpj = 0;

    /**
     * keeps track of state for field: _cnpj
     */
    private boolean _has_cnpj;


      //----------------/
     //- Constructors -/
    //----------------/

    public DetalharDenpendenciasEncerradasResponse() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.response.DetalharDenpendenciasEncerradasResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCepAgenciaIncorporadora
     * 
     */
    public void deleteCepAgenciaIncorporadora()
    {
        this._has_cepAgenciaIncorporadora= false;
    } //-- void deleteCepAgenciaIncorporadora() 

    /**
     * Method deleteCnpj
     * 
     */
    public void deleteCnpj()
    {
        this._has_cnpj= false;
    } //-- void deleteCnpj() 

    /**
     * Method deleteCodigoAgenciaIncorporadora
     * 
     */
    public void deleteCodigoAgenciaIncorporadora()
    {
        this._has_codigoAgenciaIncorporadora= false;
    } //-- void deleteCodigoAgenciaIncorporadora() 

    /**
     * Method deleteCodigoCadastroContribuinteMobiliario
     * 
     */
    public void deleteCodigoCadastroContribuinteMobiliario()
    {
        this._has_codigoCadastroContribuinteMobiliario= false;
    } //-- void deleteCodigoCadastroContribuinteMobiliario() 

    /**
     * Method deleteCodigoDepartamentoAgenciaIncorporadora
     * 
     */
    public void deleteCodigoDepartamentoAgenciaIncorporadora()
    {
        this._has_codigoDepartamentoAgenciaIncorporadora= false;
    } //-- void deleteCodigoDepartamentoAgenciaIncorporadora() 

    /**
     * Method deleteCodigoDependencia
     * 
     */
    public void deleteCodigoDependencia()
    {
        this._has_codigoDependencia= false;
    } //-- void deleteCodigoDependencia() 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteIndicadorTributavelNaoTributavel
     * 
     */
    public void deleteIndicadorTributavelNaoTributavel()
    {
        this._has_indicadorTributavelNaoTributavel= false;
    } //-- void deleteIndicadorTributavelNaoTributavel() 

    /**
     * Method deleteNumeroAgenciaIncorporadora
     * 
     */
    public void deleteNumeroAgenciaIncorporadora()
    {
        this._has_numeroAgenciaIncorporadora= false;
    } //-- void deleteNumeroAgenciaIncorporadora() 

    /**
     * Returns the value of field 'cepAgenciaIncorporadora'.
     * 
     * @return int
     * @return the value of field 'cepAgenciaIncorporadora'.
     */
    public int getCepAgenciaIncorporadora()
    {
        return this._cepAgenciaIncorporadora;
    } //-- int getCepAgenciaIncorporadora() 

    /**
     * Returns the value of field 'cnpj'.
     * 
     * @return long
     * @return the value of field 'cnpj'.
     */
    public long getCnpj()
    {
        return this._cnpj;
    } //-- long getCnpj() 

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
     * Returns the value of field 'codigoAgenciaIncorporadora'.
     * 
     * @return int
     * @return the value of field 'codigoAgenciaIncorporadora'.
     */
    public int getCodigoAgenciaIncorporadora()
    {
        return this._codigoAgenciaIncorporadora;
    } //-- int getCodigoAgenciaIncorporadora() 

    /**
     * Returns the value of field
     * 'codigoCadastroContribuinteMobiliario'.
     * 
     * @return long
     * @return the value of field
     * 'codigoCadastroContribuinteMobiliario'.
     */
    public long getCodigoCadastroContribuinteMobiliario()
    {
        return this._codigoCadastroContribuinteMobiliario;
    } //-- long getCodigoCadastroContribuinteMobiliario() 

    /**
     * Returns the value of field
     * 'codigoDepartamentoAgenciaIncorporadora'.
     * 
     * @return int
     * @return the value of field
     * 'codigoDepartamentoAgenciaIncorporadora'.
     */
    public int getCodigoDepartamentoAgenciaIncorporadora()
    {
        return this._codigoDepartamentoAgenciaIncorporadora;
    } //-- int getCodigoDepartamentoAgenciaIncorporadora() 

    /**
     * Returns the value of field 'codigoDependencia'.
     * 
     * @return int
     * @return the value of field 'codigoDependencia'.
     */
    public int getCodigoDependencia()
    {
        return this._codigoDependencia;
    } //-- int getCodigoDependencia() 

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
     * Returns the value of field
     * 'codigoMunicipioIncorporaDepartamento'.
     * 
     * @return String
     * @return the value of field
     * 'codigoMunicipioIncorporaDepartamento'.
     */
    public java.lang.String getCodigoMunicipioIncorporaDepartamento()
    {
        return this._codigoMunicipioIncorporaDepartamento;
    } //-- java.lang.String getCodigoMunicipioIncorporaDepartamento() 

    /**
     * Returns the value of field 'dataAbertura'.
     * 
     * @return String
     * @return the value of field 'dataAbertura'.
     */
    public java.lang.String getDataAbertura()
    {
        return this._dataAbertura;
    } //-- java.lang.String getDataAbertura() 

    /**
     * Returns the value of field 'dataEncerramento'.
     * 
     * @return String
     * @return the value of field 'dataEncerramento'.
     */
    public java.lang.String getDataEncerramento()
    {
        return this._dataEncerramento;
    } //-- java.lang.String getDataEncerramento() 

    /**
     * Returns the value of field
     * 'descricaoDepartamentoAgenciaIncorporadora'.
     * 
     * @return String
     * @return the value of field
     * 'descricaoDepartamentoAgenciaIncorporadora'.
     */
    public java.lang.String getDescricaoDepartamentoAgenciaIncorporadora()
    {
        return this._descricaoDepartamentoAgenciaIncorporadora;
    } //-- java.lang.String getDescricaoDepartamentoAgenciaIncorporadora() 

    /**
     * Returns the value of field
     * 'descricaoMunicipioIncorporaDepartamento'.
     * 
     * @return String
     * @return the value of field
     * 'descricaoMunicipioIncorporaDepartamento'.
     */
    public java.lang.String getDescricaoMunicipioIncorporaDepartamento()
    {
        return this._descricaoMunicipioIncorporaDepartamento;
    } //-- java.lang.String getDescricaoMunicipioIncorporaDepartamento() 

    /**
     * Returns the value of field 'enderecoAgenciaIncorporadora'.
     * 
     * @return String
     * @return the value of field 'enderecoAgenciaIncorporadora'.
     */
    public java.lang.String getEnderecoAgenciaIncorporadora()
    {
        return this._enderecoAgenciaIncorporadora;
    } //-- java.lang.String getEnderecoAgenciaIncorporadora() 

    /**
     * Returns the value of field 'estadoIncorporaDepartamento'.
     * 
     * @return String
     * @return the value of field 'estadoIncorporaDepartamento'.
     */
    public java.lang.String getEstadoIncorporaDepartamento()
    {
        return this._estadoIncorporaDepartamento;
    } //-- java.lang.String getEstadoIncorporaDepartamento() 

    /**
     * Returns the value of field
     * 'indicadorTributavelNaoTributavel'.
     * 
     * @return int
     * @return the value of field 'indicadorTributavelNaoTributavel'
     */
    public int getIndicadorTributavelNaoTributavel()
    {
        return this._indicadorTributavelNaoTributavel;
    } //-- int getIndicadorTributavelNaoTributavel() 

    /**
     * Returns the value of field 'inscricaoMunicipal'.
     * 
     * @return String
     * @return the value of field 'inscricaoMunicipal'.
     */
    public java.lang.String getInscricaoMunicipal()
    {
        return this._inscricaoMunicipal;
    } //-- java.lang.String getInscricaoMunicipal() 

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
     * Returns the value of field 'nomeAgenciaIncorporadora'.
     * 
     * @return String
     * @return the value of field 'nomeAgenciaIncorporadora'.
     */
    public java.lang.String getNomeAgenciaIncorporadora()
    {
        return this._nomeAgenciaIncorporadora;
    } //-- java.lang.String getNomeAgenciaIncorporadora() 

    /**
     * Returns the value of field 'nomeDependencia'.
     * 
     * @return String
     * @return the value of field 'nomeDependencia'.
     */
    public java.lang.String getNomeDependencia()
    {
        return this._nomeDependencia;
    } //-- java.lang.String getNomeDependencia() 

    /**
     * Returns the value of field 'nomeMunicipio'.
     * 
     * @return String
     * @return the value of field 'nomeMunicipio'.
     */
    public java.lang.String getNomeMunicipio()
    {
        return this._nomeMunicipio;
    } //-- java.lang.String getNomeMunicipio() 

    /**
     * Returns the value of field 'numeroAgenciaIncorporadora'.
     * 
     * @return int
     * @return the value of field 'numeroAgenciaIncorporadora'.
     */
    public int getNumeroAgenciaIncorporadora()
    {
        return this._numeroAgenciaIncorporadora;
    } //-- int getNumeroAgenciaIncorporadora() 

    /**
     * Returns the value of field 'paisAgenciaIncorporadora'.
     * 
     * @return String
     * @return the value of field 'paisAgenciaIncorporadora'.
     */
    public java.lang.String getPaisAgenciaIncorporadora()
    {
        return this._paisAgenciaIncorporadora;
    } //-- java.lang.String getPaisAgenciaIncorporadora() 

    /**
     * Returns the value of field 'siglaUFAgenciaIncorporadora'.
     * 
     * @return String
     * @return the value of field 'siglaUFAgenciaIncorporadora'.
     */
    public java.lang.String getSiglaUFAgenciaIncorporadora()
    {
        return this._siglaUFAgenciaIncorporadora;
    } //-- java.lang.String getSiglaUFAgenciaIncorporadora() 

    /**
     * Returns the value of field 'tipoDepartamento'.
     * 
     * @return String
     * @return the value of field 'tipoDepartamento'.
     */
    public java.lang.String getTipoDepartamento()
    {
        return this._tipoDepartamento;
    } //-- java.lang.String getTipoDepartamento() 

    /**
     * Method hasCepAgenciaIncorporadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCepAgenciaIncorporadora()
    {
        return this._has_cepAgenciaIncorporadora;
    } //-- boolean hasCepAgenciaIncorporadora() 

    /**
     * Method hasCnpj
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCnpj()
    {
        return this._has_cnpj;
    } //-- boolean hasCnpj() 

    /**
     * Method hasCodigoAgenciaIncorporadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoAgenciaIncorporadora()
    {
        return this._has_codigoAgenciaIncorporadora;
    } //-- boolean hasCodigoAgenciaIncorporadora() 

    /**
     * Method hasCodigoCadastroContribuinteMobiliario
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoCadastroContribuinteMobiliario()
    {
        return this._has_codigoCadastroContribuinteMobiliario;
    } //-- boolean hasCodigoCadastroContribuinteMobiliario() 

    /**
     * Method hasCodigoDepartamentoAgenciaIncorporadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoDepartamentoAgenciaIncorporadora()
    {
        return this._has_codigoDepartamentoAgenciaIncorporadora;
    } //-- boolean hasCodigoDepartamentoAgenciaIncorporadora() 

    /**
     * Method hasCodigoDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoDependencia()
    {
        return this._has_codigoDependencia;
    } //-- boolean hasCodigoDependencia() 

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
     * Method hasIndicadorTributavelNaoTributavel
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasIndicadorTributavelNaoTributavel()
    {
        return this._has_indicadorTributavelNaoTributavel;
    } //-- boolean hasIndicadorTributavelNaoTributavel() 

    /**
     * Method hasNumeroAgenciaIncorporadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroAgenciaIncorporadora()
    {
        return this._has_numeroAgenciaIncorporadora;
    } //-- boolean hasNumeroAgenciaIncorporadora() 

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
     * Sets the value of field 'cepAgenciaIncorporadora'.
     * 
     * @param cepAgenciaIncorporadora the value of field
     * 'cepAgenciaIncorporadora'.
     */
    public void setCepAgenciaIncorporadora(int cepAgenciaIncorporadora)
    {
        this._cepAgenciaIncorporadora = cepAgenciaIncorporadora;
        this._has_cepAgenciaIncorporadora = true;
    } //-- void setCepAgenciaIncorporadora(int) 

    /**
     * Sets the value of field 'cnpj'.
     * 
     * @param cnpj the value of field 'cnpj'.
     */
    public void setCnpj(long cnpj)
    {
        this._cnpj = cnpj;
        this._has_cnpj = true;
    } //-- void setCnpj(long) 

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
     * Sets the value of field 'codigoAgenciaIncorporadora'.
     * 
     * @param codigoAgenciaIncorporadora the value of field
     * 'codigoAgenciaIncorporadora'.
     */
    public void setCodigoAgenciaIncorporadora(int codigoAgenciaIncorporadora)
    {
        this._codigoAgenciaIncorporadora = codigoAgenciaIncorporadora;
        this._has_codigoAgenciaIncorporadora = true;
    } //-- void setCodigoAgenciaIncorporadora(int) 

    /**
     * Sets the value of field
     * 'codigoCadastroContribuinteMobiliario'.
     * 
     * @param codigoCadastroContribuinteMobiliario the value of
     * field 'codigoCadastroContribuinteMobiliario'.
     */
    public void setCodigoCadastroContribuinteMobiliario(long codigoCadastroContribuinteMobiliario)
    {
        this._codigoCadastroContribuinteMobiliario = codigoCadastroContribuinteMobiliario;
        this._has_codigoCadastroContribuinteMobiliario = true;
    } //-- void setCodigoCadastroContribuinteMobiliario(long) 

    /**
     * Sets the value of field
     * 'codigoDepartamentoAgenciaIncorporadora'.
     * 
     * @param codigoDepartamentoAgenciaIncorporadora the value of
     * field 'codigoDepartamentoAgenciaIncorporadora'.
     */
    public void setCodigoDepartamentoAgenciaIncorporadora(int codigoDepartamentoAgenciaIncorporadora)
    {
        this._codigoDepartamentoAgenciaIncorporadora = codigoDepartamentoAgenciaIncorporadora;
        this._has_codigoDepartamentoAgenciaIncorporadora = true;
    } //-- void setCodigoDepartamentoAgenciaIncorporadora(int) 

    /**
     * Sets the value of field 'codigoDependencia'.
     * 
     * @param codigoDependencia the value of field
     * 'codigoDependencia'.
     */
    public void setCodigoDependencia(int codigoDependencia)
    {
        this._codigoDependencia = codigoDependencia;
        this._has_codigoDependencia = true;
    } //-- void setCodigoDependencia(int) 

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
     * Sets the value of field
     * 'codigoMunicipioIncorporaDepartamento'.
     * 
     * @param codigoMunicipioIncorporaDepartamento the value of
     * field 'codigoMunicipioIncorporaDepartamento'.
     */
    public void setCodigoMunicipioIncorporaDepartamento(java.lang.String codigoMunicipioIncorporaDepartamento)
    {
        this._codigoMunicipioIncorporaDepartamento = codigoMunicipioIncorporaDepartamento;
    } //-- void setCodigoMunicipioIncorporaDepartamento(java.lang.String) 

    /**
     * Sets the value of field 'dataAbertura'.
     * 
     * @param dataAbertura the value of field 'dataAbertura'.
     */
    public void setDataAbertura(java.lang.String dataAbertura)
    {
        this._dataAbertura = dataAbertura;
    } //-- void setDataAbertura(java.lang.String) 

    /**
     * Sets the value of field 'dataEncerramento'.
     * 
     * @param dataEncerramento the value of field 'dataEncerramento'
     */
    public void setDataEncerramento(java.lang.String dataEncerramento)
    {
        this._dataEncerramento = dataEncerramento;
    } //-- void setDataEncerramento(java.lang.String) 

    /**
     * Sets the value of field
     * 'descricaoDepartamentoAgenciaIncorporadora'.
     * 
     * @param descricaoDepartamentoAgenciaIncorporadora the value
     * of field 'descricaoDepartamentoAgenciaIncorporadora'.
     */
    public void setDescricaoDepartamentoAgenciaIncorporadora(java.lang.String descricaoDepartamentoAgenciaIncorporadora)
    {
        this._descricaoDepartamentoAgenciaIncorporadora = descricaoDepartamentoAgenciaIncorporadora;
    } //-- void setDescricaoDepartamentoAgenciaIncorporadora(java.lang.String) 

    /**
     * Sets the value of field
     * 'descricaoMunicipioIncorporaDepartamento'.
     * 
     * @param descricaoMunicipioIncorporaDepartamento the value of
     * field 'descricaoMunicipioIncorporaDepartamento'.
     */
    public void setDescricaoMunicipioIncorporaDepartamento(java.lang.String descricaoMunicipioIncorporaDepartamento)
    {
        this._descricaoMunicipioIncorporaDepartamento = descricaoMunicipioIncorporaDepartamento;
    } //-- void setDescricaoMunicipioIncorporaDepartamento(java.lang.String) 

    /**
     * Sets the value of field 'enderecoAgenciaIncorporadora'.
     * 
     * @param enderecoAgenciaIncorporadora the value of field
     * 'enderecoAgenciaIncorporadora'.
     */
    public void setEnderecoAgenciaIncorporadora(java.lang.String enderecoAgenciaIncorporadora)
    {
        this._enderecoAgenciaIncorporadora = enderecoAgenciaIncorporadora;
    } //-- void setEnderecoAgenciaIncorporadora(java.lang.String) 

    /**
     * Sets the value of field 'estadoIncorporaDepartamento'.
     * 
     * @param estadoIncorporaDepartamento the value of field
     * 'estadoIncorporaDepartamento'.
     */
    public void setEstadoIncorporaDepartamento(java.lang.String estadoIncorporaDepartamento)
    {
        this._estadoIncorporaDepartamento = estadoIncorporaDepartamento;
    } //-- void setEstadoIncorporaDepartamento(java.lang.String) 

    /**
     * Sets the value of field 'indicadorTributavelNaoTributavel'.
     * 
     * @param indicadorTributavelNaoTributavel the value of field
     * 'indicadorTributavelNaoTributavel'.
     */
    public void setIndicadorTributavelNaoTributavel(int indicadorTributavelNaoTributavel)
    {
        this._indicadorTributavelNaoTributavel = indicadorTributavelNaoTributavel;
        this._has_indicadorTributavelNaoTributavel = true;
    } //-- void setIndicadorTributavelNaoTributavel(int) 

    /**
     * Sets the value of field 'inscricaoMunicipal'.
     * 
     * @param inscricaoMunicipal the value of field
     * 'inscricaoMunicipal'.
     */
    public void setInscricaoMunicipal(java.lang.String inscricaoMunicipal)
    {
        this._inscricaoMunicipal = inscricaoMunicipal;
    } //-- void setInscricaoMunicipal(java.lang.String) 

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
     * Sets the value of field 'nomeAgenciaIncorporadora'.
     * 
     * @param nomeAgenciaIncorporadora the value of field
     * 'nomeAgenciaIncorporadora'.
     */
    public void setNomeAgenciaIncorporadora(java.lang.String nomeAgenciaIncorporadora)
    {
        this._nomeAgenciaIncorporadora = nomeAgenciaIncorporadora;
    } //-- void setNomeAgenciaIncorporadora(java.lang.String) 

    /**
     * Sets the value of field 'nomeDependencia'.
     * 
     * @param nomeDependencia the value of field 'nomeDependencia'.
     */
    public void setNomeDependencia(java.lang.String nomeDependencia)
    {
        this._nomeDependencia = nomeDependencia;
    } //-- void setNomeDependencia(java.lang.String) 

    /**
     * Sets the value of field 'nomeMunicipio'.
     * 
     * @param nomeMunicipio the value of field 'nomeMunicipio'.
     */
    public void setNomeMunicipio(java.lang.String nomeMunicipio)
    {
        this._nomeMunicipio = nomeMunicipio;
    } //-- void setNomeMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'numeroAgenciaIncorporadora'.
     * 
     * @param numeroAgenciaIncorporadora the value of field
     * 'numeroAgenciaIncorporadora'.
     */
    public void setNumeroAgenciaIncorporadora(int numeroAgenciaIncorporadora)
    {
        this._numeroAgenciaIncorporadora = numeroAgenciaIncorporadora;
        this._has_numeroAgenciaIncorporadora = true;
    } //-- void setNumeroAgenciaIncorporadora(int) 

    /**
     * Sets the value of field 'paisAgenciaIncorporadora'.
     * 
     * @param paisAgenciaIncorporadora the value of field
     * 'paisAgenciaIncorporadora'.
     */
    public void setPaisAgenciaIncorporadora(java.lang.String paisAgenciaIncorporadora)
    {
        this._paisAgenciaIncorporadora = paisAgenciaIncorporadora;
    } //-- void setPaisAgenciaIncorporadora(java.lang.String) 

    /**
     * Sets the value of field 'siglaUFAgenciaIncorporadora'.
     * 
     * @param siglaUFAgenciaIncorporadora the value of field
     * 'siglaUFAgenciaIncorporadora'.
     */
    public void setSiglaUFAgenciaIncorporadora(java.lang.String siglaUFAgenciaIncorporadora)
    {
        this._siglaUFAgenciaIncorporadora = siglaUFAgenciaIncorporadora;
    } //-- void setSiglaUFAgenciaIncorporadora(java.lang.String) 

    /**
     * Sets the value of field 'tipoDepartamento'.
     * 
     * @param tipoDepartamento the value of field 'tipoDepartamento'
     */
    public void setTipoDepartamento(java.lang.String tipoDepartamento)
    {
        this._tipoDepartamento = tipoDepartamento;
    } //-- void setTipoDepartamento(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return DetalharDenpendenciasEncerradasResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.response.DetalharDenpendenciasEncerradasResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.response.DetalharDenpendenciasEncerradasResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.response.DetalharDenpendenciasEncerradasResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalhardenpendenciasencerradas.response.DetalharDenpendenciasEncerradasResponse unmarshal(java.io.Reader) 

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
