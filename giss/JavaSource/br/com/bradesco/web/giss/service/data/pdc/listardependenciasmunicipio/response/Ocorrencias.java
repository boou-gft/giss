/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response;

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
 * Class Ocorrencias.
 * 
 * @version $Revision$ $Date$
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codPessoaJuridica
     */
    private long _codPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codPessoaJuridica
     */
    private boolean _has_codPessoaJuridica;

    /**
     * Field _numSeqPessoaJuridica
     */
    private int _numSeqPessoaJuridica = 0;

    /**
     * keeps track of state for field: _numSeqPessoaJuridica
     */
    private boolean _has_numSeqPessoaJuridica;

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _descMunicipio
     */
    private java.lang.String _descMunicipio;

    /**
     * Field _codUF
     */
    private java.lang.String _codUF;

    /**
     * Field _descUF
     */
    private java.lang.String _descUF;

    /**
     * Field _tragSemTrag
     */
    private java.lang.String _tragSemTrag;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;

    /**
     * Field _descDependencia
     */
    private java.lang.String _descDependencia;

    /**
     * Field _dataAtualizacao
     */
    private java.lang.String _dataAtualizacao;

    /**
     * Field _situacaoDepend
     */
    private java.lang.String _situacaoDepend;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodDependencia
     * 
     */
    public void deleteCodDependencia()
    {
        this._has_codDependencia= false;
    } //-- void deleteCodDependencia() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodPessoaJuridica
     * 
     */
    public void deleteCodPessoaJuridica()
    {
        this._has_codPessoaJuridica= false;
    } //-- void deleteCodPessoaJuridica() 

    /**
     * Method deleteNumSeqPessoaJuridica
     * 
     */
    public void deleteNumSeqPessoaJuridica()
    {
        this._has_numSeqPessoaJuridica= false;
    } //-- void deleteNumSeqPessoaJuridica() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return int
     * @return the value of field 'codDependencia'.
     */
    public int getCodDependencia()
    {
        return this._codDependencia;
    } //-- int getCodDependencia() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

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
     * Returns the value of field 'codUF'.
     * 
     * @return String
     * @return the value of field 'codUF'.
     */
    public java.lang.String getCodUF()
    {
        return this._codUF;
    } //-- java.lang.String getCodUF() 

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
     * Returns the value of field 'descMunicipio'.
     * 
     * @return String
     * @return the value of field 'descMunicipio'.
     */
    public java.lang.String getDescMunicipio()
    {
        return this._descMunicipio;
    } //-- java.lang.String getDescMunicipio() 

    /**
     * Returns the value of field 'descUF'.
     * 
     * @return String
     * @return the value of field 'descUF'.
     */
    public java.lang.String getDescUF()
    {
        return this._descUF;
    } //-- java.lang.String getDescUF() 

    /**
     * Returns the value of field 'numSeqPessoaJuridica'.
     * 
     * @return int
     * @return the value of field 'numSeqPessoaJuridica'.
     */
    public int getNumSeqPessoaJuridica()
    {
        return this._numSeqPessoaJuridica;
    } //-- int getNumSeqPessoaJuridica() 

    /**
     * Returns the value of field 'situacaoDepend'.
     * 
     * @return String
     * @return the value of field 'situacaoDepend'.
     */
    public java.lang.String getSituacaoDepend()
    {
        return this._situacaoDepend;
    } //-- java.lang.String getSituacaoDepend() 

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
     * Method hasCodDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependencia()
    {
        return this._has_codDependencia;
    } //-- boolean hasCodDependencia() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

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
     * Method hasNumSeqPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSeqPessoaJuridica()
    {
        return this._has_numSeqPessoaJuridica;
    } //-- boolean hasNumSeqPessoaJuridica() 

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
    public void setCodDependencia(int codDependencia)
    {
        this._codDependencia = codDependencia;
        this._has_codDependencia = true;
    } //-- void setCodDependencia(int) 

    /**
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

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
     * Sets the value of field 'codUF'.
     * 
     * @param codUF the value of field 'codUF'.
     */
    public void setCodUF(java.lang.String codUF)
    {
        this._codUF = codUF;
    } //-- void setCodUF(java.lang.String) 

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
     * Sets the value of field 'descDependencia'.
     * 
     * @param descDependencia the value of field 'descDependencia'.
     */
    public void setDescDependencia(java.lang.String descDependencia)
    {
        this._descDependencia = descDependencia;
    } //-- void setDescDependencia(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipio'.
     * 
     * @param descMunicipio the value of field 'descMunicipio'.
     */
    public void setDescMunicipio(java.lang.String descMunicipio)
    {
        this._descMunicipio = descMunicipio;
    } //-- void setDescMunicipio(java.lang.String) 

    /**
     * Sets the value of field 'descUF'.
     * 
     * @param descUF the value of field 'descUF'.
     */
    public void setDescUF(java.lang.String descUF)
    {
        this._descUF = descUF;
    } //-- void setDescUF(java.lang.String) 

    /**
     * Sets the value of field 'numSeqPessoaJuridica'.
     * 
     * @param numSeqPessoaJuridica the value of field
     * 'numSeqPessoaJuridica'.
     */
    public void setNumSeqPessoaJuridica(int numSeqPessoaJuridica)
    {
        this._numSeqPessoaJuridica = numSeqPessoaJuridica;
        this._has_numSeqPessoaJuridica = true;
    } //-- void setNumSeqPessoaJuridica(int) 

    /**
     * Sets the value of field 'situacaoDepend'.
     * 
     * @param situacaoDepend the value of field 'situacaoDepend'.
     */
    public void setSituacaoDepend(java.lang.String situacaoDepend)
    {
        this._situacaoDepend = situacaoDepend;
    } //-- void setSituacaoDepend(java.lang.String) 

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
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listardependenciasmunicipio.response.Ocorrencias unmarshal(java.io.Reader) 

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
