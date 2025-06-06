/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: Ocorrencias.java,v 1.1 2017/04/11 14:08:09 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response;

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
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:08:09 $
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
     * Field _movmtoReceitaApuracaoSinal
     */
    private java.lang.String _movmtoReceitaApuracaoSinal;

    /**
     * Field _movmtoReceitaApuracaoValor
     */
    private java.math.BigDecimal _movmtoReceitaApuracaoValor = new java.math.BigDecimal("0");

    /**
     * Field _movmtoReceitaTributavelSinal
     */
    private java.lang.String _movmtoReceitaTributavelSinal;

    /**
     * Field _movmtoReceitaTributavelValor
     */
    private java.math.BigDecimal _movmtoReceitaTributavelValor = new java.math.BigDecimal("0");

    /**
     * Field _percAliquotaApuracao
     */
    private java.math.BigDecimal _percAliquotaApuracao = new java.math.BigDecimal("0");

    /**
     * Field _tributoApuracaoSinal
     */
    private java.lang.String _tributoApuracaoSinal;

    /**
     * Field _tributoApuracaoValor
     */
    private java.math.BigDecimal _tributoApuracaoValor = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Ocorrencias() 
     {
        super();
        setMovmtoReceitaApuracaoValor(new java.math.BigDecimal("0"));
        setMovmtoReceitaTributavelValor(new java.math.BigDecimal("0"));
        setPercAliquotaApuracao(new java.math.BigDecimal("0"));
        setTributoApuracaoValor(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.Ocorrencias()


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
     * Returns the value of field 'movmtoReceitaApuracaoSinal'.
     * 
     * @return String
     * @return the value of field 'movmtoReceitaApuracaoSinal'.
     */
    public java.lang.String getMovmtoReceitaApuracaoSinal()
    {
        return this._movmtoReceitaApuracaoSinal;
    } //-- java.lang.String getMovmtoReceitaApuracaoSinal() 

    /**
     * Returns the value of field 'movmtoReceitaApuracaoValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'movmtoReceitaApuracaoValor'.
     */
    public java.math.BigDecimal getMovmtoReceitaApuracaoValor()
    {
        return this._movmtoReceitaApuracaoValor;
    } //-- java.math.BigDecimal getMovmtoReceitaApuracaoValor() 

    /**
     * Returns the value of field 'movmtoReceitaTributavelSinal'.
     * 
     * @return String
     * @return the value of field 'movmtoReceitaTributavelSinal'.
     */
    public java.lang.String getMovmtoReceitaTributavelSinal()
    {
        return this._movmtoReceitaTributavelSinal;
    } //-- java.lang.String getMovmtoReceitaTributavelSinal() 

    /**
     * Returns the value of field 'movmtoReceitaTributavelValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'movmtoReceitaTributavelValor'.
     */
    public java.math.BigDecimal getMovmtoReceitaTributavelValor()
    {
        return this._movmtoReceitaTributavelValor;
    } //-- java.math.BigDecimal getMovmtoReceitaTributavelValor() 

    /**
     * Returns the value of field 'percAliquotaApuracao'.
     * 
     * @return BigDecimal
     * @return the value of field 'percAliquotaApuracao'.
     */
    public java.math.BigDecimal getPercAliquotaApuracao()
    {
        return this._percAliquotaApuracao;
    } //-- java.math.BigDecimal getPercAliquotaApuracao() 

    /**
     * Returns the value of field 'tributoApuracaoSinal'.
     * 
     * @return String
     * @return the value of field 'tributoApuracaoSinal'.
     */
    public java.lang.String getTributoApuracaoSinal()
    {
        return this._tributoApuracaoSinal;
    } //-- java.lang.String getTributoApuracaoSinal() 

    /**
     * Returns the value of field 'tributoApuracaoValor'.
     * 
     * @return BigDecimal
     * @return the value of field 'tributoApuracaoValor'.
     */
    public java.math.BigDecimal getTributoApuracaoValor()
    {
        return this._tributoApuracaoValor;
    } //-- java.math.BigDecimal getTributoApuracaoValor() 

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
     * Sets the value of field 'movmtoReceitaApuracaoSinal'.
     * 
     * @param movmtoReceitaApuracaoSinal the value of field
     * 'movmtoReceitaApuracaoSinal'.
     */
    public void setMovmtoReceitaApuracaoSinal(java.lang.String movmtoReceitaApuracaoSinal)
    {
        this._movmtoReceitaApuracaoSinal = movmtoReceitaApuracaoSinal;
    } //-- void setMovmtoReceitaApuracaoSinal(java.lang.String) 

    /**
     * Sets the value of field 'movmtoReceitaApuracaoValor'.
     * 
     * @param movmtoReceitaApuracaoValor the value of field
     * 'movmtoReceitaApuracaoValor'.
     */
    public void setMovmtoReceitaApuracaoValor(java.math.BigDecimal movmtoReceitaApuracaoValor)
    {
        this._movmtoReceitaApuracaoValor = movmtoReceitaApuracaoValor;
    } //-- void setMovmtoReceitaApuracaoValor(java.math.BigDecimal) 

    /**
     * Sets the value of field 'movmtoReceitaTributavelSinal'.
     * 
     * @param movmtoReceitaTributavelSinal the value of field
     * 'movmtoReceitaTributavelSinal'.
     */
    public void setMovmtoReceitaTributavelSinal(java.lang.String movmtoReceitaTributavelSinal)
    {
        this._movmtoReceitaTributavelSinal = movmtoReceitaTributavelSinal;
    } //-- void setMovmtoReceitaTributavelSinal(java.lang.String) 

    /**
     * Sets the value of field 'movmtoReceitaTributavelValor'.
     * 
     * @param movmtoReceitaTributavelValor the value of field
     * 'movmtoReceitaTributavelValor'.
     */
    public void setMovmtoReceitaTributavelValor(java.math.BigDecimal movmtoReceitaTributavelValor)
    {
        this._movmtoReceitaTributavelValor = movmtoReceitaTributavelValor;
    } //-- void setMovmtoReceitaTributavelValor(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percAliquotaApuracao'.
     * 
     * @param percAliquotaApuracao the value of field
     * 'percAliquotaApuracao'.
     */
    public void setPercAliquotaApuracao(java.math.BigDecimal percAliquotaApuracao)
    {
        this._percAliquotaApuracao = percAliquotaApuracao;
    } //-- void setPercAliquotaApuracao(java.math.BigDecimal) 

    /**
     * Sets the value of field 'tributoApuracaoSinal'.
     * 
     * @param tributoApuracaoSinal the value of field
     * 'tributoApuracaoSinal'.
     */
    public void setTributoApuracaoSinal(java.lang.String tributoApuracaoSinal)
    {
        this._tributoApuracaoSinal = tributoApuracaoSinal;
    } //-- void setTributoApuracaoSinal(java.lang.String) 

    /**
     * Sets the value of field 'tributoApuracaoValor'.
     * 
     * @param tributoApuracaoValor the value of field
     * 'tributoApuracaoValor'.
     */
    public void setTributoApuracaoValor(java.math.BigDecimal tributoApuracaoValor)
    {
        this._tributoApuracaoValor = tributoApuracaoValor;
    } //-- void setTributoApuracaoValor(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Ocorrencias
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.Ocorrencias unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.Ocorrencias) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.Ocorrencias.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoreprocessamento.response.Ocorrencias unmarshal(java.io.Reader) 

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
