/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response;

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
     * Field _numeroParametro
     */
    private int _numeroParametro = 0;

    /**
     * keeps track of state for field: _numeroParametro
     */
    private boolean _has_numeroParametro;

    /**
     * Field _percentualMinimo
     */
    private java.math.BigDecimal _percentualMinimo = new java.math.BigDecimal("0");

    /**
     * Field _percentualMaximo
     */
    private java.math.BigDecimal _percentualMaximo = new java.math.BigDecimal("0");

    /**
     * Field _dataInicioVigencia
     */
    private java.lang.String _dataInicioVigencia;

    /**
     * Field _dataFimVigencia
     */
    private java.lang.String _dataFimVigencia;

    /**
     * Field _usuarioManutencao
     */
    private java.lang.String _usuarioManutencao;

    /**
     * Field _dataHoraManutencao
     */
    private java.lang.String _dataHoraManutencao;


      //----------------/
     //- Constructors -/
    //----------------/

    public Lista() 
     {
        super();
        setPercentualMinimo(new java.math.BigDecimal("0"));
        setPercentualMaximo(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteNumeroParametro
     * 
     */
    public void deleteNumeroParametro()
    {
        this._has_numeroParametro= false;
    } //-- void deleteNumeroParametro() 

    /**
     * Returns the value of field 'dataFimVigencia'.
     * 
     * @return String
     * @return the value of field 'dataFimVigencia'.
     */
    public java.lang.String getDataFimVigencia()
    {
        return this._dataFimVigencia;
    } //-- java.lang.String getDataFimVigencia() 

    /**
     * Returns the value of field 'dataHoraManutencao'.
     * 
     * @return String
     * @return the value of field 'dataHoraManutencao'.
     */
    public java.lang.String getDataHoraManutencao()
    {
        return this._dataHoraManutencao;
    } //-- java.lang.String getDataHoraManutencao() 

    /**
     * Returns the value of field 'dataInicioVigencia'.
     * 
     * @return String
     * @return the value of field 'dataInicioVigencia'.
     */
    public java.lang.String getDataInicioVigencia()
    {
        return this._dataInicioVigencia;
    } //-- java.lang.String getDataInicioVigencia() 

    /**
     * Returns the value of field 'numeroParametro'.
     * 
     * @return int
     * @return the value of field 'numeroParametro'.
     */
    public int getNumeroParametro()
    {
        return this._numeroParametro;
    } //-- int getNumeroParametro() 

    /**
     * Returns the value of field 'percentualMaximo'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentualMaximo'.
     */
    public java.math.BigDecimal getPercentualMaximo()
    {
        return this._percentualMaximo;
    } //-- java.math.BigDecimal getPercentualMaximo() 

    /**
     * Returns the value of field 'percentualMinimo'.
     * 
     * @return BigDecimal
     * @return the value of field 'percentualMinimo'.
     */
    public java.math.BigDecimal getPercentualMinimo()
    {
        return this._percentualMinimo;
    } //-- java.math.BigDecimal getPercentualMinimo() 

    /**
     * Returns the value of field 'usuarioManutencao'.
     * 
     * @return String
     * @return the value of field 'usuarioManutencao'.
     */
    public java.lang.String getUsuarioManutencao()
    {
        return this._usuarioManutencao;
    } //-- java.lang.String getUsuarioManutencao() 

    /**
     * Method hasNumeroParametro
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroParametro()
    {
        return this._has_numeroParametro;
    } //-- boolean hasNumeroParametro() 

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
     * Sets the value of field 'dataFimVigencia'.
     * 
     * @param dataFimVigencia the value of field 'dataFimVigencia'.
     */
    public void setDataFimVigencia(java.lang.String dataFimVigencia)
    {
        this._dataFimVigencia = dataFimVigencia;
    } //-- void setDataFimVigencia(java.lang.String) 

    /**
     * Sets the value of field 'dataHoraManutencao'.
     * 
     * @param dataHoraManutencao the value of field
     * 'dataHoraManutencao'.
     */
    public void setDataHoraManutencao(java.lang.String dataHoraManutencao)
    {
        this._dataHoraManutencao = dataHoraManutencao;
    } //-- void setDataHoraManutencao(java.lang.String) 

    /**
     * Sets the value of field 'dataInicioVigencia'.
     * 
     * @param dataInicioVigencia the value of field
     * 'dataInicioVigencia'.
     */
    public void setDataInicioVigencia(java.lang.String dataInicioVigencia)
    {
        this._dataInicioVigencia = dataInicioVigencia;
    } //-- void setDataInicioVigencia(java.lang.String) 

    /**
     * Sets the value of field 'numeroParametro'.
     * 
     * @param numeroParametro the value of field 'numeroParametro'.
     */
    public void setNumeroParametro(int numeroParametro)
    {
        this._numeroParametro = numeroParametro;
        this._has_numeroParametro = true;
    } //-- void setNumeroParametro(int) 

    /**
     * Sets the value of field 'percentualMaximo'.
     * 
     * @param percentualMaximo the value of field 'percentualMaximo'
     */
    public void setPercentualMaximo(java.math.BigDecimal percentualMaximo)
    {
        this._percentualMaximo = percentualMaximo;
    } //-- void setPercentualMaximo(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percentualMinimo'.
     * 
     * @param percentualMinimo the value of field 'percentualMinimo'
     */
    public void setPercentualMinimo(java.math.BigDecimal percentualMinimo)
    {
        this._percentualMinimo = percentualMinimo;
    } //-- void setPercentualMinimo(java.math.BigDecimal) 

    /**
     * Sets the value of field 'usuarioManutencao'.
     * 
     * @param usuarioManutencao the value of field
     * 'usuarioManutencao'.
     */
    public void setUsuarioManutencao(java.lang.String usuarioManutencao)
    {
        this._usuarioManutencao = usuarioManutencao;
    } //-- void setUsuarioManutencao(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Lista
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarhistoricominmaxaliquota.response.Lista unmarshal(java.io.Reader) 

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
