/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response;

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
     * Field _contaContabilTribu
     */
    private java.lang.String _contaContabilTribu;

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
     * Field _tribuSinal
     */
    private java.lang.String _tribuSinal;

    /**
     * Field _tribuValor
     */
    private double _tribuValor = 0;

    /**
     * keeps track of state for field: _tribuValor
     */
    private boolean _has_tribuValor;

    /**
     * Field _porcAliquotaConta
     */
    private double _porcAliquotaConta = 0;

    /**
     * keeps track of state for field: _porcAliquotaConta
     */
    private boolean _has_porcAliquotaConta;

    /**
     * Field _issSinal
     */
    private java.lang.String _issSinal;

    /**
     * Field _issValor
     */
    private double _issValor = 0;

    /**
     * keeps track of state for field: _issValor
     */
    private boolean _has_issValor;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias()


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
     * Method deleteIssValor
     * 
     */
    public void deleteIssValor()
    {
        this._has_issValor= false;
    } //-- void deleteIssValor() 

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
     * Method deletePorcAliquotaConta
     * 
     */
    public void deletePorcAliquotaConta()
    {
        this._has_porcAliquotaConta= false;
    } //-- void deletePorcAliquotaConta() 

    /**
     * Method deleteTribuValor
     * 
     */
    public void deleteTribuValor()
    {
        this._has_tribuValor= false;
    } //-- void deleteTribuValor() 

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
     * Returns the value of field 'contaContabilTribu'.
     * 
     * @return String
     * @return the value of field 'contaContabilTribu'.
     */
    public java.lang.String getContaContabilTribu()
    {
        return this._contaContabilTribu;
    } //-- java.lang.String getContaContabilTribu() 

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
     * @return double
     * @return the value of field 'issValor'.
     */
    public double getIssValor()
    {
        return this._issValor;
    } //-- double getIssValor() 

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
     * Returns the value of field 'porcAliquotaConta'.
     * 
     * @return double
     * @return the value of field 'porcAliquotaConta'.
     */
    public double getPorcAliquotaConta()
    {
        return this._porcAliquotaConta;
    } //-- double getPorcAliquotaConta() 

    /**
     * Returns the value of field 'tribuSinal'.
     * 
     * @return String
     * @return the value of field 'tribuSinal'.
     */
    public java.lang.String getTribuSinal()
    {
        return this._tribuSinal;
    } //-- java.lang.String getTribuSinal() 

    /**
     * Returns the value of field 'tribuValor'.
     * 
     * @return double
     * @return the value of field 'tribuValor'.
     */
    public double getTribuValor()
    {
        return this._tribuValor;
    } //-- double getTribuValor() 

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
     * Method hasIssValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasIssValor()
    {
        return this._has_issValor;
    } //-- boolean hasIssValor() 

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
     * Method hasPorcAliquotaConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPorcAliquotaConta()
    {
        return this._has_porcAliquotaConta;
    } //-- boolean hasPorcAliquotaConta() 

    /**
     * Method hasTribuValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTribuValor()
    {
        return this._has_tribuValor;
    } //-- boolean hasTribuValor() 

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
     * Sets the value of field 'contaContabilTribu'.
     * 
     * @param contaContabilTribu the value of field
     * 'contaContabilTribu'.
     */
    public void setContaContabilTribu(java.lang.String contaContabilTribu)
    {
        this._contaContabilTribu = contaContabilTribu;
    } //-- void setContaContabilTribu(java.lang.String) 

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
    public void setIssValor(double issValor)
    {
        this._issValor = issValor;
        this._has_issValor = true;
    } //-- void setIssValor(double) 

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
     * Sets the value of field 'porcAliquotaConta'.
     * 
     * @param porcAliquotaConta the value of field
     * 'porcAliquotaConta'.
     */
    public void setPorcAliquotaConta(double porcAliquotaConta)
    {
        this._porcAliquotaConta = porcAliquotaConta;
        this._has_porcAliquotaConta = true;
    } //-- void setPorcAliquotaConta(double) 

    /**
     * Sets the value of field 'tribuSinal'.
     * 
     * @param tribuSinal the value of field 'tribuSinal'.
     */
    public void setTribuSinal(java.lang.String tribuSinal)
    {
        this._tribuSinal = tribuSinal;
    } //-- void setTribuSinal(java.lang.String) 

    /**
     * Sets the value of field 'tribuValor'.
     * 
     * @param tribuValor the value of field 'tribuValor'.
     */
    public void setTribuValor(double tribuValor)
    {
        this._tribuValor = tribuValor;
        this._has_tribuValor = true;
    } //-- void setTribuValor(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaofinalaposfechamentoiss.response.Ocorrencias unmarshal(java.io.Reader) 

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
