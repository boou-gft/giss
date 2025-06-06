/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response;

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
     * Field _descRazao
     */
    private java.lang.String _descRazao;

    /**
     * Field _anteriorSinal
     */
    private java.lang.String _anteriorSinal;

    /**
     * Field _anteriorValor
     */
    private double _anteriorValor = 0;

    /**
     * keeps track of state for field: _anteriorValor
     */
    private boolean _has_anteriorValor;

    /**
     * Field _atualSinal
     */
    private java.lang.String _atualSinal;

    /**
     * Field _atualValor
     */
    private double _atualValor = 0;

    /**
     * keeps track of state for field: _atualValor
     */
    private boolean _has_atualValor;

    /**
     * Field _oscilacaoSinal
     */
    private java.lang.String _oscilacaoSinal;

    /**
     * Field _oscilacaoValor
     */
    private double _oscilacaoValor = 0;

    /**
     * keeps track of state for field: _oscilacaoValor
     */
    private boolean _has_oscilacaoValor;


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAnteriorValor
     * 
     */
    public void deleteAnteriorValor()
    {
        this._has_anteriorValor= false;
    } //-- void deleteAnteriorValor() 

    /**
     * Method deleteAtualValor
     * 
     */
    public void deleteAtualValor()
    {
        this._has_atualValor= false;
    } //-- void deleteAtualValor() 

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
     * Method deleteOscilacaoValor
     * 
     */
    public void deleteOscilacaoValor()
    {
        this._has_oscilacaoValor= false;
    } //-- void deleteOscilacaoValor() 

    /**
     * Returns the value of field 'anteriorSinal'.
     * 
     * @return String
     * @return the value of field 'anteriorSinal'.
     */
    public java.lang.String getAnteriorSinal()
    {
        return this._anteriorSinal;
    } //-- java.lang.String getAnteriorSinal() 

    /**
     * Returns the value of field 'anteriorValor'.
     * 
     * @return double
     * @return the value of field 'anteriorValor'.
     */
    public double getAnteriorValor()
    {
        return this._anteriorValor;
    } //-- double getAnteriorValor() 

    /**
     * Returns the value of field 'atualSinal'.
     * 
     * @return String
     * @return the value of field 'atualSinal'.
     */
    public java.lang.String getAtualSinal()
    {
        return this._atualSinal;
    } //-- java.lang.String getAtualSinal() 

    /**
     * Returns the value of field 'atualValor'.
     * 
     * @return double
     * @return the value of field 'atualValor'.
     */
    public double getAtualValor()
    {
        return this._atualValor;
    } //-- double getAtualValor() 

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
     * Returns the value of field 'oscilacaoSinal'.
     * 
     * @return String
     * @return the value of field 'oscilacaoSinal'.
     */
    public java.lang.String getOscilacaoSinal()
    {
        return this._oscilacaoSinal;
    } //-- java.lang.String getOscilacaoSinal() 

    /**
     * Returns the value of field 'oscilacaoValor'.
     * 
     * @return double
     * @return the value of field 'oscilacaoValor'.
     */
    public double getOscilacaoValor()
    {
        return this._oscilacaoValor;
    } //-- double getOscilacaoValor() 

    /**
     * Method hasAnteriorValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnteriorValor()
    {
        return this._has_anteriorValor;
    } //-- boolean hasAnteriorValor() 

    /**
     * Method hasAtualValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAtualValor()
    {
        return this._has_atualValor;
    } //-- boolean hasAtualValor() 

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
     * Method hasOscilacaoValor
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasOscilacaoValor()
    {
        return this._has_oscilacaoValor;
    } //-- boolean hasOscilacaoValor() 

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
     * Sets the value of field 'anteriorSinal'.
     * 
     * @param anteriorSinal the value of field 'anteriorSinal'.
     */
    public void setAnteriorSinal(java.lang.String anteriorSinal)
    {
        this._anteriorSinal = anteriorSinal;
    } //-- void setAnteriorSinal(java.lang.String) 

    /**
     * Sets the value of field 'anteriorValor'.
     * 
     * @param anteriorValor the value of field 'anteriorValor'.
     */
    public void setAnteriorValor(double anteriorValor)
    {
        this._anteriorValor = anteriorValor;
        this._has_anteriorValor = true;
    } //-- void setAnteriorValor(double) 

    /**
     * Sets the value of field 'atualSinal'.
     * 
     * @param atualSinal the value of field 'atualSinal'.
     */
    public void setAtualSinal(java.lang.String atualSinal)
    {
        this._atualSinal = atualSinal;
    } //-- void setAtualSinal(java.lang.String) 

    /**
     * Sets the value of field 'atualValor'.
     * 
     * @param atualValor the value of field 'atualValor'.
     */
    public void setAtualValor(double atualValor)
    {
        this._atualValor = atualValor;
        this._has_atualValor = true;
    } //-- void setAtualValor(double) 

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
     * Sets the value of field 'oscilacaoSinal'.
     * 
     * @param oscilacaoSinal the value of field 'oscilacaoSinal'.
     */
    public void setOscilacaoSinal(java.lang.String oscilacaoSinal)
    {
        this._oscilacaoSinal = oscilacaoSinal;
    } //-- void setOscilacaoSinal(java.lang.String) 

    /**
     * Sets the value of field 'oscilacaoValor'.
     * 
     * @param oscilacaoValor the value of field 'oscilacaoValor'.
     */
    public void setOscilacaoValor(double oscilacaoValor)
    {
        this._oscilacaoValor = oscilacaoValor;
        this._has_oscilacaoValor = true;
    } //-- void setOscilacaoValor(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultaroscilacaonegativa.response.Ocorrencias unmarshal(java.io.Reader) 

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
