/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response;

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
     * Field _movtoReceitaApuracaoSinal
     */
    private java.lang.String _movtoReceitaApuracaoSinal;

    /**
     * Field _movtoReceitaApuracaoValor
     */
    private double _movtoReceitaApuracaoValor = 0;

    /**
     * keeps track of state for field: _movtoReceitaApuracaoValor
     */
    private boolean _has_movtoReceitaApuracaoValor;

    /**
     * Field _movtoReceitaTributavelSinal
     */
    private java.lang.String _movtoReceitaTributavelSinal;

    /**
     * Field _movtoReceitaTributavelValor
     */
    private double _movtoReceitaTributavelValor = 0;

    /**
     * keeps track of state for field: _movtoReceitaTributavelValor
     */
    private boolean _has_movtoReceitaTributavelValor;

    /**
     * Field _percAliquotaPadrao
     */
    private double _percAliquotaPadrao = 0;

    /**
     * keeps track of state for field: _percAliquotaPadrao
     */
    private boolean _has_percAliquotaPadrao;

    /**
     * Field _tributoApurcaoSinal
     */
    private java.lang.String _tributoApurcaoSinal;

    /**
     * Field _tributoApurcaoValor
     */
    private double _tributoApurcaoValor = 0;

    /**
     * keeps track of state for field: _tributoApurcaoValor
     */
    private boolean _has_tributoApurcaoValor;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias()


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
     * Method deleteMovtoReceitaApuracaoValor
     * 
     */
    public void deleteMovtoReceitaApuracaoValor()
    {
        this._has_movtoReceitaApuracaoValor= false;
    } //-- void deleteMovtoReceitaApuracaoValor() 

    /**
     * Method deleteMovtoReceitaTributavelValor
     * 
     */
    public void deleteMovtoReceitaTributavelValor()
    {
        this._has_movtoReceitaTributavelValor= false;
    } //-- void deleteMovtoReceitaTributavelValor() 

    /**
     * Method deleteNumeroConta
     * 
     */
    public void deleteNumeroConta()
    {
        this._has_numeroConta= false;
    } //-- void deleteNumeroConta() 

    /**
     * Method deletePercAliquotaPadrao
     * 
     */
    public void deletePercAliquotaPadrao()
    {
        this._has_percAliquotaPadrao= false;
    } //-- void deletePercAliquotaPadrao() 

    /**
     * Method deleteTributoApurcaoValor
     * 
     */
    public void deleteTributoApurcaoValor()
    {
        this._has_tributoApurcaoValor= false;
    } //-- void deleteTributoApurcaoValor() 

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
     * Returns the value of field 'movtoReceitaApuracaoSinal'.
     * 
     * @return String
     * @return the value of field 'movtoReceitaApuracaoSinal'.
     */
    public java.lang.String getMovtoReceitaApuracaoSinal()
    {
        return this._movtoReceitaApuracaoSinal;
    } //-- java.lang.String getMovtoReceitaApuracaoSinal() 

    /**
     * Returns the value of field 'movtoReceitaApuracaoValor'.
     * 
     * @return double
     * @return the value of field 'movtoReceitaApuracaoValor'.
     */
    public double getMovtoReceitaApuracaoValor()
    {
        return this._movtoReceitaApuracaoValor;
    } //-- double getMovtoReceitaApuracaoValor() 

    /**
     * Returns the value of field 'movtoReceitaTributavelSinal'.
     * 
     * @return String
     * @return the value of field 'movtoReceitaTributavelSinal'.
     */
    public java.lang.String getMovtoReceitaTributavelSinal()
    {
        return this._movtoReceitaTributavelSinal;
    } //-- java.lang.String getMovtoReceitaTributavelSinal() 

    /**
     * Returns the value of field 'movtoReceitaTributavelValor'.
     * 
     * @return double
     * @return the value of field 'movtoReceitaTributavelValor'.
     */
    public double getMovtoReceitaTributavelValor()
    {
        return this._movtoReceitaTributavelValor;
    } //-- double getMovtoReceitaTributavelValor() 

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
     * Returns the value of field 'percAliquotaPadrao'.
     * 
     * @return double
     * @return the value of field 'percAliquotaPadrao'.
     */
    public double getPercAliquotaPadrao()
    {
        return this._percAliquotaPadrao;
    } //-- double getPercAliquotaPadrao() 

    /**
     * Returns the value of field 'tributoApurcaoSinal'.
     * 
     * @return String
     * @return the value of field 'tributoApurcaoSinal'.
     */
    public java.lang.String getTributoApurcaoSinal()
    {
        return this._tributoApurcaoSinal;
    } //-- java.lang.String getTributoApurcaoSinal() 

    /**
     * Returns the value of field 'tributoApurcaoValor'.
     * 
     * @return double
     * @return the value of field 'tributoApurcaoValor'.
     */
    public double getTributoApurcaoValor()
    {
        return this._tributoApurcaoValor;
    } //-- double getTributoApurcaoValor() 

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
     * Method hasMovtoReceitaApuracaoValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMovtoReceitaApuracaoValor()
    {
        return this._has_movtoReceitaApuracaoValor;
    } //-- boolean hasMovtoReceitaApuracaoValor() 

    /**
     * Method hasMovtoReceitaTributavelValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMovtoReceitaTributavelValor()
    {
        return this._has_movtoReceitaTributavelValor;
    } //-- boolean hasMovtoReceitaTributavelValor() 

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
     * Method hasPercAliquotaPadrao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPercAliquotaPadrao()
    {
        return this._has_percAliquotaPadrao;
    } //-- boolean hasPercAliquotaPadrao() 

    /**
     * Method hasTributoApurcaoValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasTributoApurcaoValor()
    {
        return this._has_tributoApurcaoValor;
    } //-- boolean hasTributoApurcaoValor() 

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
     * Sets the value of field 'digitoConta'.
     * 
     * @param digitoConta the value of field 'digitoConta'.
     */
    public void setDigitoConta(java.lang.String digitoConta)
    {
        this._digitoConta = digitoConta;
    } //-- void setDigitoConta(java.lang.String) 

    /**
     * Sets the value of field 'movtoReceitaApuracaoSinal'.
     * 
     * @param movtoReceitaApuracaoSinal the value of field
     * 'movtoReceitaApuracaoSinal'.
     */
    public void setMovtoReceitaApuracaoSinal(java.lang.String movtoReceitaApuracaoSinal)
    {
        this._movtoReceitaApuracaoSinal = movtoReceitaApuracaoSinal;
    } //-- void setMovtoReceitaApuracaoSinal(java.lang.String) 

    /**
     * Sets the value of field 'movtoReceitaApuracaoValor'.
     * 
     * @param movtoReceitaApuracaoValor the value of field
     * 'movtoReceitaApuracaoValor'.
     */
    public void setMovtoReceitaApuracaoValor(double movtoReceitaApuracaoValor)
    {
        this._movtoReceitaApuracaoValor = movtoReceitaApuracaoValor;
        this._has_movtoReceitaApuracaoValor = true;
    } //-- void setMovtoReceitaApuracaoValor(double) 

    /**
     * Sets the value of field 'movtoReceitaTributavelSinal'.
     * 
     * @param movtoReceitaTributavelSinal the value of field
     * 'movtoReceitaTributavelSinal'.
     */
    public void setMovtoReceitaTributavelSinal(java.lang.String movtoReceitaTributavelSinal)
    {
        this._movtoReceitaTributavelSinal = movtoReceitaTributavelSinal;
    } //-- void setMovtoReceitaTributavelSinal(java.lang.String) 

    /**
     * Sets the value of field 'movtoReceitaTributavelValor'.
     * 
     * @param movtoReceitaTributavelValor the value of field
     * 'movtoReceitaTributavelValor'.
     */
    public void setMovtoReceitaTributavelValor(double movtoReceitaTributavelValor)
    {
        this._movtoReceitaTributavelValor = movtoReceitaTributavelValor;
        this._has_movtoReceitaTributavelValor = true;
    } //-- void setMovtoReceitaTributavelValor(double) 

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
     * Sets the value of field 'percAliquotaPadrao'.
     * 
     * @param percAliquotaPadrao the value of field
     * 'percAliquotaPadrao'.
     */
    public void setPercAliquotaPadrao(double percAliquotaPadrao)
    {
        this._percAliquotaPadrao = percAliquotaPadrao;
        this._has_percAliquotaPadrao = true;
    } //-- void setPercAliquotaPadrao(double) 

    /**
     * Sets the value of field 'tributoApurcaoSinal'.
     * 
     * @param tributoApurcaoSinal the value of field
     * 'tributoApurcaoSinal'.
     */
    public void setTributoApurcaoSinal(java.lang.String tributoApurcaoSinal)
    {
        this._tributoApurcaoSinal = tributoApurcaoSinal;
    } //-- void setTributoApurcaoSinal(java.lang.String) 

    /**
     * Sets the value of field 'tributoApurcaoValor'.
     * 
     * @param tributoApurcaoValor the value of field
     * 'tributoApurcaoValor'.
     */
    public void setTributoApurcaoValor(double tributoApurcaoValor)
    {
        this._tributoApurcaoValor = tributoApurcaoValor;
        this._has_tributoApurcaoValor = true;
    } //-- void setTributoApurcaoValor(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaomensaltotalizada.response.Ocorrencias unmarshal(java.io.Reader) 

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
