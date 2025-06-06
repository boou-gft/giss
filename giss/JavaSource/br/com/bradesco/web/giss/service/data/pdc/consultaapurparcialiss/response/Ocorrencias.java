/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/09/19 18:34:54 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.response;

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
 * @version $Revision: 1.1 $ $Date: 2017/09/19 18:34:54 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _cosif
     */
    private long _cosif = 0;

    /**
     * keeps track of state for field: _cosif
     */
    private boolean _has_cosif;

    /**
     * Field _grupo
     */
    private int _grupo = 0;

    /**
     * keeps track of state for field: _grupo
     */
    private boolean _has_grupo;

    /**
     * Field _subGrupo
     */
    private int _subGrupo = 0;

    /**
     * keeps track of state for field: _subGrupo
     */
    private boolean _has_subGrupo;

    /**
     * Field _conta
     */
    private long _conta = 0;

    /**
     * keeps track of state for field: _conta
     */
    private boolean _has_conta;

    /**
     * Field _codigoPa
     */
    private int _codigoPa = 0;

    /**
     * keeps track of state for field: _codigoPa
     */
    private boolean _has_codigoPa;

    /**
     * Field _nomePa
     */
    private java.lang.String _nomePa;

    /**
     * Field _municipioPa
     */
    private java.lang.String _municipioPa;

    /**
     * Field _ufPa
     */
    private java.lang.String _ufPa;

    /**
     * Field _codigoAgencia
     */
    private int _codigoAgencia = 0;

    /**
     * keeps track of state for field: _codigoAgencia
     */
    private boolean _has_codigoAgencia;

    /**
     * Field _municipioAgencia
     */
    private java.lang.String _municipioAgencia;

    /**
     * Field _ufAgencia
     */
    private java.lang.String _ufAgencia;

    /**
     * Field _valorIss
     */
    private java.math.BigDecimal _valorIss = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
        setValorIss(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoAgencia
     * 
     */
    public void deleteCodigoAgencia()
    {
        this._has_codigoAgencia= false;
    } //-- void deleteCodigoAgencia() 

    /**
     * Method deleteCodigoPa
     * 
     */
    public void deleteCodigoPa()
    {
        this._has_codigoPa= false;
    } //-- void deleteCodigoPa() 

    /**
     * Method deleteConta
     * 
     */
    public void deleteConta()
    {
        this._has_conta= false;
    } //-- void deleteConta() 

    /**
     * Method deleteCosif
     * 
     */
    public void deleteCosif()
    {
        this._has_cosif= false;
    } //-- void deleteCosif() 

    /**
     * Method deleteGrupo
     * 
     */
    public void deleteGrupo()
    {
        this._has_grupo= false;
    } //-- void deleteGrupo() 

    /**
     * Method deleteSubGrupo
     * 
     */
    public void deleteSubGrupo()
    {
        this._has_subGrupo= false;
    } //-- void deleteSubGrupo() 

    /**
     * Returns the value of field 'codigoAgencia'.
     * 
     * @return int
     * @return the value of field 'codigoAgencia'.
     */
    public int getCodigoAgencia()
    {
        return this._codigoAgencia;
    } //-- int getCodigoAgencia() 

    /**
     * Returns the value of field 'codigoPa'.
     * 
     * @return int
     * @return the value of field 'codigoPa'.
     */
    public int getCodigoPa()
    {
        return this._codigoPa;
    } //-- int getCodigoPa() 

    /**
     * Returns the value of field 'conta'.
     * 
     * @return long
     * @return the value of field 'conta'.
     */
    public long getConta()
    {
        return this._conta;
    } //-- long getConta() 

    /**
     * Returns the value of field 'cosif'.
     * 
     * @return long
     * @return the value of field 'cosif'.
     */
    public long getCosif()
    {
        return this._cosif;
    } //-- long getCosif() 

    /**
     * Returns the value of field 'grupo'.
     * 
     * @return int
     * @return the value of field 'grupo'.
     */
    public int getGrupo()
    {
        return this._grupo;
    } //-- int getGrupo() 

    /**
     * Returns the value of field 'municipioAgencia'.
     * 
     * @return String
     * @return the value of field 'municipioAgencia'.
     */
    public java.lang.String getMunicipioAgencia()
    {
        return this._municipioAgencia;
    } //-- java.lang.String getMunicipioAgencia() 

    /**
     * Returns the value of field 'municipioPa'.
     * 
     * @return String
     * @return the value of field 'municipioPa'.
     */
    public java.lang.String getMunicipioPa()
    {
        return this._municipioPa;
    } //-- java.lang.String getMunicipioPa() 

    /**
     * Returns the value of field 'nomePa'.
     * 
     * @return String
     * @return the value of field 'nomePa'.
     */
    public java.lang.String getNomePa()
    {
        return this._nomePa;
    } //-- java.lang.String getNomePa() 

    /**
     * Returns the value of field 'subGrupo'.
     * 
     * @return int
     * @return the value of field 'subGrupo'.
     */
    public int getSubGrupo()
    {
        return this._subGrupo;
    } //-- int getSubGrupo() 

    /**
     * Returns the value of field 'ufAgencia'.
     * 
     * @return String
     * @return the value of field 'ufAgencia'.
     */
    public java.lang.String getUfAgencia()
    {
        return this._ufAgencia;
    } //-- java.lang.String getUfAgencia() 

    /**
     * Returns the value of field 'ufPa'.
     * 
     * @return String
     * @return the value of field 'ufPa'.
     */
    public java.lang.String getUfPa()
    {
        return this._ufPa;
    } //-- java.lang.String getUfPa() 

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
     * Method hasCodigoAgencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoAgencia()
    {
        return this._has_codigoAgencia;
    } //-- boolean hasCodigoAgencia() 

    /**
     * Method hasCodigoPa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPa()
    {
        return this._has_codigoPa;
    } //-- boolean hasCodigoPa() 

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
     * Method hasCosif
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCosif()
    {
        return this._has_cosif;
    } //-- boolean hasCosif() 

    /**
     * Method hasGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasGrupo()
    {
        return this._has_grupo;
    } //-- boolean hasGrupo() 

    /**
     * Method hasSubGrupo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSubGrupo()
    {
        return this._has_subGrupo;
    } //-- boolean hasSubGrupo() 

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
     * Sets the value of field 'codigoAgencia'.
     * 
     * @param codigoAgencia the value of field 'codigoAgencia'.
     */
    public void setCodigoAgencia(int codigoAgencia)
    {
        this._codigoAgencia = codigoAgencia;
        this._has_codigoAgencia = true;
    } //-- void setCodigoAgencia(int) 

    /**
     * Sets the value of field 'codigoPa'.
     * 
     * @param codigoPa the value of field 'codigoPa'.
     */
    public void setCodigoPa(int codigoPa)
    {
        this._codigoPa = codigoPa;
        this._has_codigoPa = true;
    } //-- void setCodigoPa(int) 

    /**
     * Sets the value of field 'conta'.
     * 
     * @param conta the value of field 'conta'.
     */
    public void setConta(long conta)
    {
        this._conta = conta;
        this._has_conta = true;
    } //-- void setConta(long) 

    /**
     * Sets the value of field 'cosif'.
     * 
     * @param cosif the value of field 'cosif'.
     */
    public void setCosif(long cosif)
    {
        this._cosif = cosif;
        this._has_cosif = true;
    } //-- void setCosif(long) 

    /**
     * Sets the value of field 'grupo'.
     * 
     * @param grupo the value of field 'grupo'.
     */
    public void setGrupo(int grupo)
    {
        this._grupo = grupo;
        this._has_grupo = true;
    } //-- void setGrupo(int) 

    /**
     * Sets the value of field 'municipioAgencia'.
     * 
     * @param municipioAgencia the value of field 'municipioAgencia'
     */
    public void setMunicipioAgencia(java.lang.String municipioAgencia)
    {
        this._municipioAgencia = municipioAgencia;
    } //-- void setMunicipioAgencia(java.lang.String) 

    /**
     * Sets the value of field 'municipioPa'.
     * 
     * @param municipioPa the value of field 'municipioPa'.
     */
    public void setMunicipioPa(java.lang.String municipioPa)
    {
        this._municipioPa = municipioPa;
    } //-- void setMunicipioPa(java.lang.String) 

    /**
     * Sets the value of field 'nomePa'.
     * 
     * @param nomePa the value of field 'nomePa'.
     */
    public void setNomePa(java.lang.String nomePa)
    {
        this._nomePa = nomePa;
    } //-- void setNomePa(java.lang.String) 

    /**
     * Sets the value of field 'subGrupo'.
     * 
     * @param subGrupo the value of field 'subGrupo'.
     */
    public void setSubGrupo(int subGrupo)
    {
        this._subGrupo = subGrupo;
        this._has_subGrupo = true;
    } //-- void setSubGrupo(int) 

    /**
     * Sets the value of field 'ufAgencia'.
     * 
     * @param ufAgencia the value of field 'ufAgencia'.
     */
    public void setUfAgencia(java.lang.String ufAgencia)
    {
        this._ufAgencia = ufAgencia;
    } //-- void setUfAgencia(java.lang.String) 

    /**
     * Sets the value of field 'ufPa'.
     * 
     * @param ufPa the value of field 'ufPa'.
     */
    public void setUfPa(java.lang.String ufPa)
    {
        this._ufPa = ufPa;
    } //-- void setUfPa(java.lang.String) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaapurparcialiss.response.Ocorrencias unmarshal(java.io.Reader) 

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
