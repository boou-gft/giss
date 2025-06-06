/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request;

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
 * Class ListaLiberarPagamento.
 * 
 * @version $Revision$ $Date$
 */
public class ListaLiberarPagamento implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _anoMes
     */
    private int _anoMes = 0;

    /**
     * keeps track of state for field: _anoMes
     */
    private boolean _has_anoMes;

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _codIdentificacaoTransIss
     */
    private int _codIdentificacaoTransIss = 0;

    /**
     * keeps track of state for field: _codIdentificacaoTransIss
     */
    private boolean _has_codIdentificacaoTransIss;

    /**
     * Field _NApurcIssEmpresa
     */
    private int _NApurcIssEmpresa = 0;

    /**
     * keeps track of state for field: _NApurcIssEmpresa
     */
    private boolean _has_NApurcIssEmpresa;

    /**
     * Field _produto
     */
    private java.lang.String _produto;

    /**
     * Field _dataRecepcao
     */
    private java.lang.String _dataRecepcao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaLiberarPagamento() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAnoMes
     * 
     */
    public void deleteAnoMes()
    {
        this._has_anoMes= false;
    } //-- void deleteAnoMes() 

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteCodIdentificacaoTransIss
     * 
     */
    public void deleteCodIdentificacaoTransIss()
    {
        this._has_codIdentificacaoTransIss= false;
    } //-- void deleteCodIdentificacaoTransIss() 

    /**
     * Method deleteNApurcIssEmpresa
     * 
     */
    public void deleteNApurcIssEmpresa()
    {
        this._has_NApurcIssEmpresa= false;
    } //-- void deleteNApurcIssEmpresa() 

    /**
     * Returns the value of field 'anoMes'.
     * 
     * @return int
     * @return the value of field 'anoMes'.
     */
    public int getAnoMes()
    {
        return this._anoMes;
    } //-- int getAnoMes() 

    /**
     * Returns the value of field 'codEmpresa'.
     * 
     * @return int
     * @return the value of field 'codEmpresa'.
     */
    public int getCodEmpresa()
    {
        return this._codEmpresa;
    } //-- int getCodEmpresa() 

    /**
     * Returns the value of field 'codIdentificacaoTransIss'.
     * 
     * @return int
     * @return the value of field 'codIdentificacaoTransIss'.
     */
    public int getCodIdentificacaoTransIss()
    {
        return this._codIdentificacaoTransIss;
    } //-- int getCodIdentificacaoTransIss() 

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
     * Returns the value of field 'NApurcIssEmpresa'.
     * 
     * @return int
     * @return the value of field 'NApurcIssEmpresa'.
     */
    public int getNApurcIssEmpresa()
    {
        return this._NApurcIssEmpresa;
    } //-- int getNApurcIssEmpresa() 

    /**
     * Returns the value of field 'produto'.
     * 
     * @return String
     * @return the value of field 'produto'.
     */
    public java.lang.String getProduto()
    {
        return this._produto;
    } //-- java.lang.String getProduto() 

    /**
     * Method hasAnoMes
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAnoMes()
    {
        return this._has_anoMes;
    } //-- boolean hasAnoMes() 

    /**
     * Method hasCodEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodEmpresa()
    {
        return this._has_codEmpresa;
    } //-- boolean hasCodEmpresa() 

    /**
     * Method hasCodIdentificacaoTransIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodIdentificacaoTransIss()
    {
        return this._has_codIdentificacaoTransIss;
    } //-- boolean hasCodIdentificacaoTransIss() 

    /**
     * Method hasNApurcIssEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNApurcIssEmpresa()
    {
        return this._has_NApurcIssEmpresa;
    } //-- boolean hasNApurcIssEmpresa() 

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
     * Sets the value of field 'anoMes'.
     * 
     * @param anoMes the value of field 'anoMes'.
     */
    public void setAnoMes(int anoMes)
    {
        this._anoMes = anoMes;
        this._has_anoMes = true;
    } //-- void setAnoMes(int) 

    /**
     * Sets the value of field 'codEmpresa'.
     * 
     * @param codEmpresa the value of field 'codEmpresa'.
     */
    public void setCodEmpresa(int codEmpresa)
    {
        this._codEmpresa = codEmpresa;
        this._has_codEmpresa = true;
    } //-- void setCodEmpresa(int) 

    /**
     * Sets the value of field 'codIdentificacaoTransIss'.
     * 
     * @param codIdentificacaoTransIss the value of field
     * 'codIdentificacaoTransIss'.
     */
    public void setCodIdentificacaoTransIss(int codIdentificacaoTransIss)
    {
        this._codIdentificacaoTransIss = codIdentificacaoTransIss;
        this._has_codIdentificacaoTransIss = true;
    } //-- void setCodIdentificacaoTransIss(int) 

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
     * Sets the value of field 'NApurcIssEmpresa'.
     * 
     * @param NApurcIssEmpresa the value of field 'NApurcIssEmpresa'
     */
    public void setNApurcIssEmpresa(int NApurcIssEmpresa)
    {
        this._NApurcIssEmpresa = NApurcIssEmpresa;
        this._has_NApurcIssEmpresa = true;
    } //-- void setNApurcIssEmpresa(int) 

    /**
     * Sets the value of field 'produto'.
     * 
     * @param produto the value of field 'produto'.
     */
    public void setProduto(java.lang.String produto)
    {
        this._produto = produto;
    } //-- void setProduto(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaLiberarPagamento
     */
    public static br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.liberarpagamento.request.ListaLiberarPagamento unmarshal(java.io.Reader) 

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
