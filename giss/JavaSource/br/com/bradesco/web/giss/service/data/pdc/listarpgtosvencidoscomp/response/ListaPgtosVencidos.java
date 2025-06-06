/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response;

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
 * Class ListaPgtosVencidos.
 * 
 * @version $Revision$ $Date$
 */
public class ListaPgtosVencidos implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _mesAno
     */
    private int _mesAno = 0;

    /**
     * keeps track of state for field: _mesAno
     */
    private boolean _has_mesAno;

    /**
     * Field _codEmpresa
     */
    private int _codEmpresa = 0;

    /**
     * keeps track of state for field: _codEmpresa
     */
    private boolean _has_codEmpresa;

    /**
     * Field _nomeEmpresa
     */
    private java.lang.String _nomeEmpresa;

    /**
     * Field _nomeProduto
     */
    private java.lang.String _nomeProduto;

    /**
     * Field _valorIssApurado
     */
    private java.math.BigDecimal _valorIssApurado = new java.math.BigDecimal("0");

    /**
     * Field _valorBaseIss
     */
    private java.math.BigDecimal _valorBaseIss = new java.math.BigDecimal("0");

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _nomeMunicipio
     */
    private java.lang.String _nomeMunicipio;

    /**
     * Field _vencimento
     */
    private java.lang.String _vencimento;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaPgtosVencidos() 
     {
        super();
        setValorIssApurado(new java.math.BigDecimal("0"));
        setValorBaseIss(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos()


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
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteMesAno
     * 
     */
    public void deleteMesAno()
    {
        this._has_mesAno= false;
    } //-- void deleteMesAno() 

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
     * Returns the value of field 'mesAno'.
     * 
     * @return int
     * @return the value of field 'mesAno'.
     */
    public int getMesAno()
    {
        return this._mesAno;
    } //-- int getMesAno() 

    /**
     * Returns the value of field 'nomeEmpresa'.
     * 
     * @return String
     * @return the value of field 'nomeEmpresa'.
     */
    public java.lang.String getNomeEmpresa()
    {
        return this._nomeEmpresa;
    } //-- java.lang.String getNomeEmpresa() 

    /**
     * Returns the value of field 'nomeMunicipio'.
     * 
     * @return String
     * @return the value of field 'nomeMunicipio'.
     */
    public java.lang.String getNomeMunicipio()
    {
        return this._nomeMunicipio;
    } //-- java.lang.String getNomeMunicipio() 

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
     * Returns the value of field 'valorBaseIss'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorBaseIss'.
     */
    public java.math.BigDecimal getValorBaseIss()
    {
        return this._valorBaseIss;
    } //-- java.math.BigDecimal getValorBaseIss() 

    /**
     * Returns the value of field 'valorIssApurado'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorIssApurado'.
     */
    public java.math.BigDecimal getValorIssApurado()
    {
        return this._valorIssApurado;
    } //-- java.math.BigDecimal getValorIssApurado() 

    /**
     * Returns the value of field 'vencimento'.
     * 
     * @return String
     * @return the value of field 'vencimento'.
     */
    public java.lang.String getVencimento()
    {
        return this._vencimento;
    } //-- java.lang.String getVencimento() 

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
     * Method hasMesAno
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasMesAno()
    {
        return this._has_mesAno;
    } //-- boolean hasMesAno() 

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
     * Sets the value of field 'mesAno'.
     * 
     * @param mesAno the value of field 'mesAno'.
     */
    public void setMesAno(int mesAno)
    {
        this._mesAno = mesAno;
        this._has_mesAno = true;
    } //-- void setMesAno(int) 

    /**
     * Sets the value of field 'nomeEmpresa'.
     * 
     * @param nomeEmpresa the value of field 'nomeEmpresa'.
     */
    public void setNomeEmpresa(java.lang.String nomeEmpresa)
    {
        this._nomeEmpresa = nomeEmpresa;
    } //-- void setNomeEmpresa(java.lang.String) 

    /**
     * Sets the value of field 'nomeMunicipio'.
     * 
     * @param nomeMunicipio the value of field 'nomeMunicipio'.
     */
    public void setNomeMunicipio(java.lang.String nomeMunicipio)
    {
        this._nomeMunicipio = nomeMunicipio;
    } //-- void setNomeMunicipio(java.lang.String) 

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
     * Sets the value of field 'valorBaseIss'.
     * 
     * @param valorBaseIss the value of field 'valorBaseIss'.
     */
    public void setValorBaseIss(java.math.BigDecimal valorBaseIss)
    {
        this._valorBaseIss = valorBaseIss;
    } //-- void setValorBaseIss(java.math.BigDecimal) 

    /**
     * Sets the value of field 'valorIssApurado'.
     * 
     * @param valorIssApurado the value of field 'valorIssApurado'.
     */
    public void setValorIssApurado(java.math.BigDecimal valorIssApurado)
    {
        this._valorIssApurado = valorIssApurado;
    } //-- void setValorIssApurado(java.math.BigDecimal) 

    /**
     * Sets the value of field 'vencimento'.
     * 
     * @param vencimento the value of field 'vencimento'.
     */
    public void setVencimento(java.lang.String vencimento)
    {
        this._vencimento = vencimento;
    } //-- void setVencimento(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaPgtosVencidos
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarpgtosvencidoscomp.response.ListaPgtosVencidos unmarshal(java.io.Reader) 

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
