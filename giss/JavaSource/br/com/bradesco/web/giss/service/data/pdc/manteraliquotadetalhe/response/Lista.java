/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.response;

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
 * Class Lista.
 * 
 * @version $Revision$ $Date$
 */
public class Lista implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codigoMunicipio
     */
    private long _codigoMunicipio = 0;

    /**
     * keeps track of state for field: _codigoMunicipio
     */
    private boolean _has_codigoMunicipio;

    /**
     * Field _codigoItemServico
     */
    private int _codigoItemServico = 0;

    /**
     * keeps track of state for field: _codigoItemServico
     */
    private boolean _has_codigoItemServico;

    /**
     * Field _nomeItemServico
     */
    private java.lang.String _nomeItemServico;

    /**
     * Field _percentualAliquotaApuracaoAtualizado
     */
    private java.math.BigDecimal _percentualAliquotaApuracaoAtualizado = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public Lista() 
     {
        super();
        setPercentualAliquotaApuracaoAtualizado(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.response.Lista()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodigoItemServico
     * 
     */
    public void deleteCodigoItemServico()
    {
        this._has_codigoItemServico= false;
    } //-- void deleteCodigoItemServico() 

    /**
     * Method deleteCodigoMunicipio
     * 
     */
    public void deleteCodigoMunicipio()
    {
        this._has_codigoMunicipio= false;
    } //-- void deleteCodigoMunicipio() 

    /**
     * Returns the value of field 'codigoItemServico'.
     * 
     * @return int
     * @return the value of field 'codigoItemServico'.
     */
    public int getCodigoItemServico()
    {
        return this._codigoItemServico;
    } //-- int getCodigoItemServico() 

    /**
     * Returns the value of field 'codigoMunicipio'.
     * 
     * @return long
     * @return the value of field 'codigoMunicipio'.
     */
    public long getCodigoMunicipio()
    {
        return this._codigoMunicipio;
    } //-- long getCodigoMunicipio() 

    /**
     * Returns the value of field 'nomeItemServico'.
     * 
     * @return String
     * @return the value of field 'nomeItemServico'.
     */
    public java.lang.String getNomeItemServico()
    {
        return this._nomeItemServico;
    } //-- java.lang.String getNomeItemServico() 

    /**
     * Returns the value of field
     * 'percentualAliquotaApuracaoAtualizado'.
     * 
     * @return BigDecimal
     * @return the value of field
     * 'percentualAliquotaApuracaoAtualizado'.
     */
    public java.math.BigDecimal getPercentualAliquotaApuracaoAtualizado()
    {
        return this._percentualAliquotaApuracaoAtualizado;
    } //-- java.math.BigDecimal getPercentualAliquotaApuracaoAtualizado() 

    /**
     * Method hasCodigoItemServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoItemServico()
    {
        return this._has_codigoItemServico;
    } //-- boolean hasCodigoItemServico() 

    /**
     * Method hasCodigoMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoMunicipio()
    {
        return this._has_codigoMunicipio;
    } //-- boolean hasCodigoMunicipio() 

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
     * Sets the value of field 'codigoItemServico'.
     * 
     * @param codigoItemServico the value of field
     * 'codigoItemServico'.
     */
    public void setCodigoItemServico(int codigoItemServico)
    {
        this._codigoItemServico = codigoItemServico;
        this._has_codigoItemServico = true;
    } //-- void setCodigoItemServico(int) 

    /**
     * Sets the value of field 'codigoMunicipio'.
     * 
     * @param codigoMunicipio the value of field 'codigoMunicipio'.
     */
    public void setCodigoMunicipio(long codigoMunicipio)
    {
        this._codigoMunicipio = codigoMunicipio;
        this._has_codigoMunicipio = true;
    } //-- void setCodigoMunicipio(long) 

    /**
     * Sets the value of field 'nomeItemServico'.
     * 
     * @param nomeItemServico the value of field 'nomeItemServico'.
     */
    public void setNomeItemServico(java.lang.String nomeItemServico)
    {
        this._nomeItemServico = nomeItemServico;
    } //-- void setNomeItemServico(java.lang.String) 

    /**
     * Sets the value of field
     * 'percentualAliquotaApuracaoAtualizado'.
     * 
     * @param percentualAliquotaApuracaoAtualizado the value of
     * field 'percentualAliquotaApuracaoAtualizado'.
     */
    public void setPercentualAliquotaApuracaoAtualizado(java.math.BigDecimal percentualAliquotaApuracaoAtualizado)
    {
        this._percentualAliquotaApuracaoAtualizado = percentualAliquotaApuracaoAtualizado;
    } //-- void setPercentualAliquotaApuracaoAtualizado(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Lista
     */
    public static br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.response.Lista unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.response.Lista) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.response.Lista.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.manteraliquotadetalhe.response.Lista unmarshal(java.io.Reader) 

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
