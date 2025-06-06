/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request;

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
 * Class ListaMunicipioAgendar.
 * 
 * @version $Revision$ $Date$
 */
public class ListaMunicipioAgendar implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _valorTotalApuracaoIss
     */
    private java.math.BigDecimal _valorTotalApuracaoIss = new java.math.BigDecimal("0");

    /**
     * Field _valorMulta
     */
    private java.math.BigDecimal _valorMulta = new java.math.BigDecimal("0");

    /**
     * Field _percentualAtualizacaoMonetaria
     */
    private double _percentualAtualizacaoMonetaria = 0;

    /**
     * keeps track of state for field:
     * _percentualAtualizacaoMonetaria
     */
    private boolean _has_percentualAtualizacaoMonetaria;

    /**
     * Field _valorAtualizacaoMonetaria
     */
    private java.math.BigDecimal _valorAtualizacaoMonetaria = new java.math.BigDecimal("0");

    /**
     * Field _valorPagamento
     */
    private java.math.BigDecimal _valorPagamento = new java.math.BigDecimal("0");

    /**
     * Field _dataOrigem
     */
    private java.lang.String _dataOrigem;

    /**
     * Field _dataAgendamento
     */
    private java.lang.String _dataAgendamento;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaMunicipioAgendar() 
     {
        super();
        setValorTotalApuracaoIss(new java.math.BigDecimal("0"));
        setValorMulta(new java.math.BigDecimal("0"));
        setValorAtualizacaoMonetaria(new java.math.BigDecimal("0"));
        setValorPagamento(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deletePercentualAtualizacaoMonetaria
     * 
     */
    public void deletePercentualAtualizacaoMonetaria()
    {
        this._has_percentualAtualizacaoMonetaria= false;
    } //-- void deletePercentualAtualizacaoMonetaria() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'dataAgendamento'.
     * 
     * @return String
     * @return the value of field 'dataAgendamento'.
     */
    public java.lang.String getDataAgendamento()
    {
        return this._dataAgendamento;
    } //-- java.lang.String getDataAgendamento() 

    /**
     * Returns the value of field 'dataOrigem'.
     * 
     * @return String
     * @return the value of field 'dataOrigem'.
     */
    public java.lang.String getDataOrigem()
    {
        return this._dataOrigem;
    } //-- java.lang.String getDataOrigem() 

    /**
     * Returns the value of field 'percentualAtualizacaoMonetaria'.
     * 
     * @return double
     * @return the value of field 'percentualAtualizacaoMonetaria'.
     */
    public double getPercentualAtualizacaoMonetaria()
    {
        return this._percentualAtualizacaoMonetaria;
    } //-- double getPercentualAtualizacaoMonetaria() 

    /**
     * Returns the value of field 'valorAtualizacaoMonetaria'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorAtualizacaoMonetaria'.
     */
    public java.math.BigDecimal getValorAtualizacaoMonetaria()
    {
        return this._valorAtualizacaoMonetaria;
    } //-- java.math.BigDecimal getValorAtualizacaoMonetaria() 

    /**
     * Returns the value of field 'valorMulta'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorMulta'.
     */
    public java.math.BigDecimal getValorMulta()
    {
        return this._valorMulta;
    } //-- java.math.BigDecimal getValorMulta() 

    /**
     * Returns the value of field 'valorPagamento'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorPagamento'.
     */
    public java.math.BigDecimal getValorPagamento()
    {
        return this._valorPagamento;
    } //-- java.math.BigDecimal getValorPagamento() 

    /**
     * Returns the value of field 'valorTotalApuracaoIss'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalApuracaoIss'.
     */
    public java.math.BigDecimal getValorTotalApuracaoIss()
    {
        return this._valorTotalApuracaoIss;
    } //-- java.math.BigDecimal getValorTotalApuracaoIss() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasPercentualAtualizacaoMonetaria
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasPercentualAtualizacaoMonetaria()
    {
        return this._has_percentualAtualizacaoMonetaria;
    } //-- boolean hasPercentualAtualizacaoMonetaria() 

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
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'dataAgendamento'.
     * 
     * @param dataAgendamento the value of field 'dataAgendamento'.
     */
    public void setDataAgendamento(java.lang.String dataAgendamento)
    {
        this._dataAgendamento = dataAgendamento;
    } //-- void setDataAgendamento(java.lang.String) 

    /**
     * Sets the value of field 'dataOrigem'.
     * 
     * @param dataOrigem the value of field 'dataOrigem'.
     */
    public void setDataOrigem(java.lang.String dataOrigem)
    {
        this._dataOrigem = dataOrigem;
    } //-- void setDataOrigem(java.lang.String) 

    /**
     * Sets the value of field 'percentualAtualizacaoMonetaria'.
     * 
     * @param percentualAtualizacaoMonetaria the value of field
     * 'percentualAtualizacaoMonetaria'.
     */
    public void setPercentualAtualizacaoMonetaria(double percentualAtualizacaoMonetaria)
    {
        this._percentualAtualizacaoMonetaria = percentualAtualizacaoMonetaria;
        this._has_percentualAtualizacaoMonetaria = true;
    } //-- void setPercentualAtualizacaoMonetaria(double) 

    /**
     * Sets the value of field 'valorAtualizacaoMonetaria'.
     * 
     * @param valorAtualizacaoMonetaria the value of field
     * 'valorAtualizacaoMonetaria'.
     */
    public void setValorAtualizacaoMonetaria(java.math.BigDecimal valorAtualizacaoMonetaria)
    {
        this._valorAtualizacaoMonetaria = valorAtualizacaoMonetaria;
    } //-- void setValorAtualizacaoMonetaria(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorMulta'.
     * 
     * @param valorMulta the value of field 'valorMulta'.
     */
    public void setValorMulta(java.math.BigDecimal valorMulta)
    {
        this._valorMulta = valorMulta;
    } //-- void setValorMulta(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorPagamento'.
     * 
     * @param valorPagamento the value of field 'valorPagamento'.
     */
    public void setValorPagamento(java.math.BigDecimal valorPagamento)
    {
        this._valorPagamento = valorPagamento;
    } //-- void setValorPagamento(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalApuracaoIss'.
     * 
     * @param valorTotalApuracaoIss the value of field
     * 'valorTotalApuracaoIss'.
     */
    public void setValorTotalApuracaoIss(java.math.BigDecimal valorTotalApuracaoIss)
    {
        this._valorTotalApuracaoIss = valorTotalApuracaoIss;
    } //-- void setValorTotalApuracaoIss(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaMunicipioAgendar
     */
    public static br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.agendarpgtoindividual.request.ListaMunicipioAgendar unmarshal(java.io.Reader) 

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
