/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response;

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
 * Class ListaApuracaoMensalNvConta.
 * 
 * @version $Revision$ $Date$
 */
public class ListaApuracaoMensalNvConta implements java.io.Serializable {


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
     * Field _sinalConta
     */
    private java.lang.String _sinalConta;

    /**
     * Field _valorConta
     */
    private double _valorConta = 0;

    /**
     * keeps track of state for field: _valorConta
     */
    private boolean _has_valorConta;

    /**
     * Field _sinalTributo
     */
    private java.lang.String _sinalTributo;

    /**
     * Field _valorTributo
     */
    private double _valorTributo = 0;

    /**
     * keeps track of state for field: _valorTributo
     */
    private boolean _has_valorTributo;

    /**
     * Field _percentAliquota
     */
    private double _percentAliquota = 0;

    /**
     * keeps track of state for field: _percentAliquota
     */
    private boolean _has_percentAliquota;

    /**
     * Field _sinaltributavel
     */
    private java.lang.String _sinaltributavel;

    /**
     * Field _valorTributavel
     */
    private double _valorTributavel = 0;

    /**
     * keeps track of state for field: _valorTributavel
     */
    private boolean _has_valorTributavel;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaApuracaoMensalNvConta() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta()


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
     * Method deletePercentAliquota
     * 
     */
    public void deletePercentAliquota()
    {
        this._has_percentAliquota= false;
    } //-- void deletePercentAliquota() 

    /**
     * Method deleteValorConta
     * 
     */
    public void deleteValorConta()
    {
        this._has_valorConta= false;
    } //-- void deleteValorConta() 

    /**
     * Method deleteValorTributavel
     * 
     */
    public void deleteValorTributavel()
    {
        this._has_valorTributavel= false;
    } //-- void deleteValorTributavel() 

    /**
     * Method deleteValorTributo
     * 
     */
    public void deleteValorTributo()
    {
        this._has_valorTributo= false;
    } //-- void deleteValorTributo() 

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
     * @return double
     * @return the value of field 'percentAliquota'.
     */
    public double getPercentAliquota()
    {
        return this._percentAliquota;
    } //-- double getPercentAliquota() 

    /**
     * Returns the value of field 'sinalConta'.
     * 
     * @return String
     * @return the value of field 'sinalConta'.
     */
    public java.lang.String getSinalConta()
    {
        return this._sinalConta;
    } //-- java.lang.String getSinalConta() 

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
     * Returns the value of field 'sinaltributavel'.
     * 
     * @return String
     * @return the value of field 'sinaltributavel'.
     */
    public java.lang.String getSinaltributavel()
    {
        return this._sinaltributavel;
    } //-- java.lang.String getSinaltributavel() 

    /**
     * Returns the value of field 'valorConta'.
     * 
     * @return double
     * @return the value of field 'valorConta'.
     */
    public double getValorConta()
    {
        return this._valorConta;
    } //-- double getValorConta() 

    /**
     * Returns the value of field 'valorTributavel'.
     * 
     * @return double
     * @return the value of field 'valorTributavel'.
     */
    public double getValorTributavel()
    {
        return this._valorTributavel;
    } //-- double getValorTributavel() 

    /**
     * Returns the value of field 'valorTributo'.
     * 
     * @return double
     * @return the value of field 'valorTributo'.
     */
    public double getValorTributo()
    {
        return this._valorTributo;
    } //-- double getValorTributo() 

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
     * Method hasPercentAliquota
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPercentAliquota()
    {
        return this._has_percentAliquota;
    } //-- boolean hasPercentAliquota() 

    /**
     * Method hasValorConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorConta()
    {
        return this._has_valorConta;
    } //-- boolean hasValorConta() 

    /**
     * Method hasValorTributavel
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTributavel()
    {
        return this._has_valorTributavel;
    } //-- boolean hasValorTributavel() 

    /**
     * Method hasValorTributo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorTributo()
    {
        return this._has_valorTributo;
    } //-- boolean hasValorTributo() 

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
    public void setPercentAliquota(double percentAliquota)
    {
        this._percentAliquota = percentAliquota;
        this._has_percentAliquota = true;
    } //-- void setPercentAliquota(double) 

    /**
     * Sets the value of field 'sinalConta'.
     * 
     * @param sinalConta the value of field 'sinalConta'.
     */
    public void setSinalConta(java.lang.String sinalConta)
    {
        this._sinalConta = sinalConta;
    } //-- void setSinalConta(java.lang.String) 

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
     * Sets the value of field 'sinaltributavel'.
     * 
     * @param sinaltributavel the value of field 'sinaltributavel'.
     */
    public void setSinaltributavel(java.lang.String sinaltributavel)
    {
        this._sinaltributavel = sinaltributavel;
    } //-- void setSinaltributavel(java.lang.String) 

    /**
     * Sets the value of field 'valorConta'.
     * 
     * @param valorConta the value of field 'valorConta'.
     */
    public void setValorConta(double valorConta)
    {
        this._valorConta = valorConta;
        this._has_valorConta = true;
    } //-- void setValorConta(double) 

    /**
     * Sets the value of field 'valorTributavel'.
     * 
     * @param valorTributavel the value of field 'valorTributavel'.
     */
    public void setValorTributavel(double valorTributavel)
    {
        this._valorTributavel = valorTributavel;
        this._has_valorTributavel = true;
    } //-- void setValorTributavel(double) 

    /**
     * Sets the value of field 'valorTributo'.
     * 
     * @param valorTributo the value of field 'valorTributo'.
     */
    public void setValorTributo(double valorTributo)
    {
        this._valorTributo = valorTributo;
        this._has_valorTributo = true;
    } //-- void setValorTributo(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaApuracaoMensalNvConta
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensalnvconta.response.ListaApuracaoMensalNvConta unmarshal(java.io.Reader) 

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
