/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:11:21 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response;

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
 * Class Ocorrencias.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:11:21 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codSolicitacaoBalancete
     */
    private long _codSolicitacaoBalancete = 0;

    /**
     * keeps track of state for field: _codSolicitacaoBalancete
     */
    private boolean _has_codSolicitacaoBalancete;

    /**
     * Field _seqApuracaoBalancete
     */
    private long _seqApuracaoBalancete = 0;

    /**
     * keeps track of state for field: _seqApuracaoBalancete
     */
    private boolean _has_seqApuracaoBalancete;

    /**
     * Field _codCosif
     */
    private long _codCosif = 0;

    /**
     * keeps track of state for field: _codCosif
     */
    private boolean _has_codCosif;

    /**
     * Field _codGrupoContabil
     */
    private int _codGrupoContabil = 0;

    /**
     * keeps track of state for field: _codGrupoContabil
     */
    private boolean _has_codGrupoContabil;

    /**
     * Field _codSubgrupoContabil
     */
    private int _codSubgrupoContabil = 0;

    /**
     * keeps track of state for field: _codSubgrupoContabil
     */
    private boolean _has_codSubgrupoContabil;

    /**
     * Field _codConta
     */
    private long _codConta = 0;

    /**
     * keeps track of state for field: _codConta
     */
    private boolean _has_codConta;

    /**
     * Field _digConta
     */
    private java.lang.String _digConta;

    /**
     * Field _sinalSaldoAnterior
     */
    private java.lang.String _sinalSaldoAnterior;

    /**
     * Field _vlrSaldoAnterior
     */
    private java.math.BigDecimal _vlrSaldoAnterior = new java.math.BigDecimal("0");

    /**
     * Field _vlrSaldoDebito
     */
    private java.math.BigDecimal _vlrSaldoDebito = new java.math.BigDecimal("0");

    /**
     * Field _vlrSaldoCredito
     */
    private java.math.BigDecimal _vlrSaldoCredito = new java.math.BigDecimal("0");

    /**
     * Field _sinalSaldoAtual
     */
    private java.lang.String _sinalSaldoAtual;

    /**
     * Field _vlrSaldoAtual
     */
    private java.math.BigDecimal _vlrSaldoAtual = new java.math.BigDecimal("0");

    /**
     * Field _nivelLancamento
     */
    private int _nivelLancamento;

    /**
     * keeps track of state for field: _nivelLancamento
     */
    private boolean _has_nivelLancamento;

    /**
     * Field _descLancamento
     */
    private java.lang.String _descLancamento;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
        setVlrSaldoAnterior(new java.math.BigDecimal("0"));
        setVlrSaldoDebito(new java.math.BigDecimal("0"));
        setVlrSaldoCredito(new java.math.BigDecimal("0"));
        setVlrSaldoAtual(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodConta
     * 
     */
    public void deleteCodConta()
    {
        this._has_codConta= false;
    } //-- void deleteCodConta() 

    /**
     * Method deleteCodCosif
     * 
     */
    public void deleteCodCosif()
    {
        this._has_codCosif= false;
    } //-- void deleteCodCosif() 

    /**
     * Method deleteCodGrupoContabil
     * 
     */
    public void deleteCodGrupoContabil()
    {
        this._has_codGrupoContabil= false;
    } //-- void deleteCodGrupoContabil() 

    /**
     * Method deleteCodSolicitacaoBalancete
     * 
     */
    public void deleteCodSolicitacaoBalancete()
    {
        this._has_codSolicitacaoBalancete= false;
    } //-- void deleteCodSolicitacaoBalancete() 

    /**
     * Method deleteCodSubgrupoContabil
     * 
     */
    public void deleteCodSubgrupoContabil()
    {
        this._has_codSubgrupoContabil= false;
    } //-- void deleteCodSubgrupoContabil() 

    /**
     * Method deleteNivelLancamento
     * 
     */
    public void deleteNivelLancamento()
    {
        this._has_nivelLancamento= false;
    } //-- void deleteNivelLancamento() 

    /**
     * Method deleteSeqApuracaoBalancete
     * 
     */
    public void deleteSeqApuracaoBalancete()
    {
        this._has_seqApuracaoBalancete= false;
    } //-- void deleteSeqApuracaoBalancete() 

    /**
     * Returns the value of field 'codConta'.
     * 
     * @return long
     * @return the value of field 'codConta'.
     */
    public long getCodConta()
    {
        return this._codConta;
    } //-- long getCodConta() 

    /**
     * Returns the value of field 'codCosif'.
     * 
     * @return long
     * @return the value of field 'codCosif'.
     */
    public long getCodCosif()
    {
        return this._codCosif;
    } //-- long getCodCosif() 

    /**
     * Returns the value of field 'codGrupoContabil'.
     * 
     * @return int
     * @return the value of field 'codGrupoContabil'.
     */
    public int getCodGrupoContabil()
    {
        return this._codGrupoContabil;
    } //-- int getCodGrupoContabil() 

    /**
     * Returns the value of field 'codSolicitacaoBalancete'.
     * 
     * @return long
     * @return the value of field 'codSolicitacaoBalancete'.
     */
    public long getCodSolicitacaoBalancete()
    {
        return this._codSolicitacaoBalancete;
    } //-- long getCodSolicitacaoBalancete() 

    /**
     * Returns the value of field 'codSubgrupoContabil'.
     * 
     * @return int
     * @return the value of field 'codSubgrupoContabil'.
     */
    public int getCodSubgrupoContabil()
    {
        return this._codSubgrupoContabil;
    } //-- int getCodSubgrupoContabil() 

    /**
     * Returns the value of field 'descLancamento'.
     * 
     * @return String
     * @return the value of field 'descLancamento'.
     */
    public java.lang.String getDescLancamento()
    {
        return this._descLancamento;
    } //-- java.lang.String getDescLancamento() 

    /**
     * Returns the value of field 'digConta'.
     * 
     * @return String
     * @return the value of field 'digConta'.
     */
    public java.lang.String getDigConta()
    {
        return this._digConta;
    } //-- java.lang.String getDigConta() 

    /**
     * Returns the value of field 'nivelLancamento'.
     * 
     * @return int
     * @return the value of field 'nivelLancamento'.
     */
    public int getNivelLancamento()
    {
        return this._nivelLancamento;
    } //-- int getNivelLancamento() 

    /**
     * Returns the value of field 'seqApuracaoBalancete'.
     * 
     * @return long
     * @return the value of field 'seqApuracaoBalancete'.
     */
    public long getSeqApuracaoBalancete()
    {
        return this._seqApuracaoBalancete;
    } //-- long getSeqApuracaoBalancete() 

    /**
     * Returns the value of field 'sinalSaldoAnterior'.
     * 
     * @return String
     * @return the value of field 'sinalSaldoAnterior'.
     */
    public java.lang.String getSinalSaldoAnterior()
    {
        return this._sinalSaldoAnterior;
    } //-- java.lang.String getSinalSaldoAnterior() 

    /**
     * Returns the value of field 'sinalSaldoAtual'.
     * 
     * @return String
     * @return the value of field 'sinalSaldoAtual'.
     */
    public java.lang.String getSinalSaldoAtual()
    {
        return this._sinalSaldoAtual;
    } //-- java.lang.String getSinalSaldoAtual() 

    /**
     * Returns the value of field 'vlrSaldoAnterior'.
     * 
     * @return BigDecimal
     * @return the value of field 'vlrSaldoAnterior'.
     */
    public java.math.BigDecimal getVlrSaldoAnterior()
    {
        return this._vlrSaldoAnterior;
    } //-- java.math.BigDecimal getVlrSaldoAnterior() 

    /**
     * Returns the value of field 'vlrSaldoAtual'.
     * 
     * @return BigDecimal
     * @return the value of field 'vlrSaldoAtual'.
     */
    public java.math.BigDecimal getVlrSaldoAtual()
    {
        return this._vlrSaldoAtual;
    } //-- java.math.BigDecimal getVlrSaldoAtual() 

    /**
     * Returns the value of field 'vlrSaldoCredito'.
     * 
     * @return BigDecimal
     * @return the value of field 'vlrSaldoCredito'.
     */
    public java.math.BigDecimal getVlrSaldoCredito()
    {
        return this._vlrSaldoCredito;
    } //-- java.math.BigDecimal getVlrSaldoCredito() 

    /**
     * Returns the value of field 'vlrSaldoDebito'.
     * 
     * @return BigDecimal
     * @return the value of field 'vlrSaldoDebito'.
     */
    public java.math.BigDecimal getVlrSaldoDebito()
    {
        return this._vlrSaldoDebito;
    } //-- java.math.BigDecimal getVlrSaldoDebito() 

    /**
     * Method hasCodConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodConta()
    {
        return this._has_codConta;
    } //-- boolean hasCodConta() 

    /**
     * Method hasCodCosif
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodCosif()
    {
        return this._has_codCosif;
    } //-- boolean hasCodCosif() 

    /**
     * Method hasCodGrupoContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodGrupoContabil()
    {
        return this._has_codGrupoContabil;
    } //-- boolean hasCodGrupoContabil() 

    /**
     * Method hasCodSolicitacaoBalancete
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodSolicitacaoBalancete()
    {
        return this._has_codSolicitacaoBalancete;
    } //-- boolean hasCodSolicitacaoBalancete() 

    /**
     * Method hasCodSubgrupoContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodSubgrupoContabil()
    {
        return this._has_codSubgrupoContabil;
    } //-- boolean hasCodSubgrupoContabil() 

    /**
     * Method hasNivelLancamento
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNivelLancamento()
    {
        return this._has_nivelLancamento;
    } //-- boolean hasNivelLancamento() 

    /**
     * Method hasSeqApuracaoBalancete
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSeqApuracaoBalancete()
    {
        return this._has_seqApuracaoBalancete;
    } //-- boolean hasSeqApuracaoBalancete() 

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
     * Sets the value of field 'codConta'.
     * 
     * @param codConta the value of field 'codConta'.
     */
    public void setCodConta(long codConta)
    {
        this._codConta = codConta;
        this._has_codConta = true;
    } //-- void setCodConta(long) 

    /**
     * Sets the value of field 'codCosif'.
     * 
     * @param codCosif the value of field 'codCosif'.
     */
    public void setCodCosif(long codCosif)
    {
        this._codCosif = codCosif;
        this._has_codCosif = true;
    } //-- void setCodCosif(long) 

    /**
     * Sets the value of field 'codGrupoContabil'.
     * 
     * @param codGrupoContabil the value of field 'codGrupoContabil'
     */
    public void setCodGrupoContabil(int codGrupoContabil)
    {
        this._codGrupoContabil = codGrupoContabil;
        this._has_codGrupoContabil = true;
    } //-- void setCodGrupoContabil(int) 

    /**
     * Sets the value of field 'codSolicitacaoBalancete'.
     * 
     * @param codSolicitacaoBalancete the value of field
     * 'codSolicitacaoBalancete'.
     */
    public void setCodSolicitacaoBalancete(long codSolicitacaoBalancete)
    {
        this._codSolicitacaoBalancete = codSolicitacaoBalancete;
        this._has_codSolicitacaoBalancete = true;
    } //-- void setCodSolicitacaoBalancete(long) 

    /**
     * Sets the value of field 'codSubgrupoContabil'.
     * 
     * @param codSubgrupoContabil the value of field
     * 'codSubgrupoContabil'.
     */
    public void setCodSubgrupoContabil(int codSubgrupoContabil)
    {
        this._codSubgrupoContabil = codSubgrupoContabil;
        this._has_codSubgrupoContabil = true;
    } //-- void setCodSubgrupoContabil(int) 

    /**
     * Sets the value of field 'descLancamento'.
     * 
     * @param descLancamento the value of field 'descLancamento'.
     */
    public void setDescLancamento(java.lang.String descLancamento)
    {
        this._descLancamento = descLancamento;
    } //-- void setDescLancamento(java.lang.String) 

    /**
     * Sets the value of field 'digConta'.
     * 
     * @param digConta the value of field 'digConta'.
     */
    public void setDigConta(java.lang.String digConta)
    {
        this._digConta = digConta;
    } //-- void setDigConta(java.lang.String) 

    /**
     * Sets the value of field 'nivelLancamento'.
     * 
     * @param nivelLancamento the value of field 'nivelLancamento'.
     */
    public void setNivelLancamento(int nivelLancamento)
    {
        this._nivelLancamento = nivelLancamento;
        this._has_nivelLancamento = true;
    } //-- void setNivelLancamento(int) 

    /**
     * Sets the value of field 'seqApuracaoBalancete'.
     * 
     * @param seqApuracaoBalancete the value of field
     * 'seqApuracaoBalancete'.
     */
    public void setSeqApuracaoBalancete(long seqApuracaoBalancete)
    {
        this._seqApuracaoBalancete = seqApuracaoBalancete;
        this._has_seqApuracaoBalancete = true;
    } //-- void setSeqApuracaoBalancete(long) 

    /**
     * Sets the value of field 'sinalSaldoAnterior'.
     * 
     * @param sinalSaldoAnterior the value of field
     * 'sinalSaldoAnterior'.
     */
    public void setSinalSaldoAnterior(java.lang.String sinalSaldoAnterior)
    {
        this._sinalSaldoAnterior = sinalSaldoAnterior;
    } //-- void setSinalSaldoAnterior(java.lang.String) 

    /**
     * Sets the value of field 'sinalSaldoAtual'.
     * 
     * @param sinalSaldoAtual the value of field 'sinalSaldoAtual'.
     */
    public void setSinalSaldoAtual(java.lang.String sinalSaldoAtual)
    {
        this._sinalSaldoAtual = sinalSaldoAtual;
    } //-- void setSinalSaldoAtual(java.lang.String) 

    /**
     * Sets the value of field 'vlrSaldoAnterior'.
     * 
     * @param vlrSaldoAnterior the value of field 'vlrSaldoAnterior'
     */
    public void setVlrSaldoAnterior(java.math.BigDecimal vlrSaldoAnterior)
    {
        this._vlrSaldoAnterior = vlrSaldoAnterior;
    } //-- void setVlrSaldoAnterior(java.math.BigDecimal) 

    /**
     * Sets the value of field 'vlrSaldoAtual'.
     * 
     * @param vlrSaldoAtual the value of field 'vlrSaldoAtual'.
     */
    public void setVlrSaldoAtual(java.math.BigDecimal vlrSaldoAtual)
    {
        this._vlrSaldoAtual = vlrSaldoAtual;
    } //-- void setVlrSaldoAtual(java.math.BigDecimal) 

    /**
     * Sets the value of field 'vlrSaldoCredito'.
     * 
     * @param vlrSaldoCredito the value of field 'vlrSaldoCredito'.
     */
    public void setVlrSaldoCredito(java.math.BigDecimal vlrSaldoCredito)
    {
        this._vlrSaldoCredito = vlrSaldoCredito;
    } //-- void setVlrSaldoCredito(java.math.BigDecimal) 

    /**
     * Sets the value of field 'vlrSaldoDebito'.
     * 
     * @param vlrSaldoDebito the value of field 'vlrSaldoDebito'.
     */
    public void setVlrSaldoDebito(java.math.BigDecimal vlrSaldoDebito)
    {
        this._vlrSaldoDebito = vlrSaldoDebito;
    } //-- void setVlrSaldoDebito(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarbalancetes.response.Ocorrencias unmarshal(java.io.Reader) 

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
