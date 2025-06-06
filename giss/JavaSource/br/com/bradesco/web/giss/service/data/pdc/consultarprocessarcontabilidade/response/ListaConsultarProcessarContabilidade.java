/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaConsultarProcessarContabilidade.java,v 1.1 2018/01/12 17:35:07 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response;

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
 * Class ListaConsultarProcessarContabilidade.
 * 
 * @version $Revision: 1.1 $ $Date: 2018/01/12 17:35:07 $
 */
public class ListaConsultarProcessarContabilidade implements java.io.Serializable {


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
     * Field _descEspresa
     */
    private int _descEspresa = 0;

    /**
     * keeps track of state for field: _descEspresa
     */
    private boolean _has_descEspresa;

    /**
     * Field _napurcIssEmpresa
     */
    private int _napurcIssEmpresa = 0;

    /**
     * keeps track of state for field: _napurcIssEmpresa
     */
    private boolean _has_napurcIssEmpresa;

    /**
     * Field _produto
     */
    private java.lang.String _produto;

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

    public ListaConsultarProcessarContabilidade() 
     {
        super();
        setValorReceita(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade()


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
     * Method deleteDescEspresa
     * 
     */
    public void deleteDescEspresa()
    {
        this._has_descEspresa= false;
    } //-- void deleteDescEspresa() 

    /**
     * Method deleteNapurcIssEmpresa
     * 
     */
    public void deleteNapurcIssEmpresa()
    {
        this._has_napurcIssEmpresa= false;
    } //-- void deleteNapurcIssEmpresa() 

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
     * Returns the value of field 'descEspresa'.
     * 
     * @return int
     * @return the value of field 'descEspresa'.
     */
    public int getDescEspresa()
    {
        return this._descEspresa;
    } //-- int getDescEspresa() 

    /**
     * Returns the value of field 'napurcIssEmpresa'.
     * 
     * @return int
     * @return the value of field 'napurcIssEmpresa'.
     */
    public int getNapurcIssEmpresa()
    {
        return this._napurcIssEmpresa;
    } //-- int getNapurcIssEmpresa() 

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
     * Method hasDescEspresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDescEspresa()
    {
        return this._has_descEspresa;
    } //-- boolean hasDescEspresa() 

    /**
     * Method hasNapurcIssEmpresa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNapurcIssEmpresa()
    {
        return this._has_napurcIssEmpresa;
    } //-- boolean hasNapurcIssEmpresa() 

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
     * Sets the value of field 'dataRecepcao'.
     * 
     * @param dataRecepcao the value of field 'dataRecepcao'.
     */
    public void setDataRecepcao(java.lang.String dataRecepcao)
    {
        this._dataRecepcao = dataRecepcao;
    } //-- void setDataRecepcao(java.lang.String) 

    /**
     * Sets the value of field 'descEspresa'.
     * 
     * @param descEspresa the value of field 'descEspresa'.
     */
    public void setDescEspresa(int descEspresa)
    {
        this._descEspresa = descEspresa;
        this._has_descEspresa = true;
    } //-- void setDescEspresa(int) 

    /**
     * Sets the value of field 'napurcIssEmpresa'.
     * 
     * @param napurcIssEmpresa the value of field 'napurcIssEmpresa'
     */
    public void setNapurcIssEmpresa(int napurcIssEmpresa)
    {
        this._napurcIssEmpresa = napurcIssEmpresa;
        this._has_napurcIssEmpresa = true;
    } //-- void setNapurcIssEmpresa(int) 

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
     * @return ListaConsultarProcessarContabilidade
     */
    public static br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.consultarprocessarcontabilidade.response.ListaConsultarProcessarContabilidade unmarshal(java.io.Reader) 

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
