/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencia.java,v 1.1 2017/04/11 14:10:07 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response;

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
 * Class Ocorrencia.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:07 $
 */
public class Ocorrencia implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoPessoaJuridica
     */
    private long _codigoPessoaJuridica = 0;

    /**
     * keeps track of state for field: _codigoPessoaJuridica
     */
    private boolean _has_codigoPessoaJuridica;

    /**
     * Field _numeroSequenciaUnidadeOrganizacional
     */
    private int _numeroSequenciaUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field:
     * _numeroSequenciaUnidadeOrganizacional
     */
    private boolean _has_numeroSequenciaUnidadeOrganizacional;

    /**
     * Field _mesAnoApuracaoContabil
     */
    private int _mesAnoApuracaoContabil = 0;

    /**
     * keeps track of state for field: _mesAnoApuracaoContabil
     */
    private boolean _has_mesAnoApuracaoContabil;

    /**
     * Field _codigoDependencia
     */
    private java.lang.String _codigoDependencia;

    /**
     * Field _descricaoDependencia
     */
    private java.lang.String _descricaoDependencia;

    /**
     * Field _receitaSinal
     */
    private java.lang.String _receitaSinal;

    /**
     * Field _receitaValor
     */
    private java.math.BigDecimal _receitaValor = new java.math.BigDecimal("0");

    /**
     * Field _issSinal
     */
    private java.lang.String _issSinal;

    /**
     * Field _issValor
     */
    private java.math.BigDecimal _issValor = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencia() 
     {
        super();
        setReceitaValor(new java.math.BigDecimal("0"));
        setIssValor(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoPessoaJuridica
     * 
     */
    public void deleteCodigoPessoaJuridica()
    {
        this._has_codigoPessoaJuridica= false;
    } //-- void deleteCodigoPessoaJuridica() 

    /**
     * Method deleteMesAnoApuracaoContabil
     * 
     */
    public void deleteMesAnoApuracaoContabil()
    {
        this._has_mesAnoApuracaoContabil= false;
    } //-- void deleteMesAnoApuracaoContabil() 

    /**
     * Method deleteNumeroSequenciaUnidadeOrganizacional
     * 
     */
    public void deleteNumeroSequenciaUnidadeOrganizacional()
    {
        this._has_numeroSequenciaUnidadeOrganizacional= false;
    } //-- void deleteNumeroSequenciaUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codigoDependencia'.
     * 
     * @return String
     * @return the value of field 'codigoDependencia'.
     */
    public java.lang.String getCodigoDependencia()
    {
        return this._codigoDependencia;
    } //-- java.lang.String getCodigoDependencia() 

    /**
     * Returns the value of field 'codigoPessoaJuridica'.
     * 
     * @return long
     * @return the value of field 'codigoPessoaJuridica'.
     */
    public long getCodigoPessoaJuridica()
    {
        return this._codigoPessoaJuridica;
    } //-- long getCodigoPessoaJuridica() 

    /**
     * Returns the value of field 'descricaoDependencia'.
     * 
     * @return String
     * @return the value of field 'descricaoDependencia'.
     */
    public java.lang.String getDescricaoDependencia()
    {
        return this._descricaoDependencia;
    } //-- java.lang.String getDescricaoDependencia() 

    /**
     * Returns the value of field 'issSinal'.
     * 
     * @return String
     * @return the value of field 'issSinal'.
     */
    public java.lang.String getIssSinal()
    {
        return this._issSinal;
    } //-- java.lang.String getIssSinal() 

    /**
     * Returns the value of field 'issValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'issValor'.
     */
    public java.math.BigDecimal getIssValor()
    {
        return this._issValor;
    } //-- java.math.BigDecimal getIssValor() 

    /**
     * Returns the value of field 'mesAnoApuracaoContabil'.
     * 
     * @return int
     * @return the value of field 'mesAnoApuracaoContabil'.
     */
    public int getMesAnoApuracaoContabil()
    {
        return this._mesAnoApuracaoContabil;
    } //-- int getMesAnoApuracaoContabil() 

    /**
     * Returns the value of field
     * 'numeroSequenciaUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field
     * 'numeroSequenciaUnidadeOrganizacional'.
     */
    public int getNumeroSequenciaUnidadeOrganizacional()
    {
        return this._numeroSequenciaUnidadeOrganizacional;
    } //-- int getNumeroSequenciaUnidadeOrganizacional() 

    /**
     * Returns the value of field 'receitaSinal'.
     * 
     * @return String
     * @return the value of field 'receitaSinal'.
     */
    public java.lang.String getReceitaSinal()
    {
        return this._receitaSinal;
    } //-- java.lang.String getReceitaSinal() 

    /**
     * Returns the value of field 'receitaValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'receitaValor'.
     */
    public java.math.BigDecimal getReceitaValor()
    {
        return this._receitaValor;
    } //-- java.math.BigDecimal getReceitaValor() 

    /**
     * Method hasCodigoPessoaJuridica
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoPessoaJuridica()
    {
        return this._has_codigoPessoaJuridica;
    } //-- boolean hasCodigoPessoaJuridica() 

    /**
     * Method hasMesAnoApuracaoContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAnoApuracaoContabil()
    {
        return this._has_mesAnoApuracaoContabil;
    } //-- boolean hasMesAnoApuracaoContabil() 

    /**
     * Method hasNumeroSequenciaUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroSequenciaUnidadeOrganizacional()
    {
        return this._has_numeroSequenciaUnidadeOrganizacional;
    } //-- boolean hasNumeroSequenciaUnidadeOrganizacional() 

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
     * Sets the value of field 'codigoDependencia'.
     * 
     * @param codigoDependencia the value of field
     * 'codigoDependencia'.
     */
    public void setCodigoDependencia(java.lang.String codigoDependencia)
    {
        this._codigoDependencia = codigoDependencia;
    } //-- void setCodigoDependencia(java.lang.String) 

    /**
     * Sets the value of field 'codigoPessoaJuridica'.
     * 
     * @param codigoPessoaJuridica the value of field
     * 'codigoPessoaJuridica'.
     */
    public void setCodigoPessoaJuridica(long codigoPessoaJuridica)
    {
        this._codigoPessoaJuridica = codigoPessoaJuridica;
        this._has_codigoPessoaJuridica = true;
    } //-- void setCodigoPessoaJuridica(long) 

    /**
     * Sets the value of field 'descricaoDependencia'.
     * 
     * @param descricaoDependencia the value of field
     * 'descricaoDependencia'.
     */
    public void setDescricaoDependencia(java.lang.String descricaoDependencia)
    {
        this._descricaoDependencia = descricaoDependencia;
    } //-- void setDescricaoDependencia(java.lang.String) 

    /**
     * Sets the value of field 'issSinal'.
     * 
     * @param issSinal the value of field 'issSinal'.
     */
    public void setIssSinal(java.lang.String issSinal)
    {
        this._issSinal = issSinal;
    } //-- void setIssSinal(java.lang.String) 

    /**
     * Sets the value of field 'issValor'.
     * 
     * @param issValor the value of field 'issValor'.
     */
    public void setIssValor(java.math.BigDecimal issValor)
    {
        this._issValor = issValor;
    } //-- void setIssValor(java.math.BigDecimal) 

    /**
     * Sets the value of field 'mesAnoApuracaoContabil'.
     * 
     * @param mesAnoApuracaoContabil the value of field
     * 'mesAnoApuracaoContabil'.
     */
    public void setMesAnoApuracaoContabil(int mesAnoApuracaoContabil)
    {
        this._mesAnoApuracaoContabil = mesAnoApuracaoContabil;
        this._has_mesAnoApuracaoContabil = true;
    } //-- void setMesAnoApuracaoContabil(int) 

    /**
     * Sets the value of field
     * 'numeroSequenciaUnidadeOrganizacional'.
     * 
     * @param numeroSequenciaUnidadeOrganizacional the value of
     * field 'numeroSequenciaUnidadeOrganizacional'.
     */
    public void setNumeroSequenciaUnidadeOrganizacional(int numeroSequenciaUnidadeOrganizacional)
    {
        this._numeroSequenciaUnidadeOrganizacional = numeroSequenciaUnidadeOrganizacional;
        this._has_numeroSequenciaUnidadeOrganizacional = true;
    } //-- void setNumeroSequenciaUnidadeOrganizacional(int) 

    /**
     * Sets the value of field 'receitaSinal'.
     * 
     * @param receitaSinal the value of field 'receitaSinal'.
     */
    public void setReceitaSinal(java.lang.String receitaSinal)
    {
        this._receitaSinal = receitaSinal;
    } //-- void setReceitaSinal(java.lang.String) 

    /**
     * Sets the value of field 'receitaValor'.
     * 
     * @param receitaValor the value of field 'receitaValor'.
     */
    public void setReceitaValor(java.math.BigDecimal receitaValor)
    {
        this._receitaValor = receitaValor;
    } //-- void setReceitaValor(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencia
     */
    public static br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.agenciaincorporadepartamentoresult.response.Ocorrencia unmarshal(java.io.Reader) 

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
