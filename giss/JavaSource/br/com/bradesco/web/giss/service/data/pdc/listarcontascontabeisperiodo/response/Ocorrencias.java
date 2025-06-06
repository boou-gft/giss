/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeisperiodo.response;

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
     * Field _codigoContaContabil
     */
    private java.lang.String _codigoContaContabil;

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
     * Field _codigoLeiComplementar
     */
    private int _codigoLeiComplementar = 0;

    /**
     * keeps track of state for field: _codigoLeiComplementar
     */
    private boolean _has_codigoLeiComplementar;

    /**
     * Field _codigoServico
     */
    private int _codigoServico = 0;

    /**
     * keeps track of state for field: _codigoServico
     */
    private boolean _has_codigoServico;

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
     * Field _codigoFuncao
     */
    private java.lang.String _codigoFuncao;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeisperiodo.response.Ocorrencias()


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
     * Method deleteCodigoLeiComplementar
     * 
     */
    public void deleteCodigoLeiComplementar()
    {
        this._has_codigoLeiComplementar= false;
    } //-- void deleteCodigoLeiComplementar() 

    /**
     * Method deleteCodigoServico
     * 
     */
    public void deleteCodigoServico()
    {
        this._has_codigoServico= false;
    } //-- void deleteCodigoServico() 

    /**
     * Method deleteCodigoSubgrupo
     * 
     */
    public void deleteCodigoSubgrupo()
    {
        this._has_codigoSubgrupo= false;
    } //-- void deleteCodigoSubgrupo() 

    /**
     * Method deleteNumeroConta
     * 
     */
    public void deleteNumeroConta()
    {
        this._has_numeroConta= false;
    } //-- void deleteNumeroConta() 

    /**
     * Returns the value of field 'codigoContaContabil'.
     * 
     * @return String
     * @return the value of field 'codigoContaContabil'.
     */
    public java.lang.String getCodigoContaContabil()
    {
        return this._codigoContaContabil;
    } //-- java.lang.String getCodigoContaContabil() 

    /**
     * Returns the value of field 'codigoFuncao'.
     * 
     * @return String
     * @return the value of field 'codigoFuncao'.
     */
    public java.lang.String getCodigoFuncao()
    {
        return this._codigoFuncao;
    } //-- java.lang.String getCodigoFuncao() 

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
     * @return int
     * @return the value of field 'codigoLeiComplementar'.
     */
    public int getCodigoLeiComplementar()
    {
        return this._codigoLeiComplementar;
    } //-- int getCodigoLeiComplementar() 

    /**
     * Returns the value of field 'codigoServico'.
     * 
     * @return int
     * @return the value of field 'codigoServico'.
     */
    public int getCodigoServico()
    {
        return this._codigoServico;
    } //-- int getCodigoServico() 

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
     * Method hasCodigoLeiComplementar
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoLeiComplementar()
    {
        return this._has_codigoLeiComplementar;
    } //-- boolean hasCodigoLeiComplementar() 

    /**
     * Method hasCodigoServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoServico()
    {
        return this._has_codigoServico;
    } //-- boolean hasCodigoServico() 

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
     * Sets the value of field 'codigoContaContabil'.
     * 
     * @param codigoContaContabil the value of field
     * 'codigoContaContabil'.
     */
    public void setCodigoContaContabil(java.lang.String codigoContaContabil)
    {
        this._codigoContaContabil = codigoContaContabil;
    } //-- void setCodigoContaContabil(java.lang.String) 

    /**
     * Sets the value of field 'codigoFuncao'.
     * 
     * @param codigoFuncao the value of field 'codigoFuncao'.
     */
    public void setCodigoFuncao(java.lang.String codigoFuncao)
    {
        this._codigoFuncao = codigoFuncao;
    } //-- void setCodigoFuncao(java.lang.String) 

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
    public void setCodigoLeiComplementar(int codigoLeiComplementar)
    {
        this._codigoLeiComplementar = codigoLeiComplementar;
        this._has_codigoLeiComplementar = true;
    } //-- void setCodigoLeiComplementar(int) 

    /**
     * Sets the value of field 'codigoServico'.
     * 
     * @param codigoServico the value of field 'codigoServico'.
     */
    public void setCodigoServico(int codigoServico)
    {
        this._codigoServico = codigoServico;
        this._has_codigoServico = true;
    } //-- void setCodigoServico(int) 

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
     * Sets the value of field 'horaAtualizacao'.
     * 
     * @param horaAtualizacao the value of field 'horaAtualizacao'.
     */
    public void setHoraAtualizacao(java.lang.String horaAtualizacao)
    {
        this._horaAtualizacao = horaAtualizacao;
    } //-- void setHoraAtualizacao(java.lang.String) 

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
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeisperiodo.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeisperiodo.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeisperiodo.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarcontascontabeisperiodo.response.Ocorrencias unmarshal(java.io.Reader) 

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
