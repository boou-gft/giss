/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.3 2017/12/14 16:00:44 gabrielmarani Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response;

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
 * @version $Revision: 1.3 $ $Date: 2017/12/14 16:00:44 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoConta
     */
    private java.lang.String _codigoConta;

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
     * Field _numeroConta
     */
    private int _numeroConta = 0;

    /**
     * keeps track of state for field: _numeroConta
     */
    private boolean _has_numeroConta;

    /**
     * Field _digitoConta
     */
    private java.lang.String _digitoConta;

    /**
     * Field _descricaoRazao
     */
    private java.lang.String _descricaoRazao;

    /**
     * Field _percentualAliquota
     */
    private java.math.BigDecimal _percentualAliquota = new java.math.BigDecimal("0");

    /**
     * Field _codigoTributo
     */
    private int _codigoTributo = 0;

    /**
     * keeps track of state for field: _codigoTributo
     */
    private boolean _has_codigoTributo;

    /**
     * Field _dtInicioVigencia
     */
    private java.lang.String _dtInicioVigencia;

    /**
     * Field _dtFinalVigencia
     */
    private java.lang.String _dtFinalVigencia;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
        setPercentualAliquota(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.Ocorrencias()


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
     * Method deleteCodigoTributo
     * 
     */
    public void deleteCodigoTributo()
    {
        this._has_codigoTributo= false;
    } //-- void deleteCodigoTributo() 

    /**
     * Method deleteNumeroConta
     * 
     */
    public void deleteNumeroConta()
    {
        this._has_numeroConta= false;
    } //-- void deleteNumeroConta() 

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
     * Returns the value of field 'codigoConta'.
     * 
     * @return String
     * @return the value of field 'codigoConta'.
     */
    public java.lang.String getCodigoConta()
    {
        return this._codigoConta;
    } //-- java.lang.String getCodigoConta() 

    /**
     * Returns the value of field 'codigoTributo'.
     * 
     * @return int
     * @return the value of field 'codigoTributo'.
     */
    public int getCodigoTributo()
    {
        return this._codigoTributo;
    } //-- int getCodigoTributo() 

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
     * Returns the value of field 'digitoConta'.
     * 
     * @return String
     * @return the value of field 'digitoConta'.
     */
    public java.lang.String getDigitoConta()
    {
        return this._digitoConta;
    } //-- java.lang.String getDigitoConta() 

    /**
     * Returns the value of field 'dtFinalVigencia'.
     * 
     * @return String
     * @return the value of field 'dtFinalVigencia'.
     */
    public java.lang.String getDtFinalVigencia()
    {
        return this._dtFinalVigencia;
    } //-- java.lang.String getDtFinalVigencia() 

    /**
     * Returns the value of field 'dtInicioVigencia'.
     * 
     * @return String
     * @return the value of field 'dtInicioVigencia'.
     */
    public java.lang.String getDtInicioVigencia()
    {
        return this._dtInicioVigencia;
    } //-- java.lang.String getDtInicioVigencia() 

    /**
     * Returns the value of field 'numeroConta'.
     * 
     * @return int
     * @return the value of field 'numeroConta'.
     */
    public int getNumeroConta()
    {
        return this._numeroConta;
    } //-- int getNumeroConta() 

    /**
     * Returns the value of field 'percentualAliquota'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentualAliquota'.
     */
    public java.math.BigDecimal getPercentualAliquota()
    {
        return this._percentualAliquota;
    } //-- java.math.BigDecimal getPercentualAliquota() 

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
     * Method hasCodigoTributo
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoTributo()
    {
        return this._has_codigoTributo;
    } //-- boolean hasCodigoTributo() 

    /**
     * Method hasNumeroConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroConta()
    {
        return this._has_numeroConta;
    } //-- boolean hasNumeroConta() 

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
     * Sets the value of field 'codigoConta'.
     * 
     * @param codigoConta the value of field 'codigoConta'.
     */
    public void setCodigoConta(java.lang.String codigoConta)
    {
        this._codigoConta = codigoConta;
    } //-- void setCodigoConta(java.lang.String) 

    /**
     * Sets the value of field 'codigoTributo'.
     * 
     * @param codigoTributo the value of field 'codigoTributo'.
     */
    public void setCodigoTributo(int codigoTributo)
    {
        this._codigoTributo = codigoTributo;
        this._has_codigoTributo = true;
    } //-- void setCodigoTributo(int) 

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
     * Sets the value of field 'digitoConta'.
     * 
     * @param digitoConta the value of field 'digitoConta'.
     */
    public void setDigitoConta(java.lang.String digitoConta)
    {
        this._digitoConta = digitoConta;
    } //-- void setDigitoConta(java.lang.String) 

    /**
     * Sets the value of field 'dtFinalVigencia'.
     * 
     * @param dtFinalVigencia the value of field 'dtFinalVigencia'.
     */
    public void setDtFinalVigencia(java.lang.String dtFinalVigencia)
    {
        this._dtFinalVigencia = dtFinalVigencia;
    } //-- void setDtFinalVigencia(java.lang.String) 

    /**
     * Sets the value of field 'dtInicioVigencia'.
     * 
     * @param dtInicioVigencia the value of field 'dtInicioVigencia'
     */
    public void setDtInicioVigencia(java.lang.String dtInicioVigencia)
    {
        this._dtInicioVigencia = dtInicioVigencia;
    } //-- void setDtInicioVigencia(java.lang.String) 

    /**
     * Sets the value of field 'numeroConta'.
     * 
     * @param numeroConta the value of field 'numeroConta'.
     */
    public void setNumeroConta(int numeroConta)
    {
        this._numeroConta = numeroConta;
        this._has_numeroConta = true;
    } //-- void setNumeroConta(int) 

    /**
     * Sets the value of field 'percentualAliquota'.
     * 
     * @param percentualAliquota the value of field
     * 'percentualAliquota'.
     */
    public void setPercentualAliquota(java.math.BigDecimal percentualAliquota)
    {
        this._percentualAliquota = percentualAliquota;
    } //-- void setPercentualAliquota(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontastiposervico.response.Ocorrencias unmarshal(java.io.Reader) 

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
