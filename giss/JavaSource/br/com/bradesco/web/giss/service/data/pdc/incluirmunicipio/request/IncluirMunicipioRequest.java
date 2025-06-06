/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: IncluirMunicipioRequest.java,v 1.1 2017/04/11 14:09:38 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.incluirmunicipio.request;

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
 * Class IncluirMunicipioRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:09:38 $
 */
public class IncluirMunicipioRequest implements java.io.Serializable {


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
     * Field _diaVencimento
     */
    private int _diaVencimento = 0;

    /**
     * keeps track of state for field: _diaVencimento
     */
    private boolean _has_diaVencimento;

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
     * Field _codigoUnidadeOrganizacional
     */
    private long _codigoUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field: _codigoUnidadeOrganizacional
     */
    private boolean _has_codigoUnidadeOrganizacional;

    /**
     * Field _numeroUnidadeOrganizacional
     */
    private int _numeroUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field: _numeroUnidadeOrganizacional
     */
    private boolean _has_numeroUnidadeOrganizacional;

    /**
     * Field _codigoLegislacaoVigente
     */
    private int _codigoLegislacaoVigente = 0;

    /**
     * keeps track of state for field: _codigoLegislacaoVigente
     */
    private boolean _has_codigoLegislacaoVigente;

    /**
     * Field _itemComplementarLei
     */
    private java.lang.String _itemComplementarLei;


      //----------------/
     //- Constructors -/
    //----------------/

    public IncluirMunicipioRequest() 
     {
        super();
        setPercentualBaseAliquota(new java.math.BigDecimal("0"));
        setPercentualAliquotaPadrao(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirmunicipio.request.IncluirMunicipioRequest()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Method deleteCodigoTipoIncidencia
     * 
     */
    public void deleteCodigoTipoIncidencia()
    {
        this._has_codigoTipoIncidencia= false;
    } //-- void deleteCodigoTipoIncidencia() 

    /**
     * Method deleteCodigoUnidadeOrganizacional
     * 
     */
    public void deleteCodigoUnidadeOrganizacional()
    {
        this._has_codigoUnidadeOrganizacional= false;
    } //-- void deleteCodigoUnidadeOrganizacional() 

    /**
     * Method deleteDiaVencimento
     * 
     */
    public void deleteDiaVencimento()
    {
        this._has_diaVencimento= false;
    } //-- void deleteDiaVencimento() 

    /**
     * Method deleteNumeroUnidadeOrganizacional
     * 
     */
    public void deleteNumeroUnidadeOrganizacional()
    {
        this._has_numeroUnidadeOrganizacional= false;
    } //-- void deleteNumeroUnidadeOrganizacional() 

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
     * Returns the value of field 'codigoUnidadeOrganizacional'.
     * 
     * @return long
     * @return the value of field 'codigoUnidadeOrganizacional'.
     */
    public long getCodigoUnidadeOrganizacional()
    {
        return this._codigoUnidadeOrganizacional;
    } //-- long getCodigoUnidadeOrganizacional() 

    /**
     * Returns the value of field 'diaVencimento'.
     * 
     * @return int
     * @return the value of field 'diaVencimento'.
     */
    public int getDiaVencimento()
    {
        return this._diaVencimento;
    } //-- int getDiaVencimento() 

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
     * Returns the value of field 'numeroUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field 'numeroUnidadeOrganizacional'.
     */
    public int getNumeroUnidadeOrganizacional()
    {
        return this._numeroUnidadeOrganizacional;
    } //-- int getNumeroUnidadeOrganizacional() 

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
     * Method hasCodigoUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoUnidadeOrganizacional()
    {
        return this._has_codigoUnidadeOrganizacional;
    } //-- boolean hasCodigoUnidadeOrganizacional() 

    /**
     * Method hasDiaVencimento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDiaVencimento()
    {
        return this._has_diaVencimento;
    } //-- boolean hasDiaVencimento() 

    /**
     * Method hasNumeroUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroUnidadeOrganizacional()
    {
        return this._has_numeroUnidadeOrganizacional;
    } //-- boolean hasNumeroUnidadeOrganizacional() 

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
     * Sets the value of field 'codigoUnidadeOrganizacional'.
     * 
     * @param codigoUnidadeOrganizacional the value of field
     * 'codigoUnidadeOrganizacional'.
     */
    public void setCodigoUnidadeOrganizacional(long codigoUnidadeOrganizacional)
    {
        this._codigoUnidadeOrganizacional = codigoUnidadeOrganizacional;
        this._has_codigoUnidadeOrganizacional = true;
    } //-- void setCodigoUnidadeOrganizacional(long) 

    /**
     * Sets the value of field 'diaVencimento'.
     * 
     * @param diaVencimento the value of field 'diaVencimento'.
     */
    public void setDiaVencimento(int diaVencimento)
    {
        this._diaVencimento = diaVencimento;
        this._has_diaVencimento = true;
    } //-- void setDiaVencimento(int) 

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
     * Sets the value of field 'numeroUnidadeOrganizacional'.
     * 
     * @param numeroUnidadeOrganizacional the value of field
     * 'numeroUnidadeOrganizacional'.
     */
    public void setNumeroUnidadeOrganizacional(int numeroUnidadeOrganizacional)
    {
        this._numeroUnidadeOrganizacional = numeroUnidadeOrganizacional;
        this._has_numeroUnidadeOrganizacional = true;
    } //-- void setNumeroUnidadeOrganizacional(int) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return IncluirMunicipioRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.incluirmunicipio.request.IncluirMunicipioRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.incluirmunicipio.request.IncluirMunicipioRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.incluirmunicipio.request.IncluirMunicipioRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.incluirmunicipio.request.IncluirMunicipioRequest unmarshal(java.io.Reader) 

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
