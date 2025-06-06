/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request;

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
 * Class ListaEntrada.
 * 
 * @version $Revision$ $Date$
 */
public class ListaEntrada implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _anoMesCompetencia
     */
    private int _anoMesCompetencia = 0;

    /**
     * keeps track of state for field: _anoMesCompetencia
     */
    private boolean _has_anoMesCompetencia;

    /**
     * Field _codigoEmpresa
     */
    private int _codigoEmpresa = 0;

    /**
     * keeps track of state for field: _codigoEmpresa
     */
    private boolean _has_codigoEmpresa;

    /**
     * Field _identificadorTransacaoIss
     */
    private int _identificadorTransacaoIss = 0;

    /**
     * keeps track of state for field: _identificadorTransacaoIss
     */
    private boolean _has_identificadorTransacaoIss;

    /**
     * Field _numeroApuracaoIss
     */
    private int _numeroApuracaoIss = 0;

    /**
     * keeps track of state for field: _numeroApuracaoIss
     */
    private boolean _has_numeroApuracaoIss;

    /**
     * Field _nomeProduto
     */
    private java.lang.String _nomeProduto;

    /**
     * Field _dataRecepcao
     */
    private java.lang.String _dataRecepcao;

    /**
     * Field _quantidadeRegistro
     */
    private long _quantidadeRegistro = 0;

    /**
     * keeps track of state for field: _quantidadeRegistro
     */
    private boolean _has_quantidadeRegistro;

    /**
     * Field _valorReceita
     */
    private java.math.BigDecimal _valorReceita = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaEntrada() 
     {
        super();
        setValorReceita(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request.ListaEntrada()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAnoMesCompetencia
     * 
     */
    public void deleteAnoMesCompetencia()
    {
        this._has_anoMesCompetencia= false;
    } //-- void deleteAnoMesCompetencia() 

    /**
     * Method deleteCodigoEmpresa
     * 
     */
    public void deleteCodigoEmpresa()
    {
        this._has_codigoEmpresa= false;
    } //-- void deleteCodigoEmpresa() 

    /**
     * Method deleteIdentificadorTransacaoIss
     * 
     */
    public void deleteIdentificadorTransacaoIss()
    {
        this._has_identificadorTransacaoIss= false;
    } //-- void deleteIdentificadorTransacaoIss() 

    /**
     * Method deleteNumeroApuracaoIss
     * 
     */
    public void deleteNumeroApuracaoIss()
    {
        this._has_numeroApuracaoIss= false;
    } //-- void deleteNumeroApuracaoIss() 

    /**
     * Method deleteQuantidadeRegistro
     * 
     */
    public void deleteQuantidadeRegistro()
    {
        this._has_quantidadeRegistro= false;
    } //-- void deleteQuantidadeRegistro() 

    /**
     * Returns the value of field 'anoMesCompetencia'.
     * 
     * @return int
     * @return the value of field 'anoMesCompetencia'.
     */
    public int getAnoMesCompetencia()
    {
        return this._anoMesCompetencia;
    } //-- int getAnoMesCompetencia() 

    /**
     * Returns the value of field 'codigoEmpresa'.
     * 
     * @return int
     * @return the value of field 'codigoEmpresa'.
     */
    public int getCodigoEmpresa()
    {
        return this._codigoEmpresa;
    } //-- int getCodigoEmpresa() 

    /**
     * Returns the value of field 'dataRecepcao'.
     * 
     * @return String
     * @return the value of field 'dataRecepcao'.
     */
    public java.lang.String getDataRecepcao()
    {
        return this._dataRecepcao;
    } //-- java.lang.String getDataRecepcao() 

    /**
     * Returns the value of field 'identificadorTransacaoIss'.
     * 
     * @return int
     * @return the value of field 'identificadorTransacaoIss'.
     */
    public int getIdentificadorTransacaoIss()
    {
        return this._identificadorTransacaoIss;
    } //-- int getIdentificadorTransacaoIss() 

    /**
     * Returns the value of field 'nomeProduto'.
     * 
     * @return String
     * @return the value of field 'nomeProduto'.
     */
    public java.lang.String getNomeProduto()
    {
        return this._nomeProduto;
    } //-- java.lang.String getNomeProduto() 

    /**
     * Returns the value of field 'numeroApuracaoIss'.
     * 
     * @return int
     * @return the value of field 'numeroApuracaoIss'.
     */
    public int getNumeroApuracaoIss()
    {
        return this._numeroApuracaoIss;
    } //-- int getNumeroApuracaoIss() 

    /**
     * Returns the value of field 'quantidadeRegistro'.
     * 
     * @return long
     * @return the value of field 'quantidadeRegistro'.
     */
    public long getQuantidadeRegistro()
    {
        return this._quantidadeRegistro;
    } //-- long getQuantidadeRegistro() 

    /**
     * Returns the value of field 'valorReceita'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorReceita'.
     */
    public java.math.BigDecimal getValorReceita()
    {
        return this._valorReceita;
    } //-- java.math.BigDecimal getValorReceita() 

    /**
     * Method hasAnoMesCompetencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoMesCompetencia()
    {
        return this._has_anoMesCompetencia;
    } //-- boolean hasAnoMesCompetencia() 

    /**
     * Method hasCodigoEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodigoEmpresa()
    {
        return this._has_codigoEmpresa;
    } //-- boolean hasCodigoEmpresa() 

    /**
     * Method hasIdentificadorTransacaoIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasIdentificadorTransacaoIss()
    {
        return this._has_identificadorTransacaoIss;
    } //-- boolean hasIdentificadorTransacaoIss() 

    /**
     * Method hasNumeroApuracaoIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumeroApuracaoIss()
    {
        return this._has_numeroApuracaoIss;
    } //-- boolean hasNumeroApuracaoIss() 

    /**
     * Method hasQuantidadeRegistro
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQuantidadeRegistro()
    {
        return this._has_quantidadeRegistro;
    } //-- boolean hasQuantidadeRegistro() 

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
     * Sets the value of field 'anoMesCompetencia'.
     * 
     * @param anoMesCompetencia the value of field
     * 'anoMesCompetencia'.
     */
    public void setAnoMesCompetencia(int anoMesCompetencia)
    {
        this._anoMesCompetencia = anoMesCompetencia;
        this._has_anoMesCompetencia = true;
    } //-- void setAnoMesCompetencia(int) 

    /**
     * Sets the value of field 'codigoEmpresa'.
     * 
     * @param codigoEmpresa the value of field 'codigoEmpresa'.
     */
    public void setCodigoEmpresa(int codigoEmpresa)
    {
        this._codigoEmpresa = codigoEmpresa;
        this._has_codigoEmpresa = true;
    } //-- void setCodigoEmpresa(int) 

    /**
     * Sets the value of field 'dataRecepcao'.
     * 
     * @param dataRecepcao the value of field 'dataRecepcao'.
     */
    public void setDataRecepcao(java.lang.String dataRecepcao)
    {
        this._dataRecepcao = dataRecepcao;
    } //-- void setDataRecepcao(java.lang.String) 

    /**
     * Sets the value of field 'identificadorTransacaoIss'.
     * 
     * @param identificadorTransacaoIss the value of field
     * 'identificadorTransacaoIss'.
     */
    public void setIdentificadorTransacaoIss(int identificadorTransacaoIss)
    {
        this._identificadorTransacaoIss = identificadorTransacaoIss;
        this._has_identificadorTransacaoIss = true;
    } //-- void setIdentificadorTransacaoIss(int) 

    /**
     * Sets the value of field 'nomeProduto'.
     * 
     * @param nomeProduto the value of field 'nomeProduto'.
     */
    public void setNomeProduto(java.lang.String nomeProduto)
    {
        this._nomeProduto = nomeProduto;
    } //-- void setNomeProduto(java.lang.String) 

    /**
     * Sets the value of field 'numeroApuracaoIss'.
     * 
     * @param numeroApuracaoIss the value of field
     * 'numeroApuracaoIss'.
     */
    public void setNumeroApuracaoIss(int numeroApuracaoIss)
    {
        this._numeroApuracaoIss = numeroApuracaoIss;
        this._has_numeroApuracaoIss = true;
    } //-- void setNumeroApuracaoIss(int) 

    /**
     * Sets the value of field 'quantidadeRegistro'.
     * 
     * @param quantidadeRegistro the value of field
     * 'quantidadeRegistro'.
     */
    public void setQuantidadeRegistro(long quantidadeRegistro)
    {
        this._quantidadeRegistro = quantidadeRegistro;
        this._has_quantidadeRegistro = true;
    } //-- void setQuantidadeRegistro(long) 

    /**
     * Sets the value of field 'valorReceita'.
     * 
     * @param valorReceita the value of field 'valorReceita'.
     */
    public void setValorReceita(java.math.BigDecimal valorReceita)
    {
        this._valorReceita = valorReceita;
    } //-- void setValorReceita(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaEntrada
     */
    public static br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request.ListaEntrada unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request.ListaEntrada) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request.ListaEntrada.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarretificadorcontabil.request.ListaEntrada unmarshal(java.io.Reader) 

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
