/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response;

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
 * Class ListaRelatorioApuracao.
 * 
 * @version $Revision$ $Date$
 */
public class ListaRelatorioApuracao implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _descEmpresa
     */
    private java.lang.String _descEmpresa;

    /**
     * Field _produto
     */
    private java.lang.String _produto;

    /**
     * Field _dtMesAno
     */
    private int _dtMesAno = 0;

    /**
     * keeps track of state for field: _dtMesAno
     */
    private boolean _has_dtMesAno;

    /**
     * Field _valorTotalCredito
     */
    private java.math.BigDecimal _valorTotalCredito = new java.math.BigDecimal("0");

    /**
     * Field _valorTotalApuracao
     */
    private java.math.BigDecimal _valorTotalApuracao = new java.math.BigDecimal("0");

    /**
     * Field _codMunicipioPrestador
     */
    private long _codMunicipioPrestador = 0;

    /**
     * keeps track of state for field: _codMunicipioPrestador
     */
    private boolean _has_codMunicipioPrestador;

    /**
     * Field _descMunicipioPrestador
     */
    private java.lang.String _descMunicipioPrestador;

    /**
     * Field _siglaUfPrestador
     */
    private java.lang.String _siglaUfPrestador;

    /**
     * Field _valorTotalReceitaPrestador
     */
    private java.math.BigDecimal _valorTotalReceitaPrestador = new java.math.BigDecimal("0");

    /**
     * Field _percAliquotaPrestador
     */
    private java.math.BigDecimal _percAliquotaPrestador = new java.math.BigDecimal("0");

    /**
     * Field _valorTotalApuracaoPresstador
     */
    private java.math.BigDecimal _valorTotalApuracaoPresstador = new java.math.BigDecimal("0");

    /**
     * Field _codMunicipioTomador
     */
    private long _codMunicipioTomador = 0;

    /**
     * keeps track of state for field: _codMunicipioTomador
     */
    private boolean _has_codMunicipioTomador;

    /**
     * Field _descMunicipioTomador
     */
    private java.lang.String _descMunicipioTomador;

    /**
     * Field _siglaUfTomador
     */
    private java.lang.String _siglaUfTomador;

    /**
     * Field _valorTotalReceitaTomador
     */
    private java.math.BigDecimal _valorTotalReceitaTomador = new java.math.BigDecimal("0");

    /**
     * Field _percAliquotaTomador
     */
    private java.math.BigDecimal _percAliquotaTomador = new java.math.BigDecimal("0");

    /**
     * Field _valorTotalApuracaoTomador
     */
    private java.math.BigDecimal _valorTotalApuracaoTomador = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaRelatorioApuracao() 
     {
        super();
        setValorTotalCredito(new java.math.BigDecimal("0"));
        setValorTotalApuracao(new java.math.BigDecimal("0"));
        setValorTotalReceitaPrestador(new java.math.BigDecimal("0"));
        setPercAliquotaPrestador(new java.math.BigDecimal("0"));
        setValorTotalApuracaoPresstador(new java.math.BigDecimal("0"));
        setValorTotalReceitaTomador(new java.math.BigDecimal("0"));
        setPercAliquotaTomador(new java.math.BigDecimal("0"));
        setValorTotalApuracaoTomador(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodEmpresa
     * 
     */
    public void deleteCodEmpresa()
    {
        this._has_codEmpresa= false;
    } //-- void deleteCodEmpresa() 

    /**
     * Method deleteCodMunicipioPrestador
     * 
     */
    public void deleteCodMunicipioPrestador()
    {
        this._has_codMunicipioPrestador= false;
    } //-- void deleteCodMunicipioPrestador() 

    /**
     * Method deleteCodMunicipioTomador
     * 
     */
    public void deleteCodMunicipioTomador()
    {
        this._has_codMunicipioTomador= false;
    } //-- void deleteCodMunicipioTomador() 

    /**
     * Method deleteDtMesAno
     * 
     */
    public void deleteDtMesAno()
    {
        this._has_dtMesAno= false;
    } //-- void deleteDtMesAno() 

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
     * Returns the value of field 'codMunicipioPrestador'.
     * 
     * @return long
     * @return the value of field 'codMunicipioPrestador'.
     */
    public long getCodMunicipioPrestador()
    {
        return this._codMunicipioPrestador;
    } //-- long getCodMunicipioPrestador() 

    /**
     * Returns the value of field 'codMunicipioTomador'.
     * 
     * @return long
     * @return the value of field 'codMunicipioTomador'.
     */
    public long getCodMunicipioTomador()
    {
        return this._codMunicipioTomador;
    } //-- long getCodMunicipioTomador() 

    /**
     * Returns the value of field 'descEmpresa'.
     * 
     * @return String
     * @return the value of field 'descEmpresa'.
     */
    public java.lang.String getDescEmpresa()
    {
        return this._descEmpresa;
    } //-- java.lang.String getDescEmpresa() 

    /**
     * Returns the value of field 'descMunicipioPrestador'.
     * 
     * @return String
     * @return the value of field 'descMunicipioPrestador'.
     */
    public java.lang.String getDescMunicipioPrestador()
    {
        return this._descMunicipioPrestador;
    } //-- java.lang.String getDescMunicipioPrestador() 

    /**
     * Returns the value of field 'descMunicipioTomador'.
     * 
     * @return String
     * @return the value of field 'descMunicipioTomador'.
     */
    public java.lang.String getDescMunicipioTomador()
    {
        return this._descMunicipioTomador;
    } //-- java.lang.String getDescMunicipioTomador() 

    /**
     * Returns the value of field 'dtMesAno'.
     * 
     * @return int
     * @return the value of field 'dtMesAno'.
     */
    public int getDtMesAno()
    {
        return this._dtMesAno;
    } //-- int getDtMesAno() 

    /**
     * Returns the value of field 'percAliquotaPrestador'.
     * 
     * @return BigDecimal
     * @return the value of field 'percAliquotaPrestador'.
     */
    public java.math.BigDecimal getPercAliquotaPrestador()
    {
        return this._percAliquotaPrestador;
    } //-- java.math.BigDecimal getPercAliquotaPrestador() 

    /**
     * Returns the value of field 'percAliquotaTomador'.
     * 
     * @return BigDecimal
     * @return the value of field 'percAliquotaTomador'.
     */
    public java.math.BigDecimal getPercAliquotaTomador()
    {
        return this._percAliquotaTomador;
    } //-- java.math.BigDecimal getPercAliquotaTomador() 

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
     * Returns the value of field 'siglaUfPrestador'.
     * 
     * @return String
     * @return the value of field 'siglaUfPrestador'.
     */
    public java.lang.String getSiglaUfPrestador()
    {
        return this._siglaUfPrestador;
    } //-- java.lang.String getSiglaUfPrestador() 

    /**
     * Returns the value of field 'siglaUfTomador'.
     * 
     * @return String
     * @return the value of field 'siglaUfTomador'.
     */
    public java.lang.String getSiglaUfTomador()
    {
        return this._siglaUfTomador;
    } //-- java.lang.String getSiglaUfTomador() 

    /**
     * Returns the value of field 'valorTotalApuracao'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalApuracao'.
     */
    public java.math.BigDecimal getValorTotalApuracao()
    {
        return this._valorTotalApuracao;
    } //-- java.math.BigDecimal getValorTotalApuracao() 

    /**
     * Returns the value of field 'valorTotalApuracaoPresstador'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalApuracaoPresstador'.
     */
    public java.math.BigDecimal getValorTotalApuracaoPresstador()
    {
        return this._valorTotalApuracaoPresstador;
    } //-- java.math.BigDecimal getValorTotalApuracaoPresstador() 

    /**
     * Returns the value of field 'valorTotalApuracaoTomador'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalApuracaoTomador'.
     */
    public java.math.BigDecimal getValorTotalApuracaoTomador()
    {
        return this._valorTotalApuracaoTomador;
    } //-- java.math.BigDecimal getValorTotalApuracaoTomador() 

    /**
     * Returns the value of field 'valorTotalCredito'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalCredito'.
     */
    public java.math.BigDecimal getValorTotalCredito()
    {
        return this._valorTotalCredito;
    } //-- java.math.BigDecimal getValorTotalCredito() 

    /**
     * Returns the value of field 'valorTotalReceitaPrestador'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalReceitaPrestador'.
     */
    public java.math.BigDecimal getValorTotalReceitaPrestador()
    {
        return this._valorTotalReceitaPrestador;
    } //-- java.math.BigDecimal getValorTotalReceitaPrestador() 

    /**
     * Returns the value of field 'valorTotalReceitaTomador'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorTotalReceitaTomador'.
     */
    public java.math.BigDecimal getValorTotalReceitaTomador()
    {
        return this._valorTotalReceitaTomador;
    } //-- java.math.BigDecimal getValorTotalReceitaTomador() 

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
     * Method hasCodMunicipioPrestador
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipioPrestador()
    {
        return this._has_codMunicipioPrestador;
    } //-- boolean hasCodMunicipioPrestador() 

    /**
     * Method hasCodMunicipioTomador
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipioTomador()
    {
        return this._has_codMunicipioTomador;
    } //-- boolean hasCodMunicipioTomador() 

    /**
     * Method hasDtMesAno
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasDtMesAno()
    {
        return this._has_dtMesAno;
    } //-- boolean hasDtMesAno() 

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
     * Sets the value of field 'codMunicipioPrestador'.
     * 
     * @param codMunicipioPrestador the value of field
     * 'codMunicipioPrestador'.
     */
    public void setCodMunicipioPrestador(long codMunicipioPrestador)
    {
        this._codMunicipioPrestador = codMunicipioPrestador;
        this._has_codMunicipioPrestador = true;
    } //-- void setCodMunicipioPrestador(long) 

    /**
     * Sets the value of field 'codMunicipioTomador'.
     * 
     * @param codMunicipioTomador the value of field
     * 'codMunicipioTomador'.
     */
    public void setCodMunicipioTomador(long codMunicipioTomador)
    {
        this._codMunicipioTomador = codMunicipioTomador;
        this._has_codMunicipioTomador = true;
    } //-- void setCodMunicipioTomador(long) 

    /**
     * Sets the value of field 'descEmpresa'.
     * 
     * @param descEmpresa the value of field 'descEmpresa'.
     */
    public void setDescEmpresa(java.lang.String descEmpresa)
    {
        this._descEmpresa = descEmpresa;
    } //-- void setDescEmpresa(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipioPrestador'.
     * 
     * @param descMunicipioPrestador the value of field
     * 'descMunicipioPrestador'.
     */
    public void setDescMunicipioPrestador(java.lang.String descMunicipioPrestador)
    {
        this._descMunicipioPrestador = descMunicipioPrestador;
    } //-- void setDescMunicipioPrestador(java.lang.String) 

    /**
     * Sets the value of field 'descMunicipioTomador'.
     * 
     * @param descMunicipioTomador the value of field
     * 'descMunicipioTomador'.
     */
    public void setDescMunicipioTomador(java.lang.String descMunicipioTomador)
    {
        this._descMunicipioTomador = descMunicipioTomador;
    } //-- void setDescMunicipioTomador(java.lang.String) 

    /**
     * Sets the value of field 'dtMesAno'.
     * 
     * @param dtMesAno the value of field 'dtMesAno'.
     */
    public void setDtMesAno(int dtMesAno)
    {
        this._dtMesAno = dtMesAno;
        this._has_dtMesAno = true;
    } //-- void setDtMesAno(int) 

    /**
     * Sets the value of field 'percAliquotaPrestador'.
     * 
     * @param percAliquotaPrestador the value of field
     * 'percAliquotaPrestador'.
     */
    public void setPercAliquotaPrestador(java.math.BigDecimal percAliquotaPrestador)
    {
        this._percAliquotaPrestador = percAliquotaPrestador;
    } //-- void setPercAliquotaPrestador(java.math.BigDecimal) 

    /**
     * Sets the value of field 'percAliquotaTomador'.
     * 
     * @param percAliquotaTomador the value of field
     * 'percAliquotaTomador'.
     */
    public void setPercAliquotaTomador(java.math.BigDecimal percAliquotaTomador)
    {
        this._percAliquotaTomador = percAliquotaTomador;
    } //-- void setPercAliquotaTomador(java.math.BigDecimal) 

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
     * Sets the value of field 'siglaUfPrestador'.
     * 
     * @param siglaUfPrestador the value of field 'siglaUfPrestador'
     */
    public void setSiglaUfPrestador(java.lang.String siglaUfPrestador)
    {
        this._siglaUfPrestador = siglaUfPrestador;
    } //-- void setSiglaUfPrestador(java.lang.String) 

    /**
     * Sets the value of field 'siglaUfTomador'.
     * 
     * @param siglaUfTomador the value of field 'siglaUfTomador'.
     */
    public void setSiglaUfTomador(java.lang.String siglaUfTomador)
    {
        this._siglaUfTomador = siglaUfTomador;
    } //-- void setSiglaUfTomador(java.lang.String) 

    /**
     * Sets the value of field 'valorTotalApuracao'.
     * 
     * @param valorTotalApuracao the value of field
     * 'valorTotalApuracao'.
     */
    public void setValorTotalApuracao(java.math.BigDecimal valorTotalApuracao)
    {
        this._valorTotalApuracao = valorTotalApuracao;
    } //-- void setValorTotalApuracao(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalApuracaoPresstador'.
     * 
     * @param valorTotalApuracaoPresstador the value of field
     * 'valorTotalApuracaoPresstador'.
     */
    public void setValorTotalApuracaoPresstador(java.math.BigDecimal valorTotalApuracaoPresstador)
    {
        this._valorTotalApuracaoPresstador = valorTotalApuracaoPresstador;
    } //-- void setValorTotalApuracaoPresstador(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalApuracaoTomador'.
     * 
     * @param valorTotalApuracaoTomador the value of field
     * 'valorTotalApuracaoTomador'.
     */
    public void setValorTotalApuracaoTomador(java.math.BigDecimal valorTotalApuracaoTomador)
    {
        this._valorTotalApuracaoTomador = valorTotalApuracaoTomador;
    } //-- void setValorTotalApuracaoTomador(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalCredito'.
     * 
     * @param valorTotalCredito the value of field
     * 'valorTotalCredito'.
     */
    public void setValorTotalCredito(java.math.BigDecimal valorTotalCredito)
    {
        this._valorTotalCredito = valorTotalCredito;
    } //-- void setValorTotalCredito(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalReceitaPrestador'.
     * 
     * @param valorTotalReceitaPrestador the value of field
     * 'valorTotalReceitaPrestador'.
     */
    public void setValorTotalReceitaPrestador(java.math.BigDecimal valorTotalReceitaPrestador)
    {
        this._valorTotalReceitaPrestador = valorTotalReceitaPrestador;
    } //-- void setValorTotalReceitaPrestador(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorTotalReceitaTomador'.
     * 
     * @param valorTotalReceitaTomador the value of field
     * 'valorTotalReceitaTomador'.
     */
    public void setValorTotalReceitaTomador(java.math.BigDecimal valorTotalReceitaTomador)
    {
        this._valorTotalReceitaTomador = valorTotalReceitaTomador;
    } //-- void setValorTotalReceitaTomador(java.math.BigDecimal) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaRelatorioApuracao
     */
    public static br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.gerarrelatorioapuracao.response.ListaRelatorioApuracao unmarshal(java.io.Reader) 

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
