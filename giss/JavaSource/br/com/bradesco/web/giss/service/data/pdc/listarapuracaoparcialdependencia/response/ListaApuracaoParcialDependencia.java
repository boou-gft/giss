/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: ListaApuracaoParcialDependencia.java,v 1.2 2018/04/24 02:27:07 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response;

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
 * Class ListaApuracaoParcialDependencia.
 * 
 * @version $Revision: 1.2 $ $Date: 2018/04/24 02:27:07 $
 */
public class ListaApuracaoParcialDependencia implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codPessoaJurid
     */
    private long _codPessoaJurid = 0;

    /**
     * keeps track of state for field: _codPessoaJurid
     */
    private boolean _has_codPessoaJurid;

    /**
     * Field _numSeqUnidadeOrganizacional
     */
    private int _numSeqUnidadeOrganizacional = 0;

    /**
     * keeps track of state for field: _numSeqUnidadeOrganizacional
     */
    private boolean _has_numSeqUnidadeOrganizacional;

    /**
     * Field _codDependencia
     */
    private int _codDependencia = 0;

    /**
     * keeps track of state for field: _codDependencia
     */
    private boolean _has_codDependencia;

    /**
     * Field _descDependencia
     */
    private java.lang.String _descDependencia;

    /**
     * Field _codPa
     */
    private int _codPa = 0;

    /**
     * keeps track of state for field: _codPa
     */
    private boolean _has_codPa;

    /**
     * Field _descPa
     */
    private java.lang.String _descPa;

    /**
     * Field _sinalReceita
     */
    private java.lang.String _sinalReceita;

    /**
     * Field _valorReceita
     */
    private java.math.BigDecimal _valorReceita = new java.math.BigDecimal("0");

    /**
     * Field _sinalISS
     */
    private java.lang.String _sinalISS;

    /**
     * Field _valorISS
     */
    private java.math.BigDecimal _valorISS = new java.math.BigDecimal("0");


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaApuracaoParcialDependencia() 
     {
        super();
        setValorReceita(new java.math.BigDecimal("0"));
        setValorISS(new java.math.BigDecimal("0"));
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodDependencia
     * 
     */
    public void deleteCodDependencia()
    {
        this._has_codDependencia= false;
    } //-- void deleteCodDependencia() 

    /**
     * Method deleteCodPa
     * 
     */
    public void deleteCodPa()
    {
        this._has_codPa= false;
    } //-- void deleteCodPa() 

    /**
     * Method deleteCodPessoaJurid
     * 
     */
    public void deleteCodPessoaJurid()
    {
        this._has_codPessoaJurid= false;
    } //-- void deleteCodPessoaJurid() 

    /**
     * Method deleteNumSeqUnidadeOrganizacional
     * 
     */
    public void deleteNumSeqUnidadeOrganizacional()
    {
        this._has_numSeqUnidadeOrganizacional= false;
    } //-- void deleteNumSeqUnidadeOrganizacional() 

    /**
     * Returns the value of field 'codDependencia'.
     * 
     * @return int
     * @return the value of field 'codDependencia'.
     */
    public int getCodDependencia()
    {
        return this._codDependencia;
    } //-- int getCodDependencia() 

    /**
     * Returns the value of field 'codPa'.
     * 
     * @return int
     * @return the value of field 'codPa'.
     */
    public int getCodPa()
    {
        return this._codPa;
    } //-- int getCodPa() 

    /**
     * Returns the value of field 'codPessoaJurid'.
     * 
     * @return long
     * @return the value of field 'codPessoaJurid'.
     */
    public long getCodPessoaJurid()
    {
        return this._codPessoaJurid;
    } //-- long getCodPessoaJurid() 

    /**
     * Returns the value of field 'descDependencia'.
     * 
     * @return String
     * @return the value of field 'descDependencia'.
     */
    public java.lang.String getDescDependencia()
    {
        return this._descDependencia;
    } //-- java.lang.String getDescDependencia() 

    /**
     * Returns the value of field 'descPa'.
     * 
     * @return String
     * @return the value of field 'descPa'.
     */
    public java.lang.String getDescPa()
    {
        return this._descPa;
    } //-- java.lang.String getDescPa() 

    /**
     * Returns the value of field 'numSeqUnidadeOrganizacional'.
     * 
     * @return int
     * @return the value of field 'numSeqUnidadeOrganizacional'.
     */
    public int getNumSeqUnidadeOrganizacional()
    {
        return this._numSeqUnidadeOrganizacional;
    } //-- int getNumSeqUnidadeOrganizacional() 

    /**
     * Returns the value of field 'sinalISS'.
     * 
     * @return String
     * @return the value of field 'sinalISS'.
     */
    public java.lang.String getSinalISS()
    {
        return this._sinalISS;
    } //-- java.lang.String getSinalISS() 

    /**
     * Returns the value of field 'sinalReceita'.
     * 
     * @return String
     * @return the value of field 'sinalReceita'.
     */
    public java.lang.String getSinalReceita()
    {
        return this._sinalReceita;
    } //-- java.lang.String getSinalReceita() 

    /**
     * Returns the value of field 'valorISS'.
     * 
     * @return BigDecimal
     * @return the value of field 'valorISS'.
     */
    public java.math.BigDecimal getValorISS()
    {
        return this._valorISS;
    } //-- java.math.BigDecimal getValorISS() 

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
     * Method hasCodDependencia
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodDependencia()
    {
        return this._has_codDependencia;
    } //-- boolean hasCodDependencia() 

    /**
     * Method hasCodPa
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPa()
    {
        return this._has_codPa;
    } //-- boolean hasCodPa() 

    /**
     * Method hasCodPessoaJurid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodPessoaJurid()
    {
        return this._has_codPessoaJurid;
    } //-- boolean hasCodPessoaJurid() 

    /**
     * Method hasNumSeqUnidadeOrganizacional
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasNumSeqUnidadeOrganizacional()
    {
        return this._has_numSeqUnidadeOrganizacional;
    } //-- boolean hasNumSeqUnidadeOrganizacional() 

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
     * Sets the value of field 'codDependencia'.
     * 
     * @param codDependencia the value of field 'codDependencia'.
     */
    public void setCodDependencia(int codDependencia)
    {
        this._codDependencia = codDependencia;
        this._has_codDependencia = true;
    } //-- void setCodDependencia(int) 

    /**
     * Sets the value of field 'codPa'.
     * 
     * @param codPa the value of field 'codPa'.
     */
    public void setCodPa(int codPa)
    {
        this._codPa = codPa;
        this._has_codPa = true;
    } //-- void setCodPa(int) 

    /**
     * Sets the value of field 'codPessoaJurid'.
     * 
     * @param codPessoaJurid the value of field 'codPessoaJurid'.
     */
    public void setCodPessoaJurid(long codPessoaJurid)
    {
        this._codPessoaJurid = codPessoaJurid;
        this._has_codPessoaJurid = true;
    } //-- void setCodPessoaJurid(long) 

    /**
     * Sets the value of field 'descDependencia'.
     * 
     * @param descDependencia the value of field 'descDependencia'.
     */
    public void setDescDependencia(java.lang.String descDependencia)
    {
        this._descDependencia = descDependencia;
    } //-- void setDescDependencia(java.lang.String) 

    /**
     * Sets the value of field 'descPa'.
     * 
     * @param descPa the value of field 'descPa'.
     */
    public void setDescPa(java.lang.String descPa)
    {
        this._descPa = descPa;
    } //-- void setDescPa(java.lang.String) 

    /**
     * Sets the value of field 'numSeqUnidadeOrganizacional'.
     * 
     * @param numSeqUnidadeOrganizacional the value of field
     * 'numSeqUnidadeOrganizacional'.
     */
    public void setNumSeqUnidadeOrganizacional(int numSeqUnidadeOrganizacional)
    {
        this._numSeqUnidadeOrganizacional = numSeqUnidadeOrganizacional;
        this._has_numSeqUnidadeOrganizacional = true;
    } //-- void setNumSeqUnidadeOrganizacional(int) 

    /**
     * Sets the value of field 'sinalISS'.
     * 
     * @param sinalISS the value of field 'sinalISS'.
     */
    public void setSinalISS(java.lang.String sinalISS)
    {
        this._sinalISS = sinalISS;
    } //-- void setSinalISS(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceita'.
     * 
     * @param sinalReceita the value of field 'sinalReceita'.
     */
    public void setSinalReceita(java.lang.String sinalReceita)
    {
        this._sinalReceita = sinalReceita;
    } //-- void setSinalReceita(java.lang.String) 

    /**
     * Sets the value of field 'valorISS'.
     * 
     * @param valorISS the value of field 'valorISS'.
     */
    public void setValorISS(java.math.BigDecimal valorISS)
    {
        this._valorISS = valorISS;
    } //-- void setValorISS(java.math.BigDecimal) 

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
     * @return ListaApuracaoParcialDependencia
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarapuracaoparcialdependencia.response.ListaApuracaoParcialDependencia unmarshal(java.io.Reader) 

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
