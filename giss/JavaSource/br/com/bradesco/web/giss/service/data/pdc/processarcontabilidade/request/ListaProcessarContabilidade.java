/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaProcessarContabilidade.java,v 1.2 2018/01/19 16:31:09 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request;

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
 * Class ListaProcessarContabilidade.
 * 
 * @version $Revision: 1.2 $ $Date: 2018/01/19 16:31:09 $
 */
public class ListaProcessarContabilidade implements java.io.Serializable {


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
     * Field _codIdentificadorTransIss
     */
    private int _codIdentificadorTransIss = 0;

    /**
     * keeps track of state for field: _codIdentificadorTransIss
     */
    private boolean _has_codIdentificadorTransIss;

    /**
     * Field _NApurcIssEmpresa
     */
    private int _NApurcIssEmpresa = 0;

    /**
     * keeps track of state for field: _NApurcIssEmpresa
     */
    private boolean _has_NApurcIssEmpresa;

    /**
     * Field _producao
     */
    private java.lang.String _producao;

    /**
     * Field _dataRecepcao
     */
    private java.lang.String _dataRecepcao;

    /**
     * Field _qtdRegistros
     */
    private long _qtdRegistros = 0;

    /**
     * keeps track of state for field: _qtdRegistros
     */
    private boolean _has_qtdRegistros;

    /**
     * Field _valorReceita
     */
    private java.math.BigDecimal _valorReceita = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaProcessarContabilidade() 
     {
        super();
        setValorReceita(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade()


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
     * Method deleteCodIdentificadorTransIss
     * 
     */
    public void deleteCodIdentificadorTransIss()
    {
        this._has_codIdentificadorTransIss= false;
    } //-- void deleteCodIdentificadorTransIss() 

    /**
     * Method deleteNApurcIssEmpresa
     * 
     */
    public void deleteNApurcIssEmpresa()
    {
        this._has_NApurcIssEmpresa= false;
    } //-- void deleteNApurcIssEmpresa() 

    /**
     * Method deleteQtdRegistros
     * 
     */
    public void deleteQtdRegistros()
    {
        this._has_qtdRegistros= false;
    } //-- void deleteQtdRegistros() 

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
     * Returns the value of field 'codIdentificadorTransIss'.
     * 
     * @return int
     * @return the value of field 'codIdentificadorTransIss'.
     */
    public int getCodIdentificadorTransIss()
    {
        return this._codIdentificadorTransIss;
    } //-- int getCodIdentificadorTransIss() 

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
     * Returns the value of field 'producao'.
     * 
     * @return String
     * @return the value of field 'producao'.
     */
    public java.lang.String getProducao()
    {
        return this._producao;
    } //-- java.lang.String getProducao() 

    /**
     * Returns the value of field 'qtdRegistros'.
     * 
     * @return long
     * @return the value of field 'qtdRegistros'.
     */
    public long getQtdRegistros()
    {
        return this._qtdRegistros;
    } //-- long getQtdRegistros() 

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
     * Method hasCodIdentificadorTransIss
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodIdentificadorTransIss()
    {
        return this._has_codIdentificadorTransIss;
    } //-- boolean hasCodIdentificadorTransIss() 

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
     * Method hasQtdRegistros
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasQtdRegistros()
    {
        return this._has_qtdRegistros;
    } //-- boolean hasQtdRegistros() 

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
     * Sets the value of field 'codIdentificadorTransIss'.
     * 
     * @param codIdentificadorTransIss the value of field
     * 'codIdentificadorTransIss'.
     */
    public void setCodIdentificadorTransIss(int codIdentificadorTransIss)
    {
        this._codIdentificadorTransIss = codIdentificadorTransIss;
        this._has_codIdentificadorTransIss = true;
    } //-- void setCodIdentificadorTransIss(int) 

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
     * Sets the value of field 'producao'.
     * 
     * @param producao the value of field 'producao'.
     */
    public void setProducao(java.lang.String producao)
    {
        this._producao = producao;
    } //-- void setProducao(java.lang.String) 

    /**
     * Sets the value of field 'qtdRegistros'.
     * 
     * @param qtdRegistros the value of field 'qtdRegistros'.
     */
    public void setQtdRegistros(long qtdRegistros)
    {
        this._qtdRegistros = qtdRegistros;
        this._has_qtdRegistros = true;
    } //-- void setQtdRegistros(long) 

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
     * @return ListaProcessarContabilidade
     */
    public static br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.processarcontabilidade.request.ListaProcessarContabilidade unmarshal(java.io.Reader) 

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
