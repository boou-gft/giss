/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultarMunicipioResponse.java,v 1.2 2017/06/05 15:06:09 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.response;

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
 * Class ConsultarMunicipioResponse.
 * 
 * @version $Revision: 1.2 $ $Date: 2017/06/05 15:06:09 $
 */
public class ConsultarMunicipioResponse implements java.io.Serializable {


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
     * Field _percentualAliquotaMunicipio
     */
    private java.math.BigDecimal _percentualAliquotaMunicipio = new java.math.BigDecimal("0");

    /**
     * Field _diaVencimentoTribut
     */
    private int _diaVencimentoTribut = 0;

    /**
     * keeps track of state for field: _diaVencimentoTribut
     */
    private boolean _has_diaVencimentoTribut;

    /**
     * Field _indNecessidadePagtoDiaUtil
     */
    private java.lang.String _indNecessidadePagtoDiaUtil;

    /**
     * Field _codigoFormaPagamento
     */
    private int _codigoFormaPagamento = 0;

    /**
     * keeps track of state for field: _codigoFormaPagamento
     */
    private boolean _has_codigoFormaPagamento;

    /**
     * Field _percentualBaseAliquota
     */
    private java.math.BigDecimal _percentualBaseAliquota = new java.math.BigDecimal("0");

    /**
     * Field _percentualAliquotaPadrao
     */
    private java.math.BigDecimal _percentualAliquotaPadrao = new java.math.BigDecimal("0");

    /**
     * Field _codigoTipoIncidencia
     */
    private int _codigoTipoIncidencia = 0;

    /**
     * keeps track of state for field: _codigoTipoIncidencia
     */
    private boolean _has_codigoTipoIncidencia;

    /**
     * Field _nomeTipoIncidencia
     */
    private java.lang.String _nomeTipoIncidencia;

    /**
     * Field _codigoDependenciaCentralizadora
     */
    private int _codigoDependenciaCentralizadora = 0;

    /**
     * keeps track of state for field:
     * _codigoDependenciaCentralizadora
     */
    private boolean _has_codigoDependenciaCentralizadora;

    /**
     * Field _descricaoDependenciaCentralizadora
     */
    private java.lang.String _descricaoDependenciaCentralizadora;

    /**
     * Field _indiceVigencia
     */
    private java.lang.String _indiceVigencia;

    /**
     * Field _codigoMunicipioCentralizadora
     */
    private long _codigoMunicipioCentralizadora = 0;

    /**
     * keeps track of state for field: _codigoMunicipioCentralizador
     */
    private boolean _has_codigoMunicipioCentralizadora;

    /**
     * Field _descricaoMunicipio
     */
    private java.lang.String _descricaoMunicipio;

    /**
     * Field _codigoPessoaJuridicaCentralizadora
     */
    private long _codigoPessoaJuridicaCentralizadora = 0;

    /**
     * keeps track of state for field:
     * _codigoPessoaJuridicaCentralizadora
     */
    private boolean _has_codigoPessoaJuridicaCentralizadora;

    /**
     * Field _numeroSequencialCentralizadora
     */
    private int _numeroSequencialCentralizadora = 0;

    /**
     * keeps track of state for field:
     * _numeroSequencialCentralizadora
     */
    private boolean _has_numeroSequencialCentralizadora;

    /**
     * Field _uFCentralizadora
     */
    private java.lang.String _uFCentralizadora;

    /**
     * Field _descricaoUF
     */
    private java.lang.String _descricaoUF;

    /**
     * Field _codigoLegislacaoVigente
     */
    private int _codigoLegislacaoVigente = 0;

    /**
     * keeps track of state for field: _codigoLegislacaoVigente
     */
    private boolean _has_codigoLegislacaoVigente;

    /**
     * Field _descLegislacaoVigente
     */
    private java.lang.String _descLegislacaoVigente;

    /**
     * Field _itemComplementarLei
     */
    private java.lang.String _itemComplementarLei;

    /**
     * Field _tipoPesquisa
     */
    private int _tipoPesquisa = 0;

    /**
     * keeps track of state for field: _tipoPesquisa
     */
    private boolean _has_tipoPesquisa;


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultarMunicipioResponse() 
     {
        super();
        setPercentualAliquotaMunicipio(new java.math.BigDecimal("0"));
        setPercentualBaseAliquota(new java.math.BigDecimal("0"));
        setPercentualAliquotaPadrao(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.response.ConsultarMunicipioResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoDependenciaCentralizadora
     * 
     */
    public void deleteCodigoDependenciaCentralizadora()
    {
        this._has_codigoDependenciaCentralizadora= false;
    } //-- void deleteCodigoDependenciaCentralizadora() 

    /**
     * Method deleteCodigoFormaPagamento
     * 
     */
    public void deleteCodigoFormaPagamento()
    {
        this._has_codigoFormaPagamento= false;
    } //-- void deleteCodigoFormaPagamento() 

    /**
     * Method deleteCodigoLegislacaoVigente
     * 
     */
    public void deleteCodigoLegislacaoVigente()
    {
        this._has_codigoLegislacaoVigente= false;
    } //-- void deleteCodigoLegislacaoVigente() 

    /**
     * Method deleteCodigoMunicipioCentralizadora
     * 
     */
    public void deleteCodigoMunicipioCentralizadora()
    {
        this._has_codigoMunicipioCentralizadora= false;
    } //-- void deleteCodigoMunicipioCentralizadora() 

    /**
     * Method deleteCodigoPessoaJuridicaCentralizadora
     * 
     */
    public void deleteCodigoPessoaJuridicaCentralizadora()
    {
        this._has_codigoPessoaJuridicaCentralizadora= false;
    } //-- void deleteCodigoPessoaJuridicaCentralizadora() 

    /**
     * Method deleteCodigoTipoIncidencia
     * 
     */
    public void deleteCodigoTipoIncidencia()
    {
        this._has_codigoTipoIncidencia= false;
    } //-- void deleteCodigoTipoIncidencia() 

    /**
     * Method deleteDiaVencimentoTribut
     * 
     */
    public void deleteDiaVencimentoTribut()
    {
        this._has_diaVencimentoTribut= false;
    } //-- void deleteDiaVencimentoTribut() 

    /**
     * Method deleteNumeroSequencialCentralizadora
     * 
     */
    public void deleteNumeroSequencialCentralizadora()
    {
        this._has_numeroSequencialCentralizadora= false;
    } //-- void deleteNumeroSequencialCentralizadora() 

    /**
     * Method deleteTipoPesquisa
     * 
     */
    public void deleteTipoPesquisa()
    {
        this._has_tipoPesquisa= false;
    } //-- void deleteTipoPesquisa() 

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
     * Returns the value of field
     * 'codigoDependenciaCentralizadora'.
     * 
     * @return int
     * @return the value of field 'codigoDependenciaCentralizadora'.
     */
    public int getCodigoDependenciaCentralizadora()
    {
        return this._codigoDependenciaCentralizadora;
    } //-- int getCodigoDependenciaCentralizadora() 

    /**
     * Returns the value of field 'codigoFormaPagamento'.
     * 
     * @return int
     * @return the value of field 'codigoFormaPagamento'.
     */
    public int getCodigoFormaPagamento()
    {
        return this._codigoFormaPagamento;
    } //-- int getCodigoFormaPagamento() 

    /**
     * Returns the value of field 'codigoLegislacaoVigente'.
     * 
     * @return int
     * @return the value of field 'codigoLegislacaoVigente'.
     */
    public int getCodigoLegislacaoVigente()
    {
        return this._codigoLegislacaoVigente;
    } //-- int getCodigoLegislacaoVigente() 

    /**
     * Returns the value of field 'codigoMunicipioCentralizadora'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipioCentralizadora'.
     */
    public long getCodigoMunicipioCentralizadora()
    {
        return this._codigoMunicipioCentralizadora;
    } //-- long getCodigoMunicipioCentralizadora() 

    /**
     * Returns the value of field
     * 'codigoPessoaJuridicaCentralizadora'.
     * 
     * @return long
     * @return the value of field
     * 'codigoPessoaJuridicaCentralizadora'.
     */
    public long getCodigoPessoaJuridicaCentralizadora()
    {
        return this._codigoPessoaJuridicaCentralizadora;
    } //-- long getCodigoPessoaJuridicaCentralizadora() 

    /**
     * Returns the value of field 'codigoTipoIncidencia'.
     * 
     * @return int
     * @return the value of field 'codigoTipoIncidencia'.
     */
    public int getCodigoTipoIncidencia()
    {
        return this._codigoTipoIncidencia;
    } //-- int getCodigoTipoIncidencia() 

    /**
     * Returns the value of field 'descLegislacaoVigente'.
     * 
     * @return String
     * @return the value of field 'descLegislacaoVigente'.
     */
    public java.lang.String getDescLegislacaoVigente()
    {
        return this._descLegislacaoVigente;
    } //-- java.lang.String getDescLegislacaoVigente() 

    /**
     * Returns the value of field
     * 'descricaoDependenciaCentralizadora'.
     * 
     * @return String
     * @return the value of field
     * 'descricaoDependenciaCentralizadora'.
     */
    public java.lang.String getDescricaoDependenciaCentralizadora()
    {
        return this._descricaoDependenciaCentralizadora;
    } //-- java.lang.String getDescricaoDependenciaCentralizadora() 

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
     * Returns the value of field 'descricaoUF'.
     * 
     * @return String
     * @return the value of field 'descricaoUF'.
     */
    public java.lang.String getDescricaoUF()
    {
        return this._descricaoUF;
    } //-- java.lang.String getDescricaoUF() 

    /**
     * Returns the value of field 'diaVencimentoTribut'.
     * 
     * @return int
     * @return the value of field 'diaVencimentoTribut'.
     */
    public int getDiaVencimentoTribut()
    {
        return this._diaVencimentoTribut;
    } //-- int getDiaVencimentoTribut() 

    /**
     * Returns the value of field 'indNecessidadePagtoDiaUtil'.
     * 
     * @return String
     * @return the value of field 'indNecessidadePagtoDiaUtil'.
     */
    public java.lang.String getIndNecessidadePagtoDiaUtil()
    {
        return this._indNecessidadePagtoDiaUtil;
    } //-- java.lang.String getIndNecessidadePagtoDiaUtil() 

    /**
     * Returns the value of field 'indiceVigencia'.
     * 
     * @return String
     * @return the value of field 'indiceVigencia'.
     */
    public java.lang.String getIndiceVigencia()
    {
        return this._indiceVigencia;
    } //-- java.lang.String getIndiceVigencia() 

    /**
     * Returns the value of field 'itemComplementarLei'.
     * 
     * @return String
     * @return the value of field 'itemComplementarLei'.
     */
    public java.lang.String getItemComplementarLei()
    {
        return this._itemComplementarLei;
    } //-- java.lang.String getItemComplementarLei() 

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
     * Returns the value of field 'nomeTipoIncidencia'.
     * 
     * @return String
     * @return the value of field 'nomeTipoIncidencia'.
     */
    public java.lang.String getNomeTipoIncidencia()
    {
        return this._nomeTipoIncidencia;
    } //-- java.lang.String getNomeTipoIncidencia() 

    /**
     * Returns the value of field 'numeroSequencialCentralizadora'.
     * 
     * @return int
     * @return the value of field 'numeroSequencialCentralizadora'.
     */
    public int getNumeroSequencialCentralizadora()
    {
        return this._numeroSequencialCentralizadora;
    } //-- int getNumeroSequencialCentralizadora() 

    /**
     * Returns the value of field 'percentualAliquotaMunicipio'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentualAliquotaMunicipio'.
     */
    public java.math.BigDecimal getPercentualAliquotaMunicipio()
    {
        return this._percentualAliquotaMunicipio;
    } //-- java.math.BigDecimal getPercentualAliquotaMunicipio() 

    /**
     * Returns the value of field 'percentualAliquotaPadrao'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentualAliquotaPadrao'.
     */
    public java.math.BigDecimal getPercentualAliquotaPadrao()
    {
        return this._percentualAliquotaPadrao;
    } //-- java.math.BigDecimal getPercentualAliquotaPadrao() 

    /**
     * Returns the value of field 'percentualBaseAliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentualBaseAliquota'.
     */
    public java.math.BigDecimal getPercentualBaseAliquota()
    {
        return this._percentualBaseAliquota;
    } //-- java.math.BigDecimal getPercentualBaseAliquota() 

    /**
     * Returns the value of field 'tipoPesquisa'.
     * 
     * @return int
     * @return the value of field 'tipoPesquisa'.
     */
    public int getTipoPesquisa()
    {
        return this._tipoPesquisa;
    } //-- int getTipoPesquisa() 

    /**
     * Returns the value of field 'uFCentralizadora'.
     * 
     * @return String
     * @return the value of field 'uFCentralizadora'.
     */
    public java.lang.String getUFCentralizadora()
    {
        return this._uFCentralizadora;
    } //-- java.lang.String getUFCentralizadora() 

    /**
     * Method hasCodigoDependenciaCentralizadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoDependenciaCentralizadora()
    {
        return this._has_codigoDependenciaCentralizadora;
    } //-- boolean hasCodigoDependenciaCentralizadora() 

    /**
     * Method hasCodigoFormaPagamento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoFormaPagamento()
    {
        return this._has_codigoFormaPagamento;
    } //-- boolean hasCodigoFormaPagamento() 

    /**
     * Method hasCodigoLegislacaoVigente
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoLegislacaoVigente()
    {
        return this._has_codigoLegislacaoVigente;
    } //-- boolean hasCodigoLegislacaoVigente() 

    /**
     * Method hasCodigoMunicipioCentralizadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipioCentralizadora()
    {
        return this._has_codigoMunicipioCentralizadora;
    } //-- boolean hasCodigoMunicipioCentralizadora() 

    /**
     * Method hasCodigoPessoaJuridicaCentralizadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaJuridicaCentralizadora()
    {
        return this._has_codigoPessoaJuridicaCentralizadora;
    } //-- boolean hasCodigoPessoaJuridicaCentralizadora() 

    /**
     * Method hasCodigoTipoIncidencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTipoIncidencia()
    {
        return this._has_codigoTipoIncidencia;
    } //-- boolean hasCodigoTipoIncidencia() 

    /**
     * Method hasDiaVencimentoTribut
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDiaVencimentoTribut()
    {
        return this._has_diaVencimentoTribut;
    } //-- boolean hasDiaVencimentoTribut() 

    /**
     * Method hasNumeroSequencialCentralizadora
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequencialCentralizadora()
    {
        return this._has_numeroSequencialCentralizadora;
    } //-- boolean hasNumeroSequencialCentralizadora() 

    /**
     * Method hasTipoPesquisa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTipoPesquisa()
    {
        return this._has_tipoPesquisa;
    } //-- boolean hasTipoPesquisa() 

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
     * Sets the value of field 'codMensagem'.
     * 
     * @param codMensagem the value of field 'codMensagem'.
     */
    public void setCodMensagem(java.lang.String codMensagem)
    {
        this._codMensagem = codMensagem;
    } //-- void setCodMensagem(java.lang.String) 

    /**
     * Sets the value of field 'codigoDependenciaCentralizadora'.
     * 
     * @param codigoDependenciaCentralizadora the value of field
     * 'codigoDependenciaCentralizadora'.
     */
    public void setCodigoDependenciaCentralizadora(int codigoDependenciaCentralizadora)
    {
        this._codigoDependenciaCentralizadora = codigoDependenciaCentralizadora;
        this._has_codigoDependenciaCentralizadora = true;
    } //-- void setCodigoDependenciaCentralizadora(int) 

    /**
     * Sets the value of field 'codigoFormaPagamento'.
     * 
     * @param codigoFormaPagamento the value of field
     * 'codigoFormaPagamento'.
     */
    public void setCodigoFormaPagamento(int codigoFormaPagamento)
    {
        this._codigoFormaPagamento = codigoFormaPagamento;
        this._has_codigoFormaPagamento = true;
    } //-- void setCodigoFormaPagamento(int) 

    /**
     * Sets the value of field 'codigoLegislacaoVigente'.
     * 
     * @param codigoLegislacaoVigente the value of field
     * 'codigoLegislacaoVigente'.
     */
    public void setCodigoLegislacaoVigente(int codigoLegislacaoVigente)
    {
        this._codigoLegislacaoVigente = codigoLegislacaoVigente;
        this._has_codigoLegislacaoVigente = true;
    } //-- void setCodigoLegislacaoVigente(int) 

    /**
     * Sets the value of field 'codigoMunicipioCentralizadora'.
     * 
     * @param codigoMunicipioCentralizadora the value of field
     * 'codigoMunicipioCentralizadora'.
     */
    public void setCodigoMunicipioCentralizadora(long codigoMunicipioCentralizadora)
    {
        this._codigoMunicipioCentralizadora = codigoMunicipioCentralizadora;
        this._has_codigoMunicipioCentralizadora = true;
    } //-- void setCodigoMunicipioCentralizadora(long) 

    /**
     * Sets the value of field
     * 'codigoPessoaJuridicaCentralizadora'.
     * 
     * @param codigoPessoaJuridicaCentralizadora the value of field
     * 'codigoPessoaJuridicaCentralizadora'.
     */
    public void setCodigoPessoaJuridicaCentralizadora(long codigoPessoaJuridicaCentralizadora)
    {
        this._codigoPessoaJuridicaCentralizadora = codigoPessoaJuridicaCentralizadora;
        this._has_codigoPessoaJuridicaCentralizadora = true;
    } //-- void setCodigoPessoaJuridicaCentralizadora(long) 

    /**
     * Sets the value of field 'codigoTipoIncidencia'.
     * 
     * @param codigoTipoIncidencia the value of field
     * 'codigoTipoIncidencia'.
     */
    public void setCodigoTipoIncidencia(int codigoTipoIncidencia)
    {
        this._codigoTipoIncidencia = codigoTipoIncidencia;
        this._has_codigoTipoIncidencia = true;
    } //-- void setCodigoTipoIncidencia(int) 

    /**
     * Sets the value of field 'descLegislacaoVigente'.
     * 
     * @param descLegislacaoVigente the value of field
     * 'descLegislacaoVigente'.
     */
    public void setDescLegislacaoVigente(java.lang.String descLegislacaoVigente)
    {
        this._descLegislacaoVigente = descLegislacaoVigente;
    } //-- void setDescLegislacaoVigente(java.lang.String) 

    /**
     * Sets the value of field
     * 'descricaoDependenciaCentralizadora'.
     * 
     * @param descricaoDependenciaCentralizadora the value of field
     * 'descricaoDependenciaCentralizadora'.
     */
    public void setDescricaoDependenciaCentralizadora(java.lang.String descricaoDependenciaCentralizadora)
    {
        this._descricaoDependenciaCentralizadora = descricaoDependenciaCentralizadora;
    } //-- void setDescricaoDependenciaCentralizadora(java.lang.String) 

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
     * Sets the value of field 'descricaoUF'.
     * 
     * @param descricaoUF the value of field 'descricaoUF'.
     */
    public void setDescricaoUF(java.lang.String descricaoUF)
    {
        this._descricaoUF = descricaoUF;
    } //-- void setDescricaoUF(java.lang.String) 

    /**
     * Sets the value of field 'diaVencimentoTribut'.
     * 
     * @param diaVencimentoTribut the value of field
     * 'diaVencimentoTribut'.
     */
    public void setDiaVencimentoTribut(int diaVencimentoTribut)
    {
        this._diaVencimentoTribut = diaVencimentoTribut;
        this._has_diaVencimentoTribut = true;
    } //-- void setDiaVencimentoTribut(int) 

    /**
     * Sets the value of field 'indNecessidadePagtoDiaUtil'.
     * 
     * @param indNecessidadePagtoDiaUtil the value of field
     * 'indNecessidadePagtoDiaUtil'.
     */
    public void setIndNecessidadePagtoDiaUtil(java.lang.String indNecessidadePagtoDiaUtil)
    {
        this._indNecessidadePagtoDiaUtil = indNecessidadePagtoDiaUtil;
    } //-- void setIndNecessidadePagtoDiaUtil(java.lang.String) 

    /**
     * Sets the value of field 'indiceVigencia'.
     * 
     * @param indiceVigencia the value of field 'indiceVigencia'.
     */
    public void setIndiceVigencia(java.lang.String indiceVigencia)
    {
        this._indiceVigencia = indiceVigencia;
    } //-- void setIndiceVigencia(java.lang.String) 

    /**
     * Sets the value of field 'itemComplementarLei'.
     * 
     * @param itemComplementarLei the value of field
     * 'itemComplementarLei'.
     */
    public void setItemComplementarLei(java.lang.String itemComplementarLei)
    {
        this._itemComplementarLei = itemComplementarLei;
    } //-- void setItemComplementarLei(java.lang.String) 

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
     * Sets the value of field 'nomeTipoIncidencia'.
     * 
     * @param nomeTipoIncidencia the value of field
     * 'nomeTipoIncidencia'.
     */
    public void setNomeTipoIncidencia(java.lang.String nomeTipoIncidencia)
    {
        this._nomeTipoIncidencia = nomeTipoIncidencia;
    } //-- void setNomeTipoIncidencia(java.lang.String) 

    /**
     * Sets the value of field 'numeroSequencialCentralizadora'.
     * 
     * @param numeroSequencialCentralizadora the value of field
     * 'numeroSequencialCentralizadora'.
     */
    public void setNumeroSequencialCentralizadora(int numeroSequencialCentralizadora)
    {
        this._numeroSequencialCentralizadora = numeroSequencialCentralizadora;
        this._has_numeroSequencialCentralizadora = true;
    } //-- void setNumeroSequencialCentralizadora(int) 

    /**
     * Sets the value of field 'percentualAliquotaMunicipio'.
     * 
     * @param percentualAliquotaMunicipio the value of field
     * 'percentualAliquotaMunicipio'.
     */
    public void setPercentualAliquotaMunicipio(java.math.BigDecimal percentualAliquotaMunicipio)
    {
        this._percentualAliquotaMunicipio = percentualAliquotaMunicipio;
    } //-- void setPercentualAliquotaMunicipio(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percentualAliquotaPadrao'.
     * 
     * @param percentualAliquotaPadrao the value of field
     * 'percentualAliquotaPadrao'.
     */
    public void setPercentualAliquotaPadrao(java.math.BigDecimal percentualAliquotaPadrao)
    {
        this._percentualAliquotaPadrao = percentualAliquotaPadrao;
    } //-- void setPercentualAliquotaPadrao(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percentualBaseAliquota'.
     * 
     * @param percentualBaseAliquota the value of field
     * 'percentualBaseAliquota'.
     */
    public void setPercentualBaseAliquota(java.math.BigDecimal percentualBaseAliquota)
    {
        this._percentualBaseAliquota = percentualBaseAliquota;
    } //-- void setPercentualBaseAliquota(java.math.BigDecimal) 

    /**
     * Sets the value of field 'tipoPesquisa'.
     * 
     * @param tipoPesquisa the value of field 'tipoPesquisa'.
     */
    public void setTipoPesquisa(int tipoPesquisa)
    {
        this._tipoPesquisa = tipoPesquisa;
        this._has_tipoPesquisa = true;
    } //-- void setTipoPesquisa(int) 

    /**
     * Sets the value of field 'uFCentralizadora'.
     * 
     * @param uFCentralizadora the value of field 'uFCentralizadora'
     */
    public void setUFCentralizadora(java.lang.String uFCentralizadora)
    {
        this._uFCentralizadora = uFCentralizadora;
    } //-- void setUFCentralizadora(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultarMunicipioResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.response.ConsultarMunicipioResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.response.ConsultarMunicipioResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.response.ConsultarMunicipioResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarmunicipio.response.ConsultarMunicipioResponse unmarshal(java.io.Reader) 

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
