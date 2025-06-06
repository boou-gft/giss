/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.3 2017/07/28 19:14:40 gilbertocopoli Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response;

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
 * @version $Revision: 1.3 $ $Date: 2017/07/28 19:14:40 $
 */
public class Ocorrencias implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _contaContabil
     */
    private java.lang.String _contaContabil;

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
     * Field _descRazao
     */
    private java.lang.String _descRazao;

    /**
     * Field _receitaApuracaoSinal
     */
    private java.lang.String _receitaApuracaoSinal;

    /**
     * Field _receitaApuracaoValor
     */
    private java.math.BigDecimal _receitaApuracaoValor = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
        setReceitaApuracaoValor(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias()


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
     * Returns the value of field 'contaContabil'.
     * 
     * @return String
     * @return the value of field 'contaContabil'.
     */
    public java.lang.String getContaContabil()
    {
        return this._contaContabil;
    } //-- java.lang.String getContaContabil() 

    /**
     * Returns the value of field 'descRazao'.
     * 
     * @return String
     * @return the value of field 'descRazao'.
     */
    public java.lang.String getDescRazao()
    {
        return this._descRazao;
    } //-- java.lang.String getDescRazao() 

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
     * Returns the value of field 'receitaApuracaoSinal'.
     * 
     * @return String
     * @return the value of field 'receitaApuracaoSinal'.
     */
    public java.lang.String getReceitaApuracaoSinal()
    {
        return this._receitaApuracaoSinal;
    } //-- java.lang.String getReceitaApuracaoSinal() 

    /**
     * Returns the value of field 'receitaApuracaoValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'receitaApuracaoValor'.
     */
    public java.math.BigDecimal getReceitaApuracaoValor()
    {
        return this._receitaApuracaoValor;
    } //-- java.math.BigDecimal getReceitaApuracaoValor() 

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
     * Sets the value of field 'contaContabil'.
     * 
     * @param contaContabil the value of field 'contaContabil'.
     */
    public void setContaContabil(java.lang.String contaContabil)
    {
        this._contaContabil = contaContabil;
    } //-- void setContaContabil(java.lang.String) 

    /**
     * Sets the value of field 'descRazao'.
     * 
     * @param descRazao the value of field 'descRazao'.
     */
    public void setDescRazao(java.lang.String descRazao)
    {
        this._descRazao = descRazao;
    } //-- void setDescRazao(java.lang.String) 

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
     * Sets the value of field 'receitaApuracaoSinal'.
     * 
     * @param receitaApuracaoSinal the value of field
     * 'receitaApuracaoSinal'.
     */
    public void setReceitaApuracaoSinal(java.lang.String receitaApuracaoSinal)
    {
        this._receitaApuracaoSinal = receitaApuracaoSinal;
    } //-- void setReceitaApuracaoSinal(java.lang.String) 

    /**
     * Sets the value of field 'receitaApuracaoValor'.
     * 
     * @param receitaApuracaoValor the value of field
     * 'receitaApuracaoValor'.
     */
    public void setReceitaApuracaoValor(java.math.BigDecimal receitaApuracaoValor)
    {
        this._receitaApuracaoValor = receitaApuracaoValor;
    } //-- void setReceitaApuracaoValor(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listaraliquotazerada.response.Ocorrencias unmarshal(java.io.Reader) 

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
