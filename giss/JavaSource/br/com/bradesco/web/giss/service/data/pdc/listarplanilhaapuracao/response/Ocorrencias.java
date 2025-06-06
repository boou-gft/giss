/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:10:33 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response;

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
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:33 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _tipoRegistro
     */
    private java.lang.String _tipoRegistro;

    /**
     * Field _codigoTipoServicTributavel
     */
    private int _codigoTipoServicTributavel = 0;

    /**
     * keeps track of state for field: _codigoTipoServicTributavel
     */
    private boolean _has_codigoTipoServicTributavel;

    /**
     * Field _tipoServicoTributavel
     */
    private java.lang.String _tipoServicoTributavel;

    /**
     * Field _contaContabil
     */
    private java.lang.String _contaContabil;

    /**
     * Field _codigoGrupo
     */
    private int _codigoGrupo = 0;

    /**
     * keeps track of state for field: _codigoGrupo
     */
    private boolean _has_codigoGrupo;

    /**
     * Field _codigoSubgrupo
     */
    private int _codigoSubgrupo = 0;

    /**
     * keeps track of state for field: _codigoSubgrupo
     */
    private boolean _has_codigoSubgrupo;

    /**
     * Field _descricaoRazao
     */
    private java.lang.String _descricaoRazao;

    /**
     * Field _codigoLeiComplementar
     */
    private java.lang.String _codigoLeiComplementar;

    /**
     * Field _percAliquotaApurMun
     */
    private java.math.BigDecimal _percAliquotaApurMun = new java.math.BigDecimal("0");

    /**
     * Field _receitaSinal
     */
    private java.lang.String _receitaSinal;

    /**
     * Field _receitaValor
     */
    private java.math.BigDecimal _receitaValor = new java.math.BigDecimal("0");

    /**
     * Field _tributavelApuracaoIssSinal
     */
    private java.lang.String _tributavelApuracaoIssSinal;

    /**
     * Field _tributavelApuracaoIssValor
     */
    private java.math.BigDecimal _tributavelApuracaoIssValor = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
        setPercAliquotaApurMun(new java.math.BigDecimal("0"));
        setReceitaValor(new java.math.BigDecimal("0"));
        setTributavelApuracaoIssValor(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoGrupo
     * 
     */
    public void deleteCodigoGrupo()
    {
        this._has_codigoGrupo= false;
    } //-- void deleteCodigoGrupo() 

    /**
     * Method deleteCodigoSubgrupo
     * 
     */
    public void deleteCodigoSubgrupo()
    {
        this._has_codigoSubgrupo= false;
    } //-- void deleteCodigoSubgrupo() 

    /**
     * Method deleteCodigoTipoServicTributavel
     * 
     */
    public void deleteCodigoTipoServicTributavel()
    {
        this._has_codigoTipoServicTributavel= false;
    } //-- void deleteCodigoTipoServicTributavel() 

    /**
     * Returns the value of field 'codigoGrupo'.
     * 
     * @return int
     * @return the value of field 'codigoGrupo'.
     */
    public int getCodigoGrupo()
    {
        return this._codigoGrupo;
    } //-- int getCodigoGrupo() 

    /**
     * Returns the value of field 'codigoLeiComplementar'.
     * 
     * @return String
     * @return the value of field 'codigoLeiComplementar'.
     */
    public java.lang.String getCodigoLeiComplementar()
    {
        return this._codigoLeiComplementar;
    } //-- java.lang.String getCodigoLeiComplementar() 

    /**
     * Returns the value of field 'codigoSubgrupo'.
     * 
     * @return int
     * @return the value of field 'codigoSubgrupo'.
     */
    public int getCodigoSubgrupo()
    {
        return this._codigoSubgrupo;
    } //-- int getCodigoSubgrupo() 

    /**
     * Returns the value of field 'codigoTipoServicTributavel'.
     * 
     * @return int
     * @return the value of field 'codigoTipoServicTributavel'.
     */
    public int getCodigoTipoServicTributavel()
    {
        return this._codigoTipoServicTributavel;
    } //-- int getCodigoTipoServicTributavel() 

    /**
     * Returns the value of field 'contaContabil'.
     * 
     * @return String
     * @return the value of field 'contaContabil'.
     */
    public java.lang.String getContaContabil()
    {
        return this._contaContabil;
    } //-- java.lang.String getContaContabil() 

    /**
     * Returns the value of field 'descricaoRazao'.
     * 
     * @return String
     * @return the value of field 'descricaoRazao'.
     */
    public java.lang.String getDescricaoRazao()
    {
        return this._descricaoRazao;
    } //-- java.lang.String getDescricaoRazao() 

    /**
     * Returns the value of field 'percAliquotaApurMun'.
     * 
     * @return BigDecimal
     * @return the value of field 'percAliquotaApurMun'.
     */
    public java.math.BigDecimal getPercAliquotaApurMun()
    {
        return this._percAliquotaApurMun;
    } //-- java.math.BigDecimal getPercAliquotaApurMun() 

    /**
     * Returns the value of field 'receitaSinal'.
     * 
     * @return String
     * @return the value of field 'receitaSinal'.
     */
    public java.lang.String getReceitaSinal()
    {
        return this._receitaSinal;
    } //-- java.lang.String getReceitaSinal() 

    /**
     * Returns the value of field 'receitaValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'receitaValor'.
     */
    public java.math.BigDecimal getReceitaValor()
    {
        return this._receitaValor;
    } //-- java.math.BigDecimal getReceitaValor() 

    /**
     * Returns the value of field 'tipoRegistro'.
     * 
     * @return String
     * @return the value of field 'tipoRegistro'.
     */
    public java.lang.String getTipoRegistro()
    {
        return this._tipoRegistro;
    } //-- java.lang.String getTipoRegistro() 

    /**
     * Returns the value of field 'tipoServicoTributavel'.
     * 
     * @return String
     * @return the value of field 'tipoServicoTributavel'.
     */
    public java.lang.String getTipoServicoTributavel()
    {
        return this._tipoServicoTributavel;
    } //-- java.lang.String getTipoServicoTributavel() 

    /**
     * Returns the value of field 'tributavelApuracaoIssSinal'.
     * 
     * @return String
     * @return the value of field 'tributavelApuracaoIssSinal'.
     */
    public java.lang.String getTributavelApuracaoIssSinal()
    {
        return this._tributavelApuracaoIssSinal;
    } //-- java.lang.String getTributavelApuracaoIssSinal() 

    /**
     * Returns the value of field 'tributavelApuracaoIssValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'tributavelApuracaoIssValor'.
     */
    public java.math.BigDecimal getTributavelApuracaoIssValor()
    {
        return this._tributavelApuracaoIssValor;
    } //-- java.math.BigDecimal getTributavelApuracaoIssValor() 

    /**
     * Method hasCodigoGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoGrupo()
    {
        return this._has_codigoGrupo;
    } //-- boolean hasCodigoGrupo() 

    /**
     * Method hasCodigoSubgrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoSubgrupo()
    {
        return this._has_codigoSubgrupo;
    } //-- boolean hasCodigoSubgrupo() 

    /**
     * Method hasCodigoTipoServicTributavel
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTipoServicTributavel()
    {
        return this._has_codigoTipoServicTributavel;
    } //-- boolean hasCodigoTipoServicTributavel() 

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
     * Sets the value of field 'codigoGrupo'.
     * 
     * @param codigoGrupo the value of field 'codigoGrupo'.
     */
    public void setCodigoGrupo(int codigoGrupo)
    {
        this._codigoGrupo = codigoGrupo;
        this._has_codigoGrupo = true;
    } //-- void setCodigoGrupo(int) 

    /**
     * Sets the value of field 'codigoLeiComplementar'.
     * 
     * @param codigoLeiComplementar the value of field
     * 'codigoLeiComplementar'.
     */
    public void setCodigoLeiComplementar(java.lang.String codigoLeiComplementar)
    {
        this._codigoLeiComplementar = codigoLeiComplementar;
    } //-- void setCodigoLeiComplementar(java.lang.String) 

    /**
     * Sets the value of field 'codigoSubgrupo'.
     * 
     * @param codigoSubgrupo the value of field 'codigoSubgrupo'.
     */
    public void setCodigoSubgrupo(int codigoSubgrupo)
    {
        this._codigoSubgrupo = codigoSubgrupo;
        this._has_codigoSubgrupo = true;
    } //-- void setCodigoSubgrupo(int) 

    /**
     * Sets the value of field 'codigoTipoServicTributavel'.
     * 
     * @param codigoTipoServicTributavel the value of field
     * 'codigoTipoServicTributavel'.
     */
    public void setCodigoTipoServicTributavel(int codigoTipoServicTributavel)
    {
        this._codigoTipoServicTributavel = codigoTipoServicTributavel;
        this._has_codigoTipoServicTributavel = true;
    } //-- void setCodigoTipoServicTributavel(int) 

    /**
     * Sets the value of field 'contaContabil'.
     * 
     * @param contaContabil the value of field 'contaContabil'.
     */
    public void setContaContabil(java.lang.String contaContabil)
    {
        this._contaContabil = contaContabil;
    } //-- void setContaContabil(java.lang.String) 

    /**
     * Sets the value of field 'descricaoRazao'.
     * 
     * @param descricaoRazao the value of field 'descricaoRazao'.
     */
    public void setDescricaoRazao(java.lang.String descricaoRazao)
    {
        this._descricaoRazao = descricaoRazao;
    } //-- void setDescricaoRazao(java.lang.String) 

    /**
     * Sets the value of field 'percAliquotaApurMun'.
     * 
     * @param percAliquotaApurMun the value of field
     * 'percAliquotaApurMun'.
     */
    public void setPercAliquotaApurMun(java.math.BigDecimal percAliquotaApurMun)
    {
        this._percAliquotaApurMun = percAliquotaApurMun;
    } //-- void setPercAliquotaApurMun(java.math.BigDecimal) 

    /**
     * Sets the value of field 'receitaSinal'.
     * 
     * @param receitaSinal the value of field 'receitaSinal'.
     */
    public void setReceitaSinal(java.lang.String receitaSinal)
    {
        this._receitaSinal = receitaSinal;
    } //-- void setReceitaSinal(java.lang.String) 

    /**
     * Sets the value of field 'receitaValor'.
     * 
     * @param receitaValor the value of field 'receitaValor'.
     */
    public void setReceitaValor(java.math.BigDecimal receitaValor)
    {
        this._receitaValor = receitaValor;
    } //-- void setReceitaValor(java.math.BigDecimal) 

    /**
     * Sets the value of field 'tipoRegistro'.
     * 
     * @param tipoRegistro the value of field 'tipoRegistro'.
     */
    public void setTipoRegistro(java.lang.String tipoRegistro)
    {
        this._tipoRegistro = tipoRegistro;
    } //-- void setTipoRegistro(java.lang.String) 

    /**
     * Sets the value of field 'tipoServicoTributavel'.
     * 
     * @param tipoServicoTributavel the value of field
     * 'tipoServicoTributavel'.
     */
    public void setTipoServicoTributavel(java.lang.String tipoServicoTributavel)
    {
        this._tipoServicoTributavel = tipoServicoTributavel;
    } //-- void setTipoServicoTributavel(java.lang.String) 

    /**
     * Sets the value of field 'tributavelApuracaoIssSinal'.
     * 
     * @param tributavelApuracaoIssSinal the value of field
     * 'tributavelApuracaoIssSinal'.
     */
    public void setTributavelApuracaoIssSinal(java.lang.String tributavelApuracaoIssSinal)
    {
        this._tributavelApuracaoIssSinal = tributavelApuracaoIssSinal;
    } //-- void setTributavelApuracaoIssSinal(java.lang.String) 

    /**
     * Sets the value of field 'tributavelApuracaoIssValor'.
     * 
     * @param tributavelApuracaoIssValor the value of field
     * 'tributavelApuracaoIssValor'.
     */
    public void setTributavelApuracaoIssValor(java.math.BigDecimal tributavelApuracaoIssValor)
    {
        this._tributavelApuracaoIssValor = tributavelApuracaoIssValor;
    } //-- void setTributavelApuracaoIssValor(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarplanilhaapuracao.response.Ocorrencias unmarshal(java.io.Reader) 

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
