/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaApurAposFechamentoNvConta.java,v 1.1 2018/05/21 14:33:49 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response;

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
 * Class ListaApurAposFechamentoNvConta.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/05/21 14:33:49 $
 */
public class ListaApurAposFechamentoNvConta implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

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
     * Field _sinalMovimento
     */
    private java.lang.String _sinalMovimento;

    /**
     * Field _valorMovimento
     */
    private java.math.BigDecimal _valorMovimento = new java.math.BigDecimal("0");

    /**
     * Field _sinalTributo
     */
    private java.lang.String _sinalTributo;

    /**
     * Field _valorTributo
     */
    private java.math.BigDecimal _valorTributo = new java.math.BigDecimal("0");

    /**
     * Field _percentAliquota
     */
    private java.math.BigDecimal _percentAliquota = new java.math.BigDecimal("0");

    /**
     * Field _sinalIss
     */
    private java.lang.String _sinalIss;

    /**
     * Field _valorIss
     */
    private java.math.BigDecimal _valorIss = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaApurAposFechamentoNvConta() 
     {
        super();
        setValorMovimento(new java.math.BigDecimal("0"));
        setValorTributo(new java.math.BigDecimal("0"));
        setPercentAliquota(new java.math.BigDecimal("0"));
        setValorIss(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta()


      //-----------/
     //- Methods -/
    //-----------/

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
     * Method deleteConta
     * 
     */
    public void deleteConta()
    {
        this._has_conta= false;
    } //-- void deleteConta() 

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
     * Returns the value of field 'percentAliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentAliquota'.
     */
    public java.math.BigDecimal getPercentAliquota()
    {
        return this._percentAliquota;
    } //-- java.math.BigDecimal getPercentAliquota() 

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
     * Returns the value of field 'sinalMovimento'.
     * 
     * @return String
     * @return the value of field 'sinalMovimento'.
     */
    public java.lang.String getSinalMovimento()
    {
        return this._sinalMovimento;
    } //-- java.lang.String getSinalMovimento() 

    /**
     * Returns the value of field 'sinalTributo'.
     * 
     * @return String
     * @return the value of field 'sinalTributo'.
     */
    public java.lang.String getSinalTributo()
    {
        return this._sinalTributo;
    } //-- java.lang.String getSinalTributo() 

    /**
     * Returns the value of field 'valorIss'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorIss'.
     */
    public java.math.BigDecimal getValorIss()
    {
        return this._valorIss;
    } //-- java.math.BigDecimal getValorIss() 

    /**
     * Returns the value of field 'valorMovimento'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorMovimento'.
     */
    public java.math.BigDecimal getValorMovimento()
    {
        return this._valorMovimento;
    } //-- java.math.BigDecimal getValorMovimento() 

    /**
     * Returns the value of field 'valorTributo'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTributo'.
     */
    public java.math.BigDecimal getValorTributo()
    {
        return this._valorTributo;
    } //-- java.math.BigDecimal getValorTributo() 

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
     * Sets the value of field 'digConta'.
     * 
     * @param digConta the value of field 'digConta'.
     */
    public void setDigConta(java.lang.String digConta)
    {
        this._digConta = digConta;
    } //-- void setDigConta(java.lang.String) 

    /**
     * Sets the value of field 'percentAliquota'.
     * 
     * @param percentAliquota the value of field 'percentAliquota'.
     */
    public void setPercentAliquota(java.math.BigDecimal percentAliquota)
    {
        this._percentAliquota = percentAliquota;
    } //-- void setPercentAliquota(java.math.BigDecimal) 

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
     * Sets the value of field 'sinalMovimento'.
     * 
     * @param sinalMovimento the value of field 'sinalMovimento'.
     */
    public void setSinalMovimento(java.lang.String sinalMovimento)
    {
        this._sinalMovimento = sinalMovimento;
    } //-- void setSinalMovimento(java.lang.String) 

    /**
     * Sets the value of field 'sinalTributo'.
     * 
     * @param sinalTributo the value of field 'sinalTributo'.
     */
    public void setSinalTributo(java.lang.String sinalTributo)
    {
        this._sinalTributo = sinalTributo;
    } //-- void setSinalTributo(java.lang.String) 

    /**
     * Sets the value of field 'valorIss'.
     * 
     * @param valorIss the value of field 'valorIss'.
     */
    public void setValorIss(java.math.BigDecimal valorIss)
    {
        this._valorIss = valorIss;
    } //-- void setValorIss(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorMovimento'.
     * 
     * @param valorMovimento the value of field 'valorMovimento'.
     */
    public void setValorMovimento(java.math.BigDecimal valorMovimento)
    {
        this._valorMovimento = valorMovimento;
    } //-- void setValorMovimento(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTributo'.
     * 
     * @param valorTributo the value of field 'valorTributo'.
     */
    public void setValorTributo(java.math.BigDecimal valorTributo)
    {
        this._valorTributo = valorTributo;
    } //-- void setValorTributo(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaApurAposFechamentoNvConta
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuraposfechamentonvconta.response.ListaApurAposFechamentoNvConta unmarshal(java.io.Reader) 

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
