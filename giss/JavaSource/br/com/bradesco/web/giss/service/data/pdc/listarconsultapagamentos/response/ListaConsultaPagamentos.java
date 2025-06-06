/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarconsultapagamentos.response;

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
 * Class ListaConsultaPagamentos.
 * 
 * @version $Revision$ $Date$
 */
public class ListaConsultaPagamentos implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _descEmpresa
     */
    private java.lang.String _descEmpresa;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _codIdentifTransIss
     */
    private int _codIdentifTransIss = 0;

    /**
     * keeps track of state for field: _codIdentifTransIss
     */
    private boolean _has_codIdentifTransIss;

    /**
     * Field _produto
     */
    private java.lang.String _produto;

    /**
     * Field _dtAgendamento
     */
    private java.lang.String _dtAgendamento;

    /**
     * Field _dtPagamento
     */
    private java.lang.String _dtPagamento;

    /**
     * Field _competencia
     */
    private int _competencia = 0;

    /**
     * keeps track of state for field: _competencia
     */
    private boolean _has_competencia;

    /**
     * Field _codTipoCredito
     */
    private int _codTipoCredito = 0;

    /**
     * keeps track of state for field: _codTipoCredito
     */
    private boolean _has_codTipoCredito;

    /**
     * Field _descTipoCredito
     */
    private java.lang.String _descTipoCredito;

    /**
     * Field _valorIssPagto
     */
    private java.math.BigDecimal _valorIssPagto = new java.math.BigDecimal("0");

    /**
     * Field _codStatus
     */
    private int _codStatus = 0;

    /**
     * keeps track of state for field: _codStatus
     */
    private boolean _has_codStatus;

    /**
     * Field _descStatus
     */
    private java.lang.String _descStatus;

    /**
     * Field _codMovimento
     */
    private int _codMovimento = 0;

    /**
     * keeps track of state for field: _codMovimento
     */
    private boolean _has_codMovimento;

    /**
     * Field _nomePrograma
     */
    private java.lang.String _nomePrograma;

    /**
     * Field _dtHoraInclusao
     */
    private java.lang.String _dtHoraInclusao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaConsultaPagamentos() 
     {
        super();
        setValorIssPagto(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconsultapagamentos.response.ListaConsultaPagamentos()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteCodIdentifTransIss
     * 
     */
    public void deleteCodIdentifTransIss()
    {
        this._has_codIdentifTransIss= false;
    } //-- void deleteCodIdentifTransIss() 

    /**
     * Method deleteCodMovimento
     * 
     */
    public void deleteCodMovimento()
    {
        this._has_codMovimento= false;
    } //-- void deleteCodMovimento() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodStatus
     * 
     */
    public void deleteCodStatus()
    {
        this._has_codStatus= false;
    } //-- void deleteCodStatus() 

    /**
     * Method deleteCodTipoCredito
     * 
     */
    public void deleteCodTipoCredito()
    {
        this._has_codTipoCredito= false;
    } //-- void deleteCodTipoCredito() 

    /**
     * Method deleteCompetencia
     * 
     */
    public void deleteCompetencia()
    {
        this._has_competencia= false;
    } //-- void deleteCompetencia() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return int
     * @return the value of field 'codEmpresa'.
     */
    public int getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- int getCodEmpresa() 

    /**
     * Returns the value of field 'codIdentifTransIss'.
     * 
     * @return int
     * @return the value of field 'codIdentifTransIss'.
     */
    public int getCodIdentifTransIss()
    {
        return this._codIdentifTransIss;
    } //-- int getCodIdentifTransIss() 

    /**
     * Returns the value of field 'codMovimento'.
     * 
     * @return int
     * @return the value of field 'codMovimento'.
     */
    public int getCodMovimento()
    {
        return this._codMovimento;
    } //-- int getCodMovimento() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codStatus'.
     * 
     * @return int
     * @return the value of field 'codStatus'.
     */
    public int getCodStatus()
    {
        return this._codStatus;
    } //-- int getCodStatus() 

    /**
     * Returns the value of field 'codTipoCredito'.
     * 
     * @return int
     * @return the value of field 'codTipoCredito'.
     */
    public int getCodTipoCredito()
    {
        return this._codTipoCredito;
    } //-- int getCodTipoCredito() 

    /**
     * Returns the value of field 'competencia'.
     * 
     * @return int
     * @return the value of field 'competencia'.
     */
    public int getCompetencia()
    {
        return this._competencia;
    } //-- int getCompetencia() 

    /**
     * Returns the value of field 'descEmpresa'.
     * 
     * @return String
     * @return the value of field 'descEmpresa'.
     */
    public java.lang.String getDescEmpresa()
    {
        return this._descEmpresa;
    } //-- java.lang.String getDescEmpresa() 

    /**
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'descStatus'.
     * 
     * @return String
     * @return the value of field 'descStatus'.
     */
    public java.lang.String getDescStatus()
    {
        return this._descStatus;
    } //-- java.lang.String getDescStatus() 

    /**
     * Returns the value of field 'descTipoCredito'.
     * 
     * @return String
     * @return the value of field 'descTipoCredito'.
     */
    public java.lang.String getDescTipoCredito()
    {
        return this._descTipoCredito;
    } //-- java.lang.String getDescTipoCredito() 

    /**
     * Returns the value of field 'dtAgendamento'.
     * 
     * @return String
     * @return the value of field 'dtAgendamento'.
     */
    public java.lang.String getDtAgendamento()
    {
        return this._dtAgendamento;
    } //-- java.lang.String getDtAgendamento() 

    /**
     * Returns the value of field 'dtHoraInclusao'.
     * 
     * @return String
     * @return the value of field 'dtHoraInclusao'.
     */
    public java.lang.String getDtHoraInclusao()
    {
        return this._dtHoraInclusao;
    } //-- java.lang.String getDtHoraInclusao() 

    /**
     * Returns the value of field 'dtPagamento'.
     * 
     * @return String
     * @return the value of field 'dtPagamento'.
     */
    public java.lang.String getDtPagamento()
    {
        return this._dtPagamento;
    } //-- java.lang.String getDtPagamento() 

    /**
     * Returns the value of field 'nomePrograma'.
     * 
     * @return String
     * @return the value of field 'nomePrograma'.
     */
    public java.lang.String getNomePrograma()
    {
        return this._nomePrograma;
    } //-- java.lang.String getNomePrograma() 

    /**
     * Returns the value of field 'produto'.
     * 
     * @return String
     * @return the value of field 'produto'.
     */
    public java.lang.String getProduto()
    {
        return this._produto;
    } //-- java.lang.String getProduto() 

    /**
     * Returns the value of field 'valorIssPagto'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorIssPagto'.
     */
    public java.math.BigDecimal getValorIssPagto()
    {
        return this._valorIssPagto;
    } //-- java.math.BigDecimal getValorIssPagto() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

    /**
     * Method hasCodIdentifTransIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodIdentifTransIss()
    {
        return this._has_codIdentifTransIss;
    } //-- boolean hasCodIdentifTransIss() 

    /**
     * Method hasCodMovimento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMovimento()
    {
        return this._has_codMovimento;
    } //-- boolean hasCodMovimento() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasCodStatus
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodStatus()
    {
        return this._has_codStatus;
    } //-- boolean hasCodStatus() 

    /**
     * Method hasCodTipoCredito
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodTipoCredito()
    {
        return this._has_codTipoCredito;
    } //-- boolean hasCodTipoCredito() 

    /**
     * Method hasCompetencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCompetencia()
    {
        return this._has_competencia;
    } //-- boolean hasCompetencia() 

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
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(int codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(int) 

    /**
     * Sets the value of field 'codIdentifTransIss'.
     * 
     * @param codIdentifTransIss the value of field
     * 'codIdentifTransIss'.
     */
    public void setCodIdentifTransIss(int codIdentifTransIss)
    {
        this._codIdentifTransIss = codIdentifTransIss;
        this._has_codIdentifTransIss = true;
    } //-- void setCodIdentifTransIss(int) 

    /**
     * Sets the value of field 'codMovimento'.
     * 
     * @param codMovimento the value of field 'codMovimento'.
     */
    public void setCodMovimento(int codMovimento)
    {
        this._codMovimento = codMovimento;
        this._has_codMovimento = true;
    } //-- void setCodMovimento(int) 

    /**
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codStatus'.
     * 
     * @param codStatus the value of field 'codStatus'.
     */
    public void setCodStatus(int codStatus)
    {
        this._codStatus = codStatus;
        this._has_codStatus = true;
    } //-- void setCodStatus(int) 

    /**
     * Sets the value of field 'codTipoCredito'.
     * 
     * @param codTipoCredito the value of field 'codTipoCredito'.
     */
    public void setCodTipoCredito(int codTipoCredito)
    {
        this._codTipoCredito = codTipoCredito;
        this._has_codTipoCredito = true;
    } //-- void setCodTipoCredito(int) 

    /**
     * Sets the value of field 'competencia'.
     * 
     * @param competencia the value of field 'competencia'.
     */
    public void setCompetencia(int competencia)
    {
        this._competencia = competencia;
        this._has_competencia = true;
    } //-- void setCompetencia(int) 

    /**
     * Sets the value of field 'descEmpresa'.
     * 
     * @param descEmpresa the value of field 'descEmpresa'.
     */
    public void setDescEmpresa(java.lang.String descEmpresa)
    {
        this._descEmpresa = descEmpresa;
    } //-- void setDescEmpresa(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'descStatus'.
     * 
     * @param descStatus the value of field 'descStatus'.
     */
    public void setDescStatus(java.lang.String descStatus)
    {
        this._descStatus = descStatus;
    } //-- void setDescStatus(java.lang.String) 

    /**
     * Sets the value of field 'descTipoCredito'.
     * 
     * @param descTipoCredito the value of field 'descTipoCredito'.
     */
    public void setDescTipoCredito(java.lang.String descTipoCredito)
    {
        this._descTipoCredito = descTipoCredito;
    } //-- void setDescTipoCredito(java.lang.String) 

    /**
     * Sets the value of field 'dtAgendamento'.
     * 
     * @param dtAgendamento the value of field 'dtAgendamento'.
     */
    public void setDtAgendamento(java.lang.String dtAgendamento)
    {
        this._dtAgendamento = dtAgendamento;
    } //-- void setDtAgendamento(java.lang.String) 

    /**
     * Sets the value of field 'dtHoraInclusao'.
     * 
     * @param dtHoraInclusao the value of field 'dtHoraInclusao'.
     */
    public void setDtHoraInclusao(java.lang.String dtHoraInclusao)
    {
        this._dtHoraInclusao = dtHoraInclusao;
    } //-- void setDtHoraInclusao(java.lang.String) 

    /**
     * Sets the value of field 'dtPagamento'.
     * 
     * @param dtPagamento the value of field 'dtPagamento'.
     */
    public void setDtPagamento(java.lang.String dtPagamento)
    {
        this._dtPagamento = dtPagamento;
    } //-- void setDtPagamento(java.lang.String) 

    /**
     * Sets the value of field 'nomePrograma'.
     * 
     * @param nomePrograma the value of field 'nomePrograma'.
     */
    public void setNomePrograma(java.lang.String nomePrograma)
    {
        this._nomePrograma = nomePrograma;
    } //-- void setNomePrograma(java.lang.String) 

    /**
     * Sets the value of field 'produto'.
     * 
     * @param produto the value of field 'produto'.
     */
    public void setProduto(java.lang.String produto)
    {
        this._produto = produto;
    } //-- void setProduto(java.lang.String) 

    /**
     * Sets the value of field 'valorIssPagto'.
     * 
     * @param valorIssPagto the value of field 'valorIssPagto'.
     */
    public void setValorIssPagto(java.math.BigDecimal valorIssPagto)
    {
        this._valorIssPagto = valorIssPagto;
    } //-- void setValorIssPagto(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaConsultaPagamentos
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarconsultapagamentos.response.ListaConsultaPagamentos unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarconsultapagamentos.response.ListaConsultaPagamentos) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarconsultapagamentos.response.ListaConsultaPagamentos.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconsultapagamentos.response.ListaConsultaPagamentos unmarshal(java.io.Reader) 

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
