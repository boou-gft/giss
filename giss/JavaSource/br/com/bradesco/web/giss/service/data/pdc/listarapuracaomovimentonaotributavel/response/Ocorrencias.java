/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response;

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
    private long _codigoContaContabil = 0;

    /**
     * keeps track of state for field: _codigoContaContabil
     */
    private boolean _has_codigoContaContabil;

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
     * Field _movimentoSinal
     */
    private java.lang.String _movimentoSinal;

    /**
     * Field _movimentoValor
     */
    private double _movimentoValor = 0;

    /**
     * keeps track of state for field: _movimentoValor
     */
    private boolean _has_movimentoValor;

    /**
     * Field _receitaSinal
     */
    private java.lang.String _receitaSinal;

    /**
     * Field _receitaValor
     */
    private double _receitaValor = 0;

    /**
     * keeps track of state for field: _receitaValor
     */
    private boolean _has_receitaValor;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoContaContabil
     * 
     */
    public void deleteCodigoContaContabil()
    {
        this._has_codigoContaContabil= false;
    } //-- void deleteCodigoContaContabil() 

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
     * Method deleteMovimentoValor
     * 
     */
    public void deleteMovimentoValor()
    {
        this._has_movimentoValor= false;
    } //-- void deleteMovimentoValor() 

    /**
     * Method deleteNumeroConta
     * 
     */
    public void deleteNumeroConta()
    {
        this._has_numeroConta= false;
    } //-- void deleteNumeroConta() 

    /**
     * Method deleteReceitaValor
     * 
     */
    public void deleteReceitaValor()
    {
        this._has_receitaValor= false;
    } //-- void deleteReceitaValor() 

    /**
     * Returns the value of field 'codigoContaContabil'.
     * 
     * @return long
     * @return the value of field 'codigoContaContabil'.
     */
    public long getCodigoContaContabil()
    {
        return this._codigoContaContabil;
    } //-- long getCodigoContaContabil() 

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
     * Returns the value of field 'movimentoSinal'.
     * 
     * @return String
     * @return the value of field 'movimentoSinal'.
     */
    public java.lang.String getMovimentoSinal()
    {
        return this._movimentoSinal;
    } //-- java.lang.String getMovimentoSinal() 

    /**
     * Returns the value of field 'movimentoValor'.
     * 
     * @return double
     * @return the value of field 'movimentoValor'.
     */
    public double getMovimentoValor()
    {
        return this._movimentoValor;
    } //-- double getMovimentoValor() 

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
     * @return double
     * @return the value of field 'receitaValor'.
     */
    public double getReceitaValor()
    {
        return this._receitaValor;
    } //-- double getReceitaValor() 

    /**
     * Method hasCodigoContaContabil
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoContaContabil()
    {
        return this._has_codigoContaContabil;
    } //-- boolean hasCodigoContaContabil() 

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
     * Method hasMovimentoValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMovimentoValor()
    {
        return this._has_movimentoValor;
    } //-- boolean hasMovimentoValor() 

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
     * Method hasReceitaValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasReceitaValor()
    {
        return this._has_receitaValor;
    } //-- boolean hasReceitaValor() 

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
    public void setCodigoContaContabil(long codigoContaContabil)
    {
        this._codigoContaContabil = codigoContaContabil;
        this._has_codigoContaContabil = true;
    } //-- void setCodigoContaContabil(long) 

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
     * Sets the value of field 'digitoConta'.
     * 
     * @param digitoConta the value of field 'digitoConta'.
     */
    public void setDigitoConta(java.lang.String digitoConta)
    {
        this._digitoConta = digitoConta;
    } //-- void setDigitoConta(java.lang.String) 

    /**
     * Sets the value of field 'movimentoSinal'.
     * 
     * @param movimentoSinal the value of field 'movimentoSinal'.
     */
    public void setMovimentoSinal(java.lang.String movimentoSinal)
    {
        this._movimentoSinal = movimentoSinal;
    } //-- void setMovimentoSinal(java.lang.String) 

    /**
     * Sets the value of field 'movimentoValor'.
     * 
     * @param movimentoValor the value of field 'movimentoValor'.
     */
    public void setMovimentoValor(double movimentoValor)
    {
        this._movimentoValor = movimentoValor;
        this._has_movimentoValor = true;
    } //-- void setMovimentoValor(double) 

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
    public void setReceitaValor(double receitaValor)
    {
        this._receitaValor = receitaValor;
        this._has_receitaValor = true;
    } //-- void setReceitaValor(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomovimentonaotributavel.response.Ocorrencias unmarshal(java.io.Reader) 

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
