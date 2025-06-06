/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao2.response;

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
 * Class OcorrenciasPlanApuracao.
 * 
 * @version $Revision$ $Date$
 */
public class OcorrenciasPlanApuracao implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _tipoRegistro
     */
    private java.lang.String _tipoRegistro;

    /**
     * Field _codTipoServico
     */
    private int _codTipoServico = 0;

    /**
     * keeps track of state for field: _codTipoServico
     */
    private boolean _has_codTipoServico;

    /**
     * Field _descTipoServico
     */
    private java.lang.String _descTipoServico;

    /**
     * Field _cosif
     */
    private java.lang.String _cosif;

    /**
     * Field _codGrupo
     */
    private int _codGrupo = 0;

    /**
     * keeps track of state for field: _codGrupo
     */
    private boolean _has_codGrupo;

    /**
     * Field _codSubGrupo
     */
    private int _codSubGrupo = 0;

    /**
     * keeps track of state for field: _codSubGrupo
     */
    private boolean _has_codSubGrupo;

    /**
     * Field _conta
     */
    private int _conta = 0;

    /**
     * keeps track of state for field: _conta
     */
    private boolean _has_conta;

    /**
     * Field _digConta
     */
    private java.lang.String _digConta;

    /**
     * Field _descRazao
     */
    private java.lang.String _descRazao;

    /**
     * Field _descContaContabil
     */
    private java.lang.String _descContaContabil;

    /**
     * Field _itemLei
     */
    private java.lang.String _itemLei;

    /**
     * Field _aliquotaApuracao
     */
    private double _aliquotaApuracao = 0;

    /**
     * keeps track of state for field: _aliquotaApuracao
     */
    private boolean _has_aliquotaApuracao;

    /**
     * Field _sinalReceita
     */
    private java.lang.String _sinalReceita;

    /**
     * Field _valorReceita
     */
    private double _valorReceita = 0;

    /**
     * keeps track of state for field: _valorReceita
     */
    private boolean _has_valorReceita;

    /**
     * Field _sinalIss
     */
    private java.lang.String _sinalIss;

    /**
     * Field _valorIss
     */
    private double _valorIss = 0;

    /**
     * keeps track of state for field: _valorIss
     */
    private boolean _has_valorIss;

    /**
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;

    /**
     * Field _mesCompetencia
     */
    private java.lang.String _mesCompetencia;

    /**
     * Field _codigoMesCompetencia
     */
    private int _codigoMesCompetencia = 0;

    /**
     * keeps track of state for field: _codigoMesCompetencia
     */
    private boolean _has_codigoMesCompetencia;

    /**
     * Field _sinalRedutorMes
     */
    private java.lang.String _sinalRedutorMes;

    /**
     * Field _valorRedutorMes
     */
    private double _valorRedutorMes = 0;

    /**
     * keeps track of state for field: _valorRedutorMes
     */
    private boolean _has_valorRedutorMes;

    /**
     * Field _valorTotalReceitaMes
     */
    private double _valorTotalReceitaMes = 0;

    /**
     * keeps track of state for field: _valorTotalReceitaMes
     */
    private boolean _has_valorTotalReceitaMes;

    /**
     * Field _valorTotalIssMes
     */
    private double _valorTotalIssMes = 0;

    /**
     * keeps track of state for field: _valorTotalIssMes
     */
    private boolean _has_valorTotalIssMes;

    /**
     * Field _diaVencimento
     */
    private int _diaVencimento = 0;

    /**
     * keeps track of state for field: _diaVencimento
     */
    private boolean _has_diaVencimento;


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorrenciasPlanApuracao() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao2.response.OcorrenciasPlanApuracao()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAliquotaApuracao
     * 
     */
    public void deleteAliquotaApuracao()
    {
        this._has_aliquotaApuracao= false;
    } //-- void deleteAliquotaApuracao() 

    /**
     * Method deleteCodGrupo
     * 
     */
    public void deleteCodGrupo()
    {
        this._has_codGrupo= false;
    } //-- void deleteCodGrupo() 

    /**
     * Method deleteCodSubGrupo
     * 
     */
    public void deleteCodSubGrupo()
    {
        this._has_codSubGrupo= false;
    } //-- void deleteCodSubGrupo() 

    /**
     * Method deleteCodTipoServico
     * 
     */
    public void deleteCodTipoServico()
    {
        this._has_codTipoServico= false;
    } //-- void deleteCodTipoServico() 

    /**
     * Method deleteCodigoMesCompetencia
     * 
     */
    public void deleteCodigoMesCompetencia()
    {
        this._has_codigoMesCompetencia= false;
    } //-- void deleteCodigoMesCompetencia() 

    /**
     * Method deleteConta
     * 
     */
    public void deleteConta()
    {
        this._has_conta= false;
    } //-- void deleteConta() 

    /**
     * Method deleteDiaVencimento
     * 
     */
    public void deleteDiaVencimento()
    {
        this._has_diaVencimento= false;
    } //-- void deleteDiaVencimento() 

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteValorIss
     * 
     */
    public void deleteValorIss()
    {
        this._has_valorIss= false;
    } //-- void deleteValorIss() 

    /**
     * Method deleteValorReceita
     * 
     */
    public void deleteValorReceita()
    {
        this._has_valorReceita= false;
    } //-- void deleteValorReceita() 

    /**
     * Method deleteValorRedutorMes
     * 
     */
    public void deleteValorRedutorMes()
    {
        this._has_valorRedutorMes= false;
    } //-- void deleteValorRedutorMes() 

    /**
     * Method deleteValorTotalIssMes
     * 
     */
    public void deleteValorTotalIssMes()
    {
        this._has_valorTotalIssMes= false;
    } //-- void deleteValorTotalIssMes() 

    /**
     * Method deleteValorTotalReceitaMes
     * 
     */
    public void deleteValorTotalReceitaMes()
    {
        this._has_valorTotalReceitaMes= false;
    } //-- void deleteValorTotalReceitaMes() 

    /**
     * Returns the value of field 'aliquotaApuracao'.
     * 
     * @return double
     * @return the value of field 'aliquotaApuracao'.
     */
    public double getAliquotaApuracao()
    {
        return this._aliquotaApuracao;
    } //-- double getAliquotaApuracao() 

    /**
     * Returns the value of field 'codGrupo'.
     * 
     * @return int
     * @return the value of field 'codGrupo'.
     */
    public int getCodGrupo()
    {
        return this._codGrupo;
    } //-- int getCodGrupo() 

    /**
     * Returns the value of field 'codSubGrupo'.
     * 
     * @return int
     * @return the value of field 'codSubGrupo'.
     */
    public int getCodSubGrupo()
    {
        return this._codSubGrupo;
    } //-- int getCodSubGrupo() 

    /**
     * Returns the value of field 'codTipoServico'.
     * 
     * @return int
     * @return the value of field 'codTipoServico'.
     */
    public int getCodTipoServico()
    {
        return this._codTipoServico;
    } //-- int getCodTipoServico() 

    /**
     * Returns the value of field 'codigoMesCompetencia'.
     * 
     * @return int
     * @return the value of field 'codigoMesCompetencia'.
     */
    public int getCodigoMesCompetencia()
    {
        return this._codigoMesCompetencia;
    } //-- int getCodigoMesCompetencia() 

    /**
     * Returns the value of field 'conta'.
     * 
     * @return int
     * @return the value of field 'conta'.
     */
    public int getConta()
    {
        return this._conta;
    } //-- int getConta() 

    /**
     * Returns the value of field 'cosif'.
     * 
     * @return String
     * @return the value of field 'cosif'.
     */
    public java.lang.String getCosif()
    {
        return this._cosif;
    } //-- java.lang.String getCosif() 

    /**
     * Returns the value of field 'descContaContabil'.
     * 
     * @return String
     * @return the value of field 'descContaContabil'.
     */
    public java.lang.String getDescContaContabil()
    {
        return this._descContaContabil;
    } //-- java.lang.String getDescContaContabil() 

    /**
     * Returns the value of field 'descRazao'.
     * 
     * @return String
     * @return the value of field 'descRazao'.
     */
    public java.lang.String getDescRazao()
    {
        return this._descRazao;
    } //-- java.lang.String getDescRazao() 

    /**
     * Returns the value of field 'descTipoServico'.
     * 
     * @return String
     * @return the value of field 'descTipoServico'.
     */
    public java.lang.String getDescTipoServico()
    {
        return this._descTipoServico;
    } //-- java.lang.String getDescTipoServico() 

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
     * Returns the value of field 'itemLei'.
     * 
     * @return String
     * @return the value of field 'itemLei'.
     */
    public java.lang.String getItemLei()
    {
        return this._itemLei;
    } //-- java.lang.String getItemLei() 

    /**
     * Returns the value of field 'mesAnoApuracao'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracao'.
     */
    public int getMesAnoApuracao()
    {
        return this._mesAnoApuracao;
    } //-- int getMesAnoApuracao() 

    /**
     * Returns the value of field 'mesCompetencia'.
     * 
     * @return String
     * @return the value of field 'mesCompetencia'.
     */
    public java.lang.String getMesCompetencia()
    {
        return this._mesCompetencia;
    } //-- java.lang.String getMesCompetencia() 

    /**
     * Returns the value of field 'sinalIss'.
     * 
     * @return String
     * @return the value of field 'sinalIss'.
     */
    public java.lang.String getSinalIss()
    {
        return this._sinalIss;
    } //-- java.lang.String getSinalIss() 

    /**
     * Returns the value of field 'sinalReceita'.
     * 
     * @return String
     * @return the value of field 'sinalReceita'.
     */
    public java.lang.String getSinalReceita()
    {
        return this._sinalReceita;
    } //-- java.lang.String getSinalReceita() 

    /**
     * Returns the value of field 'sinalRedutorMes'.
     * 
     * @return String
     * @return the value of field 'sinalRedutorMes'.
     */
    public java.lang.String getSinalRedutorMes()
    {
        return this._sinalRedutorMes;
    } //-- java.lang.String getSinalRedutorMes() 

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
     * Returns the value of field 'valorIss'.
     * 
     * @return double
     * @return the value of field 'valorIss'.
     */
    public double getValorIss()
    {
        return this._valorIss;
    } //-- double getValorIss() 

    /**
     * Returns the value of field 'valorReceita'.
     * 
     * @return double
     * @return the value of field 'valorReceita'.
     */
    public double getValorReceita()
    {
        return this._valorReceita;
    } //-- double getValorReceita() 

    /**
     * Returns the value of field 'valorRedutorMes'.
     * 
     * @return double
     * @return the value of field 'valorRedutorMes'.
     */
    public double getValorRedutorMes()
    {
        return this._valorRedutorMes;
    } //-- double getValorRedutorMes() 

    /**
     * Returns the value of field 'valorTotalIssMes'.
     * 
     * @return double
     * @return the value of field 'valorTotalIssMes'.
     */
    public double getValorTotalIssMes()
    {
        return this._valorTotalIssMes;
    } //-- double getValorTotalIssMes() 

    /**
     * Returns the value of field 'valorTotalReceitaMes'.
     * 
     * @return double
     * @return the value of field 'valorTotalReceitaMes'.
     */
    public double getValorTotalReceitaMes()
    {
        return this._valorTotalReceitaMes;
    } //-- double getValorTotalReceitaMes() 

    /**
     * Method hasAliquotaApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAliquotaApuracao()
    {
        return this._has_aliquotaApuracao;
    } //-- boolean hasAliquotaApuracao() 

    /**
     * Method hasCodGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodGrupo()
    {
        return this._has_codGrupo;
    } //-- boolean hasCodGrupo() 

    /**
     * Method hasCodSubGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodSubGrupo()
    {
        return this._has_codSubGrupo;
    } //-- boolean hasCodSubGrupo() 

    /**
     * Method hasCodTipoServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodTipoServico()
    {
        return this._has_codTipoServico;
    } //-- boolean hasCodTipoServico() 

    /**
     * Method hasCodigoMesCompetencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMesCompetencia()
    {
        return this._has_codigoMesCompetencia;
    } //-- boolean hasCodigoMesCompetencia() 

    /**
     * Method hasConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasConta()
    {
        return this._has_conta;
    } //-- boolean hasConta() 

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
     * Method hasMesAnoApuracao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracao()
    {
        return this._has_mesAnoApuracao;
    } //-- boolean hasMesAnoApuracao() 

    /**
     * Method hasValorIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorIss()
    {
        return this._has_valorIss;
    } //-- boolean hasValorIss() 

    /**
     * Method hasValorReceita
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorReceita()
    {
        return this._has_valorReceita;
    } //-- boolean hasValorReceita() 

    /**
     * Method hasValorRedutorMes
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorRedutorMes()
    {
        return this._has_valorRedutorMes;
    } //-- boolean hasValorRedutorMes() 

    /**
     * Method hasValorTotalIssMes
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTotalIssMes()
    {
        return this._has_valorTotalIssMes;
    } //-- boolean hasValorTotalIssMes() 

    /**
     * Method hasValorTotalReceitaMes
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTotalReceitaMes()
    {
        return this._has_valorTotalReceitaMes;
    } //-- boolean hasValorTotalReceitaMes() 

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
     * Sets the value of field 'aliquotaApuracao'.
     * 
     * @param aliquotaApuracao the value of field 'aliquotaApuracao'
     */
    public void setAliquotaApuracao(double aliquotaApuracao)
    {
        this._aliquotaApuracao = aliquotaApuracao;
        this._has_aliquotaApuracao = true;
    } //-- void setAliquotaApuracao(double) 

    /**
     * Sets the value of field 'codGrupo'.
     * 
     * @param codGrupo the value of field 'codGrupo'.
     */
    public void setCodGrupo(int codGrupo)
    {
        this._codGrupo = codGrupo;
        this._has_codGrupo = true;
    } //-- void setCodGrupo(int) 

    /**
     * Sets the value of field 'codSubGrupo'.
     * 
     * @param codSubGrupo the value of field 'codSubGrupo'.
     */
    public void setCodSubGrupo(int codSubGrupo)
    {
        this._codSubGrupo = codSubGrupo;
        this._has_codSubGrupo = true;
    } //-- void setCodSubGrupo(int) 

    /**
     * Sets the value of field 'codTipoServico'.
     * 
     * @param codTipoServico the value of field 'codTipoServico'.
     */
    public void setCodTipoServico(int codTipoServico)
    {
        this._codTipoServico = codTipoServico;
        this._has_codTipoServico = true;
    } //-- void setCodTipoServico(int) 

    /**
     * Sets the value of field 'codigoMesCompetencia'.
     * 
     * @param codigoMesCompetencia the value of field
     * 'codigoMesCompetencia'.
     */
    public void setCodigoMesCompetencia(int codigoMesCompetencia)
    {
        this._codigoMesCompetencia = codigoMesCompetencia;
        this._has_codigoMesCompetencia = true;
    } //-- void setCodigoMesCompetencia(int) 

    /**
     * Sets the value of field 'conta'.
     * 
     * @param conta the value of field 'conta'.
     */
    public void setConta(int conta)
    {
        this._conta = conta;
        this._has_conta = true;
    } //-- void setConta(int) 

    /**
     * Sets the value of field 'cosif'.
     * 
     * @param cosif the value of field 'cosif'.
     */
    public void setCosif(java.lang.String cosif)
    {
        this._cosif = cosif;
    } //-- void setCosif(java.lang.String) 

    /**
     * Sets the value of field 'descContaContabil'.
     * 
     * @param descContaContabil the value of field
     * 'descContaContabil'.
     */
    public void setDescContaContabil(java.lang.String descContaContabil)
    {
        this._descContaContabil = descContaContabil;
    } //-- void setDescContaContabil(java.lang.String) 

    /**
     * Sets the value of field 'descRazao'.
     * 
     * @param descRazao the value of field 'descRazao'.
     */
    public void setDescRazao(java.lang.String descRazao)
    {
        this._descRazao = descRazao;
    } //-- void setDescRazao(java.lang.String) 

    /**
     * Sets the value of field 'descTipoServico'.
     * 
     * @param descTipoServico the value of field 'descTipoServico'.
     */
    public void setDescTipoServico(java.lang.String descTipoServico)
    {
        this._descTipoServico = descTipoServico;
    } //-- void setDescTipoServico(java.lang.String) 

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
     * Sets the value of field 'digConta'.
     * 
     * @param digConta the value of field 'digConta'.
     */
    public void setDigConta(java.lang.String digConta)
    {
        this._digConta = digConta;
    } //-- void setDigConta(java.lang.String) 

    /**
     * Sets the value of field 'itemLei'.
     * 
     * @param itemLei the value of field 'itemLei'.
     */
    public void setItemLei(java.lang.String itemLei)
    {
        this._itemLei = itemLei;
    } //-- void setItemLei(java.lang.String) 

    /**
     * Sets the value of field 'mesAnoApuracao'.
     * 
     * @param mesAnoApuracao the value of field 'mesAnoApuracao'.
     */
    public void setMesAnoApuracao(int mesAnoApuracao)
    {
        this._mesAnoApuracao = mesAnoApuracao;
        this._has_mesAnoApuracao = true;
    } //-- void setMesAnoApuracao(int) 

    /**
     * Sets the value of field 'mesCompetencia'.
     * 
     * @param mesCompetencia the value of field 'mesCompetencia'.
     */
    public void setMesCompetencia(java.lang.String mesCompetencia)
    {
        this._mesCompetencia = mesCompetencia;
    } //-- void setMesCompetencia(java.lang.String) 

    /**
     * Sets the value of field 'sinalIss'.
     * 
     * @param sinalIss the value of field 'sinalIss'.
     */
    public void setSinalIss(java.lang.String sinalIss)
    {
        this._sinalIss = sinalIss;
    } //-- void setSinalIss(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceita'.
     * 
     * @param sinalReceita the value of field 'sinalReceita'.
     */
    public void setSinalReceita(java.lang.String sinalReceita)
    {
        this._sinalReceita = sinalReceita;
    } //-- void setSinalReceita(java.lang.String) 

    /**
     * Sets the value of field 'sinalRedutorMes'.
     * 
     * @param sinalRedutorMes the value of field 'sinalRedutorMes'.
     */
    public void setSinalRedutorMes(java.lang.String sinalRedutorMes)
    {
        this._sinalRedutorMes = sinalRedutorMes;
    } //-- void setSinalRedutorMes(java.lang.String) 

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
     * Sets the value of field 'valorIss'.
     * 
     * @param valorIss the value of field 'valorIss'.
     */
    public void setValorIss(double valorIss)
    {
        this._valorIss = valorIss;
        this._has_valorIss = true;
    } //-- void setValorIss(double) 

    /**
     * Sets the value of field 'valorReceita'.
     * 
     * @param valorReceita the value of field 'valorReceita'.
     */
    public void setValorReceita(double valorReceita)
    {
        this._valorReceita = valorReceita;
        this._has_valorReceita = true;
    } //-- void setValorReceita(double) 

    /**
     * Sets the value of field 'valorRedutorMes'.
     * 
     * @param valorRedutorMes the value of field 'valorRedutorMes'.
     */
    public void setValorRedutorMes(double valorRedutorMes)
    {
        this._valorRedutorMes = valorRedutorMes;
        this._has_valorRedutorMes = true;
    } //-- void setValorRedutorMes(double) 

    /**
     * Sets the value of field 'valorTotalIssMes'.
     * 
     * @param valorTotalIssMes the value of field 'valorTotalIssMes'
     */
    public void setValorTotalIssMes(double valorTotalIssMes)
    {
        this._valorTotalIssMes = valorTotalIssMes;
        this._has_valorTotalIssMes = true;
    } //-- void setValorTotalIssMes(double) 

    /**
     * Sets the value of field 'valorTotalReceitaMes'.
     * 
     * @param valorTotalReceitaMes the value of field
     * 'valorTotalReceitaMes'.
     */
    public void setValorTotalReceitaMes(double valorTotalReceitaMes)
    {
        this._valorTotalReceitaMes = valorTotalReceitaMes;
        this._has_valorTotalReceitaMes = true;
    } //-- void setValorTotalReceitaMes(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorrenciasPlanApuracao
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao2.response.OcorrenciasPlanApuracao unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao2.response.OcorrenciasPlanApuracao) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao2.response.OcorrenciasPlanApuracao.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaplanilhaapuracao2.response.OcorrenciasPlanApuracao unmarshal(java.io.Reader) 

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
