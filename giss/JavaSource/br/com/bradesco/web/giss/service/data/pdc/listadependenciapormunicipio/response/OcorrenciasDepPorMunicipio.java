/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response;

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
 * Class OcorrenciasDepPorMunicipio.
 * 
 * @version $Revision$ $Date$
 */
public class OcorrenciasDepPorMunicipio implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codUnidadeOrganizacional
     */
    private int _codUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field: _codUnidadeOrganizacional
     */
    private boolean _has_codUnidadeOrganizacional;

    /**
     * Field _descUnidadeOrganizacional
     */
    private java.lang.String _descUnidadeOrganizacional;

    /**
     * Field _tragSemTrag
     */
    private java.lang.String _tragSemTrag;

    /**
     * Field _dataAtualizacao
     */
    private java.lang.String _dataAtualizacao;

    /**
     * Field _horaAtualizacao
     */
    private java.lang.String _horaAtualizacao;

    /**
     * Field _dataExclusao
     */
    private java.lang.String _dataExclusao;

    /**
     * Field _codPessoaJuridica
     */
    private long _codPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codPessoaJuridica
     */
    private boolean _has_codPessoaJuridica;

    /**
     * Field _numSeqUnidadeOrganizacional
     */
    private int _numSeqUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field: _numSeqUnidadeOrganizacional
     */
    private boolean _has_numSeqUnidadeOrganizacional;

    /**
     * Field _timeStamp
     */
    private java.lang.String _timeStamp;

    /**
     * Field _codigoFuncional
     */
    private java.lang.String _codigoFuncional;


      //----------------/
     //- Constructors -/
    //----------------/

    public OcorrenciasDepPorMunicipio() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodPessoaJuridica
     * 
     */
    public void deleteCodPessoaJuridica()
    {
        this._has_codPessoaJuridica= false;
    } //-- void deleteCodPessoaJuridica() 

    /**
     * Method deleteCodUnidadeOrganizacional
     * 
     */
    public void deleteCodUnidadeOrganizacional()
    {
        this._has_codUnidadeOrganizacional= false;
    } //-- void deleteCodUnidadeOrganizacional() 

    /**
     * Method deleteNumSeqUnidadeOrganizacional
     * 
     */
    public void deleteNumSeqUnidadeOrganizacional()
    {
        this._has_numSeqUnidadeOrganizacional= false;
    } //-- void deleteNumSeqUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codPessoaJuridica'.
     */
    public long getCodPessoaJuridica()
    {
        return this._codPessoaJuridica;
    } //-- long getCodPessoaJuridica() 

    /**
     * Returns the value of field 'codUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field 'codUnidadeOrganizacional'.
     */
    public int getCodUnidadeOrganizacional()
    {
        return this._codUnidadeOrganizacional;
    } //-- int getCodUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codigoFuncional'.
     * 
     * @return String
     * @return the value of field 'codigoFuncional'.
     */
    public java.lang.String getCodigoFuncional()
    {
        return this._codigoFuncional;
    } //-- java.lang.String getCodigoFuncional() 

    /**
     * Returns the value of field 'dataAtualizacao'.
     * 
     * @return String
     * @return the value of field 'dataAtualizacao'.
     */
    public java.lang.String getDataAtualizacao()
    {
        return this._dataAtualizacao;
    } //-- java.lang.String getDataAtualizacao() 

    /**
     * Returns the value of field 'dataExclusao'.
     * 
     * @return String
     * @return the value of field 'dataExclusao'.
     */
    public java.lang.String getDataExclusao()
    {
        return this._dataExclusao;
    } //-- java.lang.String getDataExclusao() 

    /**
     * Returns the value of field 'descUnidadeOrganizacional'.
     * 
     * @return String
     * @return the value of field 'descUnidadeOrganizacional'.
     */
    public java.lang.String getDescUnidadeOrganizacional()
    {
        return this._descUnidadeOrganizacional;
    } //-- java.lang.String getDescUnidadeOrganizacional() 

    /**
     * Returns the value of field 'horaAtualizacao'.
     * 
     * @return String
     * @return the value of field 'horaAtualizacao'.
     */
    public java.lang.String getHoraAtualizacao()
    {
        return this._horaAtualizacao;
    } //-- java.lang.String getHoraAtualizacao() 

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
     * Returns the value of field 'timeStamp'.
     * 
     * @return String
     * @return the value of field 'timeStamp'.
     */
    public java.lang.String getTimeStamp()
    {
        return this._timeStamp;
    } //-- java.lang.String getTimeStamp() 

    /**
     * Returns the value of field 'tragSemTrag'.
     * 
     * @return String
     * @return the value of field 'tragSemTrag'.
     */
    public java.lang.String getTragSemTrag()
    {
        return this._tragSemTrag;
    } //-- java.lang.String getTragSemTrag() 

    /**
     * Method hasCodPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJuridica()
    {
        return this._has_codPessoaJuridica;
    } //-- boolean hasCodPessoaJuridica() 

    /**
     * Method hasCodUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodUnidadeOrganizacional()
    {
        return this._has_codUnidadeOrganizacional;
    } //-- boolean hasCodUnidadeOrganizacional() 

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
     * Sets the value of field 'codPessoaJuridica'.
     * 
     * @param codPessoaJuridica the value of field
     * 'codPessoaJuridica'.
     */
    public void setCodPessoaJuridica(long codPessoaJuridica)
    {
        this._codPessoaJuridica = codPessoaJuridica;
        this._has_codPessoaJuridica = true;
    } //-- void setCodPessoaJuridica(long) 

    /**
     * Sets the value of field 'codUnidadeOrganizacional'.
     * 
     * @param codUnidadeOrganizacional the value of field
     * 'codUnidadeOrganizacional'.
     */
    public void setCodUnidadeOrganizacional(int codUnidadeOrganizacional)
    {
        this._codUnidadeOrganizacional = codUnidadeOrganizacional;
        this._has_codUnidadeOrganizacional = true;
    } //-- void setCodUnidadeOrganizacional(int) 

    /**
     * Sets the value of field 'codigoFuncional'.
     * 
     * @param codigoFuncional the value of field 'codigoFuncional'.
     */
    public void setCodigoFuncional(java.lang.String codigoFuncional)
    {
        this._codigoFuncional = codigoFuncional;
    } //-- void setCodigoFuncional(java.lang.String) 

    /**
     * Sets the value of field 'dataAtualizacao'.
     * 
     * @param dataAtualizacao the value of field 'dataAtualizacao'.
     */
    public void setDataAtualizacao(java.lang.String dataAtualizacao)
    {
        this._dataAtualizacao = dataAtualizacao;
    } //-- void setDataAtualizacao(java.lang.String) 

    /**
     * Sets the value of field 'dataExclusao'.
     * 
     * @param dataExclusao the value of field 'dataExclusao'.
     */
    public void setDataExclusao(java.lang.String dataExclusao)
    {
        this._dataExclusao = dataExclusao;
    } //-- void setDataExclusao(java.lang.String) 

    /**
     * Sets the value of field 'descUnidadeOrganizacional'.
     * 
     * @param descUnidadeOrganizacional the value of field
     * 'descUnidadeOrganizacional'.
     */
    public void setDescUnidadeOrganizacional(java.lang.String descUnidadeOrganizacional)
    {
        this._descUnidadeOrganizacional = descUnidadeOrganizacional;
    } //-- void setDescUnidadeOrganizacional(java.lang.String) 

    /**
     * Sets the value of field 'horaAtualizacao'.
     * 
     * @param horaAtualizacao the value of field 'horaAtualizacao'.
     */
    public void setHoraAtualizacao(java.lang.String horaAtualizacao)
    {
        this._horaAtualizacao = horaAtualizacao;
    } //-- void setHoraAtualizacao(java.lang.String) 

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
     * Sets the value of field 'timeStamp'.
     * 
     * @param timeStamp the value of field 'timeStamp'.
     */
    public void setTimeStamp(java.lang.String timeStamp)
    {
        this._timeStamp = timeStamp;
    } //-- void setTimeStamp(java.lang.String) 

    /**
     * Sets the value of field 'tragSemTrag'.
     * 
     * @param tragSemTrag the value of field 'tragSemTrag'.
     */
    public void setTragSemTrag(java.lang.String tragSemTrag)
    {
        this._tragSemTrag = tragSemTrag;
    } //-- void setTragSemTrag(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return OcorrenciasDepPorMunicipio
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listadependenciapormunicipio.response.OcorrenciasDepPorMunicipio unmarshal(java.io.Reader) 

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
