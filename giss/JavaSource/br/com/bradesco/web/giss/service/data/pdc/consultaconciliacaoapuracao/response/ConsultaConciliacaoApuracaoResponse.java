/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ConsultaConciliacaoApuracaoResponse.java,v 1.1 2017/09/19 18:34:46 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultaconciliacaoapuracao.response;

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
 * Class ConsultaConciliacaoApuracaoResponse.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/09/19 18:34:46 $
 */
public class ConsultaConciliacaoApuracaoResponse implements java.io.Serializable {


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
     * Field _valorReceita
     */
    private java.math.BigDecimal _valorReceita = new java.math.BigDecimal("0");

    /**
     * Field _valorReceitaTotal
     */
    private java.math.BigDecimal _valorReceitaTotal = new java.math.BigDecimal("0");

    /**
     * Field _valorReceitaDiferenca
     */
    private java.math.BigDecimal _valorReceitaDiferenca = new java.math.BigDecimal("0");

    /**
     * Field _balancete
     */
    private java.math.BigDecimal _balancete = new java.math.BigDecimal("0");

    /**
     * Field _aliquotaZerada
     */
    private java.math.BigDecimal _aliquotaZerada = new java.math.BigDecimal("0");

    /**
     * Field _oscilacaoNegativa
     */
    private java.math.BigDecimal _oscilacaoNegativa = new java.math.BigDecimal("0");

    /**
     * Field _subTotalUm
     */
    private java.math.BigDecimal _subTotalUm = new java.math.BigDecimal("0");

    /**
     * Field _subTotalDois
     */
    private java.math.BigDecimal _subTotalDois = new java.math.BigDecimal("0");

    /**
     * Field _ajuste
     */
    private java.math.BigDecimal _ajuste = new java.math.BigDecimal("0");

    /**
     * Field _conciliacaoFinal
     */
    private java.math.BigDecimal _conciliacaoFinal = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public ConsultaConciliacaoApuracaoResponse() 
     {
        super();
        setValorReceita(new java.math.BigDecimal("0"));
        setValorReceitaTotal(new java.math.BigDecimal("0"));
        setValorReceitaDiferenca(new java.math.BigDecimal("0"));
        setBalancete(new java.math.BigDecimal("0"));
        setAliquotaZerada(new java.math.BigDecimal("0"));
        setOscilacaoNegativa(new java.math.BigDecimal("0"));
        setSubTotalUm(new java.math.BigDecimal("0"));
        setSubTotalDois(new java.math.BigDecimal("0"));
        setAjuste(new java.math.BigDecimal("0"));
        setConciliacaoFinal(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaconciliacaoapuracao.response.ConsultaConciliacaoApuracaoResponse()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'ajuste'.
     * 
     * @return BigDecimal
     * @return the value of field 'ajuste'.
     */
    public java.math.BigDecimal getAjuste()
    {
        return this._ajuste;
    } //-- java.math.BigDecimal getAjuste() 

    /**
     * Returns the value of field 'aliquotaZerada'.
     * 
     * @return BigDecimal
     * @return the value of field 'aliquotaZerada'.
     */
    public java.math.BigDecimal getAliquotaZerada()
    {
        return this._aliquotaZerada;
    } //-- java.math.BigDecimal getAliquotaZerada() 

    /**
     * Returns the value of field 'balancete'.
     * 
     * @return BigDecimal
     * @return the value of field 'balancete'.
     */
    public java.math.BigDecimal getBalancete()
    {
        return this._balancete;
    } //-- java.math.BigDecimal getBalancete() 

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
     * Returns the value of field 'conciliacaoFinal'.
     * 
     * @return BigDecimal
     * @return the value of field 'conciliacaoFinal'.
     */
    public java.math.BigDecimal getConciliacaoFinal()
    {
        return this._conciliacaoFinal;
    } //-- java.math.BigDecimal getConciliacaoFinal() 

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
     * Returns the value of field 'oscilacaoNegativa'.
     * 
     * @return BigDecimal
     * @return the value of field 'oscilacaoNegativa'.
     */
    public java.math.BigDecimal getOscilacaoNegativa()
    {
        return this._oscilacaoNegativa;
    } //-- java.math.BigDecimal getOscilacaoNegativa() 

    /**
     * Returns the value of field 'subTotalDois'.
     * 
     * @return BigDecimal
     * @return the value of field 'subTotalDois'.
     */
    public java.math.BigDecimal getSubTotalDois()
    {
        return this._subTotalDois;
    } //-- java.math.BigDecimal getSubTotalDois() 

    /**
     * Returns the value of field 'subTotalUm'.
     * 
     * @return BigDecimal
     * @return the value of field 'subTotalUm'.
     */
    public java.math.BigDecimal getSubTotalUm()
    {
        return this._subTotalUm;
    } //-- java.math.BigDecimal getSubTotalUm() 

    /**
     * Returns the value of field 'valorReceita'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorReceita'.
     */
    public java.math.BigDecimal getValorReceita()
    {
        return this._valorReceita;
    } //-- java.math.BigDecimal getValorReceita() 

    /**
     * Returns the value of field 'valorReceitaDiferenca'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorReceitaDiferenca'.
     */
    public java.math.BigDecimal getValorReceitaDiferenca()
    {
        return this._valorReceitaDiferenca;
    } //-- java.math.BigDecimal getValorReceitaDiferenca() 

    /**
     * Returns the value of field 'valorReceitaTotal'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorReceitaTotal'.
     */
    public java.math.BigDecimal getValorReceitaTotal()
    {
        return this._valorReceitaTotal;
    } //-- java.math.BigDecimal getValorReceitaTotal() 

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
     * Sets the value of field 'ajuste'.
     * 
     * @param ajuste the value of field 'ajuste'.
     */
    public void setAjuste(java.math.BigDecimal ajuste)
    {
        this._ajuste = ajuste;
    } //-- void setAjuste(java.math.BigDecimal) 

    /**
     * Sets the value of field 'aliquotaZerada'.
     * 
     * @param aliquotaZerada the value of field 'aliquotaZerada'.
     */
    public void setAliquotaZerada(java.math.BigDecimal aliquotaZerada)
    {
        this._aliquotaZerada = aliquotaZerada;
    } //-- void setAliquotaZerada(java.math.BigDecimal) 

    /**
     * Sets the value of field 'balancete'.
     * 
     * @param balancete the value of field 'balancete'.
     */
    public void setBalancete(java.math.BigDecimal balancete)
    {
        this._balancete = balancete;
    } //-- void setBalancete(java.math.BigDecimal) 

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
     * Sets the value of field 'conciliacaoFinal'.
     * 
     * @param conciliacaoFinal the value of field 'conciliacaoFinal'
     */
    public void setConciliacaoFinal(java.math.BigDecimal conciliacaoFinal)
    {
        this._conciliacaoFinal = conciliacaoFinal;
    } //-- void setConciliacaoFinal(java.math.BigDecimal) 

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
     * Sets the value of field 'oscilacaoNegativa'.
     * 
     * @param oscilacaoNegativa the value of field
     * 'oscilacaoNegativa'.
     */
    public void setOscilacaoNegativa(java.math.BigDecimal oscilacaoNegativa)
    {
        this._oscilacaoNegativa = oscilacaoNegativa;
    } //-- void setOscilacaoNegativa(java.math.BigDecimal) 

    /**
     * Sets the value of field 'subTotalDois'.
     * 
     * @param subTotalDois the value of field 'subTotalDois'.
     */
    public void setSubTotalDois(java.math.BigDecimal subTotalDois)
    {
        this._subTotalDois = subTotalDois;
    } //-- void setSubTotalDois(java.math.BigDecimal) 

    /**
     * Sets the value of field 'subTotalUm'.
     * 
     * @param subTotalUm the value of field 'subTotalUm'.
     */
    public void setSubTotalUm(java.math.BigDecimal subTotalUm)
    {
        this._subTotalUm = subTotalUm;
    } //-- void setSubTotalUm(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorReceita'.
     * 
     * @param valorReceita the value of field 'valorReceita'.
     */
    public void setValorReceita(java.math.BigDecimal valorReceita)
    {
        this._valorReceita = valorReceita;
    } //-- void setValorReceita(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorReceitaDiferenca'.
     * 
     * @param valorReceitaDiferenca the value of field
     * 'valorReceitaDiferenca'.
     */
    public void setValorReceitaDiferenca(java.math.BigDecimal valorReceitaDiferenca)
    {
        this._valorReceitaDiferenca = valorReceitaDiferenca;
    } //-- void setValorReceitaDiferenca(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorReceitaTotal'.
     * 
     * @param valorReceitaTotal the value of field
     * 'valorReceitaTotal'.
     */
    public void setValorReceitaTotal(java.math.BigDecimal valorReceitaTotal)
    {
        this._valorReceitaTotal = valorReceitaTotal;
    } //-- void setValorReceitaTotal(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ConsultaConciliacaoApuracaoResponse
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultaconciliacaoapuracao.response.ConsultaConciliacaoApuracaoResponse unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultaconciliacaoapuracao.response.ConsultaConciliacaoApuracaoResponse) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultaconciliacaoapuracao.response.ConsultaConciliacaoApuracaoResponse.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaconciliacaoapuracao.response.ConsultaConciliacaoApuracaoResponse unmarshal(java.io.Reader) 

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
