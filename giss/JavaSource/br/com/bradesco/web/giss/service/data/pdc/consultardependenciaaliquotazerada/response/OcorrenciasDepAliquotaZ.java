/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: OcorrenciasDepAliquotaZ.java,v 1.4 2018/04/24 02:26:48 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response;

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
 * Class OcorrenciasDepAliquotaZ.
 * 
 * @version $Revision: 1.4 $ $Date: 2018/04/24 02:26:48 $
 */
public class OcorrenciasDepAliquotaZ implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codPessoaJuridOcor
     */
    private long _codPessoaJuridOcor = 0;

    /**
     * keeps track of state for field: _codPessoaJuridOcor
     */
    private boolean _has_codPessoaJuridOcor;

    /**
     * Field _numSeqUnidadeOrganizacional
     */
    private int _numSeqUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field: _numSeqUnidadeOrganizacional
     */
    private boolean _has_numSeqUnidadeOrganizacional;

    /**
     * Field _codDependencia
     */
    private java.lang.String _codDependencia;

    /**
     * Field _descDependencia
     */
    private java.lang.String _descDependencia;

    /**
     * Field _codPa
     */
    private java.lang.String _codPa;

    /**
     * Field _descPa
     */
    private java.lang.String _descPa;

    /**
     * Field _sinalApuracao
     */
    private java.lang.String _sinalApuracao;

    /**
     * Field _valorApuracao
     */
    private java.math.BigDecimal _valorApuracao = new java.math.BigDecimal("0");

    /**
     * Field _mesAnoApuracao
     */
    private int _mesAnoApuracao = 0;

    /**
     * keeps track of state for field: _mesAnoApuracao
     */
    private boolean _has_mesAnoApuracao;


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorrenciasDepAliquotaZ() 
     {
        super();
        setValorApuracao(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodPessoaJuridOcor
     * 
     */
    public void deleteCodPessoaJuridOcor()
    {
        this._has_codPessoaJuridOcor= false;
    } //-- void deleteCodPessoaJuridOcor() 

    /**
     * Method deleteMesAnoApuracao
     * 
     */
    public void deleteMesAnoApuracao()
    {
        this._has_mesAnoApuracao= false;
    } //-- void deleteMesAnoApuracao() 

    /**
     * Method deleteNumSeqUnidadeOrganizacional
     * 
     */
    public void deleteNumSeqUnidadeOrganizacional()
    {
        this._has_numSeqUnidadeOrganizacional= false;
    } //-- void deleteNumSeqUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return String
     * @return the value of field 'codDependencia'.
     */
    public java.lang.String getCodDependencia()
    {
        return this._codDependencia;
    } //-- java.lang.String getCodDependencia() 

    /**
     * Returns the value of field 'codPa'.
     * 
     * @return String
     * @return the value of field 'codPa'.
     */
    public java.lang.String getCodPa()
    {
        return this._codPa;
    } //-- java.lang.String getCodPa() 

    /**
     * Returns the value of field 'codPessoaJuridOcor'.
     * 
     * @return long
     * @return the value of field 'codPessoaJuridOcor'.
     */
    public long getCodPessoaJuridOcor()
    {
        return this._codPessoaJuridOcor;
    } //-- long getCodPessoaJuridOcor() 

    /**
     * Returns the value of field 'descDependencia'.
     * 
     * @return String
     * @return the value of field 'descDependencia'.
     */
    public java.lang.String getDescDependencia()
    {
        return this._descDependencia;
    } //-- java.lang.String getDescDependencia() 

    /**
     * Returns the value of field 'descPa'.
     * 
     * @return String
     * @return the value of field 'descPa'.
     */
    public java.lang.String getDescPa()
    {
        return this._descPa;
    } //-- java.lang.String getDescPa() 

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
     * Returns the value of field 'numSeqUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field 'numSeqUnidadeOrganizacional'.
     */
    public int getNumSeqUnidadeOrganizacional()
    {
        return this._numSeqUnidadeOrganizacional;
    } //-- int getNumSeqUnidadeOrganizacional() 

    /**
     * Returns the value of field 'sinalApuracao'.
     * 
     * @return String
     * @return the value of field 'sinalApuracao'.
     */
    public java.lang.String getSinalApuracao()
    {
        return this._sinalApuracao;
    } //-- java.lang.String getSinalApuracao() 

    /**
     * Returns the value of field 'valorApuracao'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorApuracao'.
     */
    public java.math.BigDecimal getValorApuracao()
    {
        return this._valorApuracao;
    } //-- java.math.BigDecimal getValorApuracao() 

    /**
     * Method hasCodPessoaJuridOcor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJuridOcor()
    {
        return this._has_codPessoaJuridOcor;
    } //-- boolean hasCodPessoaJuridOcor() 

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
     * Method hasNumSeqUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSeqUnidadeOrganizacional()
    {
        return this._has_numSeqUnidadeOrganizacional;
    } //-- boolean hasNumSeqUnidadeOrganizacional() 

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
     * Sets the value of field 'codDependencia'.
     * 
     * @param codDependencia the value of field 'codDependencia'.
     */
    public void setCodDependencia(java.lang.String codDependencia)
    {
        this._codDependencia = codDependencia;
    } //-- void setCodDependencia(java.lang.String) 

    /**
     * Sets the value of field 'codPa'.
     * 
     * @param codPa the value of field 'codPa'.
     */
    public void setCodPa(java.lang.String codPa)
    {
        this._codPa = codPa;
    } //-- void setCodPa(java.lang.String) 

    /**
     * Sets the value of field 'codPessoaJuridOcor'.
     * 
     * @param codPessoaJuridOcor the value of field
     * 'codPessoaJuridOcor'.
     */
    public void setCodPessoaJuridOcor(long codPessoaJuridOcor)
    {
        this._codPessoaJuridOcor = codPessoaJuridOcor;
        this._has_codPessoaJuridOcor = true;
    } //-- void setCodPessoaJuridOcor(long) 

    /**
     * Sets the value of field 'descDependencia'.
     * 
     * @param descDependencia the value of field 'descDependencia'.
     */
    public void setDescDependencia(java.lang.String descDependencia)
    {
        this._descDependencia = descDependencia;
    } //-- void setDescDependencia(java.lang.String) 

    /**
     * Sets the value of field 'descPa'.
     * 
     * @param descPa the value of field 'descPa'.
     */
    public void setDescPa(java.lang.String descPa)
    {
        this._descPa = descPa;
    } //-- void setDescPa(java.lang.String) 

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
     * Sets the value of field 'numSeqUnidadeOrganizacional'.
     * 
     * @param numSeqUnidadeOrganizacional the value of field
     * 'numSeqUnidadeOrganizacional'.
     */
    public void setNumSeqUnidadeOrganizacional(int numSeqUnidadeOrganizacional)
    {
        this._numSeqUnidadeOrganizacional = numSeqUnidadeOrganizacional;
        this._has_numSeqUnidadeOrganizacional = true;
    } //-- void setNumSeqUnidadeOrganizacional(int) 

    /**
     * Sets the value of field 'sinalApuracao'.
     * 
     * @param sinalApuracao the value of field 'sinalApuracao'.
     */
    public void setSinalApuracao(java.lang.String sinalApuracao)
    {
        this._sinalApuracao = sinalApuracao;
    } //-- void setSinalApuracao(java.lang.String) 

    /**
     * Sets the value of field 'valorApuracao'.
     * 
     * @param valorApuracao the value of field 'valorApuracao'.
     */
    public void setValorApuracao(java.math.BigDecimal valorApuracao)
    {
        this._valorApuracao = valorApuracao;
    } //-- void setValorApuracao(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorrenciasDepAliquotaZ
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultardependenciaaliquotazerada.response.OcorrenciasDepAliquotaZ unmarshal(java.io.Reader) 

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
